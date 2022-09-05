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

  public static final String NAME_FORMAT = "^[A-Z][-a-zA-Z]+$";
  public static final String MIDDLE_NAME_FORMAT = "^[A-Z][-.a-zA-Z]+$";
  public static final String SSN_FORMAT = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
  public static final String STATE_FORMAT = "^[A-Z]{2}$";
  public static final String POSTAL_CODE_FORMAT = "^[0-9]{5}$";
  public static final int MIN_GENDER_CODE = 401;
  public static final int MAX_GENDER_CODE = 403;
  public static final int MIN_RACE_CODE = 501;
  public static final int MAX_RACE_CODE = 507;
  public static final int MIN_HAIR_COLOR_CODE = 601;
  public static final int MAX_HAIR_COLOR_CODE = 608;
  public static final int MIN_EYE_COLOR_CODE = 701;
  public static final int MAX_EYE_COLOR_CODE = 707;
}