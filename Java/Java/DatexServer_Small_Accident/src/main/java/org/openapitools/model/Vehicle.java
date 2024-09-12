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
import org.openapitools.model.AxleSpacing;
import org.openapitools.model.AxleWeight;
import org.openapitools.model.HazardousMaterials;
import org.openapitools.model.MultilingualString;
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
 * Vehicle
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Vehicle {

  private String anonymizedVehicleReference;

  private MultilingualString vehicleColour;

  private String vehicleCountryOfOrigin;

  private String vehicleIdentifier;

  private String vehicleManufacturer;

  private String vehicleModel;

  private String vehicleRegistrationPlateIdentifier;

  private VehicleStatusEnumG vehicleStatus;

  private VehicleCharacteristics vehicleCharacteristics;

  @Valid
  private List<@Valid AxleSpacing> axleSpacingOnVehicle = new ArrayList<>();

  @Valid
  private List<@Valid AxleWeight> specificAxleWeight = new ArrayList<>();

  private HazardousMaterials hazardousGoodsAssociatedWithVehicle;

  @Valid
  private Map<String, Object> vehicleExtensionG = new HashMap<>();

  public Vehicle anonymizedVehicleReference(String anonymizedVehicleReference) {
    this.anonymizedVehicleReference = anonymizedVehicleReference;
    return this;
  }

  /**
   * Get anonymizedVehicleReference
   * @return anonymizedVehicleReference
   */
  @Size(max = 1024) 
  @Schema(name = "anonymizedVehicleReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anonymizedVehicleReference")
  public String getAnonymizedVehicleReference() {
    return anonymizedVehicleReference;
  }

  public void setAnonymizedVehicleReference(String anonymizedVehicleReference) {
    this.anonymizedVehicleReference = anonymizedVehicleReference;
  }

  public Vehicle vehicleColour(MultilingualString vehicleColour) {
    this.vehicleColour = vehicleColour;
    return this;
  }

  /**
   * Get vehicleColour
   * @return vehicleColour
   */
  @Valid 
  @Schema(name = "vehicleColour", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleColour")
  public MultilingualString getVehicleColour() {
    return vehicleColour;
  }

  public void setVehicleColour(MultilingualString vehicleColour) {
    this.vehicleColour = vehicleColour;
  }

  public Vehicle vehicleCountryOfOrigin(String vehicleCountryOfOrigin) {
    this.vehicleCountryOfOrigin = vehicleCountryOfOrigin;
    return this;
  }

  /**
   * Get vehicleCountryOfOrigin
   * @return vehicleCountryOfOrigin
   */
  @Size(max = 1024) 
  @Schema(name = "vehicleCountryOfOrigin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleCountryOfOrigin")
  public String getVehicleCountryOfOrigin() {
    return vehicleCountryOfOrigin;
  }

  public void setVehicleCountryOfOrigin(String vehicleCountryOfOrigin) {
    this.vehicleCountryOfOrigin = vehicleCountryOfOrigin;
  }

  public Vehicle vehicleIdentifier(String vehicleIdentifier) {
    this.vehicleIdentifier = vehicleIdentifier;
    return this;
  }

  /**
   * Get vehicleIdentifier
   * @return vehicleIdentifier
   */
  @Size(max = 1024) 
  @Schema(name = "vehicleIdentifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleIdentifier")
  public String getVehicleIdentifier() {
    return vehicleIdentifier;
  }

  public void setVehicleIdentifier(String vehicleIdentifier) {
    this.vehicleIdentifier = vehicleIdentifier;
  }

  public Vehicle vehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
    return this;
  }

  /**
   * Get vehicleManufacturer
   * @return vehicleManufacturer
   */
  @Size(max = 1024) 
  @Schema(name = "vehicleManufacturer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleManufacturer")
  public String getVehicleManufacturer() {
    return vehicleManufacturer;
  }

  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  public Vehicle vehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
    return this;
  }

  /**
   * Get vehicleModel
   * @return vehicleModel
   */
  @Size(max = 1024) 
  @Schema(name = "vehicleModel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleModel")
  public String getVehicleModel() {
    return vehicleModel;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public Vehicle vehicleRegistrationPlateIdentifier(String vehicleRegistrationPlateIdentifier) {
    this.vehicleRegistrationPlateIdentifier = vehicleRegistrationPlateIdentifier;
    return this;
  }

  /**
   * Get vehicleRegistrationPlateIdentifier
   * @return vehicleRegistrationPlateIdentifier
   */
  @Size(max = 1024) 
  @Schema(name = "vehicleRegistrationPlateIdentifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleRegistrationPlateIdentifier")
  public String getVehicleRegistrationPlateIdentifier() {
    return vehicleRegistrationPlateIdentifier;
  }

  public void setVehicleRegistrationPlateIdentifier(String vehicleRegistrationPlateIdentifier) {
    this.vehicleRegistrationPlateIdentifier = vehicleRegistrationPlateIdentifier;
  }

  public Vehicle vehicleStatus(VehicleStatusEnumG vehicleStatus) {
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

  public Vehicle vehicleCharacteristics(VehicleCharacteristics vehicleCharacteristics) {
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

  public Vehicle axleSpacingOnVehicle(List<@Valid AxleSpacing> axleSpacingOnVehicle) {
    this.axleSpacingOnVehicle = axleSpacingOnVehicle;
    return this;
  }

  public Vehicle addAxleSpacingOnVehicleItem(AxleSpacing axleSpacingOnVehicleItem) {
    if (this.axleSpacingOnVehicle == null) {
      this.axleSpacingOnVehicle = new ArrayList<>();
    }
    this.axleSpacingOnVehicle.add(axleSpacingOnVehicleItem);
    return this;
  }

  /**
   * Get axleSpacingOnVehicle
   * @return axleSpacingOnVehicle
   */
  @Valid @Size(min = 0) 
  @Schema(name = "axleSpacingOnVehicle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("axleSpacingOnVehicle")
  public List<@Valid AxleSpacing> getAxleSpacingOnVehicle() {
    return axleSpacingOnVehicle;
  }

  public void setAxleSpacingOnVehicle(List<@Valid AxleSpacing> axleSpacingOnVehicle) {
    this.axleSpacingOnVehicle = axleSpacingOnVehicle;
  }

  public Vehicle specificAxleWeight(List<@Valid AxleWeight> specificAxleWeight) {
    this.specificAxleWeight = specificAxleWeight;
    return this;
  }

  public Vehicle addSpecificAxleWeightItem(AxleWeight specificAxleWeightItem) {
    if (this.specificAxleWeight == null) {
      this.specificAxleWeight = new ArrayList<>();
    }
    this.specificAxleWeight.add(specificAxleWeightItem);
    return this;
  }

  /**
   * Get specificAxleWeight
   * @return specificAxleWeight
   */
  @Valid @Size(min = 0) 
  @Schema(name = "specificAxleWeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specificAxleWeight")
  public List<@Valid AxleWeight> getSpecificAxleWeight() {
    return specificAxleWeight;
  }

  public void setSpecificAxleWeight(List<@Valid AxleWeight> specificAxleWeight) {
    this.specificAxleWeight = specificAxleWeight;
  }

  public Vehicle hazardousGoodsAssociatedWithVehicle(HazardousMaterials hazardousGoodsAssociatedWithVehicle) {
    this.hazardousGoodsAssociatedWithVehicle = hazardousGoodsAssociatedWithVehicle;
    return this;
  }

  /**
   * Get hazardousGoodsAssociatedWithVehicle
   * @return hazardousGoodsAssociatedWithVehicle
   */
  @Valid 
  @Schema(name = "hazardousGoodsAssociatedWithVehicle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hazardousGoodsAssociatedWithVehicle")
  public HazardousMaterials getHazardousGoodsAssociatedWithVehicle() {
    return hazardousGoodsAssociatedWithVehicle;
  }

  public void setHazardousGoodsAssociatedWithVehicle(HazardousMaterials hazardousGoodsAssociatedWithVehicle) {
    this.hazardousGoodsAssociatedWithVehicle = hazardousGoodsAssociatedWithVehicle;
  }

  public Vehicle vehicleExtensionG(Map<String, Object> vehicleExtensionG) {
    this.vehicleExtensionG = vehicleExtensionG;
    return this;
  }

  public Vehicle putVehicleExtensionGItem(String key, Object vehicleExtensionGItem) {
    if (this.vehicleExtensionG == null) {
      this.vehicleExtensionG = new HashMap<>();
    }
    this.vehicleExtensionG.put(key, vehicleExtensionGItem);
    return this;
  }

  /**
   * Get vehicleExtensionG
   * @return vehicleExtensionG
   */
  
  @Schema(name = "vehicleExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleExtensionG")
  public Map<String, Object> getVehicleExtensionG() {
    return vehicleExtensionG;
  }

  public void setVehicleExtensionG(Map<String, Object> vehicleExtensionG) {
    this.vehicleExtensionG = vehicleExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.anonymizedVehicleReference, vehicle.anonymizedVehicleReference) &&
        Objects.equals(this.vehicleColour, vehicle.vehicleColour) &&
        Objects.equals(this.vehicleCountryOfOrigin, vehicle.vehicleCountryOfOrigin) &&
        Objects.equals(this.vehicleIdentifier, vehicle.vehicleIdentifier) &&
        Objects.equals(this.vehicleManufacturer, vehicle.vehicleManufacturer) &&
        Objects.equals(this.vehicleModel, vehicle.vehicleModel) &&
        Objects.equals(this.vehicleRegistrationPlateIdentifier, vehicle.vehicleRegistrationPlateIdentifier) &&
        Objects.equals(this.vehicleStatus, vehicle.vehicleStatus) &&
        Objects.equals(this.vehicleCharacteristics, vehicle.vehicleCharacteristics) &&
        Objects.equals(this.axleSpacingOnVehicle, vehicle.axleSpacingOnVehicle) &&
        Objects.equals(this.specificAxleWeight, vehicle.specificAxleWeight) &&
        Objects.equals(this.hazardousGoodsAssociatedWithVehicle, vehicle.hazardousGoodsAssociatedWithVehicle) &&
        Objects.equals(this.vehicleExtensionG, vehicle.vehicleExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymizedVehicleReference, vehicleColour, vehicleCountryOfOrigin, vehicleIdentifier, vehicleManufacturer, vehicleModel, vehicleRegistrationPlateIdentifier, vehicleStatus, vehicleCharacteristics, axleSpacingOnVehicle, specificAxleWeight, hazardousGoodsAssociatedWithVehicle, vehicleExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    sb.append("    anonymizedVehicleReference: ").append(toIndentedString(anonymizedVehicleReference)).append("\n");
    sb.append("    vehicleColour: ").append(toIndentedString(vehicleColour)).append("\n");
    sb.append("    vehicleCountryOfOrigin: ").append(toIndentedString(vehicleCountryOfOrigin)).append("\n");
    sb.append("    vehicleIdentifier: ").append(toIndentedString(vehicleIdentifier)).append("\n");
    sb.append("    vehicleManufacturer: ").append(toIndentedString(vehicleManufacturer)).append("\n");
    sb.append("    vehicleModel: ").append(toIndentedString(vehicleModel)).append("\n");
    sb.append("    vehicleRegistrationPlateIdentifier: ").append(toIndentedString(vehicleRegistrationPlateIdentifier)).append("\n");
    sb.append("    vehicleStatus: ").append(toIndentedString(vehicleStatus)).append("\n");
    sb.append("    vehicleCharacteristics: ").append(toIndentedString(vehicleCharacteristics)).append("\n");
    sb.append("    axleSpacingOnVehicle: ").append(toIndentedString(axleSpacingOnVehicle)).append("\n");
    sb.append("    specificAxleWeight: ").append(toIndentedString(specificAxleWeight)).append("\n");
    sb.append("    hazardousGoodsAssociatedWithVehicle: ").append(toIndentedString(hazardousGoodsAssociatedWithVehicle)).append("\n");
    sb.append("    vehicleExtensionG: ").append(toIndentedString(vehicleExtensionG)).append("\n");
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

