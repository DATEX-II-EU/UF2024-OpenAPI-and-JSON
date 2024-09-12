package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.PointCoordinates;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PointByCoordinates
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PointByCoordinates {

  private Integer bearing;

  private PointCoordinates pointCoordinates;

  @Valid
  private Map<String, Object> pointByCoordinatesExtensionG = new HashMap<>();

  public PointByCoordinates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PointByCoordinates(PointCoordinates pointCoordinates) {
    this.pointCoordinates = pointCoordinates;
  }

  public PointByCoordinates bearing(Integer bearing) {
    this.bearing = bearing;
    return this;
  }

  /**
   * Get bearing
   * minimum: 0
   * @return bearing
   */
  @Min(0) 
  @Schema(name = "bearing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bearing")
  public Integer getBearing() {
    return bearing;
  }

  public void setBearing(Integer bearing) {
    this.bearing = bearing;
  }

  public PointByCoordinates pointCoordinates(PointCoordinates pointCoordinates) {
    this.pointCoordinates = pointCoordinates;
    return this;
  }

  /**
   * Get pointCoordinates
   * @return pointCoordinates
   */
  @NotNull @Valid 
  @Schema(name = "pointCoordinates", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pointCoordinates")
  public PointCoordinates getPointCoordinates() {
    return pointCoordinates;
  }

  public void setPointCoordinates(PointCoordinates pointCoordinates) {
    this.pointCoordinates = pointCoordinates;
  }

  public PointByCoordinates pointByCoordinatesExtensionG(Map<String, Object> pointByCoordinatesExtensionG) {
    this.pointByCoordinatesExtensionG = pointByCoordinatesExtensionG;
    return this;
  }

  public PointByCoordinates putPointByCoordinatesExtensionGItem(String key, Object pointByCoordinatesExtensionGItem) {
    if (this.pointByCoordinatesExtensionG == null) {
      this.pointByCoordinatesExtensionG = new HashMap<>();
    }
    this.pointByCoordinatesExtensionG.put(key, pointByCoordinatesExtensionGItem);
    return this;
  }

  /**
   * Get pointByCoordinatesExtensionG
   * @return pointByCoordinatesExtensionG
   */
  
  @Schema(name = "pointByCoordinatesExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointByCoordinatesExtensionG")
  public Map<String, Object> getPointByCoordinatesExtensionG() {
    return pointByCoordinatesExtensionG;
  }

  public void setPointByCoordinatesExtensionG(Map<String, Object> pointByCoordinatesExtensionG) {
    this.pointByCoordinatesExtensionG = pointByCoordinatesExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointByCoordinates pointByCoordinates = (PointByCoordinates) o;
    return Objects.equals(this.bearing, pointByCoordinates.bearing) &&
        Objects.equals(this.pointCoordinates, pointByCoordinates.pointCoordinates) &&
        Objects.equals(this.pointByCoordinatesExtensionG, pointByCoordinates.pointByCoordinatesExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bearing, pointCoordinates, pointByCoordinatesExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointByCoordinates {\n");
    sb.append("    bearing: ").append(toIndentedString(bearing)).append("\n");
    sb.append("    pointCoordinates: ").append(toIndentedString(pointCoordinates)).append("\n");
    sb.append("    pointByCoordinatesExtensionG: ").append(toIndentedString(pointByCoordinatesExtensionG)).append("\n");
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

