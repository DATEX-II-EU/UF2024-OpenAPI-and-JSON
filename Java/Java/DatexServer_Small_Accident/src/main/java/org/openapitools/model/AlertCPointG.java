package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AlertCMethod2Point;
import org.openapitools.model.AlertCMethod4Point;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCPointG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCPointG {

  private AlertCMethod2Point locAlertCMethod2Point;

  private AlertCMethod4Point locAlertCMethod4Point;

  public AlertCPointG locAlertCMethod2Point(AlertCMethod2Point locAlertCMethod2Point) {
    this.locAlertCMethod2Point = locAlertCMethod2Point;
    return this;
  }

  /**
   * Get locAlertCMethod2Point
   * @return locAlertCMethod2Point
   */
  @Valid 
  @Schema(name = "locAlertCMethod2Point", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locAlertCMethod2Point")
  public AlertCMethod2Point getLocAlertCMethod2Point() {
    return locAlertCMethod2Point;
  }

  public void setLocAlertCMethod2Point(AlertCMethod2Point locAlertCMethod2Point) {
    this.locAlertCMethod2Point = locAlertCMethod2Point;
  }

  public AlertCPointG locAlertCMethod4Point(AlertCMethod4Point locAlertCMethod4Point) {
    this.locAlertCMethod4Point = locAlertCMethod4Point;
    return this;
  }

  /**
   * Get locAlertCMethod4Point
   * @return locAlertCMethod4Point
   */
  @Valid 
  @Schema(name = "locAlertCMethod4Point", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locAlertCMethod4Point")
  public AlertCMethod4Point getLocAlertCMethod4Point() {
    return locAlertCMethod4Point;
  }

  public void setLocAlertCMethod4Point(AlertCMethod4Point locAlertCMethod4Point) {
    this.locAlertCMethod4Point = locAlertCMethod4Point;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCPointG alertCPointG = (AlertCPointG) o;
    return Objects.equals(this.locAlertCMethod2Point, alertCPointG.locAlertCMethod2Point) &&
        Objects.equals(this.locAlertCMethod4Point, alertCPointG.locAlertCMethod4Point);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locAlertCMethod2Point, locAlertCMethod4Point);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCPointG {\n");
    sb.append("    locAlertCMethod2Point: ").append(toIndentedString(locAlertCMethod2Point)).append("\n");
    sb.append("    locAlertCMethod4Point: ").append(toIndentedString(locAlertCMethod4Point)).append("\n");
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

