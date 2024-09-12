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
 * Gets or Sets VehicleStatusEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum VehicleStatusEnum {
  
  ABANDONED("abandoned"),
  
  BROKEN_DOWN("brokenDown"),
  
  BURNT_OUT("burntOut"),
  
  DAMAGED("damaged"),
  
  DAMAGED_AND_IMMOBILIZED("damagedAndImmobilized"),
  
  IN_DITCH("inDitch"),
  
  JACKNIFED("jacknifed"),
  
  OFF_ROAD("offRoad"),
  
  ON_FIRE("onFire"),
  
  ON_TOP_OF_CRASH_BARRIER("onTopOfCrashBarrier"),
  
  ON_WHEELS("onWheels"),
  
  OVERTURNED("overturned"),
  
  ROLLABLE("rollable"),
  
  SPUN_AROUND("spunAround"),
  
  EXTENDED_G("extendedG");

  private String value;

  VehicleStatusEnum(String value) {
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
  public static VehicleStatusEnum fromValue(String value) {
    for (VehicleStatusEnum b : VehicleStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

