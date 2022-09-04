package com.test.example.controller;

import com.test.example.dto.ErrorResponse;
import com.test.example.exception.RecordNotFoundException;
import java.time.Instant;
import java.util.List;
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
  public ResponseEntity<String> handleRecordNotFoundException(RecordNotFoundException e) {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(WebExchangeBindException.class)
  public ResponseEntity<ErrorResponse> handleWebExchangeBindException(
      WebExchangeBindException e) {

    ErrorResponse response = new ErrorResponse();
    response.setGeneralMessage(ErrorResponse.BAD_REQUEST_MESSAGE);
    response.setStatusCode(HttpStatus.BAD_REQUEST.value());
    response.setExClazz(e.getClass().getName());
    response.setTimestamp(Instant.now());
    List<String> errors = e.getAllErrors()
        .stream()
        .map(ex -> ex.getDefaultMessage())
        .collect(Collectors.toList());
    response.setErrors(errors);

    return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(
      MethodArgumentNotValidException e) {

    ErrorResponse response = new ErrorResponse();
    response.setGeneralMessage(ErrorResponse.BAD_REQUEST_MESSAGE);
    response.setStatusCode(HttpStatus.BAD_REQUEST.value());
    response.setExClazz(e.getClass().getName());
    response.setTimestamp(Instant.now());
    List<String> errors = e.getAllErrors()
        .stream()
        .map(ex -> ex.getDefaultMessage())
        .collect(Collectors.toList());
    response.setErrors(errors);

    return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
  }
}