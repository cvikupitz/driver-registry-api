package com.test.example.dto.driver;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.test.example.constants.ConstraintConstants;
import java.sql.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

  @NotBlank(message = "'Gender' cannot be null, empty, or blank.")
  @Pattern(
      regexp = ConstraintConstants.GENDER_PATTERN,
      flags = Flag.CASE_INSENSITIVE,
      message = "'Gender' must conform to the pattern " + ConstraintConstants.GENDER_PATTERN)
  @JsonProperty("Gender")
  private String gender;

  @NotBlank(message = "'Race' cannot be null, empty, or blank.")
  @Pattern(
      regexp = ConstraintConstants.RACE_PATTERN,
      flags = Flag.CASE_INSENSITIVE,
      message = "'Race' must conform to the pattern " + ConstraintConstants.RACE_PATTERN)
  @JsonProperty("Race")
  private String race;

  @NotBlank(message = "'HairColor' cannot be null, empty, or blank.")
  @Pattern(
      regexp = ConstraintConstants.HAIR_COLOR_PATTERN,
      flags = Flag.CASE_INSENSITIVE,
      message = "'HairColor' must conform to the pattern " + ConstraintConstants.HAIR_COLOR_PATTERN)
  @JsonProperty("HairColor")
  private String hairColor;

  @NotBlank(message = "'EyeColor' cannot be null, empty, or blank.")
  @Pattern(
      regexp = ConstraintConstants.EYE_COLOR_PATTERN,
      flags = Flag.CASE_INSENSITIVE,
      message = "'EyeColor' must conform to the pattern " + ConstraintConstants.EYE_COLOR_PATTERN)
  @JsonProperty("EyeColor")
  private String eyeColor;

  @NotNull(message = "'HeightInches' cannot be null.")
  @JsonProperty("HeightInches")
  private Short heightIns;

  @NotNull(message = "'WeightLbs' cannot be null.")
  @JsonProperty("WeightLbs")
  private Short weightLbs;
}