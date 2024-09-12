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
 * HeightCharacteristic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class HeightCharacteristic {

  private ComparisonOperatorEnumG comparisonOperator;

  private BigDecimal vehicleHeight;

  @Valid
  private Map<String, Object> heightCharacteristicExtensionG = new HashMap<>();

  public HeightCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HeightCharacteristic(ComparisonOperatorEnumG comparisonOperator, BigDecimal vehicleHeight) {
    this.comparisonOperator = comparisonOperator;
    this.vehicleHeight = vehicleHeight;
  }

  public HeightCharacteristic comparisonOperator(ComparisonOperatorEnumG comparisonOperator) {
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

  public HeightCharacteristic vehicleHeight(BigDecimal vehicleHeight) {
    this.vehicleHeight = vehicleHeight;
    return this;
  }

  /**
   * Get vehicleHeight
   * @return vehicleHeight
   */
  @NotNull @Valid 
  @Schema(name = "vehicleHeight", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleHeight")
  public BigDecimal getVehicleHeight() {
    return vehicleHeight;
  }

  public void setVehicleHeight(BigDecimal vehicleHeight) {
    this.vehicleHeight = vehicleHeight;
  }

  public HeightCharacteristic heightCharacteristicExtensionG(Map<String, Object> heightCharacteristicExtensionG) {
    this.heightCharacteristicExtensionG = heightCharacteristicExtensionG;
    return this;
  }

  public HeightCharacteristic putHeightCharacteristicExtensionGItem(String key, Object heightCharacteristicExtensionGItem) {
    if (this.heightCharacteristicExtensionG == null) {
      this.heightCharacteristicExtensionG = new HashMap<>();
    }
    this.heightCharacteristicExtensionG.put(key, heightCharacteristicExtensionGItem);
    return this;
  }

  /**
   * Get heightCharacteristicExtensionG
   * @return heightCharacteristicExtensionG
   */
  
  @Schema(name = "heightCharacteristicExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heightCharacteristicExtensionG")
  public Map<String, Object> getHeightCharacteristicExtensionG() {
    return heightCharacteristicExtensionG;
  }

  public void setHeightCharacteristicExtensionG(Map<String, Object> heightCharacteristicExtensionG) {
    this.heightCharacteristicExtensionG = heightCharacteristicExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeightCharacteristic heightCharacteristic = (HeightCharacteristic) o;
    return Objects.equals(this.comparisonOperator, heightCharacteristic.comparisonOperator) &&
        Objects.equals(this.vehicleHeight, heightCharacteristic.vehicleHeight) &&
        Objects.equals(this.heightCharacteristicExtensionG, heightCharacteristic.heightCharacteristicExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, vehicleHeight, heightCharacteristicExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeightCharacteristic {\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    vehicleHeight: ").append(toIndentedString(vehicleHeight)).append("\n");
    sb.append("    heightCharacteristicExtensionG: ").append(toIndentedString(heightCharacteristicExtensionG)).append("\n");
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

