package com.test.example.dto.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetadataResponse {

  @JsonProperty("LicenseTypes")
  private List<LicenseTypeDto> licenseTypes;
  @JsonProperty("LicenseEndorsements")
  private List<LicenseEndorsementDto> licenseEndorsements;
  @JsonProperty("LicenseRestrictions")
  private List<LicenseRestrictionDto> licenseRestrictions;
}