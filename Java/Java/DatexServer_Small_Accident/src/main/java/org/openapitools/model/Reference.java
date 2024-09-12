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
 * Reference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Reference {

  private String idG;

  public Reference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Reference(String idG) {
    this.idG = idG;
  }

  public Reference idG(String idG) {
    this.idG = idG;
    return this;
  }

  /**
   * Get idG
   * @return idG
   */
  @NotNull 
  @Schema(name = "idG", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idG")
  public String getIdG() {
    return idG;
  }

  public void setIdG(String idG) {
    this.idG = idG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.idG, reference.idG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    sb.append("    idG: ").append(toIndentedString(idG)).append("\n");
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

