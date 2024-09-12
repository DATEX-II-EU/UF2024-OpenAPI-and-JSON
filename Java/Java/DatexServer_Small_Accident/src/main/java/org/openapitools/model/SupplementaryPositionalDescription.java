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
import org.openapitools.model.Carriageway;
import org.openapitools.model.MultilingualString;
import org.openapitools.model.NamedAreaG;
import org.openapitools.model.RoadInformationG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SupplementaryPositionalDescription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SupplementaryPositionalDescription {

  private MultilingualString locationDescription;

  @Valid
  private List<@Valid Carriageway> carriageway = new ArrayList<>();

  private NamedAreaG namedArea;

  @Valid
  private List<@Valid RoadInformationG> roadInformation = new ArrayList<>();

  @Valid
  private Map<String, Object> supplementaryPositionalDescriptionExtensionG = new HashMap<>();

  public SupplementaryPositionalDescription locationDescription(MultilingualString locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
   */
  @Valid 
  @Schema(name = "locationDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDescription")
  public MultilingualString getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(MultilingualString locationDescription) {
    this.locationDescription = locationDescription;
  }

  public SupplementaryPositionalDescription carriageway(List<@Valid Carriageway> carriageway) {
    this.carriageway = carriageway;
    return this;
  }

  public SupplementaryPositionalDescription addCarriagewayItem(Carriageway carriagewayItem) {
    if (this.carriageway == null) {
      this.carriageway = new ArrayList<>();
    }
    this.carriageway.add(carriagewayItem);
    return this;
  }

  /**
   * Get carriageway
   * @return carriageway
   */
  @Valid @Size(min = 0) 
  @Schema(name = "carriageway", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carriageway")
  public List<@Valid Carriageway> getCarriageway() {
    return carriageway;
  }

  public void setCarriageway(List<@Valid Carriageway> carriageway) {
    this.carriageway = carriageway;
  }

  public SupplementaryPositionalDescription namedArea(NamedAreaG namedArea) {
    this.namedArea = namedArea;
    return this;
  }

  /**
   * Get namedArea
   * @return namedArea
   */
  @Valid 
  @Schema(name = "namedArea", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namedArea")
  public NamedAreaG getNamedArea() {
    return namedArea;
  }

  public void setNamedArea(NamedAreaG namedArea) {
    this.namedArea = namedArea;
  }

  public SupplementaryPositionalDescription roadInformation(List<@Valid RoadInformationG> roadInformation) {
    this.roadInformation = roadInformation;
    return this;
  }

  public SupplementaryPositionalDescription addRoadInformationItem(RoadInformationG roadInformationItem) {
    if (this.roadInformation == null) {
      this.roadInformation = new ArrayList<>();
    }
    this.roadInformation.add(roadInformationItem);
    return this;
  }

  /**
   * Get roadInformation
   * @return roadInformation
   */
  @Valid @Size(min = 0) 
  @Schema(name = "roadInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roadInformation")
  public List<@Valid RoadInformationG> getRoadInformation() {
    return roadInformation;
  }

  public void setRoadInformation(List<@Valid RoadInformationG> roadInformation) {
    this.roadInformation = roadInformation;
  }

  public SupplementaryPositionalDescription supplementaryPositionalDescriptionExtensionG(Map<String, Object> supplementaryPositionalDescriptionExtensionG) {
    this.supplementaryPositionalDescriptionExtensionG = supplementaryPositionalDescriptionExtensionG;
    return this;
  }

  public SupplementaryPositionalDescription putSupplementaryPositionalDescriptionExtensionGItem(String key, Object supplementaryPositionalDescriptionExtensionGItem) {
    if (this.supplementaryPositionalDescriptionExtensionG == null) {
      this.supplementaryPositionalDescriptionExtensionG = new HashMap<>();
    }
    this.supplementaryPositionalDescriptionExtensionG.put(key, supplementaryPositionalDescriptionExtensionGItem);
    return this;
  }

  /**
   * Get supplementaryPositionalDescriptionExtensionG
   * @return supplementaryPositionalDescriptionExtensionG
   */
  
  @Schema(name = "supplementaryPositionalDescriptionExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supplementaryPositionalDescriptionExtensionG")
  public Map<String, Object> getSupplementaryPositionalDescriptionExtensionG() {
    return supplementaryPositionalDescriptionExtensionG;
  }

  public void setSupplementaryPositionalDescriptionExtensionG(Map<String, Object> supplementaryPositionalDescriptionExtensionG) {
    this.supplementaryPositionalDescriptionExtensionG = supplementaryPositionalDescriptionExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplementaryPositionalDescription supplementaryPositionalDescription = (SupplementaryPositionalDescription) o;
    return Objects.equals(this.locationDescription, supplementaryPositionalDescription.locationDescription) &&
        Objects.equals(this.carriageway, supplementaryPositionalDescription.carriageway) &&
        Objects.equals(this.namedArea, supplementaryPositionalDescription.namedArea) &&
        Objects.equals(this.roadInformation, supplementaryPositionalDescription.roadInformation) &&
        Objects.equals(this.supplementaryPositionalDescriptionExtensionG, supplementaryPositionalDescription.supplementaryPositionalDescriptionExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationDescription, carriageway, namedArea, roadInformation, supplementaryPositionalDescriptionExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementaryPositionalDescription {\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    carriageway: ").append(toIndentedString(carriageway)).append("\n");
    sb.append("    namedArea: ").append(toIndentedString(namedArea)).append("\n");
    sb.append("    roadInformation: ").append(toIndentedString(roadInformation)).append("\n");
    sb.append("    supplementaryPositionalDescriptionExtensionG: ").append(toIndentedString(supplementaryPositionalDescriptionExtensionG)).append("\n");
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

