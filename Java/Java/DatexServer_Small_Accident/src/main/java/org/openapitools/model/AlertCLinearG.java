package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AlertCLinearByCode;
import org.openapitools.model.AlertCMethod2Linear;
import org.openapitools.model.AlertCMethod4Linear;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCLinearG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCLinearG {

  private AlertCLinearByCode locAlertCLinearByCode;

  private AlertCMethod4Linear locAlertCMethod4Linear;

  private AlertCMethod2Linear locAlertCMethod2Linear;

  public AlertCLinearG locAlertCLinearByCode(AlertCLinearByCode locAlertCLinearByCode) {
    this.locAlertCLinearByCode = locAlertCLinearByCode;
    return this;
  }

  /**
   * Get locAlertCLinearByCode
   * @return locAlertCLinearByCode
   */
  @Valid 
  @Schema(name = "locAlertCLinearByCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locAlertCLinearByCode")
  public AlertCLinearByCode getLocAlertCLinearByCode() {
    return locAlertCLinearByCode;
  }

  public void setLocAlertCLinearByCode(AlertCLinearByCode locAlertCLinearByCode) {
    this.locAlertCLinearByCode = locAlertCLinearByCode;
  }

  public AlertCLinearG locAlertCMethod4Linear(AlertCMethod4Linear locAlertCMethod4Linear) {
    this.locAlertCMethod4Linear = locAlertCMethod4Linear;
    return this;
  }

  /**
   * Get locAlertCMethod4Linear
   * @return locAlertCMethod4Linear
   */
  @Valid 
  @Schema(name = "locAlertCMethod4Linear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locAlertCMethod4Linear")
  public AlertCMethod4Linear getLocAlertCMethod4Linear() {
    return locAlertCMethod4Linear;
  }

  public void setLocAlertCMethod4Linear(AlertCMethod4Linear locAlertCMethod4Linear) {
    this.locAlertCMethod4Linear = locAlertCMethod4Linear;
  }

  public AlertCLinearG locAlertCMethod2Linear(AlertCMethod2Linear locAlertCMethod2Linear) {
    this.locAlertCMethod2Linear = locAlertCMethod2Linear;
    return this;
  }

  /**
   * Get locAlertCMethod2Linear
   * @return locAlertCMethod2Linear
   */
  @Valid 
  @Schema(name = "locAlertCMethod2Linear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locAlertCMethod2Linear")
  public AlertCMethod2Linear getLocAlertCMethod2Linear() {
    return locAlertCMethod2Linear;
  }

  public void setLocAlertCMethod2Linear(AlertCMethod2Linear locAlertCMethod2Linear) {
    this.locAlertCMethod2Linear = locAlertCMethod2Linear;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCLinearG alertCLinearG = (AlertCLinearG) o;
    return Objects.equals(this.locAlertCLinearByCode, alertCLinearG.locAlertCLinearByCode) &&
        Objects.equals(this.locAlertCMethod4Linear, alertCLinearG.locAlertCMethod4Linear) &&
        Objects.equals(this.locAlertCMethod2Linear, alertCLinearG.locAlertCMethod2Linear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locAlertCLinearByCode, locAlertCMethod4Linear, locAlertCMethod2Linear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCLinearG {\n");
    sb.append("    locAlertCLinearByCode: ").append(toIndentedString(locAlertCLinearByCode)).append("\n");
    sb.append("    locAlertCMethod4Linear: ").append(toIndentedString(locAlertCMethod4Linear)).append("\n");
    sb.append("    locAlertCMethod2Linear: ").append(toIndentedString(locAlertCMethod2Linear)).append("\n");
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

