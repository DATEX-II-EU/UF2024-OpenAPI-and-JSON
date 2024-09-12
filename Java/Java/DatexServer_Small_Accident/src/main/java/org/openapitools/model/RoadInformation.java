package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RoadInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RoadInformation {

  private String roadDestination;

  private String roadName;

  private String roadNumber;

  @Valid
  private Map<String, Object> roadInformationExtensionG = new HashMap<>();

  public RoadInformation roadDestination(String roadDestination) {
    this.roadDestination = roadDestination;
    return this;
  }

  /**
   * Get roadDestination
   * @return roadDestination
   */
  @Size(max = 1024) 
  @Schema(name = "roadDestination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roadDestination")
  public String getRoadDestination() {
    return roadDestination;
  }

  public void setRoadDestination(String roadDestination) {
    this.roadDestination = roadDestination;
  }

  public RoadInformation roadName(String roadName) {
    this.roadName = roadName;
    return this;
  }

  /**
   * Get roadName
   * @return roadName
   */
  @Size(max = 1024) 
  @Schema(name = "roadName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roadName")
  public String getRoadName() {
    return roadName;
  }

  public void setRoadName(String roadName) {
    this.roadName = roadName;
  }

  public RoadInformation roadNumber(String roadNumber) {
    this.roadNumber = roadNumber;
    return this;
  }

  /**
   * Get roadNumber
   * @return roadNumber
   */
  @Size(max = 1024) 
  @Schema(name = "roadNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roadNumber")
  public String getRoadNumber() {
    return roadNumber;
  }

  public void setRoadNumber(String roadNumber) {
    this.roadNumber = roadNumber;
  }

  public RoadInformation roadInformationExtensionG(Map<String, Object> roadInformationExtensionG) {
    this.roadInformationExtensionG = roadInformationExtensionG;
    return this;
  }

  public RoadInformation putRoadInformationExtensionGItem(String key, Object roadInformationExtensionGItem) {
    if (this.roadInformationExtensionG == null) {
      this.roadInformationExtensionG = new HashMap<>();
    }
    this.roadInformationExtensionG.put(key, roadInformationExtensionGItem);
    return this;
  }

  /**
   * Get roadInformationExtensionG
   * @return roadInformationExtensionG
   */
  
  @Schema(name = "roadInformationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roadInformationExtensionG")
  public Map<String, Object> getRoadInformationExtensionG() {
    return roadInformationExtensionG;
  }

  public void setRoadInformationExtensionG(Map<String, Object> roadInformationExtensionG) {
    this.roadInformationExtensionG = roadInformationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadInformation roadInformation = (RoadInformation) o;
    return Objects.equals(this.roadDestination, roadInformation.roadDestination) &&
        Objects.equals(this.roadName, roadInformation.roadName) &&
        Objects.equals(this.roadNumber, roadInformation.roadNumber) &&
        Objects.equals(this.roadInformationExtensionG, roadInformation.roadInformationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roadDestination, roadName, roadNumber, roadInformationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadInformation {\n");
    sb.append("    roadDestination: ").append(toIndentedString(roadDestination)).append("\n");
    sb.append("    roadName: ").append(toIndentedString(roadName)).append("\n");
    sb.append("    roadNumber: ").append(toIndentedString(roadNumber)).append("\n");
    sb.append("    roadInformationExtensionG: ").append(toIndentedString(roadInformationExtensionG)).append("\n");
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

