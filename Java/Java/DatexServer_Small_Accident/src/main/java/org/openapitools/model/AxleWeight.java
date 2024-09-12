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
 * AxleWeight
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AxleWeight {

  private Integer axlePositionIdentifier;

  private BigDecimal axleWeight;

  private BigDecimal maximumPermittedAxleWeight;

  @Valid
  private Map<String, Object> axleWeightExtensionG = new HashMap<>();

  public AxleWeight() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AxleWeight(Integer axlePositionIdentifier) {
    this.axlePositionIdentifier = axlePositionIdentifier;
  }

  public AxleWeight axlePositionIdentifier(Integer axlePositionIdentifier) {
    this.axlePositionIdentifier = axlePositionIdentifier;
    return this;
  }

  /**
   * Get axlePositionIdentifier
   * minimum: 0
   * @return axlePositionIdentifier
   */
  @NotNull @Min(0) 
  @Schema(name = "axlePositionIdentifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("axlePositionIdentifier")
  public Integer getAxlePositionIdentifier() {
    return axlePositionIdentifier;
  }

  public void setAxlePositionIdentifier(Integer axlePositionIdentifier) {
    this.axlePositionIdentifier = axlePositionIdentifier;
  }

  public AxleWeight axleWeight(BigDecimal axleWeight) {
    this.axleWeight = axleWeight;
    return this;
  }

  /**
   * Get axleWeight
   * @return axleWeight
   */
  @Valid 
  @Schema(name = "axleWeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("axleWeight")
  public BigDecimal getAxleWeight() {
    return axleWeight;
  }

  public void setAxleWeight(BigDecimal axleWeight) {
    this.axleWeight = axleWeight;
  }

  public AxleWeight maximumPermittedAxleWeight(BigDecimal maximumPermittedAxleWeight) {
    this.maximumPermittedAxleWeight = maximumPermittedAxleWeight;
    return this;
  }

  /**
   * Get maximumPermittedAxleWeight
   * @return maximumPermittedAxleWeight
   */
  @Valid 
  @Schema(name = "maximumPermittedAxleWeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumPermittedAxleWeight")
  public BigDecimal getMaximumPermittedAxleWeight() {
    return maximumPermittedAxleWeight;
  }

  public void setMaximumPermittedAxleWeight(BigDecimal maximumPermittedAxleWeight) {
    this.maximumPermittedAxleWeight = maximumPermittedAxleWeight;
  }

  public AxleWeight axleWeightExtensionG(Map<String, Object> axleWeightExtensionG) {
    this.axleWeightExtensionG = axleWeightExtensionG;
    return this;
  }

  public AxleWeight putAxleWeightExtensionGItem(String key, Object axleWeightExtensionGItem) {
    if (this.axleWeightExtensionG == null) {
      this.axleWeightExtensionG = new HashMap<>();
    }
    this.axleWeightExtensionG.put(key, axleWeightExtensionGItem);
    return this;
  }

  /**
   * Get axleWeightExtensionG
   * @return axleWeightExtensionG
   */
  
  @Schema(name = "axleWeightExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("axleWeightExtensionG")
  public Map<String, Object> getAxleWeightExtensionG() {
    return axleWeightExtensionG;
  }

  public void setAxleWeightExtensionG(Map<String, Object> axleWeightExtensionG) {
    this.axleWeightExtensionG = axleWeightExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AxleWeight axleWeight = (AxleWeight) o;
    return Objects.equals(this.axlePositionIdentifier, axleWeight.axlePositionIdentifier) &&
        Objects.equals(this.axleWeight, axleWeight.axleWeight) &&
        Objects.equals(this.maximumPermittedAxleWeight, axleWeight.maximumPermittedAxleWeight) &&
        Objects.equals(this.axleWeightExtensionG, axleWeight.axleWeightExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(axlePositionIdentifier, axleWeight, maximumPermittedAxleWeight, axleWeightExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AxleWeight {\n");
    sb.append("    axlePositionIdentifier: ").append(toIndentedString(axlePositionIdentifier)).append("\n");
    sb.append("    axleWeight: ").append(toIndentedString(axleWeight)).append("\n");
    sb.append("    maximumPermittedAxleWeight: ").append(toIndentedString(maximumPermittedAxleWeight)).append("\n");
    sb.append("    axleWeightExtensionG: ").append(toIndentedString(axleWeightExtensionG)).append("\n");
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

