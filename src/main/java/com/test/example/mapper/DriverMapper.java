package com.test.example.mapper;

import com.test.example.dto.driver.DriverDto;
import com.test.example.model.Driver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DriverMapper {

    @Mapping(source = "gender.abbreviation", target = "gender")
    @Mapping(source = "eyeColor.abbreviation", target = "eyeColor")
    @Mapping(source = "hairColor.abbreviation", target = "hairColor")
    @Mapping(source = "race.abbreviation", target = "race")
    DriverDto mapDriverModelToDto(Driver driver);

}