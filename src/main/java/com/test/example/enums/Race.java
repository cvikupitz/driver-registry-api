package com.test.example.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Race {

  ASIAN("A", "Asian/Pacific Islander"),
  BLACK("B", "Black"),
  WHITE("W", "White"),
  HISPANIC("H", "Hispanic"),
  NATIVE("I", "Native American/Alaskan Native"),
  UNKNOWN("U", "Unknown/Other");

  private final String abbreviation;
  private final String description;

  public static Race resolveByAbbreviation(String value) {
    for (Race race : Race.values()) {
      if (race.abbreviation.equalsIgnoreCase(value)) {
        return race;
      }
    }
    throw new IllegalArgumentException(
        "Failed to resolve race enumeration from value: " + value);
  }
}