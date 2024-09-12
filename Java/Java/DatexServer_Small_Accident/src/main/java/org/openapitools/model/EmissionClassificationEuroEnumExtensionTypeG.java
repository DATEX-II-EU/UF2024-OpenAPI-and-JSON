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
 * Gets or Sets EmissionClassificationEuroEnumExtensionTypeG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum EmissionClassificationEuroEnumExtensionTypeG {
  
  EURO0("euro0"),
  
  EURO1("euro1"),
  
  EURO2("euro2"),
  
  EURO3("euro3"),
  
  EURO4("euro4"),
  
  EURO6D("euro6d"),
  
  EURO6D_TEMP("euro6dTemp"),
  
  EURO_IV("euroIV"),
  
  EURO_UNKNOWN("euroUnknown"),
  
  EURO_I("euroI"),
  
  EURO_II("euroII"),
  
  EURO_III("euroIII");

  private String value;

  EmissionClassificationEuroEnumExtensionTypeG(String value) {
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
  public static EmissionClassificationEuroEnumExtensionTypeG fromValue(String value) {
    for (EmissionClassificationEuroEnumExtensionTypeG b : EmissionClassificationEuroEnumExtensionTypeG.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

