package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AlertCDirection;
import org.openapitools.model.AlertCMethod4PrimaryPointLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCMethod4Point
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCMethod4Point {

  private String alertCLocationCountryCode;

  private String alertCLocationTableNumber;

  private String alertCLocationTableVersion;

  private AlertCDirection alertCDirection;

  private AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation;

  @Valid
  private Map<String, Object> alertCPointExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> alertCMethod4PointExtensionG = new HashMap<>();

  public AlertCMethod4Point() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCMethod4Point(String alertCLocationCountryCode, String alertCLocationTableNumber, String alertCLocationTableVersion, AlertCDirection alertCDirection, AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation) {
    this.alertCLocationCountryCode = alertCLocationCountryCode;
    this.alertCLocationTableNumber = alertCLocationTableNumber;
    this.alertCLocationTableVersion = alertCLocationTableVersion;
    this.alertCDirection = alertCDirection;
    this.alertCMethod4PrimaryPointLocation = alertCMethod4PrimaryPointLocation;
  }

  public AlertCMethod4Point alertCLocationCountryCode(String alertCLocationCountryCode) {
    this.alertCLocationCountryCode = alertCLocationCountryCode;
    return this;
  }

  /**
   * Get alertCLocationCountryCode
   * @return alertCLocationCountryCode
   */
  @NotNull @Size(max = 1024) 
  @Schema(name = "alertCLocationCountryCode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCLocationCountryCode")
  public String getAlertCLocationCountryCode() {
    return alertCLocationCountryCode;
  }

  public void setAlertCLocationCountryCode(String alertCLocationCountryCode) {
    this.alertCLocationCountryCode = alertCLocationCountryCode;
  }

  public AlertCMethod4Point alertCLocationTableNumber(String alertCLocationTableNumber) {
    this.alertCLocationTableNumber = alertCLocationTableNumber;
    return this;
  }

  /**
   * Get alertCLocationTableNumber
   * @return alertCLocationTableNumber
   */
  @NotNull @Size(max = 1024) 
  @Schema(name = "alertCLocationTableNumber", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCLocationTableNumber")
  public String getAlertCLocationTableNumber() {
    return alertCLocationTableNumber;
  }

  public void setAlertCLocationTableNumber(String alertCLocationTableNumber) {
    this.alertCLocationTableNumber = alertCLocationTableNumber;
  }

  public AlertCMethod4Point alertCLocationTableVersion(String alertCLocationTableVersion) {
    this.alertCLocationTableVersion = alertCLocationTableVersion;
    return this;
  }

  /**
   * Get alertCLocationTableVersion
   * @return alertCLocationTableVersion
   */
  @NotNull @Size(max = 1024) 
  @Schema(name = "alertCLocationTableVersion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCLocationTableVersion")
  public String getAlertCLocationTableVersion() {
    return alertCLocationTableVersion;
  }

  public void setAlertCLocationTableVersion(String alertCLocationTableVersion) {
    this.alertCLocationTableVersion = alertCLocationTableVersion;
  }

  public AlertCMethod4Point alertCDirection(AlertCDirection alertCDirection) {
    this.alertCDirection = alertCDirection;
    return this;
  }

  /**
   * Get alertCDirection
   * @return alertCDirection
   */
  @NotNull @Valid 
  @Schema(name = "alertCDirection", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCDirection")
  public AlertCDirection getAlertCDirection() {
    return alertCDirection;
  }

  public void setAlertCDirection(AlertCDirection alertCDirection) {
    this.alertCDirection = alertCDirection;
  }

  public AlertCMethod4Point alertCMethod4PrimaryPointLocation(AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation) {
    this.alertCMethod4PrimaryPointLocation = alertCMethod4PrimaryPointLocation;
    return this;
  }

  /**
   * Get alertCMethod4PrimaryPointLocation
   * @return alertCMethod4PrimaryPointLocation
   */
  @NotNull @Valid 
  @Schema(name = "alertCMethod4PrimaryPointLocation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCMethod4PrimaryPointLocation")
  public AlertCMethod4PrimaryPointLocation getAlertCMethod4PrimaryPointLocation() {
    return alertCMethod4PrimaryPointLocation;
  }

  public void setAlertCMethod4PrimaryPointLocation(AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation) {
    this.alertCMethod4PrimaryPointLocation = alertCMethod4PrimaryPointLocation;
  }

  public AlertCMethod4Point alertCPointExtensionG(Map<String, Object> alertCPointExtensionG) {
    this.alertCPointExtensionG = alertCPointExtensionG;
    return this;
  }

  public AlertCMethod4Point putAlertCPointExtensionGItem(String key, Object alertCPointExtensionGItem) {
    if (this.alertCPointExtensionG == null) {
      this.alertCPointExtensionG = new HashMap<>();
    }
    this.alertCPointExtensionG.put(key, alertCPointExtensionGItem);
    return this;
  }

  /**
   * Get alertCPointExtensionG
   * @return alertCPointExtensionG
   */
  
  @Schema(name = "alertCPointExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCPointExtensionG")
  public Map<String, Object> getAlertCPointExtensionG() {
    return alertCPointExtensionG;
  }

  public void setAlertCPointExtensionG(Map<String, Object> alertCPointExtensionG) {
    this.alertCPointExtensionG = alertCPointExtensionG;
  }

  public AlertCMethod4Point alertCMethod4PointExtensionG(Map<String, Object> alertCMethod4PointExtensionG) {
    this.alertCMethod4PointExtensionG = alertCMethod4PointExtensionG;
    return this;
  }

  public AlertCMethod4Point putAlertCMethod4PointExtensionGItem(String key, Object alertCMethod4PointExtensionGItem) {
    if (this.alertCMethod4PointExtensionG == null) {
      this.alertCMethod4PointExtensionG = new HashMap<>();
    }
    this.alertCMethod4PointExtensionG.put(key, alertCMethod4PointExtensionGItem);
    return this;
  }

  /**
   * Get alertCMethod4PointExtensionG
   * @return alertCMethod4PointExtensionG
   */
  
  @Schema(name = "alertCMethod4PointExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCMethod4PointExtensionG")
  public Map<String, Object> getAlertCMethod4PointExtensionG() {
    return alertCMethod4PointExtensionG;
  }

  public void setAlertCMethod4PointExtensionG(Map<String, Object> alertCMethod4PointExtensionG) {
    this.alertCMethod4PointExtensionG = alertCMethod4PointExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCMethod4Point alertCMethod4Point = (AlertCMethod4Point) o;
    return Objects.equals(this.alertCLocationCountryCode, alertCMethod4Point.alertCLocationCountryCode) &&
        Objects.equals(this.alertCLocationTableNumber, alertCMethod4Point.alertCLocationTableNumber) &&
        Objects.equals(this.alertCLocationTableVersion, alertCMethod4Point.alertCLocationTableVersion) &&
        Objects.equals(this.alertCDirection, alertCMethod4Point.alertCDirection) &&
        Objects.equals(this.alertCMethod4PrimaryPointLocation, alertCMethod4Point.alertCMethod4PrimaryPointLocation) &&
        Objects.equals(this.alertCPointExtensionG, alertCMethod4Point.alertCPointExtensionG) &&
        Objects.equals(this.alertCMethod4PointExtensionG, alertCMethod4Point.alertCMethod4PointExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCLocationCountryCode, alertCLocationTableNumber, alertCLocationTableVersion, alertCDirection, alertCMethod4PrimaryPointLocation, alertCPointExtensionG, alertCMethod4PointExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCMethod4Point {\n");
    sb.append("    alertCLocationCountryCode: ").append(toIndentedString(alertCLocationCountryCode)).append("\n");
    sb.append("    alertCLocationTableNumber: ").append(toIndentedString(alertCLocationTableNumber)).append("\n");
    sb.append("    alertCLocationTableVersion: ").append(toIndentedString(alertCLocationTableVersion)).append("\n");
    sb.append("    alertCDirection: ").append(toIndentedString(alertCDirection)).append("\n");
    sb.append("    alertCMethod4PrimaryPointLocation: ").append(toIndentedString(alertCMethod4PrimaryPointLocation)).append("\n");
    sb.append("    alertCPointExtensionG: ").append(toIndentedString(alertCPointExtensionG)).append("\n");
    sb.append("    alertCMethod4PointExtensionG: ").append(toIndentedString(alertCMethod4PointExtensionG)).append("\n");
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

