package com.test.example.model.converter;

import com.test.example.enums.Race;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class RaceAttributeConverter implements AttributeConverter<Race, String> {

  @Override
  public String convertToDatabaseColumn(Race race) {
    return race.getAbbreviation();
  }

  @Override
  public Race convertToEntityAttribute(String s) {
    return Race.resolveByAbbreviation(s);
  }
}