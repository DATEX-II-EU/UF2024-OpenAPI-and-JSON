package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.GmlLineStringG;
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
 * LinearLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class LinearLocation {

  private PointCoordinates coordinatesForDisplay;

  private SupplementaryPositionalDescription supplementaryPositionalDescription;

  private GmlLineStringG gmlLineString;

  @Valid
  private Map<String, Object> locationReferenceExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> locationExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> networkLocationExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> linearLocationExtensionG = new HashMap<>();

  public LinearLocation coordinatesForDisplay(PointCoordinates coordinatesForDisplay) {
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

  public LinearLocation supplementaryPositionalDescription(SupplementaryPositionalDescription supplementaryPositionalDescription) {
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

  public LinearLocation gmlLineString(GmlLineStringG gmlLineString) {
    this.gmlLineString = gmlLineString;
    return this;
  }

  /**
   * Get gmlLineString
   * @return gmlLineString
   */
  @Valid 
  @Schema(name = "gmlLineString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gmlLineString")
  public GmlLineStringG getGmlLineString() {
    return gmlLineString;
  }

  public void setGmlLineString(GmlLineStringG gmlLineString) {
    this.gmlLineString = gmlLineString;
  }

  public LinearLocation locationReferenceExtensionG(Map<String, Object> locationReferenceExtensionG) {
    this.locationReferenceExtensionG = locationReferenceExtensionG;
    return this;
  }

  public LinearLocation putLocationReferenceExtensionGItem(String key, Object locationReferenceExtensionGItem) {
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

  public LinearLocation locationExtensionG(Map<String, Object> locationExtensionG) {
    this.locationExtensionG = locationExtensionG;
    return this;
  }

  public LinearLocation putLocationExtensionGItem(String key, Object locationExtensionGItem) {
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

  public LinearLocation networkLocationExtensionG(Map<String, Object> networkLocationExtensionG) {
    this.networkLocationExtensionG = networkLocationExtensionG;
    return this;
  }

  public LinearLocation putNetworkLocationExtensionGItem(String key, Object networkLocationExtensionGItem) {
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

  public LinearLocation linearLocationExtensionG(Map<String, Object> linearLocationExtensionG) {
    this.linearLocationExtensionG = linearLocationExtensionG;
    return this;
  }

  public LinearLocation putLinearLocationExtensionGItem(String key, Object linearLocationExtensionGItem) {
    if (this.linearLocationExtensionG == null) {
      this.linearLocationExtensionG = new HashMap<>();
    }
    this.linearLocationExtensionG.put(key, linearLocationExtensionGItem);
    return this;
  }

  /**
   * Get linearLocationExtensionG
   * @return linearLocationExtensionG
   */
  
  @Schema(name = "linearLocationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linearLocationExtensionG")
  public Map<String, Object> getLinearLocationExtensionG() {
    return linearLocationExtensionG;
  }

  public void setLinearLocationExtensionG(Map<String, Object> linearLocationExtensionG) {
    this.linearLocationExtensionG = linearLocationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinearLocation linearLocation = (LinearLocation) o;
    return Objects.equals(this.coordinatesForDisplay, linearLocation.coordinatesForDisplay) &&
        Objects.equals(this.supplementaryPositionalDescription, linearLocation.supplementaryPositionalDescription) &&
        Objects.equals(this.gmlLineString, linearLocation.gmlLineString) &&
        Objects.equals(this.locationReferenceExtensionG, linearLocation.locationReferenceExtensionG) &&
        Objects.equals(this.locationExtensionG, linearLocation.locationExtensionG) &&
        Objects.equals(this.networkLocationExtensionG, linearLocation.networkLocationExtensionG) &&
        Objects.equals(this.linearLocationExtensionG, linearLocation.linearLocationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinatesForDisplay, supplementaryPositionalDescription, gmlLineString, locationReferenceExtensionG, locationExtensionG, networkLocationExtensionG, linearLocationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearLocation {\n");
    sb.append("    coordinatesForDisplay: ").append(toIndentedString(coordinatesForDisplay)).append("\n");
    sb.append("    supplementaryPositionalDescription: ").append(toIndentedString(supplementaryPositionalDescription)).append("\n");
    sb.append("    gmlLineString: ").append(toIndentedString(gmlLineString)).append("\n");
    sb.append("    locationReferenceExtensionG: ").append(toIndentedString(locationReferenceExtensionG)).append("\n");
    sb.append("    locationExtensionG: ").append(toIndentedString(locationExtensionG)).append("\n");
    sb.append("    networkLocationExtensionG: ").append(toIndentedString(networkLocationExtensionG)).append("\n");
    sb.append("    linearLocationExtensionG: ").append(toIndentedString(linearLocationExtensionG)).append("\n");
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

