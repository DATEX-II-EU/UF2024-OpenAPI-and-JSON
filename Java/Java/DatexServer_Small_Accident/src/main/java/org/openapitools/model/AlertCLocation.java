package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.MultilingualString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCLocation {

  private MultilingualString alertCLocationName;

  private Integer specificLocation;

  @Valid
  private Map<String, Object> alertCLocationExtensionG = new HashMap<>();

  public AlertCLocation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCLocation(Integer specificLocation) {
    this.specificLocation = specificLocation;
  }

  public AlertCLocation alertCLocationName(MultilingualString alertCLocationName) {
    this.alertCLocationName = alertCLocationName;
    return this;
  }

  /**
   * Get alertCLocationName
   * @return alertCLocationName
   */
  @Valid 
  @Schema(name = "alertCLocationName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCLocationName")
  public MultilingualString getAlertCLocationName() {
    return alertCLocationName;
  }

  public void setAlertCLocationName(MultilingualString alertCLocationName) {
    this.alertCLocationName = alertCLocationName;
  }

  public AlertCLocation specificLocation(Integer specificLocation) {
    this.specificLocation = specificLocation;
    return this;
  }

  /**
   * Get specificLocation
   * minimum: 0
   * @return specificLocation
   */
  @NotNull @Min(0) 
  @Schema(name = "specificLocation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("specificLocation")
  public Integer getSpecificLocation() {
    return specificLocation;
  }

  public void setSpecificLocation(Integer specificLocation) {
    this.specificLocation = specificLocation;
  }

  public AlertCLocation alertCLocationExtensionG(Map<String, Object> alertCLocationExtensionG) {
    this.alertCLocationExtensionG = alertCLocationExtensionG;
    return this;
  }

  public AlertCLocation putAlertCLocationExtensionGItem(String key, Object alertCLocationExtensionGItem) {
    if (this.alertCLocationExtensionG == null) {
      this.alertCLocationExtensionG = new HashMap<>();
    }
    this.alertCLocationExtensionG.put(key, alertCLocationExtensionGItem);
    return this;
  }

  /**
   * Get alertCLocationExtensionG
   * @return alertCLocationExtensionG
   */
  
  @Schema(name = "alertCLocationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCLocationExtensionG")
  public Map<String, Object> getAlertCLocationExtensionG() {
    return alertCLocationExtensionG;
  }

  public void setAlertCLocationExtensionG(Map<String, Object> alertCLocationExtensionG) {
    this.alertCLocationExtensionG = alertCLocationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCLocation alertCLocation = (AlertCLocation) o;
    return Objects.equals(this.alertCLocationName, alertCLocation.alertCLocationName) &&
        Objects.equals(this.specificLocation, alertCLocation.specificLocation) &&
        Objects.equals(this.alertCLocationExtensionG, alertCLocation.alertCLocationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCLocationName, specificLocation, alertCLocationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCLocation {\n");
    sb.append("    alertCLocationName: ").append(toIndentedString(alertCLocationName)).append("\n");
    sb.append("    specificLocation: ").append(toIndentedString(specificLocation)).append("\n");
    sb.append("    alertCLocationExtensionG: ").append(toIndentedString(alertCLocationExtensionG)).append("\n");
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

