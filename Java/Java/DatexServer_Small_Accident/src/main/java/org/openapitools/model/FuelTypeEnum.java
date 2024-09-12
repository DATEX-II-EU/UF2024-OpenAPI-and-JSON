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
 * Gets or Sets FuelTypeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum FuelTypeEnum {
  
  ALL("all"),
  
  BATTERY("battery"),
  
  BIODIESEL("biodiesel"),
  
  DIESEL("diesel"),
  
  DIESEL_BATTERY_HYBRID("dieselBatteryHybrid"),
  
  ETHANOL("ethanol"),
  
  HYDROGEN("hydrogen"),
  
  LIQUID_GAS("liquidGas"),
  
  LPG("lpg"),
  
  METHANE("methane"),
  
  PETROL("petrol"),
  
  PETROL95_OCTANE("petrol95Octane"),
  
  PETROL98_OCTANE("petrol98Octane"),
  
  PETROL_BATTERY_HYBRID("petrolBatteryHybrid"),
  
  PETROL_LEADED("petrolLeaded"),
  
  PETROL_UNLEADED("petrolUnleaded"),
  
  UNKNOWN("unknown"),
  
  OTHER("other"),
  
  EXTENDED_G("extendedG");

  private String value;

  FuelTypeEnum(String value) {
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
  public static FuelTypeEnum fromValue(String value) {
    for (FuelTypeEnum b : FuelTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

