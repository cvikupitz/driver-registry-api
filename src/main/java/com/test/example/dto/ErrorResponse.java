package com.test.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

  public static final String BAD_REQUEST_MESSAGE =
      "The request could not be processed due to an invalid payload.";

  @JsonProperty("StatusCode")
  private Integer statusCode;
  @JsonProperty("Message")
  private String generalMessage;
  @JsonProperty("ExceptionClass")
  private String exClazz;
  @JsonProperty("Timestamp")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  private Instant timestamp;
  @JsonProperty("Errors")
  private List<String> errors;
}