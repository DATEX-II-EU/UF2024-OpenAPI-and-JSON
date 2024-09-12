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
import org.openapitools.model.MultilingualString;
import org.openapitools.model.RoadTypeEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RoadInformationEnhanced
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RoadInformationEnhanced {

  private String roadDestination;

  private String roadName;

  private String roadNumber;

  private RoadTypeEnumG typeOfRoad;

  @Valid
  private List<@Valid MultilingualString> roadOrigination = new ArrayList<>();

  @Valid
  private Map<String, Object> roadInformationExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> roadInformationEnhancedExtensionG = new HashMap<>();

  public RoadInformationEnhanced roadDestination(String roadDestination) {
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

  public RoadInformationEnhanced roadName(String roadName) {
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

  public RoadInformationEnhanced roadNumber(String roadNumber) {
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

  public RoadInformationEnhanced typeOfRoad(RoadTypeEnumG typeOfRoad) {
    this.typeOfRoad = typeOfRoad;
    return this;
  }

  /**
   * Get typeOfRoad
   * @return typeOfRoad
   */
  @Valid 
  @Schema(name = "typeOfRoad", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("typeOfRoad")
  public RoadTypeEnumG getTypeOfRoad() {
    return typeOfRoad;
  }

  public void setTypeOfRoad(RoadTypeEnumG typeOfRoad) {
    this.typeOfRoad = typeOfRoad;
  }

  public RoadInformationEnhanced roadOrigination(List<@Valid MultilingualString> roadOrigination) {
    this.roadOrigination = roadOrigination;
    return this;
  }

  public RoadInformationEnhanced addRoadOriginationItem(MultilingualString roadOriginationItem) {
    if (this.roadOrigination == null) {
      this.roadOrigination = new ArrayList<>();
    }
    this.roadOrigination.add(roadOriginationItem);
    return this;
  }

  /**
   * Get roadOrigination
   * @return roadOrigination
   */
  @Valid @Size(min = 0) 
  @Schema(name = "roadOrigination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roadOrigination")
  public List<@Valid MultilingualString> getRoadOrigination() {
    return roadOrigination;
  }

  public void setRoadOrigination(List<@Valid MultilingualString> roadOrigination) {
    this.roadOrigination = roadOrigination;
  }

  public RoadInformationEnhanced roadInformationExtensionG(Map<String, Object> roadInformationExtensionG) {
    this.roadInformationExtensionG = roadInformationExtensionG;
    return this;
  }

  public RoadInformationEnhanced putRoadInformationExtensionGItem(String key, Object roadInformationExtensionGItem) {
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

  public RoadInformationEnhanced roadInformationEnhancedExtensionG(Map<String, Object> roadInformationEnhancedExtensionG) {
    this.roadInformationEnhancedExtensionG = roadInformationEnhancedExtensionG;
    return this;
  }

  public RoadInformationEnhanced putRoadInformationEnhancedExtensionGItem(String key, Object roadInformationEnhancedExtensionGItem) {
    if (this.roadInformationEnhancedExtensionG == null) {
      this.roadInformationEnhancedExtensionG = new HashMap<>();
    }
    this.roadInformationEnhancedExtensionG.put(key, roadInformationEnhancedExtensionGItem);
    return this;
  }

  /**
   * Get roadInformationEnhancedExtensionG
   * @return roadInformationEnhancedExtensionG
   */
  
  @Schema(name = "roadInformationEnhancedExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roadInformationEnhancedExtensionG")
  public Map<String, Object> getRoadInformationEnhancedExtensionG() {
    return roadInformationEnhancedExtensionG;
  }

  public void setRoadInformationEnhancedExtensionG(Map<String, Object> roadInformationEnhancedExtensionG) {
    this.roadInformationEnhancedExtensionG = roadInformationEnhancedExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadInformationEnhanced roadInformationEnhanced = (RoadInformationEnhanced) o;
    return Objects.equals(this.roadDestination, roadInformationEnhanced.roadDestination) &&
        Objects.equals(this.roadName, roadInformationEnhanced.roadName) &&
        Objects.equals(this.roadNumber, roadInformationEnhanced.roadNumber) &&
        Objects.equals(this.typeOfRoad, roadInformationEnhanced.typeOfRoad) &&
        Objects.equals(this.roadOrigination, roadInformationEnhanced.roadOrigination) &&
        Objects.equals(this.roadInformationExtensionG, roadInformationEnhanced.roadInformationExtensionG) &&
        Objects.equals(this.roadInformationEnhancedExtensionG, roadInformationEnhanced.roadInformationEnhancedExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roadDestination, roadName, roadNumber, typeOfRoad, roadOrigination, roadInformationExtensionG, roadInformationEnhancedExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadInformationEnhanced {\n");
    sb.append("    roadDestination: ").append(toIndentedString(roadDestination)).append("\n");
    sb.append("    roadName: ").append(toIndentedString(roadName)).append("\n");
    sb.append("    roadNumber: ").append(toIndentedString(roadNumber)).append("\n");
    sb.append("    typeOfRoad: ").append(toIndentedString(typeOfRoad)).append("\n");
    sb.append("    roadOrigination: ").append(toIndentedString(roadOrigination)).append("\n");
    sb.append("    roadInformationExtensionG: ").append(toIndentedString(roadInformationExtensionG)).append("\n");
    sb.append("    roadInformationEnhancedExtensionG: ").append(toIndentedString(roadInformationEnhancedExtensionG)).append("\n");
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

