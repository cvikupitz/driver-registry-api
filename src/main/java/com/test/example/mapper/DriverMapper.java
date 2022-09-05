package com.test.example.mapper;

import com.test.example.dto.driver.DriverDto;
import com.test.example.dto.driver.DriverSaveDto;
import com.test.example.model.Driver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DriverMapper {

    DriverDto mapDriverModelToDto(Driver driver);

    @Mapping(source = "genderCode", target = "gender._id")
    @Mapping(source = "raceCode", target = "race._id")
    @Mapping(source = "hairColorCode", target = "hairColor._id")
    @Mapping(source = "eyeColorCode", target = "eyeColor._id")
    Driver mapDriverDtoToModel(DriverSaveDto driver);
}