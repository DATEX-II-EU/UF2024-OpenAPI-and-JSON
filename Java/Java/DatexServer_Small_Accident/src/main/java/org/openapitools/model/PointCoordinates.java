package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.HeightCoordinate;
import org.openapitools.model.PositionAccuracy;
import org.openapitools.model.PositionConfidenceEllipse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PointCoordinates
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PointCoordinates {

  private BigDecimal latitude;

  private BigDecimal longitude;

  @Valid
  private List<@Valid HeightCoordinate> heightCoordinate = new ArrayList<>();

  private PositionConfidenceEllipse positionConfidenceEllipse;

  private PositionAccuracy horizontalPositionAccuracy;

  @Valid
  private Map<String, Object> pointCoordinatesExtensionG = new HashMap<>();

  public PointCoordinates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PointCoordinates(BigDecimal latitude, BigDecimal longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public PointCoordinates latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  @NotNull @Valid 
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public PointCoordinates longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  @NotNull @Valid 
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public PointCoordinates heightCoordinate(List<@Valid HeightCoordinate> heightCoordinate) {
    this.heightCoordinate = heightCoordinate;
    return this;
  }

  public PointCoordinates addHeightCoordinateItem(HeightCoordinate heightCoordinateItem) {
    if (this.heightCoordinate == null) {
      this.heightCoordinate = new ArrayList<>();
    }
    this.heightCoordinate.add(heightCoordinateItem);
    return this;
  }

  /**
   * Get heightCoordinate
   * @return heightCoordinate
   */
  @Valid @Size(min = 0, max = 3) 
  @Schema(name = "heightCoordinate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heightCoordinate")
  public List<@Valid HeightCoordinate> getHeightCoordinate() {
    return heightCoordinate;
  }

  public void setHeightCoordinate(List<@Valid HeightCoordinate> heightCoordinate) {
    this.heightCoordinate = heightCoordinate;
  }

  public PointCoordinates positionConfidenceEllipse(PositionConfidenceEllipse positionConfidenceEllipse) {
    this.positionConfidenceEllipse = positionConfidenceEllipse;
    return this;
  }

  /**
   * Get positionConfidenceEllipse
   * @return positionConfidenceEllipse
   */
  @Valid 
  @Schema(name = "positionConfidenceEllipse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("positionConfidenceEllipse")
  public PositionConfidenceEllipse getPositionConfidenceEllipse() {
    return positionConfidenceEllipse;
  }

  public void setPositionConfidenceEllipse(PositionConfidenceEllipse positionConfidenceEllipse) {
    this.positionConfidenceEllipse = positionConfidenceEllipse;
  }

  public PointCoordinates horizontalPositionAccuracy(PositionAccuracy horizontalPositionAccuracy) {
    this.horizontalPositionAccuracy = horizontalPositionAccuracy;
    return this;
  }

  /**
   * Get horizontalPositionAccuracy
   * @return horizontalPositionAccuracy
   */
  @Valid 
  @Schema(name = "horizontalPositionAccuracy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("horizontalPositionAccuracy")
  public PositionAccuracy getHorizontalPositionAccuracy() {
    return horizontalPositionAccuracy;
  }

  public void setHorizontalPositionAccuracy(PositionAccuracy horizontalPositionAccuracy) {
    this.horizontalPositionAccuracy = horizontalPositionAccuracy;
  }

  public PointCoordinates pointCoordinatesExtensionG(Map<String, Object> pointCoordinatesExtensionG) {
    this.pointCoordinatesExtensionG = pointCoordinatesExtensionG;
    return this;
  }

  public PointCoordinates putPointCoordinatesExtensionGItem(String key, Object pointCoordinatesExtensionGItem) {
    if (this.pointCoordinatesExtensionG == null) {
      this.pointCoordinatesExtensionG = new HashMap<>();
    }
    this.pointCoordinatesExtensionG.put(key, pointCoordinatesExtensionGItem);
    return this;
  }

  /**
   * Get pointCoordinatesExtensionG
   * @return pointCoordinatesExtensionG
   */
  
  @Schema(name = "pointCoordinatesExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointCoordinatesExtensionG")
  public Map<String, Object> getPointCoordinatesExtensionG() {
    return pointCoordinatesExtensionG;
  }

  public void setPointCoordinatesExtensionG(Map<String, Object> pointCoordinatesExtensionG) {
    this.pointCoordinatesExtensionG = pointCoordinatesExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointCoordinates pointCoordinates = (PointCoordinates) o;
    return Objects.equals(this.latitude, pointCoordinates.latitude) &&
        Objects.equals(this.longitude, pointCoordinates.longitude) &&
        Objects.equals(this.heightCoordinate, pointCoordinates.heightCoordinate) &&
        Objects.equals(this.positionConfidenceEllipse, pointCoordinates.positionConfidenceEllipse) &&
        Objects.equals(this.horizontalPositionAccuracy, pointCoordinates.horizontalPositionAccuracy) &&
        Objects.equals(this.pointCoordinatesExtensionG, pointCoordinates.pointCoordinatesExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, heightCoordinate, positionConfidenceEllipse, horizontalPositionAccuracy, pointCoordinatesExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointCoordinates {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    heightCoordinate: ").append(toIndentedString(heightCoordinate)).append("\n");
    sb.append("    positionConfidenceEllipse: ").append(toIndentedString(positionConfidenceEllipse)).append("\n");
    sb.append("    horizontalPositionAccuracy: ").append(toIndentedString(horizontalPositionAccuracy)).append("\n");
    sb.append("    pointCoordinatesExtensionG: ").append(toIndentedString(pointCoordinatesExtensionG)).append("\n");
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

