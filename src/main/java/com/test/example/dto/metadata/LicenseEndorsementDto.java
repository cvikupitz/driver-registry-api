package com.test.example.dto.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LicenseEndorsementDto {

  @JsonProperty("LicenseEndorsementId")
  private Integer _id;
  @JsonProperty("LicenseEndorsementAbbr")
  private String abbreviation;
  @JsonProperty("LicenseEndorsementDesc")
  private String description;
}