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
 * Gets or Sets AccidentCauseEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum AccidentCauseEnum {
  
  AVOIDANCE_OF_OBSTACLES("avoidanceOfObstacles"),
  
  DRIVER_DISTRACTION("driverDistraction"),
  
  DRIVER_DRUG_ABUSE("driverDrugAbuse"),
  
  DRIVER_ILLNESS("driverIllness"),
  
  EXCEEDING_SPEEDS_LIMITS("exceedingSpeedsLimits"),
  
  EXCESS_ALCOHOL("excessAlcohol"),
  
  EXCESSIVE_DRIVER_TIREDNESS("excessiveDriverTiredness"),
  
  IMPERMISSIBLE_MANOEUVRE("impermissibleManoeuvre"),
  
  LIMITED_VISIBILITY("limitedVisibility"),
  
  NOT_KEEPING_A_SAFE_DISTANCE("notKeepingASafeDistance"),
  
  ON_THE_WRONG_SIDE_OF_THE_ROAD("onTheWrongSideOfTheRoad"),
  
  PEDESTRIAN_IN_ROAD("pedestrianInRoad"),
  
  POOR_LANE_ADHERENCE("poorLaneAdherence"),
  
  POOR_MERGE_ENTRY_OR_EXIT_JUDGEMENT("poorMergeEntryOrExitJudgement"),
  
  POOR_ROAD_SURFACE_CONDITION("poorRoadSurfaceCondition"),
  
  POOR_SURFACE_ADHERENCE("poorSurfaceAdherence"),
  
  UNDISCLOSED("undisclosed"),
  
  UNKNOWN("unknown"),
  
  VEHICLE_FAILURE("vehicleFailure"),
  
  OTHER("other"),
  
  EXTENDED_G("extendedG");

  private String value;

  AccidentCauseEnum(String value) {
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
  public static AccidentCauseEnum fromValue(String value) {
    for (AccidentCauseEnum b : AccidentCauseEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

