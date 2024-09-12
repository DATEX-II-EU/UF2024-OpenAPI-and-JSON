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
import org.openapitools.model.CarriagewayEnumG;
import org.openapitools.model.Lane;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Carriageway
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Carriageway {

  private CarriagewayEnumG carriageway;

  private Integer originalNumberOfLanes;

  @Valid
  private List<@Valid Lane> lane = new ArrayList<>();

  @Valid
  private Map<String, Object> carriagewayExtensionG = new HashMap<>();

  public Carriageway() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Carriageway(CarriagewayEnumG carriageway) {
    this.carriageway = carriageway;
  }

  public Carriageway carriageway(CarriagewayEnumG carriageway) {
    this.carriageway = carriageway;
    return this;
  }

  /**
   * Get carriageway
   * @return carriageway
   */
  @NotNull @Valid 
  @Schema(name = "carriageway", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("carriageway")
  public CarriagewayEnumG getCarriageway() {
    return carriageway;
  }

  public void setCarriageway(CarriagewayEnumG carriageway) {
    this.carriageway = carriageway;
  }

  public Carriageway originalNumberOfLanes(Integer originalNumberOfLanes) {
    this.originalNumberOfLanes = originalNumberOfLanes;
    return this;
  }

  /**
   * Get originalNumberOfLanes
   * @return originalNumberOfLanes
   */
  
  @Schema(name = "originalNumberOfLanes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originalNumberOfLanes")
  public Integer getOriginalNumberOfLanes() {
    return originalNumberOfLanes;
  }

  public void setOriginalNumberOfLanes(Integer originalNumberOfLanes) {
    this.originalNumberOfLanes = originalNumberOfLanes;
  }

  public Carriageway lane(List<@Valid Lane> lane) {
    this.lane = lane;
    return this;
  }

  public Carriageway addLaneItem(Lane laneItem) {
    if (this.lane == null) {
      this.lane = new ArrayList<>();
    }
    this.lane.add(laneItem);
    return this;
  }

  /**
   * Get lane
   * @return lane
   */
  @Valid @Size(min = 0) 
  @Schema(name = "lane", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lane")
  public List<@Valid Lane> getLane() {
    return lane;
  }

  public void setLane(List<@Valid Lane> lane) {
    this.lane = lane;
  }

  public Carriageway carriagewayExtensionG(Map<String, Object> carriagewayExtensionG) {
    this.carriagewayExtensionG = carriagewayExtensionG;
    return this;
  }

  public Carriageway putCarriagewayExtensionGItem(String key, Object carriagewayExtensionGItem) {
    if (this.carriagewayExtensionG == null) {
      this.carriagewayExtensionG = new HashMap<>();
    }
    this.carriagewayExtensionG.put(key, carriagewayExtensionGItem);
    return this;
  }

  /**
   * Get carriagewayExtensionG
   * @return carriagewayExtensionG
   */
  
  @Schema(name = "carriagewayExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carriagewayExtensionG")
  public Map<String, Object> getCarriagewayExtensionG() {
    return carriagewayExtensionG;
  }

  public void setCarriagewayExtensionG(Map<String, Object> carriagewayExtensionG) {
    this.carriagewayExtensionG = carriagewayExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carriageway carriageway = (Carriageway) o;
    return Objects.equals(this.carriageway, carriageway.carriageway) &&
        Objects.equals(this.originalNumberOfLanes, carriageway.originalNumberOfLanes) &&
        Objects.equals(this.lane, carriageway.lane) &&
        Objects.equals(this.carriagewayExtensionG, carriageway.carriagewayExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carriageway, originalNumberOfLanes, lane, carriagewayExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carriageway {\n");
    sb.append("    carriageway: ").append(toIndentedString(carriageway)).append("\n");
    sb.append("    originalNumberOfLanes: ").append(toIndentedString(originalNumberOfLanes)).append("\n");
    sb.append("    lane: ").append(toIndentedString(lane)).append("\n");
    sb.append("    carriagewayExtensionG: ").append(toIndentedString(carriagewayExtensionG)).append("\n");
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

