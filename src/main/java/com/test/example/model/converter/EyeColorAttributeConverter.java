package com.test.example.model.converter;

import com.test.example.enums.EyeColor;
import javax.persistence.AttributeConverter;

public class EyeColorAttributeConverter implements AttributeConverter<EyeColor, String> {

  @Override
  public String convertToDatabaseColumn(EyeColor eyeColor) {
    return eyeColor.getAbbreviation();
  }

  @Override
  public EyeColor convertToEntityAttribute(String s) {
    return EyeColor.resolveByAbbreviation(s);
  }
}