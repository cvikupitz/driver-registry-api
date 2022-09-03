package com.test.example.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum HairColor {

  BLACK("BLK", "Black"),
  BROWN("BRO", "Brown"),
  BLONDE("BLD", "Blonde"),
  GRAY("GRY", "Gray"),
  WHITE("WHI", "White"),
  RED("RED", "Red"),
  BALD("BAL", "Bald"),
  UNKNOWN("U", "Unknown/Other");

  private final String abbreviation;
  private final String description;

  public static HairColor resolveByAbbreviation(String value) {
    for (HairColor hairColor : HairColor.values()) {
      if (hairColor.abbreviation.equalsIgnoreCase(value)) {
        return hairColor;
      }
    }
    throw new IllegalArgumentException(
        "Failed to resolve hair color enumeration from value: " + value);
  }
}