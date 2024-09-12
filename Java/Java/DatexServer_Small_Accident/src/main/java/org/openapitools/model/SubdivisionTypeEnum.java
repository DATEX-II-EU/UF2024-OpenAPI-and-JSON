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
 * Gets or Sets SubdivisionTypeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public enum SubdivisionTypeEnum {
  
  ADMINISTRATIVE_ATOLL("administrativeAtoll"),
  
  ADMINISTRATIVE_REGION("administrativeRegion"),
  
  ADMINISTRATIVE_TERRITORY("administrativeTerritory"),
  
  ARCTIC_REGION("arcticRegion"),
  
  AUTONOMOUS_CITY("autonomousCity"),
  
  AUTONOMOUS_CITY_IN_NORTH_AFRICA("autonomousCityInNorthAfrica"),
  
  AUTONOMOUS_COMMUNITY("autonomousCommunity"),
  
  AUTONOMOUS_DISTRICT("autonomousDistrict"),
  
  AUTONOMOUS_PROVINCE("autonomousProvince"),
  
  AUTONOMOUS_REGION("autonomousRegion"),
  
  CANTON("canton"),
  
  CAPITAL_CITY("capitalCity"),
  
  CITY("city"),
  
  CITY_MUNICIPALITY("cityMunicipality"),
  
  CITY_OF_COUNTY_RIGHT("cityOfCountyRight"),
  
  COMMUNE("commune"),
  
  COUNCIL_AREA("councilArea"),
  
  COUNTY("county"),
  
  COUNTRY("country"),
  
  DEPARTMENT("department"),
  
  DEPENDENCY("dependency"),
  
  DISTRICT("district"),
  
  DISTRICT_MUNICIPALITY("districtMunicipality"),
  
  DISTRICT_WITH_SPECIAL_STATUS("districtWithSpecialStatus"),
  
  ENTITY("entity"),
  
  GEOGRAPHICAL_ENTITY("geographicalEntity"),
  
  GOVERNORATE("governorate"),
  
  LAENDER("laender"),
  
  LOCAL_COUNCIL("localCouncil"),
  
  LONDON_BOROUGH("londonBorough"),
  
  METROPOLITAN_AREA("metropolitanArea"),
  
  METROPOLITAN_DEPARTMENT("metropolitanDepartment"),
  
  METROPOLITAN_DISTRICT("metropolitanDistrict"),
  
  METROPOLITAN_REGION("metropolitanRegion"),
  
  MUNICIPALITY("municipality"),
  
  OVERSEAS_DEPARTMENT("overseasDepartment"),
  
  OVERSEAS_REGION("overseasRegion"),
  
  OVERSEAS_TERRITORIAL_COLLECTIVITY("overseasTerritorialCollectivity"),
  
  PARISH("parish"),
  
  PROVINCE("province"),
  
  QUARTER("quarter"),
  
  REGION("region"),
  
  REPUBLIC("republic"),
  
  REPUBLICAN_CITY("republicanCity"),
  
  SELF_GOVERNED_PART("selfGovernedPart"),
  
  SPECIAL_MUNICIPALITY("specialMunicipality"),
  
  STATE("state"),
  
  TERRITORIAL_UNIT("territorialUnit"),
  
  TERRITORY("territory"),
  
  TWO_TIER_COUNTY("twoTierCounty"),
  
  UNITARY_AUTHORITY("unitaryAuthority"),
  
  WARD("ward"),
  
  OTHER("other"),
  
  EXTENDED_G("extendedG");

  private String value;

  SubdivisionTypeEnum(String value) {
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
  public static SubdivisionTypeEnum fromValue(String value) {
    for (SubdivisionTypeEnum b : SubdivisionTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

