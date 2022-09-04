package com.test.example.service;

import com.test.example.dto.driver.DriverDto;
import com.test.example.exception.RecordNotFoundException;
import com.test.example.mapper.DriverMapper;
import com.test.example.model.Driver;
import com.test.example.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

  @Autowired
  private DriverRepository driverRepository;
  @Autowired
  private DriverMapper driverMapper;

  public DriverDto getDriverById(Integer driverId) {
    Driver driver = driverRepository.findById(driverId)
        .orElseThrow(() -> new RecordNotFoundException("Failed to retrieve record with ID: " + driverId));
    return driverMapper.mapDriverModelToDto(driver);
  }

}