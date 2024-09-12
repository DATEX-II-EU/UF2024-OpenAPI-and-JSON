package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.MultilingualString;
import org.openapitools.model.NamedAreaTypeEnumG;
import org.openapitools.model.NutsCodeTypeEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NutsNamedArea
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class NutsNamedArea {

  private MultilingualString areaName;

  private NamedAreaTypeEnumG namedAreaType;

  private String country;

  private NutsCodeTypeEnumG nutsCodeType;

  private String nutsCode;

  @Valid
  private Map<String, Object> namedAreaExtensionG = new HashMap<>();

  public NutsNamedArea() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NutsNamedArea(MultilingualString areaName, NutsCodeTypeEnumG nutsCodeType, String nutsCode) {
    this.areaName = areaName;
    this.nutsCodeType = nutsCodeType;
    this.nutsCode = nutsCode;
  }

  public NutsNamedArea areaName(MultilingualString areaName) {
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

  public NutsNamedArea namedAreaType(NamedAreaTypeEnumG namedAreaType) {
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

  public NutsNamedArea country(String country) {
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

  public NutsNamedArea nutsCodeType(NutsCodeTypeEnumG nutsCodeType) {
    this.nutsCodeType = nutsCodeType;
    return this;
  }

  /**
   * Get nutsCodeType
   * @return nutsCodeType
   */
  @NotNull @Valid 
  @Schema(name = "nutsCodeType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nutsCodeType")
  public NutsCodeTypeEnumG getNutsCodeType() {
    return nutsCodeType;
  }

  public void setNutsCodeType(NutsCodeTypeEnumG nutsCodeType) {
    this.nutsCodeType = nutsCodeType;
  }

  public NutsNamedArea nutsCode(String nutsCode) {
    this.nutsCode = nutsCode;
    return this;
  }

  /**
   * Get nutsCode
   * @return nutsCode
   */
  @NotNull @Size(max = 1024) 
  @Schema(name = "nutsCode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nutsCode")
  public String getNutsCode() {
    return nutsCode;
  }

  public void setNutsCode(String nutsCode) {
    this.nutsCode = nutsCode;
  }

  public NutsNamedArea namedAreaExtensionG(Map<String, Object> namedAreaExtensionG) {
    this.namedAreaExtensionG = namedAreaExtensionG;
    return this;
  }

  public NutsNamedArea putNamedAreaExtensionGItem(String key, Object namedAreaExtensionGItem) {
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
    NutsNamedArea nutsNamedArea = (NutsNamedArea) o;
    return Objects.equals(this.areaName, nutsNamedArea.areaName) &&
        Objects.equals(this.namedAreaType, nutsNamedArea.namedAreaType) &&
        Objects.equals(this.country, nutsNamedArea.country) &&
        Objects.equals(this.nutsCodeType, nutsNamedArea.nutsCodeType) &&
        Objects.equals(this.nutsCode, nutsNamedArea.nutsCode) &&
        Objects.equals(this.namedAreaExtensionG, nutsNamedArea.namedAreaExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaName, namedAreaType, country, nutsCodeType, nutsCode, namedAreaExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NutsNamedArea {\n");
    sb.append("    areaName: ").append(toIndentedString(areaName)).append("\n");
    sb.append("    namedAreaType: ").append(toIndentedString(namedAreaType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    nutsCodeType: ").append(toIndentedString(nutsCodeType)).append("\n");
    sb.append("    nutsCode: ").append(toIndentedString(nutsCode)).append("\n");
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

