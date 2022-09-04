package com.test.example.constants;

public final class ConstraintConstants {

  private ConstraintConstants() {}

  public static final int SSN_LENGTH = 11;
  public static final int FIRST_NAME_LENGTH = 64;
  public static final int MIDDLE_NAME_LENGTH = 64;
  public static final int LAST_NAME_LENGTH = 64;
  public static final int ADDRESS_LINE1_LENGTH = 128;
  public static final int ADDRESS_LINE2_LENGTH = 64;
  public static final int CITY_LENGTH = 64;
  public static final int STATE_LENGTH = 2;
  public static final int POSTAL_CODE_LENGTH = 5;
  public static final int GENDER_LENGTH = 1;
  public static final int RACE_LENGTH = 1;
  public static final int HAIR_COLOR_LENGTH = 3;
  public static final int EYE_COLOR_LENGTH = 3;

  public static final String NAME_FORMAT = "^[A-Z][-a-zA-Z]+$";
  public static final String MIDDLE_NAME_FORMAT = "^[A-Z][-.a-zA-Z]+$";
  public static final String SSN_FORMAT = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
  public static final String STATE_FORMAT = "^[A-Z]{2}$";
  public static final String POSTAL_CODE_FORMAT = "^[0-9]{5}$";
  public static final String GENDER_PATTERN = "^(M|F|U)$";
  public static final String RACE_PATTERN = "^(A|B|W|H|I|U)$";
  public static final String EYE_COLOR_PATTERN = "^(BLK|BLU|BRO|GRY|GRN|HZL|U)$";
  public static final String HAIR_COLOR_PATTERN = "^(BLK|BRO|BLD|GRY|WHI|RED|BAL|U)$";
}