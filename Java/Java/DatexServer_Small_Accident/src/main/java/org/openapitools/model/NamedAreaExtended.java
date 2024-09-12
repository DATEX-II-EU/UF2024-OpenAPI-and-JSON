package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NamedAreaExtended
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class NamedAreaExtended {

  private String namedAreaCode;

  public NamedAreaExtended() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NamedAreaExtended(String namedAreaCode) {
    this.namedAreaCode = namedAreaCode;
  }

  public NamedAreaExtended namedAreaCode(String namedAreaCode) {
    this.namedAreaCode = namedAreaCode;
    return this;
  }

  /**
   * Get namedAreaCode
   * @return namedAreaCode
   */
  @NotNull @Size(max = 1024) 
  @Schema(name = "namedAreaCode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("namedAreaCode")
  public String getNamedAreaCode() {
    return namedAreaCode;
  }

  public void setNamedAreaCode(String namedAreaCode) {
    this.namedAreaCode = namedAreaCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedAreaExtended namedAreaExtended = (NamedAreaExtended) o;
    return Objects.equals(this.namedAreaCode, namedAreaExtended.namedAreaCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namedAreaCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedAreaExtended {\n");
    sb.append("    namedAreaCode: ").append(toIndentedString(namedAreaCode)).append("\n");
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

