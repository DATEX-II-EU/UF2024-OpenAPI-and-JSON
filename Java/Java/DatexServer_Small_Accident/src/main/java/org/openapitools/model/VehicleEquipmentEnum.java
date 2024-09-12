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
 * Gets or Sets VehicleEquipmentEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum VehicleEquipmentEnum {
  
  NOT_USING_SNOW_CHAINS("notUsingSnowChains"),
  
  NOT_USING_SNOW_CHAINS_OR_TYRES("notUsingSnowChainsOrTyres"),
  
  SNOW_CHAINS_IN_USE("snowChainsInUse"),
  
  SNOW_TYRES_IN_USE("snowTyresInUse"),
  
  SNOW_CHAINS_OR_TYRES_IN_USE("snowChainsOrTyresInUse"),
  
  WITHOUT_SNOW_TYRES_OR_CHAINS_ON_BOARD("withoutSnowTyresOrChainsOnBoard"),
  
  EXTENDED_G("extendedG");

  private String value;

  VehicleEquipmentEnum(String value) {
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
  public static VehicleEquipmentEnum fromValue(String value) {
    for (VehicleEquipmentEnum b : VehicleEquipmentEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

