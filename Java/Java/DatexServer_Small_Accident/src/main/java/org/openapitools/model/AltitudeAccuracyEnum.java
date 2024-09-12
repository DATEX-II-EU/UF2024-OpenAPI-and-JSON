package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AltitudeAccuracyEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum AltitudeAccuracyEnum {
  
  EQUAL_TO_OR_LESS_THAN1_CENTIMETRE("equalToOrLessThan1Centimetre"),
  
  EQUAL_TO_OR_LESS_THAN2_CENTIMETRES("equalToOrLessThan2Centimetres"),
  
  EQUAL_TO_OR_LESS_THAN5_CENTIMETRES("equalToOrLessThan5Centimetres"),
  
  EQUAL_TO_OR_LESS_THAN10_CENTIMETRES("equalToOrLessThan10Centimetres"),
  
  EQUAL_TO_OR_LESS_THAN20_CENTIMETRES("equalToOrLessThan20Centimetres"),
  
  EQUAL_TO_OR_LESS_THAN50_CENTIMETRES("equalToOrLessThan50Centimetres"),
  
  EQUAL_TO_OR_LESS_THAN1_METRE("equalToOrLessThan1Metre"),
  
  EQUAL_TO_OR_LESS_THAN2_METRES("equalToOrLessThan2Metres"),
  
  EQUAL_TO_OR_LESS_THAN5_METRES("equalToOrLessThan5Metres"),
  
  EQUAL_TO_OR_LESS_THAN10_METRES("equalToOrLessThan10Metres"),
  
  EQUAL_TO_OR_LESS_THAN20_METRES("equalToOrLessThan20Metres"),
  
  EQUAL_TO_OR_LESS_THAN50_METRES("equalToOrLessThan50Metres"),
  
  EQUAL_TO_OR_LESS_THAN100_METRES("equalToOrLessThan100Metres"),
  
  EQUAL_TO_OR_LESS_THAN200_METRES("equalToOrLessThan200Metres"),
  
  EXTENDED_G("extendedG");

  private String value;

  AltitudeAccuracyEnum(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AltitudeAccuracyEnum fromValue(String value) {
    for (AltitudeAccuracyEnum b : AltitudeAccuracyEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

