package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.PositionConfidenceCodedErrorEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PositionConfidenceEllipse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PositionConfidenceEllipse {

  private BigDecimal semiMajorAxisLength;

  private PositionConfidenceCodedErrorEnumG semiMajorAxisLengthCodedError;

  private BigDecimal semiMinorAxisLength;

  private PositionConfidenceCodedErrorEnumG semiMinorAxisLengthCodedError;

  private Integer semiMajorAxisOrientation;

  private Boolean semiMajorAxisOrientationError;

  @Valid
  private Map<String, Object> positionConfidenceEllipseExtensionG = new HashMap<>();

  public PositionConfidenceEllipse semiMajorAxisLength(BigDecimal semiMajorAxisLength) {
    this.semiMajorAxisLength = semiMajorAxisLength;
    return this;
  }

  /**
   * Get semiMajorAxisLength
   * @return semiMajorAxisLength
   */
  @Valid 
  @Schema(name = "semiMajorAxisLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMajorAxisLength")
  public BigDecimal getSemiMajorAxisLength() {
    return semiMajorAxisLength;
  }

  public void setSemiMajorAxisLength(BigDecimal semiMajorAxisLength) {
    this.semiMajorAxisLength = semiMajorAxisLength;
  }

  public PositionConfidenceEllipse semiMajorAxisLengthCodedError(PositionConfidenceCodedErrorEnumG semiMajorAxisLengthCodedError) {
    this.semiMajorAxisLengthCodedError = semiMajorAxisLengthCodedError;
    return this;
  }

  /**
   * Get semiMajorAxisLengthCodedError
   * @return semiMajorAxisLengthCodedError
   */
  @Valid 
  @Schema(name = "semiMajorAxisLengthCodedError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMajorAxisLengthCodedError")
  public PositionConfidenceCodedErrorEnumG getSemiMajorAxisLengthCodedError() {
    return semiMajorAxisLengthCodedError;
  }

  public void setSemiMajorAxisLengthCodedError(PositionConfidenceCodedErrorEnumG semiMajorAxisLengthCodedError) {
    this.semiMajorAxisLengthCodedError = semiMajorAxisLengthCodedError;
  }

  public PositionConfidenceEllipse semiMinorAxisLength(BigDecimal semiMinorAxisLength) {
    this.semiMinorAxisLength = semiMinorAxisLength;
    return this;
  }

  /**
   * Get semiMinorAxisLength
   * @return semiMinorAxisLength
   */
  @Valid 
  @Schema(name = "semiMinorAxisLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMinorAxisLength")
  public BigDecimal getSemiMinorAxisLength() {
    return semiMinorAxisLength;
  }

  public void setSemiMinorAxisLength(BigDecimal semiMinorAxisLength) {
    this.semiMinorAxisLength = semiMinorAxisLength;
  }

  public PositionConfidenceEllipse semiMinorAxisLengthCodedError(PositionConfidenceCodedErrorEnumG semiMinorAxisLengthCodedError) {
    this.semiMinorAxisLengthCodedError = semiMinorAxisLengthCodedError;
    return this;
  }

  /**
   * Get semiMinorAxisLengthCodedError
   * @return semiMinorAxisLengthCodedError
   */
  @Valid 
  @Schema(name = "semiMinorAxisLengthCodedError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMinorAxisLengthCodedError")
  public PositionConfidenceCodedErrorEnumG getSemiMinorAxisLengthCodedError() {
    return semiMinorAxisLengthCodedError;
  }

  public void setSemiMinorAxisLengthCodedError(PositionConfidenceCodedErrorEnumG semiMinorAxisLengthCodedError) {
    this.semiMinorAxisLengthCodedError = semiMinorAxisLengthCodedError;
  }

  public PositionConfidenceEllipse semiMajorAxisOrientation(Integer semiMajorAxisOrientation) {
    this.semiMajorAxisOrientation = semiMajorAxisOrientation;
    return this;
  }

  /**
   * Get semiMajorAxisOrientation
   * minimum: 0
   * @return semiMajorAxisOrientation
   */
  @Min(0) 
  @Schema(name = "semiMajorAxisOrientation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMajorAxisOrientation")
  public Integer getSemiMajorAxisOrientation() {
    return semiMajorAxisOrientation;
  }

  public void setSemiMajorAxisOrientation(Integer semiMajorAxisOrientation) {
    this.semiMajorAxisOrientation = semiMajorAxisOrientation;
  }

  public PositionConfidenceEllipse semiMajorAxisOrientationError(Boolean semiMajorAxisOrientationError) {
    this.semiMajorAxisOrientationError = semiMajorAxisOrientationError;
    return this;
  }

  /**
   * Get semiMajorAxisOrientationError
   * @return semiMajorAxisOrientationError
   */
  
  @Schema(name = "semiMajorAxisOrientationError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("semiMajorAxisOrientationError")
  public Boolean getSemiMajorAxisOrientationError() {
    return semiMajorAxisOrientationError;
  }

  public void setSemiMajorAxisOrientationError(Boolean semiMajorAxisOrientationError) {
    this.semiMajorAxisOrientationError = semiMajorAxisOrientationError;
  }

  public PositionConfidenceEllipse positionConfidenceEllipseExtensionG(Map<String, Object> positionConfidenceEllipseExtensionG) {
    this.positionConfidenceEllipseExtensionG = positionConfidenceEllipseExtensionG;
    return this;
  }

  public PositionConfidenceEllipse putPositionConfidenceEllipseExtensionGItem(String key, Object positionConfidenceEllipseExtensionGItem) {
    if (this.positionConfidenceEllipseExtensionG == null) {
      this.positionConfidenceEllipseExtensionG = new HashMap<>();
    }
    this.positionConfidenceEllipseExtensionG.put(key, positionConfidenceEllipseExtensionGItem);
    return this;
  }

  /**
   * Get positionConfidenceEllipseExtensionG
   * @return positionConfidenceEllipseExtensionG
   */
  
  @Schema(name = "positionConfidenceEllipseExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("positionConfidenceEllipseExtensionG")
  public Map<String, Object> getPositionConfidenceEllipseExtensionG() {
    return positionConfidenceEllipseExtensionG;
  }

  public void setPositionConfidenceEllipseExtensionG(Map<String, Object> positionConfidenceEllipseExtensionG) {
    this.positionConfidenceEllipseExtensionG = positionConfidenceEllipseExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionConfidenceEllipse positionConfidenceEllipse = (PositionConfidenceEllipse) o;
    return Objects.equals(this.semiMajorAxisLength, positionConfidenceEllipse.semiMajorAxisLength) &&
        Objects.equals(this.semiMajorAxisLengthCodedError, positionConfidenceEllipse.semiMajorAxisLengthCodedError) &&
        Objects.equals(this.semiMinorAxisLength, positionConfidenceEllipse.semiMinorAxisLength) &&
        Objects.equals(this.semiMinorAxisLengthCodedError, positionConfidenceEllipse.semiMinorAxisLengthCodedError) &&
        Objects.equals(this.semiMajorAxisOrientation, positionConfidenceEllipse.semiMajorAxisOrientation) &&
        Objects.equals(this.semiMajorAxisOrientationError, positionConfidenceEllipse.semiMajorAxisOrientationError) &&
        Objects.equals(this.positionConfidenceEllipseExtensionG, positionConfidenceEllipse.positionConfidenceEllipseExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(semiMajorAxisLength, semiMajorAxisLengthCodedError, semiMinorAxisLength, semiMinorAxisLengthCodedError, semiMajorAxisOrientation, semiMajorAxisOrientationError, positionConfidenceEllipseExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionConfidenceEllipse {\n");
    sb.append("    semiMajorAxisLength: ").append(toIndentedString(semiMajorAxisLength)).append("\n");
    sb.append("    semiMajorAxisLengthCodedError: ").append(toIndentedString(semiMajorAxisLengthCodedError)).append("\n");
    sb.append("    semiMinorAxisLength: ").append(toIndentedString(semiMinorAxisLength)).append("\n");
    sb.append("    semiMinorAxisLengthCodedError: ").append(toIndentedString(semiMinorAxisLengthCodedError)).append("\n");
    sb.append("    semiMajorAxisOrientation: ").append(toIndentedString(semiMajorAxisOrientation)).append("\n");
    sb.append("    semiMajorAxisOrientationError: ").append(toIndentedString(semiMajorAxisOrientationError)).append("\n");
    sb.append("    positionConfidenceEllipseExtensionG: ").append(toIndentedString(positionConfidenceEllipseExtensionG)).append("\n");
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

