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
 * AlertCMethod2PrimaryPointLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCMethod2PrimaryPointLocation {

  private AlertCLocation alertCLocation;

  @Valid
  private Map<String, Object> alertCMethod2PrimaryPointLocationExtensionG = new HashMap<>();

  public AlertCMethod2PrimaryPointLocation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCMethod2PrimaryPointLocation(AlertCLocation alertCLocation) {
    this.alertCLocation = alertCLocation;
  }

  public AlertCMethod2PrimaryPointLocation alertCLocation(AlertCLocation alertCLocation) {
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

  public AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocationExtensionG(Map<String, Object> alertCMethod2PrimaryPointLocationExtensionG) {
    this.alertCMethod2PrimaryPointLocationExtensionG = alertCMethod2PrimaryPointLocationExtensionG;
    return this;
  }

  public AlertCMethod2PrimaryPointLocation putAlertCMethod2PrimaryPointLocationExtensionGItem(String key, Object alertCMethod2PrimaryPointLocationExtensionGItem) {
    if (this.alertCMethod2PrimaryPointLocationExtensionG == null) {
      this.alertCMethod2PrimaryPointLocationExtensionG = new HashMap<>();
    }
    this.alertCMethod2PrimaryPointLocationExtensionG.put(key, alertCMethod2PrimaryPointLocationExtensionGItem);
    return this;
  }

  /**
   * Get alertCMethod2PrimaryPointLocationExtensionG
   * @return alertCMethod2PrimaryPointLocationExtensionG
   */
  
  @Schema(name = "alertCMethod2PrimaryPointLocationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCMethod2PrimaryPointLocationExtensionG")
  public Map<String, Object> getAlertCMethod2PrimaryPointLocationExtensionG() {
    return alertCMethod2PrimaryPointLocationExtensionG;
  }

  public void setAlertCMethod2PrimaryPointLocationExtensionG(Map<String, Object> alertCMethod2PrimaryPointLocationExtensionG) {
    this.alertCMethod2PrimaryPointLocationExtensionG = alertCMethod2PrimaryPointLocationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation = (AlertCMethod2PrimaryPointLocation) o;
    return Objects.equals(this.alertCLocation, alertCMethod2PrimaryPointLocation.alertCLocation) &&
        Objects.equals(this.alertCMethod2PrimaryPointLocationExtensionG, alertCMethod2PrimaryPointLocation.alertCMethod2PrimaryPointLocationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCLocation, alertCMethod2PrimaryPointLocationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCMethod2PrimaryPointLocation {\n");
    sb.append("    alertCLocation: ").append(toIndentedString(alertCLocation)).append("\n");
    sb.append("    alertCMethod2PrimaryPointLocationExtensionG: ").append(toIndentedString(alertCMethod2PrimaryPointLocationExtensionG)).append("\n");
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

