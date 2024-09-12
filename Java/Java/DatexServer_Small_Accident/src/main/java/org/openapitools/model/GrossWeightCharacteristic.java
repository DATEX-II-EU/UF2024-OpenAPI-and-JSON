package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.ComparisonOperatorEnumG;
import org.openapitools.model.WeightTypeEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GrossWeightCharacteristic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GrossWeightCharacteristic {

  private ComparisonOperatorEnumG comparisonOperator;

  private BigDecimal grossVehicleWeight;

  private WeightTypeEnumG typeOfWeight;

  @Valid
  private Map<String, Object> grossWeightCharacteristicExtensionG = new HashMap<>();

  public GrossWeightCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GrossWeightCharacteristic(ComparisonOperatorEnumG comparisonOperator, BigDecimal grossVehicleWeight, WeightTypeEnumG typeOfWeight) {
    this.comparisonOperator = comparisonOperator;
    this.grossVehicleWeight = grossVehicleWeight;
    this.typeOfWeight = typeOfWeight;
  }

  public GrossWeightCharacteristic comparisonOperator(ComparisonOperatorEnumG comparisonOperator) {
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

  public GrossWeightCharacteristic grossVehicleWeight(BigDecimal grossVehicleWeight) {
    this.grossVehicleWeight = grossVehicleWeight;
    return this;
  }

  /**
   * Get grossVehicleWeight
   * @return grossVehicleWeight
   */
  @NotNull @Valid 
  @Schema(name = "grossVehicleWeight", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("grossVehicleWeight")
  public BigDecimal getGrossVehicleWeight() {
    return grossVehicleWeight;
  }

  public void setGrossVehicleWeight(BigDecimal grossVehicleWeight) {
    this.grossVehicleWeight = grossVehicleWeight;
  }

  public GrossWeightCharacteristic typeOfWeight(WeightTypeEnumG typeOfWeight) {
    this.typeOfWeight = typeOfWeight;
    return this;
  }

  /**
   * Get typeOfWeight
   * @return typeOfWeight
   */
  @NotNull @Valid 
  @Schema(name = "typeOfWeight", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeOfWeight")
  public WeightTypeEnumG getTypeOfWeight() {
    return typeOfWeight;
  }

  public void setTypeOfWeight(WeightTypeEnumG typeOfWeight) {
    this.typeOfWeight = typeOfWeight;
  }

  public GrossWeightCharacteristic grossWeightCharacteristicExtensionG(Map<String, Object> grossWeightCharacteristicExtensionG) {
    this.grossWeightCharacteristicExtensionG = grossWeightCharacteristicExtensionG;
    return this;
  }

  public GrossWeightCharacteristic putGrossWeightCharacteristicExtensionGItem(String key, Object grossWeightCharacteristicExtensionGItem) {
    if (this.grossWeightCharacteristicExtensionG == null) {
      this.grossWeightCharacteristicExtensionG = new HashMap<>();
    }
    this.grossWeightCharacteristicExtensionG.put(key, grossWeightCharacteristicExtensionGItem);
    return this;
  }

  /**
   * Get grossWeightCharacteristicExtensionG
   * @return grossWeightCharacteristicExtensionG
   */
  
  @Schema(name = "grossWeightCharacteristicExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grossWeightCharacteristicExtensionG")
  public Map<String, Object> getGrossWeightCharacteristicExtensionG() {
    return grossWeightCharacteristicExtensionG;
  }

  public void setGrossWeightCharacteristicExtensionG(Map<String, Object> grossWeightCharacteristicExtensionG) {
    this.grossWeightCharacteristicExtensionG = grossWeightCharacteristicExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrossWeightCharacteristic grossWeightCharacteristic = (GrossWeightCharacteristic) o;
    return Objects.equals(this.comparisonOperator, grossWeightCharacteristic.comparisonOperator) &&
        Objects.equals(this.grossVehicleWeight, grossWeightCharacteristic.grossVehicleWeight) &&
        Objects.equals(this.typeOfWeight, grossWeightCharacteristic.typeOfWeight) &&
        Objects.equals(this.grossWeightCharacteristicExtensionG, grossWeightCharacteristic.grossWeightCharacteristicExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, grossVehicleWeight, typeOfWeight, grossWeightCharacteristicExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrossWeightCharacteristic {\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    grossVehicleWeight: ").append(toIndentedString(grossVehicleWeight)).append("\n");
    sb.append("    typeOfWeight: ").append(toIndentedString(typeOfWeight)).append("\n");
    sb.append("    grossWeightCharacteristicExtensionG: ").append(toIndentedString(grossWeightCharacteristicExtensionG)).append("\n");
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

