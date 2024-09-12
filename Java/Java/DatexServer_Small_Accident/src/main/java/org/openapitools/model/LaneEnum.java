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
 * Gets or Sets LaneEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum LaneEnum {
  
  ALL_LANES_COMPLETE_CARRIAGEWAY("allLanesCompleteCarriageway"),
  
  BUS_LANE("busLane"),
  
  BUS_STOP("busStop"),
  
  CAR_POOL_LANE("carPoolLane"),
  
  CENTRAL_RESERVATION("centralReservation"),
  
  CRAWLER_LANE("crawlerLane"),
  
  CYCLE_LANE("cycleLane"),
  
  EMERGENCY_LANE("emergencyLane"),
  
  ESCAPE_LANE("escapeLane"),
  
  EXPRESS_LANE("expressLane"),
  
  HARD_SHOULDER("hardShoulder"),
  
  HEAVY_VEHICLE_LANE("heavyVehicleLane"),
  
  LAY_BY("layBy"),
  
  LEFT_HAND_TURNING_LANE("leftHandTurningLane"),
  
  LEFT_LANE("leftLane"),
  
  LOCAL_TRAFFIC_LANE("localTrafficLane"),
  
  MIDDLE_LANE("middleLane"),
  
  OVERTAKING_LANE("overtakingLane"),
  
  RIGHT_HAND_TURNING_LANE("rightHandTurningLane"),
  
  RIGHT_LANE("rightLane"),
  
  RUSH_HOUR_LANE("rushHourLane"),
  
  SET_DOWN_AREA("setDownArea"),
  
  SLOW_VEHICLE_LANE("slowVehicleLane"),
  
  THROUGH_TRAFFIC_LANE("throughTrafficLane"),
  
  TIDAL_FLOW_LANE("tidalFlowLane"),
  
  TURNING_LANE("turningLane"),
  
  VERGE("verge"),
  
  EXTENDED_G("extendedG");

  private String value;

  LaneEnum(String value) {
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
  public static LaneEnum fromValue(String value) {
    for (LaneEnum b : LaneEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

