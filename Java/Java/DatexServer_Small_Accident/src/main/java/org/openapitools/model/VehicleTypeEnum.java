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
 * Gets or Sets VehicleTypeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum VehicleTypeEnum {
  
  AGRICULTURAL_VEHICLE("agriculturalVehicle"),
  
  ANY_VEHICLE("anyVehicle"),
  
  ARTICULATED_BUS("articulatedBus"),
  
  ARTICULATED_TROLLEY_BUS("articulatedTrolleyBus"),
  
  ARTICULATED_VEHICLE("articulatedVehicle"),
  
  BICYCLE("bicycle"),
  
  BUS("bus"),
  
  CAR("car"),
  
  CARAVAN("caravan"),
  
  CAR_OR_LIGHT_VEHICLE("carOrLightVehicle"),
  
  CAR_WITH_CARAVAN("carWithCaravan"),
  
  CAR_WITH_TRAILER("carWithTrailer"),
  
  CONSTRUCTION_OR_MAINTENANCE_VEHICLE("constructionOrMaintenanceVehicle"),
  
  FOUR_WHEEL_DRIVE("fourWheelDrive"),
  
  HEAVY_GOODS_VEHICLE("heavyGoodsVehicle"),
  
  HEAVY_GOODS_VEHICLE_WITH_TRAILER("heavyGoodsVehicleWithTrailer"),
  
  HEAVY_DUTY_TRANSPORTER("heavyDutyTransporter"),
  
  HEAVY_VEHICLE("heavyVehicle"),
  
  HIGH_SIDED_VEHICLE("highSidedVehicle"),
  
  LIGHT_COMMERCIAL_VEHICLE("lightCommercialVehicle"),
  
  LARGE_CAR("largeCar"),
  
  LARGE_GOODS_VEHICLE("largeGoodsVehicle"),
  
  LIGHT_COMMERCIAL_VEHICLE_WITH_TRAILER("lightCommercialVehicleWithTrailer"),
  
  LONG_HEAVY_LORRY("longHeavyLorry"),
  
  LORRY("lorry"),
  
  METRO("metro"),
  
  MINIBUS("minibus"),
  
  MOPED("moped"),
  
  MOTORCYCLE("motorcycle"),
  
  MOTORCYCLE_WITH_SIDE_CAR("motorcycleWithSideCar"),
  
  MOTORHOME("motorhome"),
  
  MOTORSCOOTER("motorscooter"),
  
  PASSENGER_CAR("passengerCar"),
  
  SMALL_CAR("smallCar"),
  
  TANKER("tanker"),
  
  THREE_WHEELED_VEHICLE("threeWheeledVehicle"),
  
  TRAILER("trailer"),
  
  TRAM("tram"),
  
  TROLLEY_BUS("trolleyBus"),
  
  TWO_WHEELED_VEHICLE("twoWheeledVehicle"),
  
  VAN("van"),
  
  VEHICLE_WITH_CARAVAN("vehicleWithCaravan"),
  
  VEHICLE_WITH_CATALYTIC_CONVERTER("vehicleWithCatalyticConverter"),
  
  VEHICLE_WITHOUT_CATALYTIC_CONVERTER("vehicleWithoutCatalyticConverter"),
  
  VEHICLE_WITH_TRAILER("vehicleWithTrailer"),
  
  WITH_EVEN_NUMBERED_REGISTRATION_PLATES("withEvenNumberedRegistrationPlates"),
  
  WITH_ODD_NUMBERED_REGISTRATION_PLATES("withOddNumberedRegistrationPlates"),
  
  UNKNOWN("unknown"),
  
  OTHER("other"),
  
  EXTENDED_G("extendedG");

  private String value;

  VehicleTypeEnum(String value) {
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
  public static VehicleTypeEnum fromValue(String value) {
    for (VehicleTypeEnum b : VehicleTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

