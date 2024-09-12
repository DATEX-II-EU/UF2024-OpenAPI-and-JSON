package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * NumberOfAxlesCharacteristic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class NumberOfAxlesCharacteristic {

  private ComparisonOperatorEnumG comparisonOperator;

  private Integer numberOfAxles;

  @Valid
  private Map<String, Object> numberOfAxlesCharacteristicExtensionG = new HashMap<>();

  public NumberOfAxlesCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NumberOfAxlesCharacteristic(ComparisonOperatorEnumG comparisonOperator, Integer numberOfAxles) {
    this.comparisonOperator = comparisonOperator;
    this.numberOfAxles = numberOfAxles;
  }

  public NumberOfAxlesCharacteristic comparisonOperator(ComparisonOperatorEnumG comparisonOperator) {
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

  public NumberOfAxlesCharacteristic numberOfAxles(Integer numberOfAxles) {
    this.numberOfAxles = numberOfAxles;
    return this;
  }

  /**
   * Get numberOfAxles
   * minimum: 0
   * @return numberOfAxles
   */
  @NotNull @Min(0) 
  @Schema(name = "numberOfAxles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("numberOfAxles")
  public Integer getNumberOfAxles() {
    return numberOfAxles;
  }

  public void setNumberOfAxles(Integer numberOfAxles) {
    this.numberOfAxles = numberOfAxles;
  }

  public NumberOfAxlesCharacteristic numberOfAxlesCharacteristicExtensionG(Map<String, Object> numberOfAxlesCharacteristicExtensionG) {
    this.numberOfAxlesCharacteristicExtensionG = numberOfAxlesCharacteristicExtensionG;
    return this;
  }

  public NumberOfAxlesCharacteristic putNumberOfAxlesCharacteristicExtensionGItem(String key, Object numberOfAxlesCharacteristicExtensionGItem) {
    if (this.numberOfAxlesCharacteristicExtensionG == null) {
      this.numberOfAxlesCharacteristicExtensionG = new HashMap<>();
    }
    this.numberOfAxlesCharacteristicExtensionG.put(key, numberOfAxlesCharacteristicExtensionGItem);
    return this;
  }

  /**
   * Get numberOfAxlesCharacteristicExtensionG
   * @return numberOfAxlesCharacteristicExtensionG
   */
  
  @Schema(name = "numberOfAxlesCharacteristicExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfAxlesCharacteristicExtensionG")
  public Map<String, Object> getNumberOfAxlesCharacteristicExtensionG() {
    return numberOfAxlesCharacteristicExtensionG;
  }

  public void setNumberOfAxlesCharacteristicExtensionG(Map<String, Object> numberOfAxlesCharacteristicExtensionG) {
    this.numberOfAxlesCharacteristicExtensionG = numberOfAxlesCharacteristicExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOfAxlesCharacteristic numberOfAxlesCharacteristic = (NumberOfAxlesCharacteristic) o;
    return Objects.equals(this.comparisonOperator, numberOfAxlesCharacteristic.comparisonOperator) &&
        Objects.equals(this.numberOfAxles, numberOfAxlesCharacteristic.numberOfAxles) &&
        Objects.equals(this.numberOfAxlesCharacteristicExtensionG, numberOfAxlesCharacteristic.numberOfAxlesCharacteristicExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, numberOfAxles, numberOfAxlesCharacteristicExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOfAxlesCharacteristic {\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    numberOfAxles: ").append(toIndentedString(numberOfAxles)).append("\n");
    sb.append("    numberOfAxlesCharacteristicExtensionG: ").append(toIndentedString(numberOfAxlesCharacteristicExtensionG)).append("\n");
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

