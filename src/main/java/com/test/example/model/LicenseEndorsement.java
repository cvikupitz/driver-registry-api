package com.test.example.model;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(schema = "vehicle-registry", catalog = "driver-registry", name = "LICENSE_ENDORSEMENT")
public class LicenseEndorsement implements Serializable {

  @Id
  @Column(name = "_ID", nullable = false)
  private Integer _id;
  @Column(name = "ABBREVIATION", nullable = false)
  private String abbreviation;
  @Column(name = "DESCRIPTION", nullable = false)
  private String description;
}