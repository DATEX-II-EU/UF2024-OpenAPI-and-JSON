package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AlertCDirection;
import org.openapitools.model.AlertCMethod4PrimaryPointLocation;
import org.openapitools.model.AlertCMethod4SecondaryPointLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCMethod4Linear
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCMethod4Linear {

  private String alertCLocationCountryCode;

  private String alertCLocationTableNumber;

  private String alertCLocationTableVersion;

  private AlertCDirection alertCDirection;

  private AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation;

  private AlertCMethod4SecondaryPointLocation alertCMethod4SecondaryPointLocation;

  @Valid
  private Map<String, Object> alertCLinearExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> alertCMethod4LinearExtensionG = new HashMap<>();

  public AlertCMethod4Linear() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCMethod4Linear(String alertCLocationCountryCode, String alertCLocationTableNumber, String alertCLocationTableVersion, AlertCDirection alertCDirection, AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation, AlertCMethod4SecondaryPointLocation alertCMethod4SecondaryPointLocation) {
    this.alertCLocationCountryCode = alertCLocationCountryCode;
    this.alertCLocationTableNumber = alertCLocationTableNumber;
    this.alertCLocationTableVersion = alertCLocationTableVersion;
    this.alertCDirection = alertCDirection;
    this.alertCMethod4PrimaryPointLocation = alertCMethod4PrimaryPointLocation;
    this.alertCMethod4SecondaryPointLocation = alertCMethod4SecondaryPointLocation;
  }

  public AlertCMethod4Linear alertCLocationCountryCode(String alertCLocationCountryCode) {
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

  public AlertCMethod4Linear alertCLocationTableNumber(String alertCLocationTableNumber) {
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

  public AlertCMethod4Linear alertCLocationTableVersion(String alertCLocationTableVersion) {
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

  public AlertCMethod4Linear alertCDirection(AlertCDirection alertCDirection) {
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

  public AlertCMethod4Linear alertCMethod4PrimaryPointLocation(AlertCMethod4PrimaryPointLocation alertCMethod4PrimaryPointLocation) {
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

  public AlertCMethod4Linear alertCMethod4SecondaryPointLocation(AlertCMethod4SecondaryPointLocation alertCMethod4SecondaryPointLocation) {
    this.alertCMethod4SecondaryPointLocation = alertCMethod4SecondaryPointLocation;
    return this;
  }

  /**
   * Get alertCMethod4SecondaryPointLocation
   * @return alertCMethod4SecondaryPointLocation
   */
  @NotNull @Valid 
  @Schema(name = "alertCMethod4SecondaryPointLocation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCMethod4SecondaryPointLocation")
  public AlertCMethod4SecondaryPointLocation getAlertCMethod4SecondaryPointLocation() {
    return alertCMethod4SecondaryPointLocation;
  }

  public void setAlertCMethod4SecondaryPointLocation(AlertCMethod4SecondaryPointLocation alertCMethod4SecondaryPointLocation) {
    this.alertCMethod4SecondaryPointLocation = alertCMethod4SecondaryPointLocation;
  }

  public AlertCMethod4Linear alertCLinearExtensionG(Map<String, Object> alertCLinearExtensionG) {
    this.alertCLinearExtensionG = alertCLinearExtensionG;
    return this;
  }

  public AlertCMethod4Linear putAlertCLinearExtensionGItem(String key, Object alertCLinearExtensionGItem) {
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

  public AlertCMethod4Linear alertCMethod4LinearExtensionG(Map<String, Object> alertCMethod4LinearExtensionG) {
    this.alertCMethod4LinearExtensionG = alertCMethod4LinearExtensionG;
    return this;
  }

  public AlertCMethod4Linear putAlertCMethod4LinearExtensionGItem(String key, Object alertCMethod4LinearExtensionGItem) {
    if (this.alertCMethod4LinearExtensionG == null) {
      this.alertCMethod4LinearExtensionG = new HashMap<>();
    }
    this.alertCMethod4LinearExtensionG.put(key, alertCMethod4LinearExtensionGItem);
    return this;
  }

  /**
   * Get alertCMethod4LinearExtensionG
   * @return alertCMethod4LinearExtensionG
   */
  
  @Schema(name = "alertCMethod4LinearExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCMethod4LinearExtensionG")
  public Map<String, Object> getAlertCMethod4LinearExtensionG() {
    return alertCMethod4LinearExtensionG;
  }

  public void setAlertCMethod4LinearExtensionG(Map<String, Object> alertCMethod4LinearExtensionG) {
    this.alertCMethod4LinearExtensionG = alertCMethod4LinearExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCMethod4Linear alertCMethod4Linear = (AlertCMethod4Linear) o;
    return Objects.equals(this.alertCLocationCountryCode, alertCMethod4Linear.alertCLocationCountryCode) &&
        Objects.equals(this.alertCLocationTableNumber, alertCMethod4Linear.alertCLocationTableNumber) &&
        Objects.equals(this.alertCLocationTableVersion, alertCMethod4Linear.alertCLocationTableVersion) &&
        Objects.equals(this.alertCDirection, alertCMethod4Linear.alertCDirection) &&
        Objects.equals(this.alertCMethod4PrimaryPointLocation, alertCMethod4Linear.alertCMethod4PrimaryPointLocation) &&
        Objects.equals(this.alertCMethod4SecondaryPointLocation, alertCMethod4Linear.alertCMethod4SecondaryPointLocation) &&
        Objects.equals(this.alertCLinearExtensionG, alertCMethod4Linear.alertCLinearExtensionG) &&
        Objects.equals(this.alertCMethod4LinearExtensionG, alertCMethod4Linear.alertCMethod4LinearExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCLocationCountryCode, alertCLocationTableNumber, alertCLocationTableVersion, alertCDirection, alertCMethod4PrimaryPointLocation, alertCMethod4SecondaryPointLocation, alertCLinearExtensionG, alertCMethod4LinearExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCMethod4Linear {\n");
    sb.append("    alertCLocationCountryCode: ").append(toIndentedString(alertCLocationCountryCode)).append("\n");
    sb.append("    alertCLocationTableNumber: ").append(toIndentedString(alertCLocationTableNumber)).append("\n");
    sb.append("    alertCLocationTableVersion: ").append(toIndentedString(alertCLocationTableVersion)).append("\n");
    sb.append("    alertCDirection: ").append(toIndentedString(alertCDirection)).append("\n");
    sb.append("    alertCMethod4PrimaryPointLocation: ").append(toIndentedString(alertCMethod4PrimaryPointLocation)).append("\n");
    sb.append("    alertCMethod4SecondaryPointLocation: ").append(toIndentedString(alertCMethod4SecondaryPointLocation)).append("\n");
    sb.append("    alertCLinearExtensionG: ").append(toIndentedString(alertCLinearExtensionG)).append("\n");
    sb.append("    alertCMethod4LinearExtensionG: ").append(toIndentedString(alertCMethod4LinearExtensionG)).append("\n");
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

