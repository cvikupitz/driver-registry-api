package com.test.example.controller;

import com.test.example.dto.metadata.MetadataResponse;
import com.test.example.service.MetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
    path = "/api/v1/metadata",
    produces = MediaType.APPLICATION_JSON_VALUE)
public class MetadataController {

  @Autowired
  private MetadataService metadataService;

  @GetMapping
  public ResponseEntity<MetadataResponse> getAllMetadata() {
    MetadataResponse payload = metadataService.getAllMetadata();
    return new ResponseEntity<>(payload, HttpStatus.OK);
  }

}