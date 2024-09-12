package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AlertCLocation;
import org.openapitools.model.OffsetDistance;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCMethod4PrimaryPointLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCMethod4PrimaryPointLocation {

  private AlertCLocation alertCLocation;

  private OffsetDistance offsetDistance;

  @Valid
  private Map<String, Object> alertCMethod4PrimaryPointLocationExtensionG = new HashMap<>();

  public AlertCMethod4PrimaryPointLocation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCMethod4PrimaryPointLocation(AlertCLocation alertCLocation, OffsetDistance offsetDistance) {
    this.alertCLocation = alertCLocation;
    this.offsetDistance = offsetDistance;
  }

  public AlertCMethod4PrimaryPointLocation alertCLocation(AlertCLocation alertCLocation) {
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

  public AlertCMethod4PrimaryPointLocation offsetDistance(OffsetDistance offsetDistance) {
    this.offsetDistance = offsetDistance;
    return this;
  }

  /**
   * Get offsetDistance
   * @return offsetDistance
   */
  @NotNull @Valid 
  @Schema(name = "offsetDistance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offsetDistance")
  public OffsetDistance getOffsetDistance() {
    return offsetDistance;
  }

  public void setOffsetDistance(OffsetDistance offsetDistance) {
    this.offsetDistance = offsetDistance;
  }

  public AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocationExtensionG(Map<String, Object> alertCMethod4PrimaryPointLocationExtensionG) {
    this.alertCMethod4PrimaryPointLocationExtensionG = alertCMethod4PrimaryPointLocationExtensionG;
    return this;
  }

  public AlertCMethod4PrimaryPointLocation putAlertCMethod4PrimaryPointLocationExtensionGItem(String key, Object alertCMethod4PrimaryPointLocationExtensionGItem) {
    if (this.alertCMethod4PrimaryPointLocationExtensionG == null) {
      this.alertCMethod4PrimaryPointLocationExtensionG = new HashMap<>();
    }
    this.alertCMethod4PrimaryPointLocationExtensionG.put(key, alertCMethod4PrimaryPointLocationExtensionGItem);
    return this;
  }

  /**
   * Get alertCMethod4PrimaryPointLocationExtensionG
   * @return alertCMethod4PrimaryPointLocationExtensionG
   */
  
  @Schema(name = "alertCMethod4PrimaryPointLocationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCMethod4PrimaryPointLocationExtensionG")
  public Map<String, Object> getAlertCMethod4PrimaryPointLocationExtensionG() {
    return alertCMethod4PrimaryPointLocationExtensionG;
  }

  public void setAlertCMethod4PrimaryPointLocationExtensionG(Map<String, Object> alertCMethod4PrimaryPointLocationExtensionG) {
    this.alertCMethod4PrimaryPointLocationExtensionG = alertCMethod4PrimaryPointLocationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation = (AlertCMethod4PrimaryPointLocation) o;
    return Objects.equals(this.alertCLocation, alertCMethod4PrimaryPointLocation.alertCLocation) &&
        Objects.equals(this.offsetDistance, alertCMethod4PrimaryPointLocation.offsetDistance) &&
        Objects.equals(this.alertCMethod4PrimaryPointLocationExtensionG, alertCMethod4PrimaryPointLocation.alertCMethod4PrimaryPointLocationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCLocation, offsetDistance, alertCMethod4PrimaryPointLocationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCMethod4PrimaryPointLocation {\n");
    sb.append("    alertCLocation: ").append(toIndentedString(alertCLocation)).append("\n");
    sb.append("    offsetDistance: ").append(toIndentedString(offsetDistance)).append("\n");
    sb.append("    alertCMethod4PrimaryPointLocationExtensionG: ").append(toIndentedString(alertCMethod4PrimaryPointLocationExtensionG)).append("\n");
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

