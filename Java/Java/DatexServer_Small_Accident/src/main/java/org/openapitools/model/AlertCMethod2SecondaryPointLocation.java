package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AlertCLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCMethod2SecondaryPointLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCMethod2SecondaryPointLocation {

  private AlertCLocation alertCLocation;

  @Valid
  private Map<String, Object> alertCMethod2SecondaryPointLocationExtensionG = new HashMap<>();

  public AlertCMethod2SecondaryPointLocation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCMethod2SecondaryPointLocation(AlertCLocation alertCLocation) {
    this.alertCLocation = alertCLocation;
  }

  public AlertCMethod2SecondaryPointLocation alertCLocation(AlertCLocation alertCLocation) {
    this.alertCLocation = alertCLocation;
    return this;
  }

  /**
   * Get alertCLocation
   * @return alertCLocation
   */
  @NotNull @Valid 
  @Schema(name = "alertCLocation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCLocation")
  public AlertCLocation getAlertCLocation() {
    return alertCLocation;
  }

  public void setAlertCLocation(AlertCLocation alertCLocation) {
    this.alertCLocation = alertCLocation;
  }

  public AlertCMethod2SecondaryPointLocation alertCMethod2SecondaryPointLocationExtensionG(Map<String, Object> alertCMethod2SecondaryPointLocationExtensionG) {
    this.alertCMethod2SecondaryPointLocationExtensionG = alertCMethod2SecondaryPointLocationExtensionG;
    return this;
  }

  public AlertCMethod2SecondaryPointLocation putAlertCMethod2SecondaryPointLocationExtensionGItem(String key, Object alertCMethod2SecondaryPointLocationExtensionGItem) {
    if (this.alertCMethod2SecondaryPointLocationExtensionG == null) {
      this.alertCMethod2SecondaryPointLocationExtensionG = new HashMap<>();
    }
    this.alertCMethod2SecondaryPointLocationExtensionG.put(key, alertCMethod2SecondaryPointLocationExtensionGItem);
    return this;
  }

  /**
   * Get alertCMethod2SecondaryPointLocationExtensionG
   * @return alertCMethod2SecondaryPointLocationExtensionG
   */
  
  @Schema(name = "alertCMethod2SecondaryPointLocationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCMethod2SecondaryPointLocationExtensionG")
  public Map<String, Object> getAlertCMethod2SecondaryPointLocationExtensionG() {
    return alertCMethod2SecondaryPointLocationExtensionG;
  }

  public void setAlertCMethod2SecondaryPointLocationExtensionG(Map<String, Object> alertCMethod2SecondaryPointLocationExtensionG) {
    this.alertCMethod2SecondaryPointLocationExtensionG = alertCMethod2SecondaryPointLocationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCMethod2SecondaryPointLocation alertCMethod2SecondaryPointLocation = (AlertCMethod2SecondaryPointLocation) o;
    return Objects.equals(this.alertCLocation, alertCMethod2SecondaryPointLocation.alertCLocation) &&
        Objects.equals(this.alertCMethod2SecondaryPointLocationExtensionG, alertCMethod2SecondaryPointLocation.alertCMethod2SecondaryPointLocationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCLocation, alertCMethod2SecondaryPointLocationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCMethod2SecondaryPointLocation {\n");
    sb.append("    alertCLocation: ").append(toIndentedString(alertCLocation)).append("\n");
    sb.append("    alertCMethod2SecondaryPointLocationExtensionG: ").append(toIndentedString(alertCMethod2SecondaryPointLocationExtensionG)).append("\n");
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

