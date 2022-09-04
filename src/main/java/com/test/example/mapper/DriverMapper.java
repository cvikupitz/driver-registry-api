package com.test.example.mapper;

import com.test.example.dto.driver.DriverDto;
import com.test.example.model.Driver;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DriverMapper {

  DriverDto mapDriverModelToDto(Driver driver);
}