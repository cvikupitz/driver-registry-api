package com.test.example.controller.v1;

import com.test.example.dto.driver.DriverDto;
import com.test.example.dto.driver.DriverGenericSearchRequest;
import com.test.example.service.DriverService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/drivers", produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverController {

  @Autowired
  private DriverService driverService;

  @GetMapping
  public ResponseEntity<List<DriverDto>> getCollectionOfDrivers() {
    return ResponseEntity.noContent().build();
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<DriverDto> getDriverById(
      @PathVariable(name = "id") Integer id) {

    DriverDto response = driverService.getDriverById(id);
    return ResponseEntity.ok(response);
  }

  @PostMapping
  public ResponseEntity<DriverDto> saveNewDriver() {
    return ResponseEntity.noContent().build();
  }

  @PostMapping(path = "/search")
  public ResponseEntity<List<DriverDto>> searchForDrivers(
      @RequestBody DriverGenericSearchRequest request) {
    return ResponseEntity.noContent().build();
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<List<DriverDto>> updateDriver(
      @PathVariable(name = "id") String id) {
    return ResponseEntity.noContent().build();
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<List<DriverDto>> deleteDriver(@PathVariable(name = "id") String id) {
    return ResponseEntity.noContent().build();
  }
}