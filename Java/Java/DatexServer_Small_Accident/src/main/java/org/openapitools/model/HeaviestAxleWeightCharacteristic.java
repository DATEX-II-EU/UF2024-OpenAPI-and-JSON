package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.ComparisonOperatorEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * HeaviestAxleWeightCharacteristic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class HeaviestAxleWeightCharacteristic {

  private ComparisonOperatorEnumG comparisonOperator;

  private BigDecimal heaviestAxleWeight;

  @Valid
  private Map<String, Object> heaviestAxleWeightCharacteristicExtensionG = new HashMap<>();

  public HeaviestAxleWeightCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HeaviestAxleWeightCharacteristic(ComparisonOperatorEnumG comparisonOperator, BigDecimal heaviestAxleWeight) {
    this.comparisonOperator = comparisonOperator;
    this.heaviestAxleWeight = heaviestAxleWeight;
  }

  public HeaviestAxleWeightCharacteristic comparisonOperator(ComparisonOperatorEnumG comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }

  /**
   * Get comparisonOperator
   * @return comparisonOperator
   */
  @NotNull @Valid 
  @Schema(name = "comparisonOperator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("comparisonOperator")
  public ComparisonOperatorEnumG getComparisonOperator() {
    return comparisonOperator;
  }

  public void setComparisonOperator(ComparisonOperatorEnumG comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
  }

  public HeaviestAxleWeightCharacteristic heaviestAxleWeight(BigDecimal heaviestAxleWeight) {
    this.heaviestAxleWeight = heaviestAxleWeight;
    return this;
  }

  /**
   * Get heaviestAxleWeight
   * @return heaviestAxleWeight
   */
  @NotNull @Valid 
  @Schema(name = "heaviestAxleWeight", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("heaviestAxleWeight")
  public BigDecimal getHeaviestAxleWeight() {
    return heaviestAxleWeight;
  }

  public void setHeaviestAxleWeight(BigDecimal heaviestAxleWeight) {
    this.heaviestAxleWeight = heaviestAxleWeight;
  }

  public HeaviestAxleWeightCharacteristic heaviestAxleWeightCharacteristicExtensionG(Map<String, Object> heaviestAxleWeightCharacteristicExtensionG) {
    this.heaviestAxleWeightCharacteristicExtensionG = heaviestAxleWeightCharacteristicExtensionG;
    return this;
  }

  public HeaviestAxleWeightCharacteristic putHeaviestAxleWeightCharacteristicExtensionGItem(String key, Object heaviestAxleWeightCharacteristicExtensionGItem) {
    if (this.heaviestAxleWeightCharacteristicExtensionG == null) {
      this.heaviestAxleWeightCharacteristicExtensionG = new HashMap<>();
    }
    this.heaviestAxleWeightCharacteristicExtensionG.put(key, heaviestAxleWeightCharacteristicExtensionGItem);
    return this;
  }

  /**
   * Get heaviestAxleWeightCharacteristicExtensionG
   * @return heaviestAxleWeightCharacteristicExtensionG
   */
  
  @Schema(name = "heaviestAxleWeightCharacteristicExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heaviestAxleWeightCharacteristicExtensionG")
  public Map<String, Object> getHeaviestAxleWeightCharacteristicExtensionG() {
    return heaviestAxleWeightCharacteristicExtensionG;
  }

  public void setHeaviestAxleWeightCharacteristicExtensionG(Map<String, Object> heaviestAxleWeightCharacteristicExtensionG) {
    this.heaviestAxleWeightCharacteristicExtensionG = heaviestAxleWeightCharacteristicExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaviestAxleWeightCharacteristic heaviestAxleWeightCharacteristic = (HeaviestAxleWeightCharacteristic) o;
    return Objects.equals(this.comparisonOperator, heaviestAxleWeightCharacteristic.comparisonOperator) &&
        Objects.equals(this.heaviestAxleWeight, heaviestAxleWeightCharacteristic.heaviestAxleWeight) &&
        Objects.equals(this.heaviestAxleWeightCharacteristicExtensionG, heaviestAxleWeightCharacteristic.heaviestAxleWeightCharacteristicExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, heaviestAxleWeight, heaviestAxleWeightCharacteristicExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaviestAxleWeightCharacteristic {\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    heaviestAxleWeight: ").append(toIndentedString(heaviestAxleWeight)).append("\n");
    sb.append("    heaviestAxleWeightCharacteristicExtensionG: ").append(toIndentedString(heaviestAxleWeightCharacteristicExtensionG)).append("\n");
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

