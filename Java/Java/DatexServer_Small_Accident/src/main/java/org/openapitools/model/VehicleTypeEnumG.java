package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.VehicleTypeEnum;
import org.openapitools.model.VehicleTypeEnumExtensionTypeG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VehicleTypeEnumG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class VehicleTypeEnumG {

  private VehicleTypeEnum value;

  private VehicleTypeEnumExtensionTypeG extendedValueG;

  public VehicleTypeEnumG() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleTypeEnumG(VehicleTypeEnum value) {
    this.value = value;
  }

  public VehicleTypeEnumG value(VehicleTypeEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @NotNull @Valid 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public VehicleTypeEnum getValue() {
    return value;
  }

  public void setValue(VehicleTypeEnum value) {
    this.value = value;
  }

  public VehicleTypeEnumG extendedValueG(VehicleTypeEnumExtensionTypeG extendedValueG) {
    this.extendedValueG = extendedValueG;
    return this;
  }

  /**
   * Get extendedValueG
   * @return extendedValueG
   */
  @Valid 
  @Schema(name = "extendedValueG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extendedValueG")
  public VehicleTypeEnumExtensionTypeG getExtendedValueG() {
    return extendedValueG;
  }

  public void setExtendedValueG(VehicleTypeEnumExtensionTypeG extendedValueG) {
    this.extendedValueG = extendedValueG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleTypeEnumG vehicleTypeEnumG = (VehicleTypeEnumG) o;
    return Objects.equals(this.value, vehicleTypeEnumG.value) &&
        Objects.equals(this.extendedValueG, vehicleTypeEnumG.extendedValueG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, extendedValueG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleTypeEnumG {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    extendedValueG: ").append(toIndentedString(extendedValueG)).append("\n");
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

