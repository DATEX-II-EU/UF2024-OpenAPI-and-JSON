package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AlertCPointG;
import org.openapitools.model.PointByCoordinates;
import org.openapitools.model.PointCoordinates;
import org.openapitools.model.SupplementaryPositionalDescription;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PointLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PointLocation {

  private PointCoordinates coordinatesForDisplay;

  private SupplementaryPositionalDescription supplementaryPositionalDescription;

  private PointByCoordinates pointByCoordinates;

  @Valid
  private List<@Valid AlertCPointG> alertCPoint = new ArrayList<>();

  @Valid
  private Map<String, Object> locationReferenceExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> locationExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> networkLocationExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> pointLocationExtensionG = new HashMap<>();

  public PointLocation coordinatesForDisplay(PointCoordinates coordinatesForDisplay) {
    this.coordinatesForDisplay = coordinatesForDisplay;
    return this;
  }

  /**
   * Get coordinatesForDisplay
   * @return coordinatesForDisplay
   */
  @Valid 
  @Schema(name = "coordinatesForDisplay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coordinatesForDisplay")
  public PointCoordinates getCoordinatesForDisplay() {
    return coordinatesForDisplay;
  }

  public void setCoordinatesForDisplay(PointCoordinates coordinatesForDisplay) {
    this.coordinatesForDisplay = coordinatesForDisplay;
  }

  public PointLocation supplementaryPositionalDescription(SupplementaryPositionalDescription supplementaryPositionalDescription) {
    this.supplementaryPositionalDescription = supplementaryPositionalDescription;
    return this;
  }

  /**
   * Get supplementaryPositionalDescription
   * @return supplementaryPositionalDescription
   */
  @Valid 
  @Schema(name = "supplementaryPositionalDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supplementaryPositionalDescription")
  public SupplementaryPositionalDescription getSupplementaryPositionalDescription() {
    return supplementaryPositionalDescription;
  }

  public void setSupplementaryPositionalDescription(SupplementaryPositionalDescription supplementaryPositionalDescription) {
    this.supplementaryPositionalDescription = supplementaryPositionalDescription;
  }

  public PointLocation pointByCoordinates(PointByCoordinates pointByCoordinates) {
    this.pointByCoordinates = pointByCoordinates;
    return this;
  }

  /**
   * Get pointByCoordinates
   * @return pointByCoordinates
   */
  @Valid 
  @Schema(name = "pointByCoordinates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointByCoordinates")
  public PointByCoordinates getPointByCoordinates() {
    return pointByCoordinates;
  }

  public void setPointByCoordinates(PointByCoordinates pointByCoordinates) {
    this.pointByCoordinates = pointByCoordinates;
  }

  public PointLocation alertCPoint(List<@Valid AlertCPointG> alertCPoint) {
    this.alertCPoint = alertCPoint;
    return this;
  }

  public PointLocation addAlertCPointItem(AlertCPointG alertCPointItem) {
    if (this.alertCPoint == null) {
      this.alertCPoint = new ArrayList<>();
    }
    this.alertCPoint.add(alertCPointItem);
    return this;
  }

  /**
   * Get alertCPoint
   * @return alertCPoint
   */
  @Valid @Size(min = 0) 
  @Schema(name = "alertCPoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCPoint")
  public List<@Valid AlertCPointG> getAlertCPoint() {
    return alertCPoint;
  }

  public void setAlertCPoint(List<@Valid AlertCPointG> alertCPoint) {
    this.alertCPoint = alertCPoint;
  }

  public PointLocation locationReferenceExtensionG(Map<String, Object> locationReferenceExtensionG) {
    this.locationReferenceExtensionG = locationReferenceExtensionG;
    return this;
  }

  public PointLocation putLocationReferenceExtensionGItem(String key, Object locationReferenceExtensionGItem) {
    if (this.locationReferenceExtensionG == null) {
      this.locationReferenceExtensionG = new HashMap<>();
    }
    this.locationReferenceExtensionG.put(key, locationReferenceExtensionGItem);
    return this;
  }

  /**
   * Get locationReferenceExtensionG
   * @return locationReferenceExtensionG
   */
  
  @Schema(name = "locationReferenceExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationReferenceExtensionG")
  public Map<String, Object> getLocationReferenceExtensionG() {
    return locationReferenceExtensionG;
  }

  public void setLocationReferenceExtensionG(Map<String, Object> locationReferenceExtensionG) {
    this.locationReferenceExtensionG = locationReferenceExtensionG;
  }

  public PointLocation locationExtensionG(Map<String, Object> locationExtensionG) {
    this.locationExtensionG = locationExtensionG;
    return this;
  }

  public PointLocation putLocationExtensionGItem(String key, Object locationExtensionGItem) {
    if (this.locationExtensionG == null) {
      this.locationExtensionG = new HashMap<>();
    }
    this.locationExtensionG.put(key, locationExtensionGItem);
    return this;
  }

  /**
   * Get locationExtensionG
   * @return locationExtensionG
   */
  
  @Schema(name = "locationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationExtensionG")
  public Map<String, Object> getLocationExtensionG() {
    return locationExtensionG;
  }

  public void setLocationExtensionG(Map<String, Object> locationExtensionG) {
    this.locationExtensionG = locationExtensionG;
  }

  public PointLocation networkLocationExtensionG(Map<String, Object> networkLocationExtensionG) {
    this.networkLocationExtensionG = networkLocationExtensionG;
    return this;
  }

  public PointLocation putNetworkLocationExtensionGItem(String key, Object networkLocationExtensionGItem) {
    if (this.networkLocationExtensionG == null) {
      this.networkLocationExtensionG = new HashMap<>();
    }
    this.networkLocationExtensionG.put(key, networkLocationExtensionGItem);
    return this;
  }

  /**
   * Get networkLocationExtensionG
   * @return networkLocationExtensionG
   */
  
  @Schema(name = "networkLocationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("networkLocationExtensionG")
  public Map<String, Object> getNetworkLocationExtensionG() {
    return networkLocationExtensionG;
  }

  public void setNetworkLocationExtensionG(Map<String, Object> networkLocationExtensionG) {
    this.networkLocationExtensionG = networkLocationExtensionG;
  }

  public PointLocation pointLocationExtensionG(Map<String, Object> pointLocationExtensionG) {
    this.pointLocationExtensionG = pointLocationExtensionG;
    return this;
  }

  public PointLocation putPointLocationExtensionGItem(String key, Object pointLocationExtensionGItem) {
    if (this.pointLocationExtensionG == null) {
      this.pointLocationExtensionG = new HashMap<>();
    }
    this.pointLocationExtensionG.put(key, pointLocationExtensionGItem);
    return this;
  }

  /**
   * Get pointLocationExtensionG
   * @return pointLocationExtensionG
   */
  
  @Schema(name = "pointLocationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointLocationExtensionG")
  public Map<String, Object> getPointLocationExtensionG() {
    return pointLocationExtensionG;
  }

  public void setPointLocationExtensionG(Map<String, Object> pointLocationExtensionG) {
    this.pointLocationExtensionG = pointLocationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointLocation pointLocation = (PointLocation) o;
    return Objects.equals(this.coordinatesForDisplay, pointLocation.coordinatesForDisplay) &&
        Objects.equals(this.supplementaryPositionalDescription, pointLocation.supplementaryPositionalDescription) &&
        Objects.equals(this.pointByCoordinates, pointLocation.pointByCoordinates) &&
        Objects.equals(this.alertCPoint, pointLocation.alertCPoint) &&
        Objects.equals(this.locationReferenceExtensionG, pointLocation.locationReferenceExtensionG) &&
        Objects.equals(this.locationExtensionG, pointLocation.locationExtensionG) &&
        Objects.equals(this.networkLocationExtensionG, pointLocation.networkLocationExtensionG) &&
        Objects.equals(this.pointLocationExtensionG, pointLocation.pointLocationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinatesForDisplay, supplementaryPositionalDescription, pointByCoordinates, alertCPoint, locationReferenceExtensionG, locationExtensionG, networkLocationExtensionG, pointLocationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointLocation {\n");
    sb.append("    coordinatesForDisplay: ").append(toIndentedString(coordinatesForDisplay)).append("\n");
    sb.append("    supplementaryPositionalDescription: ").append(toIndentedString(supplementaryPositionalDescription)).append("\n");
    sb.append("    pointByCoordinates: ").append(toIndentedString(pointByCoordinates)).append("\n");
    sb.append("    alertCPoint: ").append(toIndentedString(alertCPoint)).append("\n");
    sb.append("    locationReferenceExtensionG: ").append(toIndentedString(locationReferenceExtensionG)).append("\n");
    sb.append("    locationExtensionG: ").append(toIndentedString(locationExtensionG)).append("\n");
    sb.append("    networkLocationExtensionG: ").append(toIndentedString(networkLocationExtensionG)).append("\n");
    sb.append("    pointLocationExtensionG: ").append(toIndentedString(pointLocationExtensionG)).append("\n");
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

