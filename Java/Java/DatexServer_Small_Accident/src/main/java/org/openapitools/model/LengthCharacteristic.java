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
 * LengthCharacteristic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class LengthCharacteristic {

  private ComparisonOperatorEnumG comparisonOperator;

  private BigDecimal vehicleLength;

  @Valid
  private Map<String, Object> lengthCharacteristicExtensionG = new HashMap<>();

  public LengthCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LengthCharacteristic(ComparisonOperatorEnumG comparisonOperator, BigDecimal vehicleLength) {
    this.comparisonOperator = comparisonOperator;
    this.vehicleLength = vehicleLength;
  }

  public LengthCharacteristic comparisonOperator(ComparisonOperatorEnumG comparisonOperator) {
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

  public LengthCharacteristic vehicleLength(BigDecimal vehicleLength) {
    this.vehicleLength = vehicleLength;
    return this;
  }

  /**
   * Get vehicleLength
   * @return vehicleLength
   */
  @NotNull @Valid 
  @Schema(name = "vehicleLength", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleLength")
  public BigDecimal getVehicleLength() {
    return vehicleLength;
  }

  public void setVehicleLength(BigDecimal vehicleLength) {
    this.vehicleLength = vehicleLength;
  }

  public LengthCharacteristic lengthCharacteristicExtensionG(Map<String, Object> lengthCharacteristicExtensionG) {
    this.lengthCharacteristicExtensionG = lengthCharacteristicExtensionG;
    return this;
  }

  public LengthCharacteristic putLengthCharacteristicExtensionGItem(String key, Object lengthCharacteristicExtensionGItem) {
    if (this.lengthCharacteristicExtensionG == null) {
      this.lengthCharacteristicExtensionG = new HashMap<>();
    }
    this.lengthCharacteristicExtensionG.put(key, lengthCharacteristicExtensionGItem);
    return this;
  }

  /**
   * Get lengthCharacteristicExtensionG
   * @return lengthCharacteristicExtensionG
   */
  
  @Schema(name = "lengthCharacteristicExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lengthCharacteristicExtensionG")
  public Map<String, Object> getLengthCharacteristicExtensionG() {
    return lengthCharacteristicExtensionG;
  }

  public void setLengthCharacteristicExtensionG(Map<String, Object> lengthCharacteristicExtensionG) {
    this.lengthCharacteristicExtensionG = lengthCharacteristicExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LengthCharacteristic lengthCharacteristic = (LengthCharacteristic) o;
    return Objects.equals(this.comparisonOperator, lengthCharacteristic.comparisonOperator) &&
        Objects.equals(this.vehicleLength, lengthCharacteristic.vehicleLength) &&
        Objects.equals(this.lengthCharacteristicExtensionG, lengthCharacteristic.lengthCharacteristicExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, vehicleLength, lengthCharacteristicExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LengthCharacteristic {\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    vehicleLength: ").append(toIndentedString(vehicleLength)).append("\n");
    sb.append("    lengthCharacteristicExtensionG: ").append(toIndentedString(lengthCharacteristicExtensionG)).append("\n");
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

