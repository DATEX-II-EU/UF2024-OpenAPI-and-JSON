package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.LaneEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Lane
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Lane {

  private Integer laneNumber;

  private LaneEnumG laneUsage;

  @Valid
  private Map<String, Object> laneExtensionG = new HashMap<>();

  public Lane laneNumber(Integer laneNumber) {
    this.laneNumber = laneNumber;
    return this;
  }

  /**
   * Get laneNumber
   * @return laneNumber
   */
  
  @Schema(name = "laneNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("laneNumber")
  public Integer getLaneNumber() {
    return laneNumber;
  }

  public void setLaneNumber(Integer laneNumber) {
    this.laneNumber = laneNumber;
  }

  public Lane laneUsage(LaneEnumG laneUsage) {
    this.laneUsage = laneUsage;
    return this;
  }

  /**
   * Get laneUsage
   * @return laneUsage
   */
  @Valid 
  @Schema(name = "laneUsage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("laneUsage")
  public LaneEnumG getLaneUsage() {
    return laneUsage;
  }

  public void setLaneUsage(LaneEnumG laneUsage) {
    this.laneUsage = laneUsage;
  }

  public Lane laneExtensionG(Map<String, Object> laneExtensionG) {
    this.laneExtensionG = laneExtensionG;
    return this;
  }

  public Lane putLaneExtensionGItem(String key, Object laneExtensionGItem) {
    if (this.laneExtensionG == null) {
      this.laneExtensionG = new HashMap<>();
    }
    this.laneExtensionG.put(key, laneExtensionGItem);
    return this;
  }

  /**
   * Get laneExtensionG
   * @return laneExtensionG
   */
  
  @Schema(name = "laneExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("laneExtensionG")
  public Map<String, Object> getLaneExtensionG() {
    return laneExtensionG;
  }

  public void setLaneExtensionG(Map<String, Object> laneExtensionG) {
    this.laneExtensionG = laneExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lane lane = (Lane) o;
    return Objects.equals(this.laneNumber, lane.laneNumber) &&
        Objects.equals(this.laneUsage, lane.laneUsage) &&
        Objects.equals(this.laneExtensionG, lane.laneExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(laneNumber, laneUsage, laneExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lane {\n");
    sb.append("    laneNumber: ").append(toIndentedString(laneNumber)).append("\n");
    sb.append("    laneUsage: ").append(toIndentedString(laneUsage)).append("\n");
    sb.append("    laneExtensionG: ").append(toIndentedString(laneExtensionG)).append("\n");
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

