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
import org.openapitools.model.Emissions;
import org.openapitools.model.FuelTypeEnumG;
import org.openapitools.model.GrossWeightCharacteristic;
import org.openapitools.model.HeaviestAxleWeightCharacteristic;
import org.openapitools.model.HeightCharacteristic;
import org.openapitools.model.LengthCharacteristic;
import org.openapitools.model.LoadTypeEnumG;
import org.openapitools.model.NumberOfAxlesCharacteristic;
import org.openapitools.model.VehicleEquipmentEnumG;
import org.openapitools.model.VehicleTypeEnumG;
import org.openapitools.model.VehicleUsageEnumG;
import org.openapitools.model.WidthCharacteristic;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VehicleCharacteristics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class VehicleCharacteristics {

  @Valid
  private List<@Valid FuelTypeEnumG> fuelType = new ArrayList<>();

  private LoadTypeEnumG loadType;

  private VehicleEquipmentEnumG vehicleEquipment;

  @Valid
  private List<@Valid VehicleTypeEnumG> vehicleType = new ArrayList<>();

  private VehicleUsageEnumG vehicleUsage;

  private Integer yearOfFirstRegistration;

  @Valid
  private List<@Valid GrossWeightCharacteristic> grossWeightCharacteristic = new ArrayList<>();

  @Valid
  private List<@Valid HeightCharacteristic> heightCharacteristic = new ArrayList<>();

  @Valid
  private List<@Valid LengthCharacteristic> lengthCharacteristic = new ArrayList<>();

  @Valid
  private List<@Valid WidthCharacteristic> widthCharacteristic = new ArrayList<>();

  @Valid
  private List<@Valid HeaviestAxleWeightCharacteristic> heaviestAxleWeightCharacteristic = new ArrayList<>();

  @Valid
  private List<@Valid NumberOfAxlesCharacteristic> numberOfAxlesCharacteristic = new ArrayList<>();

  private Emissions emissions;

  @Valid
  private Map<String, Object> vehicleCharacteristicsExtensionG = new HashMap<>();

  public VehicleCharacteristics fuelType(List<@Valid FuelTypeEnumG> fuelType) {
    this.fuelType = fuelType;
    return this;
  }

  public VehicleCharacteristics addFuelTypeItem(FuelTypeEnumG fuelTypeItem) {
    if (this.fuelType == null) {
      this.fuelType = new ArrayList<>();
    }
    this.fuelType.add(fuelTypeItem);
    return this;
  }

  /**
   * Get fuelType
   * @return fuelType
   */
  @Valid @Size(min = 0) 
  @Schema(name = "fuelType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fuelType")
  public List<@Valid FuelTypeEnumG> getFuelType() {
    return fuelType;
  }

  public void setFuelType(List<@Valid FuelTypeEnumG> fuelType) {
    this.fuelType = fuelType;
  }

  public VehicleCharacteristics loadType(LoadTypeEnumG loadType) {
    this.loadType = loadType;
    return this;
  }

  /**
   * Get loadType
   * @return loadType
   */
  @Valid 
  @Schema(name = "loadType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loadType")
  public LoadTypeEnumG getLoadType() {
    return loadType;
  }

  public void setLoadType(LoadTypeEnumG loadType) {
    this.loadType = loadType;
  }

  public VehicleCharacteristics vehicleEquipment(VehicleEquipmentEnumG vehicleEquipment) {
    this.vehicleEquipment = vehicleEquipment;
    return this;
  }

  /**
   * Get vehicleEquipment
   * @return vehicleEquipment
   */
  @Valid 
  @Schema(name = "vehicleEquipment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleEquipment")
  public VehicleEquipmentEnumG getVehicleEquipment() {
    return vehicleEquipment;
  }

  public void setVehicleEquipment(VehicleEquipmentEnumG vehicleEquipment) {
    this.vehicleEquipment = vehicleEquipment;
  }

  public VehicleCharacteristics vehicleType(List<@Valid VehicleTypeEnumG> vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

  public VehicleCharacteristics addVehicleTypeItem(VehicleTypeEnumG vehicleTypeItem) {
    if (this.vehicleType == null) {
      this.vehicleType = new ArrayList<>();
    }
    this.vehicleType.add(vehicleTypeItem);
    return this;
  }

  /**
   * Get vehicleType
   * @return vehicleType
   */
  @Valid @Size(min = 0) 
  @Schema(name = "vehicleType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleType")
  public List<@Valid VehicleTypeEnumG> getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(List<@Valid VehicleTypeEnumG> vehicleType) {
    this.vehicleType = vehicleType;
  }

  public VehicleCharacteristics vehicleUsage(VehicleUsageEnumG vehicleUsage) {
    this.vehicleUsage = vehicleUsage;
    return this;
  }

  /**
   * Get vehicleUsage
   * @return vehicleUsage
   */
  @Valid 
  @Schema(name = "vehicleUsage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleUsage")
  public VehicleUsageEnumG getVehicleUsage() {
    return vehicleUsage;
  }

  public void setVehicleUsage(VehicleUsageEnumG vehicleUsage) {
    this.vehicleUsage = vehicleUsage;
  }

  public VehicleCharacteristics yearOfFirstRegistration(Integer yearOfFirstRegistration) {
    this.yearOfFirstRegistration = yearOfFirstRegistration;
    return this;
  }

  /**
   * Get yearOfFirstRegistration
   * minimum: 0
   * @return yearOfFirstRegistration
   */
  @Min(0) 
  @Schema(name = "yearOfFirstRegistration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearOfFirstRegistration")
  public Integer getYearOfFirstRegistration() {
    return yearOfFirstRegistration;
  }

  public void setYearOfFirstRegistration(Integer yearOfFirstRegistration) {
    this.yearOfFirstRegistration = yearOfFirstRegistration;
  }

  public VehicleCharacteristics grossWeightCharacteristic(List<@Valid GrossWeightCharacteristic> grossWeightCharacteristic) {
    this.grossWeightCharacteristic = grossWeightCharacteristic;
    return this;
  }

  public VehicleCharacteristics addGrossWeightCharacteristicItem(GrossWeightCharacteristic grossWeightCharacteristicItem) {
    if (this.grossWeightCharacteristic == null) {
      this.grossWeightCharacteristic = new ArrayList<>();
    }
    this.grossWeightCharacteristic.add(grossWeightCharacteristicItem);
    return this;
  }

  /**
   * Get grossWeightCharacteristic
   * @return grossWeightCharacteristic
   */
  @Valid @Size(min = 0, max = 2) 
  @Schema(name = "grossWeightCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grossWeightCharacteristic")
  public List<@Valid GrossWeightCharacteristic> getGrossWeightCharacteristic() {
    return grossWeightCharacteristic;
  }

  public void setGrossWeightCharacteristic(List<@Valid GrossWeightCharacteristic> grossWeightCharacteristic) {
    this.grossWeightCharacteristic = grossWeightCharacteristic;
  }

  public VehicleCharacteristics heightCharacteristic(List<@Valid HeightCharacteristic> heightCharacteristic) {
    this.heightCharacteristic = heightCharacteristic;
    return this;
  }

  public VehicleCharacteristics addHeightCharacteristicItem(HeightCharacteristic heightCharacteristicItem) {
    if (this.heightCharacteristic == null) {
      this.heightCharacteristic = new ArrayList<>();
    }
    this.heightCharacteristic.add(heightCharacteristicItem);
    return this;
  }

  /**
   * Get heightCharacteristic
   * @return heightCharacteristic
   */
  @Valid @Size(min = 0, max = 2) 
  @Schema(name = "heightCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heightCharacteristic")
  public List<@Valid HeightCharacteristic> getHeightCharacteristic() {
    return heightCharacteristic;
  }

  public void setHeightCharacteristic(List<@Valid HeightCharacteristic> heightCharacteristic) {
    this.heightCharacteristic = heightCharacteristic;
  }

  public VehicleCharacteristics lengthCharacteristic(List<@Valid LengthCharacteristic> lengthCharacteristic) {
    this.lengthCharacteristic = lengthCharacteristic;
    return this;
  }

  public VehicleCharacteristics addLengthCharacteristicItem(LengthCharacteristic lengthCharacteristicItem) {
    if (this.lengthCharacteristic == null) {
      this.lengthCharacteristic = new ArrayList<>();
    }
    this.lengthCharacteristic.add(lengthCharacteristicItem);
    return this;
  }

  /**
   * Get lengthCharacteristic
   * @return lengthCharacteristic
   */
  @Valid @Size(min = 0, max = 2) 
  @Schema(name = "lengthCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lengthCharacteristic")
  public List<@Valid LengthCharacteristic> getLengthCharacteristic() {
    return lengthCharacteristic;
  }

  public void setLengthCharacteristic(List<@Valid LengthCharacteristic> lengthCharacteristic) {
    this.lengthCharacteristic = lengthCharacteristic;
  }

  public VehicleCharacteristics widthCharacteristic(List<@Valid WidthCharacteristic> widthCharacteristic) {
    this.widthCharacteristic = widthCharacteristic;
    return this;
  }

  public VehicleCharacteristics addWidthCharacteristicItem(WidthCharacteristic widthCharacteristicItem) {
    if (this.widthCharacteristic == null) {
      this.widthCharacteristic = new ArrayList<>();
    }
    this.widthCharacteristic.add(widthCharacteristicItem);
    return this;
  }

  /**
   * Get widthCharacteristic
   * @return widthCharacteristic
   */
  @Valid @Size(min = 0, max = 2) 
  @Schema(name = "widthCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("widthCharacteristic")
  public List<@Valid WidthCharacteristic> getWidthCharacteristic() {
    return widthCharacteristic;
  }

  public void setWidthCharacteristic(List<@Valid WidthCharacteristic> widthCharacteristic) {
    this.widthCharacteristic = widthCharacteristic;
  }

  public VehicleCharacteristics heaviestAxleWeightCharacteristic(List<@Valid HeaviestAxleWeightCharacteristic> heaviestAxleWeightCharacteristic) {
    this.heaviestAxleWeightCharacteristic = heaviestAxleWeightCharacteristic;
    return this;
  }

  public VehicleCharacteristics addHeaviestAxleWeightCharacteristicItem(HeaviestAxleWeightCharacteristic heaviestAxleWeightCharacteristicItem) {
    if (this.heaviestAxleWeightCharacteristic == null) {
      this.heaviestAxleWeightCharacteristic = new ArrayList<>();
    }
    this.heaviestAxleWeightCharacteristic.add(heaviestAxleWeightCharacteristicItem);
    return this;
  }

  /**
   * Get heaviestAxleWeightCharacteristic
   * @return heaviestAxleWeightCharacteristic
   */
  @Valid @Size(min = 0, max = 2) 
  @Schema(name = "heaviestAxleWeightCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heaviestAxleWeightCharacteristic")
  public List<@Valid HeaviestAxleWeightCharacteristic> getHeaviestAxleWeightCharacteristic() {
    return heaviestAxleWeightCharacteristic;
  }

  public void setHeaviestAxleWeightCharacteristic(List<@Valid HeaviestAxleWeightCharacteristic> heaviestAxleWeightCharacteristic) {
    this.heaviestAxleWeightCharacteristic = heaviestAxleWeightCharacteristic;
  }

  public VehicleCharacteristics numberOfAxlesCharacteristic(List<@Valid NumberOfAxlesCharacteristic> numberOfAxlesCharacteristic) {
    this.numberOfAxlesCharacteristic = numberOfAxlesCharacteristic;
    return this;
  }

  public VehicleCharacteristics addNumberOfAxlesCharacteristicItem(NumberOfAxlesCharacteristic numberOfAxlesCharacteristicItem) {
    if (this.numberOfAxlesCharacteristic == null) {
      this.numberOfAxlesCharacteristic = new ArrayList<>();
    }
    this.numberOfAxlesCharacteristic.add(numberOfAxlesCharacteristicItem);
    return this;
  }

  /**
   * Get numberOfAxlesCharacteristic
   * @return numberOfAxlesCharacteristic
   */
  @Valid @Size(min = 0, max = 2) 
  @Schema(name = "numberOfAxlesCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfAxlesCharacteristic")
  public List<@Valid NumberOfAxlesCharacteristic> getNumberOfAxlesCharacteristic() {
    return numberOfAxlesCharacteristic;
  }

  public void setNumberOfAxlesCharacteristic(List<@Valid NumberOfAxlesCharacteristic> numberOfAxlesCharacteristic) {
    this.numberOfAxlesCharacteristic = numberOfAxlesCharacteristic;
  }

  public VehicleCharacteristics emissions(Emissions emissions) {
    this.emissions = emissions;
    return this;
  }

  /**
   * Get emissions
   * @return emissions
   */
  @Valid 
  @Schema(name = "emissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emissions")
  public Emissions getEmissions() {
    return emissions;
  }

  public void setEmissions(Emissions emissions) {
    this.emissions = emissions;
  }

  public VehicleCharacteristics vehicleCharacteristicsExtensionG(Map<String, Object> vehicleCharacteristicsExtensionG) {
    this.vehicleCharacteristicsExtensionG = vehicleCharacteristicsExtensionG;
    return this;
  }

  public VehicleCharacteristics putVehicleCharacteristicsExtensionGItem(String key, Object vehicleCharacteristicsExtensionGItem) {
    if (this.vehicleCharacteristicsExtensionG == null) {
      this.vehicleCharacteristicsExtensionG = new HashMap<>();
    }
    this.vehicleCharacteristicsExtensionG.put(key, vehicleCharacteristicsExtensionGItem);
    return this;
  }

  /**
   * Get vehicleCharacteristicsExtensionG
   * @return vehicleCharacteristicsExtensionG
   */
  
  @Schema(name = "vehicleCharacteristicsExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleCharacteristicsExtensionG")
  public Map<String, Object> getVehicleCharacteristicsExtensionG() {
    return vehicleCharacteristicsExtensionG;
  }

  public void setVehicleCharacteristicsExtensionG(Map<String, Object> vehicleCharacteristicsExtensionG) {
    this.vehicleCharacteristicsExtensionG = vehicleCharacteristicsExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleCharacteristics vehicleCharacteristics = (VehicleCharacteristics) o;
    return Objects.equals(this.fuelType, vehicleCharacteristics.fuelType) &&
        Objects.equals(this.loadType, vehicleCharacteristics.loadType) &&
        Objects.equals(this.vehicleEquipment, vehicleCharacteristics.vehicleEquipment) &&
        Objects.equals(this.vehicleType, vehicleCharacteristics.vehicleType) &&
        Objects.equals(this.vehicleUsage, vehicleCharacteristics.vehicleUsage) &&
        Objects.equals(this.yearOfFirstRegistration, vehicleCharacteristics.yearOfFirstRegistration) &&
        Objects.equals(this.grossWeightCharacteristic, vehicleCharacteristics.grossWeightCharacteristic) &&
        Objects.equals(this.heightCharacteristic, vehicleCharacteristics.heightCharacteristic) &&
        Objects.equals(this.lengthCharacteristic, vehicleCharacteristics.lengthCharacteristic) &&
        Objects.equals(this.widthCharacteristic, vehicleCharacteristics.widthCharacteristic) &&
        Objects.equals(this.heaviestAxleWeightCharacteristic, vehicleCharacteristics.heaviestAxleWeightCharacteristic) &&
        Objects.equals(this.numberOfAxlesCharacteristic, vehicleCharacteristics.numberOfAxlesCharacteristic) &&
        Objects.equals(this.emissions, vehicleCharacteristics.emissions) &&
        Objects.equals(this.vehicleCharacteristicsExtensionG, vehicleCharacteristics.vehicleCharacteristicsExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fuelType, loadType, vehicleEquipment, vehicleType, vehicleUsage, yearOfFirstRegistration, grossWeightCharacteristic, heightCharacteristic, lengthCharacteristic, widthCharacteristic, heaviestAxleWeightCharacteristic, numberOfAxlesCharacteristic, emissions, vehicleCharacteristicsExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleCharacteristics {\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
    sb.append("    loadType: ").append(toIndentedString(loadType)).append("\n");
    sb.append("    vehicleEquipment: ").append(toIndentedString(vehicleEquipment)).append("\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
    sb.append("    vehicleUsage: ").append(toIndentedString(vehicleUsage)).append("\n");
    sb.append("    yearOfFirstRegistration: ").append(toIndentedString(yearOfFirstRegistration)).append("\n");
    sb.append("    grossWeightCharacteristic: ").append(toIndentedString(grossWeightCharacteristic)).append("\n");
    sb.append("    heightCharacteristic: ").append(toIndentedString(heightCharacteristic)).append("\n");
    sb.append("    lengthCharacteristic: ").append(toIndentedString(lengthCharacteristic)).append("\n");
    sb.append("    widthCharacteristic: ").append(toIndentedString(widthCharacteristic)).append("\n");
    sb.append("    heaviestAxleWeightCharacteristic: ").append(toIndentedString(heaviestAxleWeightCharacteristic)).append("\n");
    sb.append("    numberOfAxlesCharacteristic: ").append(toIndentedString(numberOfAxlesCharacteristic)).append("\n");
    sb.append("    emissions: ").append(toIndentedString(emissions)).append("\n");
    sb.append("    vehicleCharacteristicsExtensionG: ").append(toIndentedString(vehicleCharacteristicsExtensionG)).append("\n");
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

