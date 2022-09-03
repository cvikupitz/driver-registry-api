package com.test.example.model.converter;

import com.test.example.enums.Gender;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class GenderAttributeConverter implements AttributeConverter<Gender, String> {

  @Override
  public String convertToDatabaseColumn(Gender gender) {
    return gender.getAbbreviation();
  }

  @Override
  public Gender convertToEntityAttribute(String s) {
    return Gender.resolveByAbbreviation(s);
  }
}