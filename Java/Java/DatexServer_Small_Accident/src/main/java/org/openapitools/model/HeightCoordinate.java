package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AltitudeConfidence;
import org.openapitools.model.HeightTypeEnumG;
import org.openapitools.model.PositionAccuracy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * HeightCoordinate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class HeightCoordinate {

  private BigDecimal heightValue;

  private HeightTypeEnumG heightType;

  private AltitudeConfidence altitudeConfidence;

  private PositionAccuracy verticalPositionAccuracy;

  @Valid
  private Map<String, Object> heightCoordinateExtensionG = new HashMap<>();

  public HeightCoordinate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HeightCoordinate(BigDecimal heightValue) {
    this.heightValue = heightValue;
  }

  public HeightCoordinate heightValue(BigDecimal heightValue) {
    this.heightValue = heightValue;
    return this;
  }

  /**
   * Get heightValue
   * @return heightValue
   */
  @NotNull @Valid 
  @Schema(name = "heightValue", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("heightValue")
  public BigDecimal getHeightValue() {
    return heightValue;
  }

  public void setHeightValue(BigDecimal heightValue) {
    this.heightValue = heightValue;
  }

  public HeightCoordinate heightType(HeightTypeEnumG heightType) {
    this.heightType = heightType;
    return this;
  }

  /**
   * Get heightType
   * @return heightType
   */
  @Valid 
  @Schema(name = "heightType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heightType")
  public HeightTypeEnumG getHeightType() {
    return heightType;
  }

  public void setHeightType(HeightTypeEnumG heightType) {
    this.heightType = heightType;
  }

  public HeightCoordinate altitudeConfidence(AltitudeConfidence altitudeConfidence) {
    this.altitudeConfidence = altitudeConfidence;
    return this;
  }

  /**
   * Get altitudeConfidence
   * @return altitudeConfidence
   */
  @Valid 
  @Schema(name = "altitudeConfidence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("altitudeConfidence")
  public AltitudeConfidence getAltitudeConfidence() {
    return altitudeConfidence;
  }

  public void setAltitudeConfidence(AltitudeConfidence altitudeConfidence) {
    this.altitudeConfidence = altitudeConfidence;
  }

  public HeightCoordinate verticalPositionAccuracy(PositionAccuracy verticalPositionAccuracy) {
    this.verticalPositionAccuracy = verticalPositionAccuracy;
    return this;
  }

  /**
   * Get verticalPositionAccuracy
   * @return verticalPositionAccuracy
   */
  @Valid 
  @Schema(name = "verticalPositionAccuracy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verticalPositionAccuracy")
  public PositionAccuracy getVerticalPositionAccuracy() {
    return verticalPositionAccuracy;
  }

  public void setVerticalPositionAccuracy(PositionAccuracy verticalPositionAccuracy) {
    this.verticalPositionAccuracy = verticalPositionAccuracy;
  }

  public HeightCoordinate heightCoordinateExtensionG(Map<String, Object> heightCoordinateExtensionG) {
    this.heightCoordinateExtensionG = heightCoordinateExtensionG;
    return this;
  }

  public HeightCoordinate putHeightCoordinateExtensionGItem(String key, Object heightCoordinateExtensionGItem) {
    if (this.heightCoordinateExtensionG == null) {
      this.heightCoordinateExtensionG = new HashMap<>();
    }
    this.heightCoordinateExtensionG.put(key, heightCoordinateExtensionGItem);
    return this;
  }

  /**
   * Get heightCoordinateExtensionG
   * @return heightCoordinateExtensionG
   */
  
  @Schema(name = "heightCoordinateExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heightCoordinateExtensionG")
  public Map<String, Object> getHeightCoordinateExtensionG() {
    return heightCoordinateExtensionG;
  }

  public void setHeightCoordinateExtensionG(Map<String, Object> heightCoordinateExtensionG) {
    this.heightCoordinateExtensionG = heightCoordinateExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeightCoordinate heightCoordinate = (HeightCoordinate) o;
    return Objects.equals(this.heightValue, heightCoordinate.heightValue) &&
        Objects.equals(this.heightType, heightCoordinate.heightType) &&
        Objects.equals(this.altitudeConfidence, heightCoordinate.altitudeConfidence) &&
        Objects.equals(this.verticalPositionAccuracy, heightCoordinate.verticalPositionAccuracy) &&
        Objects.equals(this.heightCoordinateExtensionG, heightCoordinate.heightCoordinateExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heightValue, heightType, altitudeConfidence, verticalPositionAccuracy, heightCoordinateExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeightCoordinate {\n");
    sb.append("    heightValue: ").append(toIndentedString(heightValue)).append("\n");
    sb.append("    heightType: ").append(toIndentedString(heightType)).append("\n");
    sb.append("    altitudeConfidence: ").append(toIndentedString(altitudeConfidence)).append("\n");
    sb.append("    verticalPositionAccuracy: ").append(toIndentedString(verticalPositionAccuracy)).append("\n");
    sb.append("    heightCoordinateExtensionG: ").append(toIndentedString(heightCoordinateExtensionG)).append("\n");
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

