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
  private List<MetadataDto> licenseTypes;

  @JsonProperty("LicenseEndorsements")
  private List<MetadataDto> licenseEndorsements;

  @JsonProperty("LicenseRestrictions")
  private List<MetadataDto> licenseRestrictions;

  @JsonProperty("DriverGenders")
  private List<MetadataDto> driverGenders;

  @JsonProperty("DriverRaces")
  private List<MetadataDto> driverRaces;

  @JsonProperty("DriverHairColors")
  private List<MetadataDto> driverHairColors;

  @JsonProperty("DriverEyeColors")
  private List<MetadataDto> driverEyeColors;

}