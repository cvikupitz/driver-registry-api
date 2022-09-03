package com.test.example.dto.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LicenseTypeDto {

  @JsonProperty("LicenseTypeId")
  private Integer _id;
  @JsonProperty("LicenseTypeAbbr")
  private String abbreviation;
  @JsonProperty("LicenseTypeName")
  private String name;
}