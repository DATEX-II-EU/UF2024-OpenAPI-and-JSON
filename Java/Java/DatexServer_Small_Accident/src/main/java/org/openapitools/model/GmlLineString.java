package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GmlLineString
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GmlLineString {

  private Integer srsDimension;

  private String srsName;

  private String posList;

  @Valid
  private Map<String, Object> gmlLineStringExtensionG = new HashMap<>();

  public GmlLineString() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GmlLineString(String posList) {
    this.posList = posList;
  }

  public GmlLineString srsDimension(Integer srsDimension) {
    this.srsDimension = srsDimension;
    return this;
  }

  /**
   * Get srsDimension
   * minimum: 0
   * @return srsDimension
   */
  @Min(0) 
  @Schema(name = "srsDimension", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("srsDimension")
  public Integer getSrsDimension() {
    return srsDimension;
  }

  public void setSrsDimension(Integer srsDimension) {
    this.srsDimension = srsDimension;
  }

  public GmlLineString srsName(String srsName) {
    this.srsName = srsName;
    return this;
  }

  /**
   * Get srsName
   * @return srsName
   */
  @Size(max = 1024) 
  @Schema(name = "srsName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("srsName")
  public String getSrsName() {
    return srsName;
  }

  public void setSrsName(String srsName) {
    this.srsName = srsName;
  }

  public GmlLineString posList(String posList) {
    this.posList = posList;
    return this;
  }

  /**
   * Get posList
   * @return posList
   */
  @NotNull 
  @Schema(name = "posList", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("posList")
  public String getPosList() {
    return posList;
  }

  public void setPosList(String posList) {
    this.posList = posList;
  }

  public GmlLineString gmlLineStringExtensionG(Map<String, Object> gmlLineStringExtensionG) {
    this.gmlLineStringExtensionG = gmlLineStringExtensionG;
    return this;
  }

  public GmlLineString putGmlLineStringExtensionGItem(String key, Object gmlLineStringExtensionGItem) {
    if (this.gmlLineStringExtensionG == null) {
      this.gmlLineStringExtensionG = new HashMap<>();
    }
    this.gmlLineStringExtensionG.put(key, gmlLineStringExtensionGItem);
    return this;
  }

  /**
   * Get gmlLineStringExtensionG
   * @return gmlLineStringExtensionG
   */
  
  @Schema(name = "gmlLineStringExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gmlLineStringExtensionG")
  public Map<String, Object> getGmlLineStringExtensionG() {
    return gmlLineStringExtensionG;
  }

  public void setGmlLineStringExtensionG(Map<String, Object> gmlLineStringExtensionG) {
    this.gmlLineStringExtensionG = gmlLineStringExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GmlLineString gmlLineString = (GmlLineString) o;
    return Objects.equals(this.srsDimension, gmlLineString.srsDimension) &&
        Objects.equals(this.srsName, gmlLineString.srsName) &&
        Objects.equals(this.posList, gmlLineString.posList) &&
        Objects.equals(this.gmlLineStringExtensionG, gmlLineString.gmlLineStringExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srsDimension, srsName, posList, gmlLineStringExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GmlLineString {\n");
    sb.append("    srsDimension: ").append(toIndentedString(srsDimension)).append("\n");
    sb.append("    srsName: ").append(toIndentedString(srsName)).append("\n");
    sb.append("    posList: ").append(toIndentedString(posList)).append("\n");
    sb.append("    gmlLineStringExtensionG: ").append(toIndentedString(gmlLineStringExtensionG)).append("\n");
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

