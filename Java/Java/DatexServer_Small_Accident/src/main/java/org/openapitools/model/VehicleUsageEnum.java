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
 * Gets or Sets VehicleUsageEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum VehicleUsageEnum {
  
  AGRICULTURAL("agricultural"),
  
  CAR_SHARING("carSharing"),
  
  CITY_LOGISTICS("cityLogistics"),
  
  COMMERCIAL("commercial"),
  
  EMERGENCY_SERVICES("emergencyServices"),
  
  MILITARY("military"),
  
  NON_COMMERCIAL("nonCommercial"),
  
  PATROL("patrol"),
  
  RECOVERY_SERVICES("recoveryServices"),
  
  ROAD_MAINTENANCE_OR_CONSTRUCTION("roadMaintenanceOrConstruction"),
  
  ROAD_OPERATOR("roadOperator"),
  
  TAXI("taxi"),
  
  EXTENDED_G("extendedG");

  private String value;

  VehicleUsageEnum(String value) {
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
  public static VehicleUsageEnum fromValue(String value) {
    for (VehicleUsageEnum b : VehicleUsageEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

