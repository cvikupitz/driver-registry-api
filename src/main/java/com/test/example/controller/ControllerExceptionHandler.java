package com.test.example.controller;

import com.test.example.dto.ErrorResponse;
import com.test.example.exception.RecordNotFoundException;
import java.time.Instant;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.support.WebExchangeBindException;

@ControllerAdvice
public class ControllerExceptionHandler {

  @ExceptionHandler(RecordNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleRecordNotFoundException(RecordNotFoundException e) {

    ErrorResponse response = ErrorResponse.builder()
        .generalMessage(e.getMessage())
        .statusCode(HttpStatus.NOT_FOUND.value())
        .exClazz(e.getClass().getName())
        .timestamp(Instant.now())
        .build();

    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(WebExchangeBindException.class)
  public ResponseEntity<ErrorResponse> handleWebExchangeBindException(
      WebExchangeBindException e) {

    ErrorResponse response = ErrorResponse.builder()
        .generalMessage(ErrorResponse.BAD_REQUEST_MESSAGE)
        .statusCode(HttpStatus.BAD_REQUEST.value())
        .exClazz(e.getClass().getName())
        .timestamp(Instant.now())
        .errors(
            e.getAllErrors()
              .stream()
              .map(ex -> ex.getDefaultMessage())
              .collect(Collectors.toList()))
        .build();

    return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(
      MethodArgumentNotValidException e) {

    ErrorResponse response = ErrorResponse.builder()
        .generalMessage(ErrorResponse.BAD_REQUEST_MESSAGE)
        .statusCode(HttpStatus.BAD_REQUEST.value())
        .exClazz(e.getClass().getName())
        .timestamp(Instant.now())
        .errors(
            e.getAllErrors()
              .stream()
              .map(ex -> ex.getDefaultMessage())
              .collect(Collectors.toList()))
        .build();

    return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
  }
}