package com.test.example.model;

import com.test.example.constants.ConstraintConstants;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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

  @Column(name = "SSN", nullable = false, updatable = false, length = ConstraintConstants.SSN_LENGTH)
  private String ssn;

  @Column(name = "FIRST_NAME", nullable = false, length = ConstraintConstants.FIRST_NAME_LENGTH)
  private String firstName;

  @Column(name = "MIDDLE_NAME", nullable = false, length = ConstraintConstants.MIDDLE_NAME_LENGTH)
  private String middleName;

  @Column(name = "LAST_NAME", nullable = false, length = ConstraintConstants.LAST_NAME_LENGTH)
  private String lastName;

  @Column(name = "DATE_OF_BIRTH", nullable = false, updatable = false)
  private Date dateOfBirth;

  @Column(name = "ADDRESS_LINE_1", nullable = false, length = ConstraintConstants.ADDRESS_LINE1_LENGTH)
  private String addressLine1;

  @Column(name = "ADDRESS_LINE_2", length = ConstraintConstants.ADDRESS_LINE2_LENGTH)
  private String addressLine2;

  @Column(name = "CITY", nullable = false, length = ConstraintConstants.CITY_LENGTH)
  private String city;

  @Column(name = "STATE", nullable = false, length = ConstraintConstants.STATE_LENGTH)
  private String state;

  @Column(name = "POSTAL_CODE", nullable = false, length = ConstraintConstants.POSTAL_CODE_LENGTH)
  private String postalCode;

  @OneToOne
  @JoinColumn(name = "GENDER_ID", nullable = false) // TODO - Check these associations - is this correct?
  private DriverGender gender;

  @OneToOne
  @JoinColumn(name = "RACE_ID", nullable = false)
  private DriverRace race;

  @OneToOne
  @JoinColumn(name = "HAIR_COLOR_ID", nullable = false)
  private DriverHairColor hairColor;

  @OneToOne
  @JoinColumn(name = "EYE_COLOR_ID", nullable = false)
  private DriverEyeColor eyeColor;

  @Column(name = "HEIGHT_INS", nullable = false)
  private Short heightIns;

  @Column(name = "WEIGHT_LBS", nullable = false)
  private Short weightLbs;

}