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
 * Gets or Sets LaneEnumExtensionTypeG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum LaneEnumExtensionTypeG {
  
  ADVISORY_CYCLE_LANE("advisoryCycleLane"),
  
  BRIDLE_PATH("bridlePath"),
  
  BUS_AND_CYCLE_LANE("busAndCycleLane"),
  
  FOOT_AND_CYCLE_PATH("footAndCyclePath"),
  
  GUIDED_BUS_WAY("guidedBusWay"),
  
  TAXI_LANE("taxiLane"),
  
  TAXI_RANK("taxiRank"),
  
  TOLL_LANE("tollLane"),
  
  TROLLEY_BUS_LANE("trolleyBusLane");

  private String value;

  LaneEnumExtensionTypeG(String value) {
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
  public static LaneEnumExtensionTypeG fromValue(String value) {
    for (LaneEnumExtensionTypeG b : LaneEnumExtensionTypeG.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

