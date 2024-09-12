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
 * OffsetDistance
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OffsetDistance {

  private Integer offsetDistance;

  @Valid
  private Map<String, Object> offsetDistanceExtensionG = new HashMap<>();

  public OffsetDistance() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OffsetDistance(Integer offsetDistance) {
    this.offsetDistance = offsetDistance;
  }

  public OffsetDistance offsetDistance(Integer offsetDistance) {
    this.offsetDistance = offsetDistance;
    return this;
  }

  /**
   * Get offsetDistance
   * minimum: 0
   * @return offsetDistance
   */
  @NotNull @Min(0) 
  @Schema(name = "offsetDistance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offsetDistance")
  public Integer getOffsetDistance() {
    return offsetDistance;
  }

  public void setOffsetDistance(Integer offsetDistance) {
    this.offsetDistance = offsetDistance;
  }

  public OffsetDistance offsetDistanceExtensionG(Map<String, Object> offsetDistanceExtensionG) {
    this.offsetDistanceExtensionG = offsetDistanceExtensionG;
    return this;
  }

  public OffsetDistance putOffsetDistanceExtensionGItem(String key, Object offsetDistanceExtensionGItem) {
    if (this.offsetDistanceExtensionG == null) {
      this.offsetDistanceExtensionG = new HashMap<>();
    }
    this.offsetDistanceExtensionG.put(key, offsetDistanceExtensionGItem);
    return this;
  }

  /**
   * Get offsetDistanceExtensionG
   * @return offsetDistanceExtensionG
   */
  
  @Schema(name = "offsetDistanceExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offsetDistanceExtensionG")
  public Map<String, Object> getOffsetDistanceExtensionG() {
    return offsetDistanceExtensionG;
  }

  public void setOffsetDistanceExtensionG(Map<String, Object> offsetDistanceExtensionG) {
    this.offsetDistanceExtensionG = offsetDistanceExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffsetDistance offsetDistance = (OffsetDistance) o;
    return Objects.equals(this.offsetDistance, offsetDistance.offsetDistance) &&
        Objects.equals(this.offsetDistanceExtensionG, offsetDistance.offsetDistanceExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offsetDistance, offsetDistanceExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffsetDistance {\n");
    sb.append("    offsetDistance: ").append(toIndentedString(offsetDistance)).append("\n");
    sb.append("    offsetDistanceExtensionG: ").append(toIndentedString(offsetDistanceExtensionG)).append("\n");
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

