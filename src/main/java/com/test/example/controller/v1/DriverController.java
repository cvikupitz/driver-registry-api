package com.test.example.controller.v1;

import com.test.example.constants.EndpointConstants;
import com.test.example.dto.driver.DriverDto;
import com.test.example.dto.driver.DriverIdDto;
import com.test.example.dto.driver.DriverSaveDto;
import com.test.example.service.DriverService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
    path = EndpointConstants.DRIVERS_ROOT_URI,
    produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverController {

  @Autowired
  private DriverService driverService;

  @GetMapping
  public ResponseEntity<List<DriverDto>> getDriverCollection(
      @RequestParam(
          name = "offset",
          required = false,
          defaultValue = EndpointConstants.DEFAULT_PAGE_OFFSET) Integer pageOffset,
      @RequestParam(
          name = "size",
          required = false,
          defaultValue = EndpointConstants.DEFAULT_PAGE_SIZE) Integer pageSize) {

    return ResponseEntity.noContent().build();
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<DriverDto> getDriverById(
      @PathVariable(name = "id") Long id) {

    DriverDto response = driverService.getDriverById(id);
    return ResponseEntity.ok(response);
  }

  @PostMapping
  public ResponseEntity<DriverIdDto> saveNewDriver(@Valid @RequestBody DriverSaveDto request)
      throws URISyntaxException {

    DriverIdDto response = driverService.saveNewDriver(request);
    URI uri =
        new URI(EndpointConstants.DRIVERS_ROOT_URI + "/" + response.getDriverId().toString());
    return ResponseEntity.created(uri).body(response);
  }

}