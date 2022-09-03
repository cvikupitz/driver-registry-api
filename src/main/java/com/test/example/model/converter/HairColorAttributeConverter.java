package com.test.example.model.converter;

import com.test.example.enums.HairColor;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class HairColorAttributeConverter implements AttributeConverter<HairColor, String> {

  @Override
  public String convertToDatabaseColumn(HairColor hairColor) {
    return hairColor.getAbbreviation();
  }

  @Override
  public HairColor convertToEntityAttribute(String s) {
    return HairColor.resolveByAbbreviation(s);
  }
}