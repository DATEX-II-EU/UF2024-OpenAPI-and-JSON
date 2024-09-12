package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
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
 * PositionAccuracy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PositionAccuracy {

  private BigDecimal accuracyPercentile50;

  private BigDecimal accuracyPercentile75;

  private BigDecimal accuracyPercentile95;

  @Valid
  private Map<String, Object> positionAccuracyExtensionG = new HashMap<>();

  public PositionAccuracy accuracyPercentile50(BigDecimal accuracyPercentile50) {
    this.accuracyPercentile50 = accuracyPercentile50;
    return this;
  }

  /**
   * Get accuracyPercentile50
   * @return accuracyPercentile50
   */
  @Valid 
  @Schema(name = "accuracyPercentile50", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accuracyPercentile50")
  public BigDecimal getAccuracyPercentile50() {
    return accuracyPercentile50;
  }

  public void setAccuracyPercentile50(BigDecimal accuracyPercentile50) {
    this.accuracyPercentile50 = accuracyPercentile50;
  }

  public PositionAccuracy accuracyPercentile75(BigDecimal accuracyPercentile75) {
    this.accuracyPercentile75 = accuracyPercentile75;
    return this;
  }

  /**
   * Get accuracyPercentile75
   * @return accuracyPercentile75
   */
  @Valid 
  @Schema(name = "accuracyPercentile75", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accuracyPercentile75")
  public BigDecimal getAccuracyPercentile75() {
    return accuracyPercentile75;
  }

  public void setAccuracyPercentile75(BigDecimal accuracyPercentile75) {
    this.accuracyPercentile75 = accuracyPercentile75;
  }

  public PositionAccuracy accuracyPercentile95(BigDecimal accuracyPercentile95) {
    this.accuracyPercentile95 = accuracyPercentile95;
    return this;
  }

  /**
   * Get accuracyPercentile95
   * @return accuracyPercentile95
   */
  @Valid 
  @Schema(name = "accuracyPercentile95", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accuracyPercentile95")
  public BigDecimal getAccuracyPercentile95() {
    return accuracyPercentile95;
  }

  public void setAccuracyPercentile95(BigDecimal accuracyPercentile95) {
    this.accuracyPercentile95 = accuracyPercentile95;
  }

  public PositionAccuracy positionAccuracyExtensionG(Map<String, Object> positionAccuracyExtensionG) {
    this.positionAccuracyExtensionG = positionAccuracyExtensionG;
    return this;
  }

  public PositionAccuracy putPositionAccuracyExtensionGItem(String key, Object positionAccuracyExtensionGItem) {
    if (this.positionAccuracyExtensionG == null) {
      this.positionAccuracyExtensionG = new HashMap<>();
    }
    this.positionAccuracyExtensionG.put(key, positionAccuracyExtensionGItem);
    return this;
  }

  /**
   * Get positionAccuracyExtensionG
   * @return positionAccuracyExtensionG
   */
  
  @Schema(name = "positionAccuracyExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("positionAccuracyExtensionG")
  public Map<String, Object> getPositionAccuracyExtensionG() {
    return positionAccuracyExtensionG;
  }

  public void setPositionAccuracyExtensionG(Map<String, Object> positionAccuracyExtensionG) {
    this.positionAccuracyExtensionG = positionAccuracyExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionAccuracy positionAccuracy = (PositionAccuracy) o;
    return Objects.equals(this.accuracyPercentile50, positionAccuracy.accuracyPercentile50) &&
        Objects.equals(this.accuracyPercentile75, positionAccuracy.accuracyPercentile75) &&
        Objects.equals(this.accuracyPercentile95, positionAccuracy.accuracyPercentile95) &&
        Objects.equals(this.positionAccuracyExtensionG, positionAccuracy.positionAccuracyExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracyPercentile50, accuracyPercentile75, accuracyPercentile95, positionAccuracyExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionAccuracy {\n");
    sb.append("    accuracyPercentile50: ").append(toIndentedString(accuracyPercentile50)).append("\n");
    sb.append("    accuracyPercentile75: ").append(toIndentedString(accuracyPercentile75)).append("\n");
    sb.append("    accuracyPercentile95: ").append(toIndentedString(accuracyPercentile95)).append("\n");
    sb.append("    positionAccuracyExtensionG: ").append(toIndentedString(positionAccuracyExtensionG)).append("\n");
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

