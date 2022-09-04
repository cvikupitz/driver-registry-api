package com.test.example.model;

import com.test.example.enums.EyeColor;
import com.test.example.enums.Gender;
import com.test.example.enums.HairColor;
import com.test.example.enums.Race;
import com.test.example.model.converter.EyeColorAttributeConverter;
import com.test.example.model.converter.GenderAttributeConverter;
import com.test.example.model.converter.HairColorAttributeConverter;
import com.test.example.model.converter.RaceAttributeConverter;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DRIVER")
public class Driver implements Serializable {

  @Id
  @Column(name = "_ID", nullable = false)
  private Integer _id;

  @Column(name = "SSN", nullable = false, length = 11)
  private String ssn;

  @Column(name = "FIRST_NAME", nullable = false, length = 64)
  private String firstName;

  @Column(name = "MIDDLE_NAME", nullable = false, length = 64)
  private String middleName;

  @Column(name = "LAST_NAME", nullable = false, length = 64)
  private String lastName;

  @Column(name = "DATE_OF_BIRTH", nullable = false)
  private Date dateOfBirth;

  @Column(name = "ADDRESS_LINE_1", nullable = false, length = 128)
  private String addressLine1;

  @Column(name = "ADDRESS_LINE_2", length = 64)
  private String addressLine2;

  @Column(name = "CITY", nullable = false, length = 64)
  private String city;

  @Column(name = "STATE", nullable = false, length = 2)
  private String state;

  @Column(name = "POSTAL_CODE", nullable = false, length = 5)
  private String postalCode;

  @Column(name = "GENDER", nullable = false, length = 1)
  @Convert(converter = GenderAttributeConverter.class)
  private Gender gender;

  @Column(name = "RACE", nullable = false, length = 1)
  @Convert(converter = RaceAttributeConverter.class)
  private Race race;

  @Column(name = "HAIR_COLOR", nullable = false, length = 3)
  @Convert(converter = HairColorAttributeConverter.class)
  private HairColor hairColor;

  @Column(name = "EYE_COLOR", nullable = false, length = 3)
  @Convert(converter = EyeColorAttributeConverter.class)
  private EyeColor eyeColor;

  @Column(name = "HEIGHT_INS", nullable = false)
  private Short heightIns;

  @Column(name = "WEIGHT_LBS", nullable = false)
  private Short weightLbs;

}