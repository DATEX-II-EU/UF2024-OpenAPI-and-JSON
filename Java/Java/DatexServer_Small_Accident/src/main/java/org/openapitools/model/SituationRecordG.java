package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Accident;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SituationRecordG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SituationRecordG {

  private Accident sitAccident;

  public SituationRecordG sitAccident(Accident sitAccident) {
    this.sitAccident = sitAccident;
    return this;
  }

  /**
   * Get sitAccident
   * @return sitAccident
   */
  @Valid 
  @Schema(name = "sitAccident", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sitAccident")
  public Accident getSitAccident() {
    return sitAccident;
  }

  public void setSitAccident(Accident sitAccident) {
    this.sitAccident = sitAccident;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SituationRecordG situationRecordG = (SituationRecordG) o;
    return Objects.equals(this.sitAccident, situationRecordG.sitAccident);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sitAccident);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituationRecordG {\n");
    sb.append("    sitAccident: ").append(toIndentedString(sitAccident)).append("\n");
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

