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
 * Gets or Sets AccidentTypeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum AccidentTypeEnum {
  
  ACCIDENT("accident"),
  
  ACCIDENT_INVOLVING_HAZARDOUS_MATERIALS("accidentInvolvingHazardousMaterials"),
  
  ACCIDENT_INVOLVING_HEAVY_LORRIES("accidentInvolvingHeavyLorries"),
  
  ACCIDENT_INVOLVING_MASS_TRANSIT_VEHICLE("accidentInvolvingMassTransitVehicle"),
  
  ACCIDENT_INVOLVING_PUBLIC_TRANSPORT("accidentInvolvingPublicTransport"),
  
  ACCIDENT_INVOLVING_RADIOACTIVE_MATERIAL("accidentInvolvingRadioactiveMaterial"),
  
  ACCIDENT_INVOLVING_TRAIN("accidentInvolvingTrain"),
  
  COLLISION("collision"),
  
  MULTIPLE_VEHICLE_ACCIDENT("multipleVehicleAccident"),
  
  SECONDARY_ACCIDENT("secondaryAccident"),
  
  SERIOUS_INJURY_OR_FATAL_ACCIDENT("seriousInjuryOrFatalAccident"),
  
  VEHICLE_STUCK_UNDER_BRIDGE("vehicleStuckUnderBridge"),
  
  OTHER("other"),
  
  EXTENDED_G("extendedG");

  private String value;

  AccidentTypeEnum(String value) {
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
  public static AccidentTypeEnum fromValue(String value) {
    for (AccidentTypeEnum b : AccidentTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

