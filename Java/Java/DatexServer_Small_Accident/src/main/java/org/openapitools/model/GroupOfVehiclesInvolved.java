package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.VehicleCharacteristics;
import org.openapitools.model.VehicleStatusEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GroupOfVehiclesInvolved
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GroupOfVehiclesInvolved {

  private Integer numberOfVehicles;

  private VehicleStatusEnumG vehicleStatus;

  private VehicleCharacteristics vehicleCharacteristics;

  @Valid
  private Map<String, Object> groupOfVehiclesInvolvedExtensionG = new HashMap<>();

  public GroupOfVehiclesInvolved numberOfVehicles(Integer numberOfVehicles) {
    this.numberOfVehicles = numberOfVehicles;
    return this;
  }

  /**
   * Get numberOfVehicles
   * minimum: 0
   * @return numberOfVehicles
   */
  @Min(0) 
  @Schema(name = "numberOfVehicles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfVehicles")
  public Integer getNumberOfVehicles() {
    return numberOfVehicles;
  }

  public void setNumberOfVehicles(Integer numberOfVehicles) {
    this.numberOfVehicles = numberOfVehicles;
  }

  public GroupOfVehiclesInvolved vehicleStatus(VehicleStatusEnumG vehicleStatus) {
    this.vehicleStatus = vehicleStatus;
    return this;
  }

  /**
   * Get vehicleStatus
   * @return vehicleStatus
   */
  @Valid 
  @Schema(name = "vehicleStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleStatus")
  public VehicleStatusEnumG getVehicleStatus() {
    return vehicleStatus;
  }

  public void setVehicleStatus(VehicleStatusEnumG vehicleStatus) {
    this.vehicleStatus = vehicleStatus;
  }

  public GroupOfVehiclesInvolved vehicleCharacteristics(VehicleCharacteristics vehicleCharacteristics) {
    this.vehicleCharacteristics = vehicleCharacteristics;
    return this;
  }

  /**
   * Get vehicleCharacteristics
   * @return vehicleCharacteristics
   */
  @Valid 
  @Schema(name = "vehicleCharacteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleCharacteristics")
  public VehicleCharacteristics getVehicleCharacteristics() {
    return vehicleCharacteristics;
  }

  public void setVehicleCharacteristics(VehicleCharacteristics vehicleCharacteristics) {
    this.vehicleCharacteristics = vehicleCharacteristics;
  }

  public GroupOfVehiclesInvolved groupOfVehiclesInvolvedExtensionG(Map<String, Object> groupOfVehiclesInvolvedExtensionG) {
    this.groupOfVehiclesInvolvedExtensionG = groupOfVehiclesInvolvedExtensionG;
    return this;
  }

  public GroupOfVehiclesInvolved putGroupOfVehiclesInvolvedExtensionGItem(String key, Object groupOfVehiclesInvolvedExtensionGItem) {
    if (this.groupOfVehiclesInvolvedExtensionG == null) {
      this.groupOfVehiclesInvolvedExtensionG = new HashMap<>();
    }
    this.groupOfVehiclesInvolvedExtensionG.put(key, groupOfVehiclesInvolvedExtensionGItem);
    return this;
  }

  /**
   * Get groupOfVehiclesInvolvedExtensionG
   * @return groupOfVehiclesInvolvedExtensionG
   */
  
  @Schema(name = "groupOfVehiclesInvolvedExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupOfVehiclesInvolvedExtensionG")
  public Map<String, Object> getGroupOfVehiclesInvolvedExtensionG() {
    return groupOfVehiclesInvolvedExtensionG;
  }

  public void setGroupOfVehiclesInvolvedExtensionG(Map<String, Object> groupOfVehiclesInvolvedExtensionG) {
    this.groupOfVehiclesInvolvedExtensionG = groupOfVehiclesInvolvedExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupOfVehiclesInvolved groupOfVehiclesInvolved = (GroupOfVehiclesInvolved) o;
    return Objects.equals(this.numberOfVehicles, groupOfVehiclesInvolved.numberOfVehicles) &&
        Objects.equals(this.vehicleStatus, groupOfVehiclesInvolved.vehicleStatus) &&
        Objects.equals(this.vehicleCharacteristics, groupOfVehiclesInvolved.vehicleCharacteristics) &&
        Objects.equals(this.groupOfVehiclesInvolvedExtensionG, groupOfVehiclesInvolved.groupOfVehiclesInvolvedExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfVehicles, vehicleStatus, vehicleCharacteristics, groupOfVehiclesInvolvedExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupOfVehiclesInvolved {\n");
    sb.append("    numberOfVehicles: ").append(toIndentedString(numberOfVehicles)).append("\n");
    sb.append("    vehicleStatus: ").append(toIndentedString(vehicleStatus)).append("\n");
    sb.append("    vehicleCharacteristics: ").append(toIndentedString(vehicleCharacteristics)).append("\n");
    sb.append("    groupOfVehiclesInvolvedExtensionG: ").append(toIndentedString(groupOfVehiclesInvolvedExtensionG)).append("\n");
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

