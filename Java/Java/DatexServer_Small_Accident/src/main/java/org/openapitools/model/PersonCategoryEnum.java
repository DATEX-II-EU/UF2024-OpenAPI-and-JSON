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
 * Gets or Sets PersonCategoryEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum PersonCategoryEnum {
  
  ADULT("adult"),
  
  CHILD("child"),
  
  EMERGENCY_SERVICES_PERSON("emergencyServicesPerson"),
  
  FIREMAN("fireman"),
  
  INFANT("infant"),
  
  MEDICAL_STAFF("medicalStaff"),
  
  MEMBER_OF_THE_PUBLIC("memberOfThePublic"),
  
  POLICEMAN("policeman"),
  
  POLITICIAN("politician"),
  
  PUBLIC_TRANSPORT_PASSENGER("publicTransportPassenger"),
  
  SICK_PERSON("sickPerson"),
  
  TRAFFIC_OFFICER("trafficOfficer"),
  
  TRAFFIC_WARDEN("trafficWarden"),
  
  VERY_IMPORTANT_PERSON("veryImportantPerson"),
  
  EXTENDED_G("extendedG");

  private String value;

  PersonCategoryEnum(String value) {
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
  public static PersonCategoryEnum fromValue(String value) {
    for (PersonCategoryEnum b : PersonCategoryEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

