package com.test.example.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EyeColor {

  BLACK("BLK", "Black"),
  BLUE("BLU", "Blue"),
  BROWN("BRO", "Brown"),
  GRAY("GRY", "Gray"),
  GREEN("GRN", "Green"),
  HAZEL("HZL", "Hazel"),
  UNKNOWN("U", "Unknown/Other");

  private final String abbreviation;
  private final String description;

  public static EyeColor resolveByAbbreviation(String value) {
    for (EyeColor eyeColor : EyeColor.values()) {
      if (eyeColor.abbreviation.equalsIgnoreCase(value)) {
        return eyeColor;
      }
    }
    throw new IllegalArgumentException(
        "Failed to resolve eye color enumeration from value: " + value);
  }
}