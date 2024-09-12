package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.MultilingualString;
import org.openapitools.model.NamedAreaTypeEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NamedArea
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class NamedArea {

  private MultilingualString areaName;

  private NamedAreaTypeEnumG namedAreaType;

  private String country;

  @Valid
  private Map<String, Object> namedAreaExtensionG = new HashMap<>();

  public NamedArea() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NamedArea(MultilingualString areaName) {
    this.areaName = areaName;
  }

  public NamedArea areaName(MultilingualString areaName) {
    this.areaName = areaName;
    return this;
  }

  /**
   * Get areaName
   * @return areaName
   */
  @NotNull @Valid 
  @Schema(name = "areaName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("areaName")
  public MultilingualString getAreaName() {
    return areaName;
  }

  public void setAreaName(MultilingualString areaName) {
    this.areaName = areaName;
  }

  public NamedArea namedAreaType(NamedAreaTypeEnumG namedAreaType) {
    this.namedAreaType = namedAreaType;
    return this;
  }

  /**
   * Get namedAreaType
   * @return namedAreaType
   */
  @Valid 
  @Schema(name = "namedAreaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namedAreaType")
  public NamedAreaTypeEnumG getNamedAreaType() {
    return namedAreaType;
  }

  public void setNamedAreaType(NamedAreaTypeEnumG namedAreaType) {
    this.namedAreaType = namedAreaType;
  }

  public NamedArea country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @Size(max = 1024) 
  @Schema(name = "country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public NamedArea namedAreaExtensionG(Map<String, Object> namedAreaExtensionG) {
    this.namedAreaExtensionG = namedAreaExtensionG;
    return this;
  }

  public NamedArea putNamedAreaExtensionGItem(String key, Object namedAreaExtensionGItem) {
    if (this.namedAreaExtensionG == null) {
      this.namedAreaExtensionG = new HashMap<>();
    }
    this.namedAreaExtensionG.put(key, namedAreaExtensionGItem);
    return this;
  }

  /**
   * Get namedAreaExtensionG
   * @return namedAreaExtensionG
   */
  
  @Schema(name = "namedAreaExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namedAreaExtensionG")
  public Map<String, Object> getNamedAreaExtensionG() {
    return namedAreaExtensionG;
  }

  public void setNamedAreaExtensionG(Map<String, Object> namedAreaExtensionG) {
    this.namedAreaExtensionG = namedAreaExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedArea namedArea = (NamedArea) o;
    return Objects.equals(this.areaName, namedArea.areaName) &&
        Objects.equals(this.namedAreaType, namedArea.namedAreaType) &&
        Objects.equals(this.country, namedArea.country) &&
        Objects.equals(this.namedAreaExtensionG, namedArea.namedAreaExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaName, namedAreaType, country, namedAreaExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedArea {\n");
    sb.append("    areaName: ").append(toIndentedString(areaName)).append("\n");
    sb.append("    namedAreaType: ").append(toIndentedString(namedAreaType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    namedAreaExtensionG: ").append(toIndentedString(namedAreaExtensionG)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

