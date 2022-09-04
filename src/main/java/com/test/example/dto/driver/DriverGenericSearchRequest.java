package com.test.example.dto.driver;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverGenericSearchRequest {

  private String ssn;

  private String firstName;

  private String middleName;

  private String lastName;

  private Date dateOfBirth;

  private String addresLine1;

  private String addresLine2;

  private String city;

  private String state;

  private String postalCode;

//  private Gender gender;
//
//  private Race race;
//
//  private HairColor hairColor;
//
//  private EyeColor eyeColor;

  private Short heightIns;

  private Short weightLbs;

  private Integer maxResults;

}