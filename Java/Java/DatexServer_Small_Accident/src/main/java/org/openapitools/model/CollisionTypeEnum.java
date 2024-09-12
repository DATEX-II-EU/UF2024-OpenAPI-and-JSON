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
 * Gets or Sets CollisionTypeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum CollisionTypeEnum {
  
  COLLISION_WITH_ANIMAL("collisionWithAnimal"),
  
  COLLISION_WITH_OBSTACLE("collisionWithObstacle"),
  
  COLLISION_WITH_PERSON("collisionWithPerson"),
  
  HEAD_ON_COLLISION("headOnCollision"),
  
  HEAD_ON_OR_SIDE_COLLISION("headOnOrSideCollision"),
  
  MULTIPLE_VEHICLE_COLLISION("multipleVehicleCollision"),
  
  REAR_COLLISION("rearCollision"),
  
  SIDE_COLLISION("sideCollision"),
  
  EXTENDED_G("extendedG");

  private String value;

  CollisionTypeEnum(String value) {
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
  public static CollisionTypeEnum fromValue(String value) {
    for (CollisionTypeEnum b : CollisionTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

