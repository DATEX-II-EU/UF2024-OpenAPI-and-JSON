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
 * WidthCharacteristic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WidthCharacteristic {

  private ComparisonOperatorEnumG comparisonOperator;

  private BigDecimal vehicleWidth;

  @Valid
  private Map<String, Object> widthCharacteristicExtensionG = new HashMap<>();

  public WidthCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WidthCharacteristic(ComparisonOperatorEnumG comparisonOperator, BigDecimal vehicleWidth) {
    this.comparisonOperator = comparisonOperator;
    this.vehicleWidth = vehicleWidth;
  }

  public WidthCharacteristic comparisonOperator(ComparisonOperatorEnumG comparisonOperator) {
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

  public WidthCharacteristic vehicleWidth(BigDecimal vehicleWidth) {
    this.vehicleWidth = vehicleWidth;
    return this;
  }

  /**
   * Get vehicleWidth
   * @return vehicleWidth
   */
  @NotNull @Valid 
  @Schema(name = "vehicleWidth", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleWidth")
  public BigDecimal getVehicleWidth() {
    return vehicleWidth;
  }

  public void setVehicleWidth(BigDecimal vehicleWidth) {
    this.vehicleWidth = vehicleWidth;
  }

  public WidthCharacteristic widthCharacteristicExtensionG(Map<String, Object> widthCharacteristicExtensionG) {
    this.widthCharacteristicExtensionG = widthCharacteristicExtensionG;
    return this;
  }

  public WidthCharacteristic putWidthCharacteristicExtensionGItem(String key, Object widthCharacteristicExtensionGItem) {
    if (this.widthCharacteristicExtensionG == null) {
      this.widthCharacteristicExtensionG = new HashMap<>();
    }
    this.widthCharacteristicExtensionG.put(key, widthCharacteristicExtensionGItem);
    return this;
  }

  /**
   * Get widthCharacteristicExtensionG
   * @return widthCharacteristicExtensionG
   */
  
  @Schema(name = "widthCharacteristicExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("widthCharacteristicExtensionG")
  public Map<String, Object> getWidthCharacteristicExtensionG() {
    return widthCharacteristicExtensionG;
  }

  public void setWidthCharacteristicExtensionG(Map<String, Object> widthCharacteristicExtensionG) {
    this.widthCharacteristicExtensionG = widthCharacteristicExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidthCharacteristic widthCharacteristic = (WidthCharacteristic) o;
    return Objects.equals(this.comparisonOperator, widthCharacteristic.comparisonOperator) &&
        Objects.equals(this.vehicleWidth, widthCharacteristic.vehicleWidth) &&
        Objects.equals(this.widthCharacteristicExtensionG, widthCharacteristic.widthCharacteristicExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, vehicleWidth, widthCharacteristicExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidthCharacteristic {\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    vehicleWidth: ").append(toIndentedString(vehicleWidth)).append("\n");
    sb.append("    widthCharacteristicExtensionG: ").append(toIndentedString(widthCharacteristicExtensionG)).append("\n");
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

