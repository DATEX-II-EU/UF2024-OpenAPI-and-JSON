package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AlertCDirection;
import org.openapitools.model.AlertCLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCLinearByCode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCLinearByCode {

  private String alertCLocationCountryCode;

  private String alertCLocationTableNumber;

  private String alertCLocationTableVersion;

  private AlertCDirection alertCDirection;

  private AlertCLocation locationCodeForLinearLocation;

  @Valid
  private Map<String, Object> alertCLinearExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> alertCLinearByCodeExtensionG = new HashMap<>();

  public AlertCLinearByCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCLinearByCode(String alertCLocationCountryCode, String alertCLocationTableNumber, String alertCLocationTableVersion, AlertCDirection alertCDirection, AlertCLocation locationCodeForLinearLocation) {
    this.alertCLocationCountryCode = alertCLocationCountryCode;
    this.alertCLocationTableNumber = alertCLocationTableNumber;
    this.alertCLocationTableVersion = alertCLocationTableVersion;
    this.alertCDirection = alertCDirection;
    this.locationCodeForLinearLocation = locationCodeForLinearLocation;
  }

  public AlertCLinearByCode alertCLocationCountryCode(String alertCLocationCountryCode) {
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

  public AlertCLinearByCode alertCLocationTableNumber(String alertCLocationTableNumber) {
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

  public AlertCLinearByCode alertCLocationTableVersion(String alertCLocationTableVersion) {
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

  public AlertCLinearByCode alertCDirection(AlertCDirection alertCDirection) {
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

  public AlertCLinearByCode locationCodeForLinearLocation(AlertCLocation locationCodeForLinearLocation) {
    this.locationCodeForLinearLocation = locationCodeForLinearLocation;
    return this;
  }

  /**
   * Get locationCodeForLinearLocation
   * @return locationCodeForLinearLocation
   */
  @NotNull @Valid 
  @Schema(name = "locationCodeForLinearLocation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locationCodeForLinearLocation")
  public AlertCLocation getLocationCodeForLinearLocation() {
    return locationCodeForLinearLocation;
  }

  public void setLocationCodeForLinearLocation(AlertCLocation locationCodeForLinearLocation) {
    this.locationCodeForLinearLocation = locationCodeForLinearLocation;
  }

  public AlertCLinearByCode alertCLinearExtensionG(Map<String, Object> alertCLinearExtensionG) {
    this.alertCLinearExtensionG = alertCLinearExtensionG;
    return this;
  }

  public AlertCLinearByCode putAlertCLinearExtensionGItem(String key, Object alertCLinearExtensionGItem) {
    if (this.alertCLinearExtensionG == null) {
      this.alertCLinearExtensionG = new HashMap<>();
    }
    this.alertCLinearExtensionG.put(key, alertCLinearExtensionGItem);
    return this;
  }

  /**
   * Get alertCLinearExtensionG
   * @return alertCLinearExtensionG
   */
  
  @Schema(name = "alertCLinearExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCLinearExtensionG")
  public Map<String, Object> getAlertCLinearExtensionG() {
    return alertCLinearExtensionG;
  }

  public void setAlertCLinearExtensionG(Map<String, Object> alertCLinearExtensionG) {
    this.alertCLinearExtensionG = alertCLinearExtensionG;
  }

  public AlertCLinearByCode alertCLinearByCodeExtensionG(Map<String, Object> alertCLinearByCodeExtensionG) {
    this.alertCLinearByCodeExtensionG = alertCLinearByCodeExtensionG;
    return this;
  }

  public AlertCLinearByCode putAlertCLinearByCodeExtensionGItem(String key, Object alertCLinearByCodeExtensionGItem) {
    if (this.alertCLinearByCodeExtensionG == null) {
      this.alertCLinearByCodeExtensionG = new HashMap<>();
    }
    this.alertCLinearByCodeExtensionG.put(key, alertCLinearByCodeExtensionGItem);
    return this;
  }

  /**
   * Get alertCLinearByCodeExtensionG
   * @return alertCLinearByCodeExtensionG
   */
  
  @Schema(name = "alertCLinearByCodeExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCLinearByCodeExtensionG")
  public Map<String, Object> getAlertCLinearByCodeExtensionG() {
    return alertCLinearByCodeExtensionG;
  }

  public void setAlertCLinearByCodeExtensionG(Map<String, Object> alertCLinearByCodeExtensionG) {
    this.alertCLinearByCodeExtensionG = alertCLinearByCodeExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCLinearByCode alertCLinearByCode = (AlertCLinearByCode) o;
    return Objects.equals(this.alertCLocationCountryCode, alertCLinearByCode.alertCLocationCountryCode) &&
        Objects.equals(this.alertCLocationTableNumber, alertCLinearByCode.alertCLocationTableNumber) &&
        Objects.equals(this.alertCLocationTableVersion, alertCLinearByCode.alertCLocationTableVersion) &&
        Objects.equals(this.alertCDirection, alertCLinearByCode.alertCDirection) &&
        Objects.equals(this.locationCodeForLinearLocation, alertCLinearByCode.locationCodeForLinearLocation) &&
        Objects.equals(this.alertCLinearExtensionG, alertCLinearByCode.alertCLinearExtensionG) &&
        Objects.equals(this.alertCLinearByCodeExtensionG, alertCLinearByCode.alertCLinearByCodeExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCLocationCountryCode, alertCLocationTableNumber, alertCLocationTableVersion, alertCDirection, locationCodeForLinearLocation, alertCLinearExtensionG, alertCLinearByCodeExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCLinearByCode {\n");
    sb.append("    alertCLocationCountryCode: ").append(toIndentedString(alertCLocationCountryCode)).append("\n");
    sb.append("    alertCLocationTableNumber: ").append(toIndentedString(alertCLocationTableNumber)).append("\n");
    sb.append("    alertCLocationTableVersion: ").append(toIndentedString(alertCLocationTableVersion)).append("\n");
    sb.append("    alertCDirection: ").append(toIndentedString(alertCDirection)).append("\n");
    sb.append("    locationCodeForLinearLocation: ").append(toIndentedString(locationCodeForLinearLocation)).append("\n");
    sb.append("    alertCLinearExtensionG: ").append(toIndentedString(alertCLinearExtensionG)).append("\n");
    sb.append("    alertCLinearByCodeExtensionG: ").append(toIndentedString(alertCLinearByCodeExtensionG)).append("\n");
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

