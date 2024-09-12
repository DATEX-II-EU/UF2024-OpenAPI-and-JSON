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
 * AlertCMethod4SecondaryPointLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCMethod4SecondaryPointLocation {

  private AlertCLocation alertCLocation;

  private OffsetDistance offsetDistance;

  @Valid
  private Map<String, Object> alertCMethod4SecondaryPointLocationExtensionG = new HashMap<>();

  public AlertCMethod4SecondaryPointLocation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCMethod4SecondaryPointLocation(AlertCLocation alertCLocation, OffsetDistance offsetDistance) {
    this.alertCLocation = alertCLocation;
    this.offsetDistance = offsetDistance;
  }

  public AlertCMethod4SecondaryPointLocation alertCLocation(AlertCLocation alertCLocation) {
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

  public AlertCMethod4SecondaryPointLocation offsetDistance(OffsetDistance offsetDistance) {
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

  public AlertCMethod4SecondaryPointLocation alertCMethod4SecondaryPointLocationExtensionG(Map<String, Object> alertCMethod4SecondaryPointLocationExtensionG) {
    this.alertCMethod4SecondaryPointLocationExtensionG = alertCMethod4SecondaryPointLocationExtensionG;
    return this;
  }

  public AlertCMethod4SecondaryPointLocation putAlertCMethod4SecondaryPointLocationExtensionGItem(String key, Object alertCMethod4SecondaryPointLocationExtensionGItem) {
    if (this.alertCMethod4SecondaryPointLocationExtensionG == null) {
      this.alertCMethod4SecondaryPointLocationExtensionG = new HashMap<>();
    }
    this.alertCMethod4SecondaryPointLocationExtensionG.put(key, alertCMethod4SecondaryPointLocationExtensionGItem);
    return this;
  }

  /**
   * Get alertCMethod4SecondaryPointLocationExtensionG
   * @return alertCMethod4SecondaryPointLocationExtensionG
   */
  
  @Schema(name = "alertCMethod4SecondaryPointLocationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCMethod4SecondaryPointLocationExtensionG")
  public Map<String, Object> getAlertCMethod4SecondaryPointLocationExtensionG() {
    return alertCMethod4SecondaryPointLocationExtensionG;
  }

  public void setAlertCMethod4SecondaryPointLocationExtensionG(Map<String, Object> alertCMethod4SecondaryPointLocationExtensionG) {
    this.alertCMethod4SecondaryPointLocationExtensionG = alertCMethod4SecondaryPointLocationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCMethod4SecondaryPointLocation alertCMethod4SecondaryPointLocation = (AlertCMethod4SecondaryPointLocation) o;
    return Objects.equals(this.alertCLocation, alertCMethod4SecondaryPointLocation.alertCLocation) &&
        Objects.equals(this.offsetDistance, alertCMethod4SecondaryPointLocation.offsetDistance) &&
        Objects.equals(this.alertCMethod4SecondaryPointLocationExtensionG, alertCMethod4SecondaryPointLocation.alertCMethod4SecondaryPointLocationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCLocation, offsetDistance, alertCMethod4SecondaryPointLocationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCMethod4SecondaryPointLocation {\n");
    sb.append("    alertCLocation: ").append(toIndentedString(alertCLocation)).append("\n");
    sb.append("    offsetDistance: ").append(toIndentedString(offsetDistance)).append("\n");
    sb.append("    alertCMethod4SecondaryPointLocationExtensionG: ").append(toIndentedString(alertCMethod4SecondaryPointLocationExtensionG)).append("\n");
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

