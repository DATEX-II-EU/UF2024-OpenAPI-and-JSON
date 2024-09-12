package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GmlLineString;
import org.openapitools.model.GmlLinearRing;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GmlLineStringG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GmlLineStringG {

  private GmlLineString locGmlLineString;

  private GmlLinearRing locGmlLinearRing;

  public GmlLineStringG locGmlLineString(GmlLineString locGmlLineString) {
    this.locGmlLineString = locGmlLineString;
    return this;
  }

  /**
   * Get locGmlLineString
   * @return locGmlLineString
   */
  @Valid 
  @Schema(name = "locGmlLineString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locGmlLineString")
  public GmlLineString getLocGmlLineString() {
    return locGmlLineString;
  }

  public void setLocGmlLineString(GmlLineString locGmlLineString) {
    this.locGmlLineString = locGmlLineString;
  }

  public GmlLineStringG locGmlLinearRing(GmlLinearRing locGmlLinearRing) {
    this.locGmlLinearRing = locGmlLinearRing;
    return this;
  }

  /**
   * Get locGmlLinearRing
   * @return locGmlLinearRing
   */
  @Valid 
  @Schema(name = "locGmlLinearRing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locGmlLinearRing")
  public GmlLinearRing getLocGmlLinearRing() {
    return locGmlLinearRing;
  }

  public void setLocGmlLinearRing(GmlLinearRing locGmlLinearRing) {
    this.locGmlLinearRing = locGmlLinearRing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GmlLineStringG gmlLineStringG = (GmlLineStringG) o;
    return Objects.equals(this.locGmlLineString, gmlLineStringG.locGmlLineString) &&
        Objects.equals(this.locGmlLinearRing, gmlLineStringG.locGmlLinearRing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locGmlLineString, locGmlLinearRing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GmlLineStringG {\n");
    sb.append("    locGmlLineString: ").append(toIndentedString(locGmlLineString)).append("\n");
    sb.append("    locGmlLinearRing: ").append(toIndentedString(locGmlLinearRing)).append("\n");
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

