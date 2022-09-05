package com.test.example.dto.driver;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverIdDto {

  @JsonProperty("DriverId")
  private Long driverId;
}