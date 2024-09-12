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
 * Gets or Sets CarriagewayEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum CarriagewayEnum {
  
  CONNECTING_CARRIAGEWAY("connectingCarriageway"),
  
  CYCLE_TRACK("cycleTrack"),
  
  ENTRY_SLIP_ROAD("entrySlipRoad"),
  
  EXIT_SLIP_ROAD("exitSlipRoad"),
  
  FLYOVER("flyover"),
  
  FOOTPATH("footpath"),
  
  LEFT_HAND_PARALLEL_CARRIAGEWAY("leftHandParallelCarriageway"),
  
  LEFT_HAND_FEEDER_ROAD("leftHandFeederRoad"),
  
  MAIN_CARRIAGEWAY("mainCarriageway"),
  
  OPPOSITE_CARRIAGEWAY("oppositeCarriageway"),
  
  PARALLEL_CARRIAGEWAY("parallelCarriageway"),
  
  RIGHT_HAND_FEEDER_ROAD("rightHandFeederRoad"),
  
  RIGHT_HAND_PARALLEL_CARRIAGEWAY("rightHandParallelCarriageway"),
  
  ROUNDABOUT("roundabout"),
  
  SERVICE_ROAD("serviceRoad"),
  
  SLIP_ROADS("slipRoads"),
  
  UNDERPASS("underpass"),
  
  UNSPECIFIED_CARRIAGEWAY("unspecifiedCarriageway"),
  
  EXTENDED_G("extendedG");

  private String value;

  CarriagewayEnum(String value) {
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
  public static CarriagewayEnum fromValue(String value) {
    for (CarriagewayEnum b : CarriagewayEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

