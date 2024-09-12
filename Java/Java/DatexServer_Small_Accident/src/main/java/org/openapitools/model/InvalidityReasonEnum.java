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
 * Gets or Sets InvalidityReasonEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum InvalidityReasonEnum {
  
  INVALID_CIS_INFORMATION("invalidCISInformation"),
  
  INVALID_CLIENT("invalidClient"),
  
  INVALID_EXCHANGE_CONTEXT("invalidExchangeContext"),
  
  INVALID_INFORMATION_MANAGEMENT("invalidInformationManagement"),
  
  INVALID_MESSAGE("invalidMessage"),
  
  INVALID_PAYLOAD("invalidPayload"),
  
  INVALID_SEQUENCING_NUMBER("invalidSequencingNumber"),
  
  INVALID_SESSION("invalidSession"),
  
  INVALID_SUPPLIER("invalidSupplier"),
  
  OTHER("other"),
  
  EXTENDED_G("extendedG");

  private String value;

  InvalidityReasonEnum(String value) {
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
  public static InvalidityReasonEnum fromValue(String value) {
    for (InvalidityReasonEnum b : InvalidityReasonEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

