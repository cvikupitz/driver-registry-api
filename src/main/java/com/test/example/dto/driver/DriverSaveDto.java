package com.test.example.dto.driver;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.test.example.constants.ConstraintConstants;
import java.sql.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverSaveDto {

  @NotBlank(message = "'SSN' cannot be null, empty, or blank.")
  @Pattern(
      regexp = ConstraintConstants.SSN_FORMAT,
      message = "'SSN' must conform to the pattern " + ConstraintConstants.SSN_FORMAT)
  @JsonProperty("SSN")
  private String ssn;

  @NotBlank(message = "'FirstName' cannot be null, empty, or blank.")
  @Size(
      max = ConstraintConstants.FIRST_NAME_LENGTH,
      message = "'FirstName' cannot exceed 64 characters.")
  @Pattern(
      regexp = ConstraintConstants.NAME_FORMAT,
      message = "'FirstName' must conform to the pattern " + ConstraintConstants.NAME_FORMAT)
  @JsonProperty("FirstName")
  private String firstName;

  @NotBlank(message = "'MiddleName' cannot be null, empty, or blank.")
  @Size(
      max = ConstraintConstants.MIDDLE_NAME_LENGTH,
      message = "'MiddleName' cannot exceed 64 characters.")
  @Pattern(
      regexp = ConstraintConstants.MIDDLE_NAME_FORMAT,
      message = "'MiddleName' must conform to the pattern " + ConstraintConstants.MIDDLE_NAME_FORMAT)
  @JsonProperty("MiddleName")
  private String middleName;

  @NotBlank(message = "'LastName' cannot be null, empty, or blank.")
  @Size(
      max = ConstraintConstants.LAST_NAME_LENGTH,
      message = "'LastName' cannot exceed 64 characters.")
  @Pattern(
      regexp = ConstraintConstants.NAME_FORMAT,
      message = "'LastName' must conform to the pattern " + ConstraintConstants.NAME_FORMAT)
  @JsonProperty("LastName")
  private String lastName;

  @NotNull(message = "'DateOfBirth' cannot be null")
  @Past(message = "'DateOfBirth' must not be the present date or a future date.")
  @JsonProperty("DateOfBirth")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") //TODO - check for invalid dates
  private Date dateOfBirth;

  @NotBlank(message = "'AddressLine1' cannot be null, empty, or blank.")
  @Size(
      max = ConstraintConstants.ADDRESS_LINE1_LENGTH,
      message = "'AddressLine1' cannot exceed 128 characters.")
  @JsonProperty("AddressLine1")
  private String addressLine1;

  @Size(
      max = ConstraintConstants.ADDRESS_LINE2_LENGTH,
      message = "'AddressLine2' cannot exceed 64 characters.")
  @JsonProperty("AddressLine2")
  private String addressLine2;

  @NotBlank(message = "'City' cannot be null, empty, or blank.")
  @Size(
      max = ConstraintConstants.CITY_LENGTH,
      message = "'City' cannot exceed 64 characters.")
  @JsonProperty("City")
  private String city;

  @NotBlank(message = "'State' cannot be null, empty, or blank.")
  @Size(
      max = ConstraintConstants.STATE_LENGTH,
      message = "'State' cannot exceed 2 characters.")
  @Pattern(
      regexp = ConstraintConstants.STATE_FORMAT,
      message = "'State' must conform to the pattern " + ConstraintConstants.STATE_FORMAT)
  @JsonProperty("State")
  private String state;

  @NotBlank(message = "'PostalCode' cannot be null, empty, or blank.")
  @Pattern(
      regexp = ConstraintConstants.POSTAL_CODE_FORMAT,
      message = "'PostalCode' must conform to the pattern " + ConstraintConstants.POSTAL_CODE_FORMAT)
  @JsonProperty("PostalCode")
  private String postalCode;

  @NotNull(message = "'GenderCode' cannot be null.")
  @Range(
      min = ConstraintConstants.MIN_GENDER_CODE,
      max = ConstraintConstants.MAX_GENDER_CODE,
      message = "'GenderCode' must be in the range: [" + ConstraintConstants.MIN_GENDER_CODE +
                ", " + ConstraintConstants.MAX_GENDER_CODE + "].")
  @JsonProperty("GenderCode")
  private Integer genderCode;

  @NotNull(message = "'RaceCode' cannot be null.")
  @Range(
      min = ConstraintConstants.MIN_RACE_CODE,
      max = ConstraintConstants.MAX_RACE_CODE,
      message = "'RaceCode' must be in the range: [" + ConstraintConstants.MIN_RACE_CODE +
                ", " + ConstraintConstants.MAX_RACE_CODE + "].")
  @JsonProperty("RaceCode")
  private Integer raceCode;

  @NotNull(message = "'HairColorCode' cannot be null.")
  @Range(
      min = ConstraintConstants.MIN_HAIR_COLOR_CODE,
      max = ConstraintConstants.MAX_HAIR_COLOR_CODE,
      message = "'HairColorCode' must be in the range: [" + ConstraintConstants.MIN_HAIR_COLOR_CODE +
                ", " + ConstraintConstants.MAX_HAIR_COLOR_CODE + "].")
  @JsonProperty("HairColorCode")
  private Integer hairColorCode;

  @NotNull(message = "'EyeColorCode' cannot be null.")
  @Range(
      min = ConstraintConstants.MIN_EYE_COLOR_CODE,
      max = ConstraintConstants.MAX_EYE_COLOR_CODE,
      message = "'EyeColorCode' must be in the range: [" + ConstraintConstants.MIN_EYE_COLOR_CODE +
                ", " + ConstraintConstants.MAX_EYE_COLOR_CODE + "].")
  @JsonProperty("EyeColorCode")
  private Integer eyeColorCode;

  @NotNull(message = "'HeightInches' cannot be null.")
  @JsonProperty("HeightInches")
  private Integer heightIns;

  @NotNull(message = "'WeightLbs' cannot be null.")
  @JsonProperty("WeightLbs")
  private Integer weightLbs;
}