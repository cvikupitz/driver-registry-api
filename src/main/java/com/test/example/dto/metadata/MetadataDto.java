package com.test.example.dto.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetadataDto {

  @JsonProperty("Id")
  private Integer _id;

  @JsonProperty("Abbreviation")
  private String abbreviation;

  @JsonProperty("Description")
  private String description;
}