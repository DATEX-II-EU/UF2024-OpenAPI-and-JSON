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
 * Gets or Sets ProtocolTypeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum ProtocolTypeEnum {
  
  DELTA_PULL("deltaPull"),
  
  DELTA_PUSH("deltaPush"),
  
  OTHER("other"),
  
  SIMPLE_CIS("simpleCIS"),
  
  SIMPLE_PUSH("simplePush"),
  
  SNAPSHOT_PULL("snapshotPull"),
  
  SNAPSHOT_PUSH("snapshotPush"),
  
  STATEFUL_CIS("statefulCIS"),
  
  STATEFUL_PUSH("statefulPush"),
  
  EXTENDED_G("extendedG");

  private String value;

  ProtocolTypeEnum(String value) {
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
  public static ProtocolTypeEnum fromValue(String value) {
    for (ProtocolTypeEnum b : ProtocolTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

