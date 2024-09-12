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
 * Gets or Sets ComparisonOperatorEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum ComparisonOperatorEnum {
  
  EQUAL_TO("equalTo"),
  
  GREATER_THAN("greaterThan"),
  
  GREATER_THAN_OR_EQUAL_TO("greaterThanOrEqualTo"),
  
  LESS_THAN("lessThan"),
  
  LESS_THAN_OR_EQUAL_TO("lessThanOrEqualTo"),
  
  EXTENDED_G("extendedG");

  private String value;

  ComparisonOperatorEnum(String value) {
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
  public static ComparisonOperatorEnum fromValue(String value) {
    for (ComparisonOperatorEnum b : ComparisonOperatorEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

