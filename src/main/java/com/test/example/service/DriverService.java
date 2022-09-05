package com.test.example.service;

import com.test.example.dto.driver.DriverDto;
import com.test.example.dto.driver.DriverIdDto;
import com.test.example.dto.driver.DriverSaveDto;
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

  public DriverDto getDriverById(Long driverId) {

    Driver driver = driverRepository.findById(driverId)
        .orElseThrow(() -> new RecordNotFoundException("Failed to retrieve driver record with ID: "
                          + driverId));
    return driverMapper.mapDriverModelToDto(driver);
  }

  public DriverIdDto saveNewDriver(DriverSaveDto driver) {

    Driver driverModel = driverMapper.mapDriverDtoToModel(driver);
    Driver response = driverRepository.save(driverModel);

    return new DriverIdDto(response.get_id());
  }

}