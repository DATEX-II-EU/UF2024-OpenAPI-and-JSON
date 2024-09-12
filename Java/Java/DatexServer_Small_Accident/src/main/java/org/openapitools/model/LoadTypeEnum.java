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
 * Gets or Sets LoadTypeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum LoadTypeEnum {
  
  ABNORMAL_LOAD("abnormalLoad"),
  
  AMMUNITION("ammunition"),
  
  CHEMICALS("chemicals"),
  
  COMBUSTIBLE_MATERIALS("combustibleMaterials"),
  
  CORROSIVE_MATERIALS("corrosiveMaterials"),
  
  DEBRIS("debris"),
  
  EMPTY("empty"),
  
  EXPLOSIVE_MATERIALS("explosiveMaterials"),
  
  EXTRA_HIGH_LOAD("extraHighLoad"),
  
  EXTRA_LONG_LOAD("extraLongLoad"),
  
  EXTRA_WIDE_LOAD("extraWideLoad"),
  
  FUEL("fuel"),
  
  GLASS("glass"),
  
  GOODS("goods"),
  
  HAZARDOUS_MATERIALS("hazardousMaterials"),
  
  LIQUID("liquid"),
  
  LIVESTOCK("livestock"),
  
  MATERIALS("materials"),
  
  MATERIALS_DANGEROUS_FOR_PEOPLE("materialsDangerousForPeople"),
  
  MATERIALS_DANGEROUS_FOR_THE_ENVIRONMENT("materialsDangerousForTheEnvironment"),
  
  MATERIALS_DANGEROUS_FOR_WATER("materialsDangerousForWater"),
  
  OIL("oil"),
  
  ORDINARY("ordinary"),
  
  PERISHABLE_PRODUCTS("perishableProducts"),
  
  PETROL("petrol"),
  
  PHARMACEUTICAL_MATERIALS("pharmaceuticalMaterials"),
  
  RADIOACTIVE_MATERIALS("radioactiveMaterials"),
  
  REFRIGERATED_GOODS("refrigeratedGoods"),
  
  REFUSE("refuse"),
  
  TOXIC_MATERIALS("toxicMaterials"),
  
  VEHICLES("vehicles"),
  
  OTHER("other"),
  
  EXTENDED_G("extendedG");

  private String value;

  LoadTypeEnum(String value) {
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
  public static LoadTypeEnum fromValue(String value) {
    for (LoadTypeEnum b : LoadTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

