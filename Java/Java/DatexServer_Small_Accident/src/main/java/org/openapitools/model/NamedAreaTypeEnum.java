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
 * Gets or Sets NamedAreaTypeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum NamedAreaTypeEnum {
  
  APPLICATION_REGION("applicationRegion"),
  
  CONTINENT("continent"),
  
  COUNTRY("country"),
  
  COUNTRY_GROUP("countryGroup"),
  
  CAR_PARK_AREA("carParkArea"),
  
  CARPOOL_AREA("carpoolArea"),
  
  FUZZY_AREA("fuzzyArea"),
  
  INDUSTRIAL_AREA("industrialArea"),
  
  LAKE("lake"),
  
  METEOROLOGICAL_AREA("meteorologicalArea"),
  
  METROPOLITAN_AREA("metropolitanArea"),
  
  MUNICIPALITY("municipality"),
  
  PARK_AND_RIDE_SITE("parkAndRideSite"),
  
  RURAL_COUNTY("ruralCounty"),
  
  SEA("sea"),
  
  TOURIST_AREA("touristArea"),
  
  TRAFFIC_AREA("trafficArea"),
  
  URBAN_COUNTY("urbanCounty"),
  
  ORDER1_ADMINISTRATIVE_AREA("order1AdministrativeArea"),
  
  ORDER2_ADMINISTRATIVE_AREA("order2AdministrativeArea"),
  
  ORDER3_ADMINISTRATIVE_AREA("order3AdministrativeArea"),
  
  ORDER4_ADMINISTRATIVE_AREA("order4AdministrativeArea"),
  
  ORDER5_ADMINISTRATIVE_AREA("order5AdministrativeArea"),
  
  POLICE_FORCE_CONTROL_AREA("policeForceControlArea"),
  
  ROAD_OPERATOR_CONTROL_AREA("roadOperatorControlArea"),
  
  WATER_AREA("waterArea"),
  
  EXTENDED_G("extendedG");

  private String value;

  NamedAreaTypeEnum(String value) {
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
  public static NamedAreaTypeEnum fromValue(String value) {
    for (NamedAreaTypeEnum b : NamedAreaTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

