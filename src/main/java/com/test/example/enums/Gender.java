package com.test.example.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {

  MALE("M", "Male"),
  FEMALE("F", "Female"),
  UNDISCLOSED("U", "Undisclosed");

  private final String abbreviation;
  private final String description;

  public static Gender resolveByAbbreviation(String value) {
    for (Gender gender : Gender.values()) {
      if (gender.abbreviation.equalsIgnoreCase(value)) {
        return gender;
      }
    }
    throw new IllegalArgumentException(
        "Failed to resolve gender enumeration from value: " + value);
  }
}