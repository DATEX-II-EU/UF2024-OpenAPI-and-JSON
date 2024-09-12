package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AlertCDirection;
import org.openapitools.model.AlertCMethod2PrimaryPointLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCMethod2Point
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCMethod2Point {

  private String alertCLocationCountryCode;

  private String alertCLocationTableNumber;

  private String alertCLocationTableVersion;

  private AlertCDirection alertCDirection;

  private AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation;

  @Valid
  private Map<String, Object> alertCPointExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> alertCMethod2PointExtensionG = new HashMap<>();

  public AlertCMethod2Point() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCMethod2Point(String alertCLocationCountryCode, String alertCLocationTableNumber, String alertCLocationTableVersion, AlertCDirection alertCDirection, AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation) {
    this.alertCLocationCountryCode = alertCLocationCountryCode;
    this.alertCLocationTableNumber = alertCLocationTableNumber;
    this.alertCLocationTableVersion = alertCLocationTableVersion;
    this.alertCDirection = alertCDirection;
    this.alertCMethod2PrimaryPointLocation = alertCMethod2PrimaryPointLocation;
  }

  public AlertCMethod2Point alertCLocationCountryCode(String alertCLocationCountryCode) {
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

  public AlertCMethod2Point alertCLocationTableNumber(String alertCLocationTableNumber) {
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

  public AlertCMethod2Point alertCLocationTableVersion(String alertCLocationTableVersion) {
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

  public AlertCMethod2Point alertCDirection(AlertCDirection alertCDirection) {
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

  public AlertCMethod2Point alertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation) {
    this.alertCMethod2PrimaryPointLocation = alertCMethod2PrimaryPointLocation;
    return this;
  }

  /**
   * Get alertCMethod2PrimaryPointLocation
   * @return alertCMethod2PrimaryPointLocation
   */
  @NotNull @Valid 
  @Schema(name = "alertCMethod2PrimaryPointLocation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCMethod2PrimaryPointLocation")
  public AlertCMethod2PrimaryPointLocation getAlertCMethod2PrimaryPointLocation() {
    return alertCMethod2PrimaryPointLocation;
  }

  public void setAlertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation) {
    this.alertCMethod2PrimaryPointLocation = alertCMethod2PrimaryPointLocation;
  }

  public AlertCMethod2Point alertCPointExtensionG(Map<String, Object> alertCPointExtensionG) {
    this.alertCPointExtensionG = alertCPointExtensionG;
    return this;
  }

  public AlertCMethod2Point putAlertCPointExtensionGItem(String key, Object alertCPointExtensionGItem) {
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

  public AlertCMethod2Point alertCMethod2PointExtensionG(Map<String, Object> alertCMethod2PointExtensionG) {
    this.alertCMethod2PointExtensionG = alertCMethod2PointExtensionG;
    return this;
  }

  public AlertCMethod2Point putAlertCMethod2PointExtensionGItem(String key, Object alertCMethod2PointExtensionGItem) {
    if (this.alertCMethod2PointExtensionG == null) {
      this.alertCMethod2PointExtensionG = new HashMap<>();
    }
    this.alertCMethod2PointExtensionG.put(key, alertCMethod2PointExtensionGItem);
    return this;
  }

  /**
   * Get alertCMethod2PointExtensionG
   * @return alertCMethod2PointExtensionG
   */
  
  @Schema(name = "alertCMethod2PointExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCMethod2PointExtensionG")
  public Map<String, Object> getAlertCMethod2PointExtensionG() {
    return alertCMethod2PointExtensionG;
  }

  public void setAlertCMethod2PointExtensionG(Map<String, Object> alertCMethod2PointExtensionG) {
    this.alertCMethod2PointExtensionG = alertCMethod2PointExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCMethod2Point alertCMethod2Point = (AlertCMethod2Point) o;
    return Objects.equals(this.alertCLocationCountryCode, alertCMethod2Point.alertCLocationCountryCode) &&
        Objects.equals(this.alertCLocationTableNumber, alertCMethod2Point.alertCLocationTableNumber) &&
        Objects.equals(this.alertCLocationTableVersion, alertCMethod2Point.alertCLocationTableVersion) &&
        Objects.equals(this.alertCDirection, alertCMethod2Point.alertCDirection) &&
        Objects.equals(this.alertCMethod2PrimaryPointLocation, alertCMethod2Point.alertCMethod2PrimaryPointLocation) &&
        Objects.equals(this.alertCPointExtensionG, alertCMethod2Point.alertCPointExtensionG) &&
        Objects.equals(this.alertCMethod2PointExtensionG, alertCMethod2Point.alertCMethod2PointExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCLocationCountryCode, alertCLocationTableNumber, alertCLocationTableVersion, alertCDirection, alertCMethod2PrimaryPointLocation, alertCPointExtensionG, alertCMethod2PointExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCMethod2Point {\n");
    sb.append("    alertCLocationCountryCode: ").append(toIndentedString(alertCLocationCountryCode)).append("\n");
    sb.append("    alertCLocationTableNumber: ").append(toIndentedString(alertCLocationTableNumber)).append("\n");
    sb.append("    alertCLocationTableVersion: ").append(toIndentedString(alertCLocationTableVersion)).append("\n");
    sb.append("    alertCDirection: ").append(toIndentedString(alertCDirection)).append("\n");
    sb.append("    alertCMethod2PrimaryPointLocation: ").append(toIndentedString(alertCMethod2PrimaryPointLocation)).append("\n");
    sb.append("    alertCPointExtensionG: ").append(toIndentedString(alertCPointExtensionG)).append("\n");
    sb.append("    alertCMethod2PointExtensionG: ").append(toIndentedString(alertCMethod2PointExtensionG)).append("\n");
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

