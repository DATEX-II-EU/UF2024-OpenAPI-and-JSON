package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CollisionTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CollisionTypeEnumG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CollisionTypeEnumG {

  private CollisionTypeEnum value;

  private String extendedValueG;

  public CollisionTypeEnumG() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CollisionTypeEnumG(CollisionTypeEnum value) {
    this.value = value;
  }

  public CollisionTypeEnumG value(CollisionTypeEnum value) {
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
  public CollisionTypeEnum getValue() {
    return value;
  }

  public void setValue(CollisionTypeEnum value) {
    this.value = value;
  }

  public CollisionTypeEnumG extendedValueG(String extendedValueG) {
    this.extendedValueG = extendedValueG;
    return this;
  }

  /**
   * Get extendedValueG
   * @return extendedValueG
   */
  
  @Schema(name = "extendedValueG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extendedValueG")
  public String getExtendedValueG() {
    return extendedValueG;
  }

  public void setExtendedValueG(String extendedValueG) {
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
    CollisionTypeEnumG collisionTypeEnumG = (CollisionTypeEnumG) o;
    return Objects.equals(this.value, collisionTypeEnumG.value) &&
        Objects.equals(this.extendedValueG, collisionTypeEnumG.extendedValueG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, extendedValueG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollisionTypeEnumG {\n");
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

