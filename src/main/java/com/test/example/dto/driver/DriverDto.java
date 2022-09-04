package com.test.example.dto.driver;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.test.example.enums.EyeColor;
import com.test.example.enums.Gender;
import com.test.example.enums.HairColor;
import com.test.example.enums.Race;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {

  @JsonProperty("DriverId")
  private Integer _id;
  @JsonProperty("SSN")
  private String ssn;
  @JsonProperty("FirstName")
  private String firstName;
  @JsonProperty("MiddleName")
  private String middleName;
  @JsonProperty("LastName")
  private String lastName;
  @JsonProperty("DateOfBirth")
  private Date dateOfBirth;
  @JsonProperty("AddressLine1")
  private String addressLine1;
  @JsonProperty("AddressLine2")
  private String addressLine2;
  @JsonProperty("City")
  private String city;
  @JsonProperty("State")
  private String state;
  @JsonProperty("PostalCode")
  private String postalCode;
  @JsonProperty("Gender")
  private Gender gender;
  @JsonProperty("Race")
  private Race race;
  @JsonProperty("HairColor")
  private HairColor hairColor;
  @JsonProperty("EyeColor")
  private EyeColor eyeColor;
  @JsonProperty("HeightInches")
  private Short heightIns;
  @JsonProperty("WeightLbs")
  private Short weightLbs;
}