package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AlertCDirection;
import org.openapitools.model.AlertCMethod2PrimaryPointLocation;
import org.openapitools.model.AlertCMethod2SecondaryPointLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCMethod2Linear
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCMethod2Linear {

  private String alertCLocationCountryCode;

  private String alertCLocationTableNumber;

  private String alertCLocationTableVersion;

  private AlertCDirection alertCDirection;

  private AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation;

  private AlertCMethod2SecondaryPointLocation alertCMethod2SecondaryPointLocation;

  @Valid
  private Map<String, Object> alertCLinearExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> alertCMethod2LinearExtensionG = new HashMap<>();

  public AlertCMethod2Linear() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCMethod2Linear(String alertCLocationCountryCode, String alertCLocationTableNumber, String alertCLocationTableVersion, AlertCDirection alertCDirection, AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation, AlertCMethod2SecondaryPointLocation alertCMethod2SecondaryPointLocation) {
    this.alertCLocationCountryCode = alertCLocationCountryCode;
    this.alertCLocationTableNumber = alertCLocationTableNumber;
    this.alertCLocationTableVersion = alertCLocationTableVersion;
    this.alertCDirection = alertCDirection;
    this.alertCMethod2PrimaryPointLocation = alertCMethod2PrimaryPointLocation;
    this.alertCMethod2SecondaryPointLocation = alertCMethod2SecondaryPointLocation;
  }

  public AlertCMethod2Linear alertCLocationCountryCode(String alertCLocationCountryCode) {
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

  public AlertCMethod2Linear alertCLocationTableNumber(String alertCLocationTableNumber) {
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

  public AlertCMethod2Linear alertCLocationTableVersion(String alertCLocationTableVersion) {
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

  public AlertCMethod2Linear alertCDirection(AlertCDirection alertCDirection) {
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

  public AlertCMethod2Linear alertCMethod2PrimaryPointLocation(AlertCMethod2PrimaryPointLocation alertCMethod2PrimaryPointLocation) {
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

  public AlertCMethod2Linear alertCMethod2SecondaryPointLocation(AlertCMethod2SecondaryPointLocation alertCMethod2SecondaryPointLocation) {
    this.alertCMethod2SecondaryPointLocation = alertCMethod2SecondaryPointLocation;
    return this;
  }

  /**
   * Get alertCMethod2SecondaryPointLocation
   * @return alertCMethod2SecondaryPointLocation
   */
  @NotNull @Valid 
  @Schema(name = "alertCMethod2SecondaryPointLocation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCMethod2SecondaryPointLocation")
  public AlertCMethod2SecondaryPointLocation getAlertCMethod2SecondaryPointLocation() {
    return alertCMethod2SecondaryPointLocation;
  }

  public void setAlertCMethod2SecondaryPointLocation(AlertCMethod2SecondaryPointLocation alertCMethod2SecondaryPointLocation) {
    this.alertCMethod2SecondaryPointLocation = alertCMethod2SecondaryPointLocation;
  }

  public AlertCMethod2Linear alertCLinearExtensionG(Map<String, Object> alertCLinearExtensionG) {
    this.alertCLinearExtensionG = alertCLinearExtensionG;
    return this;
  }

  public AlertCMethod2Linear putAlertCLinearExtensionGItem(String key, Object alertCLinearExtensionGItem) {
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

  public AlertCMethod2Linear alertCMethod2LinearExtensionG(Map<String, Object> alertCMethod2LinearExtensionG) {
    this.alertCMethod2LinearExtensionG = alertCMethod2LinearExtensionG;
    return this;
  }

  public AlertCMethod2Linear putAlertCMethod2LinearExtensionGItem(String key, Object alertCMethod2LinearExtensionGItem) {
    if (this.alertCMethod2LinearExtensionG == null) {
      this.alertCMethod2LinearExtensionG = new HashMap<>();
    }
    this.alertCMethod2LinearExtensionG.put(key, alertCMethod2LinearExtensionGItem);
    return this;
  }

  /**
   * Get alertCMethod2LinearExtensionG
   * @return alertCMethod2LinearExtensionG
   */
  
  @Schema(name = "alertCMethod2LinearExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCMethod2LinearExtensionG")
  public Map<String, Object> getAlertCMethod2LinearExtensionG() {
    return alertCMethod2LinearExtensionG;
  }

  public void setAlertCMethod2LinearExtensionG(Map<String, Object> alertCMethod2LinearExtensionG) {
    this.alertCMethod2LinearExtensionG = alertCMethod2LinearExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCMethod2Linear alertCMethod2Linear = (AlertCMethod2Linear) o;
    return Objects.equals(this.alertCLocationCountryCode, alertCMethod2Linear.alertCLocationCountryCode) &&
        Objects.equals(this.alertCLocationTableNumber, alertCMethod2Linear.alertCLocationTableNumber) &&
        Objects.equals(this.alertCLocationTableVersion, alertCMethod2Linear.alertCLocationTableVersion) &&
        Objects.equals(this.alertCDirection, alertCMethod2Linear.alertCDirection) &&
        Objects.equals(this.alertCMethod2PrimaryPointLocation, alertCMethod2Linear.alertCMethod2PrimaryPointLocation) &&
        Objects.equals(this.alertCMethod2SecondaryPointLocation, alertCMethod2Linear.alertCMethod2SecondaryPointLocation) &&
        Objects.equals(this.alertCLinearExtensionG, alertCMethod2Linear.alertCLinearExtensionG) &&
        Objects.equals(this.alertCMethod2LinearExtensionG, alertCMethod2Linear.alertCMethod2LinearExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCLocationCountryCode, alertCLocationTableNumber, alertCLocationTableVersion, alertCDirection, alertCMethod2PrimaryPointLocation, alertCMethod2SecondaryPointLocation, alertCLinearExtensionG, alertCMethod2LinearExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCMethod2Linear {\n");
    sb.append("    alertCLocationCountryCode: ").append(toIndentedString(alertCLocationCountryCode)).append("\n");
    sb.append("    alertCLocationTableNumber: ").append(toIndentedString(alertCLocationTableNumber)).append("\n");
    sb.append("    alertCLocationTableVersion: ").append(toIndentedString(alertCLocationTableVersion)).append("\n");
    sb.append("    alertCDirection: ").append(toIndentedString(alertCDirection)).append("\n");
    sb.append("    alertCMethod2PrimaryPointLocation: ").append(toIndentedString(alertCMethod2PrimaryPointLocation)).append("\n");
    sb.append("    alertCMethod2SecondaryPointLocation: ").append(toIndentedString(alertCMethod2SecondaryPointLocation)).append("\n");
    sb.append("    alertCLinearExtensionG: ").append(toIndentedString(alertCLinearExtensionG)).append("\n");
    sb.append("    alertCMethod2LinearExtensionG: ").append(toIndentedString(alertCMethod2LinearExtensionG)).append("\n");
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

