package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DangerousGoodsRegulationsEnumG;
import org.openapitools.model.MultilingualString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * HazardousMaterials
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class HazardousMaterials {

  private MultilingualString chemicalName;

  private BigDecimal dangerousGoodsFlashPoint;

  private DangerousGoodsRegulationsEnumG dangerousGoodsRegulations;

  private String hazardCodeIdentification;

  private Integer hazardCodeVersionNumber;

  private String hazardSubstanceItemPageNumber;

  private String tremCardNumber;

  private String undgNumber;

  private BigDecimal volumeOfDangerousGoods;

  private BigDecimal weightOfDangerousGoods;

  @Valid
  private Map<String, Object> hazardousMaterialsExtensionG = new HashMap<>();

  public HazardousMaterials() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HazardousMaterials(MultilingualString chemicalName) {
    this.chemicalName = chemicalName;
  }

  public HazardousMaterials chemicalName(MultilingualString chemicalName) {
    this.chemicalName = chemicalName;
    return this;
  }

  /**
   * Get chemicalName
   * @return chemicalName
   */
  @NotNull @Valid 
  @Schema(name = "chemicalName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chemicalName")
  public MultilingualString getChemicalName() {
    return chemicalName;
  }

  public void setChemicalName(MultilingualString chemicalName) {
    this.chemicalName = chemicalName;
  }

  public HazardousMaterials dangerousGoodsFlashPoint(BigDecimal dangerousGoodsFlashPoint) {
    this.dangerousGoodsFlashPoint = dangerousGoodsFlashPoint;
    return this;
  }

  /**
   * Get dangerousGoodsFlashPoint
   * @return dangerousGoodsFlashPoint
   */
  @Valid 
  @Schema(name = "dangerousGoodsFlashPoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dangerousGoodsFlashPoint")
  public BigDecimal getDangerousGoodsFlashPoint() {
    return dangerousGoodsFlashPoint;
  }

  public void setDangerousGoodsFlashPoint(BigDecimal dangerousGoodsFlashPoint) {
    this.dangerousGoodsFlashPoint = dangerousGoodsFlashPoint;
  }

  public HazardousMaterials dangerousGoodsRegulations(DangerousGoodsRegulationsEnumG dangerousGoodsRegulations) {
    this.dangerousGoodsRegulations = dangerousGoodsRegulations;
    return this;
  }

  /**
   * Get dangerousGoodsRegulations
   * @return dangerousGoodsRegulations
   */
  @Valid 
  @Schema(name = "dangerousGoodsRegulations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dangerousGoodsRegulations")
  public DangerousGoodsRegulationsEnumG getDangerousGoodsRegulations() {
    return dangerousGoodsRegulations;
  }

  public void setDangerousGoodsRegulations(DangerousGoodsRegulationsEnumG dangerousGoodsRegulations) {
    this.dangerousGoodsRegulations = dangerousGoodsRegulations;
  }

  public HazardousMaterials hazardCodeIdentification(String hazardCodeIdentification) {
    this.hazardCodeIdentification = hazardCodeIdentification;
    return this;
  }

  /**
   * Get hazardCodeIdentification
   * @return hazardCodeIdentification
   */
  @Size(max = 1024) 
  @Schema(name = "hazardCodeIdentification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hazardCodeIdentification")
  public String getHazardCodeIdentification() {
    return hazardCodeIdentification;
  }

  public void setHazardCodeIdentification(String hazardCodeIdentification) {
    this.hazardCodeIdentification = hazardCodeIdentification;
  }

  public HazardousMaterials hazardCodeVersionNumber(Integer hazardCodeVersionNumber) {
    this.hazardCodeVersionNumber = hazardCodeVersionNumber;
    return this;
  }

  /**
   * Get hazardCodeVersionNumber
   * minimum: 0
   * @return hazardCodeVersionNumber
   */
  @Min(0) 
  @Schema(name = "hazardCodeVersionNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hazardCodeVersionNumber")
  public Integer getHazardCodeVersionNumber() {
    return hazardCodeVersionNumber;
  }

  public void setHazardCodeVersionNumber(Integer hazardCodeVersionNumber) {
    this.hazardCodeVersionNumber = hazardCodeVersionNumber;
  }

  public HazardousMaterials hazardSubstanceItemPageNumber(String hazardSubstanceItemPageNumber) {
    this.hazardSubstanceItemPageNumber = hazardSubstanceItemPageNumber;
    return this;
  }

  /**
   * Get hazardSubstanceItemPageNumber
   * @return hazardSubstanceItemPageNumber
   */
  @Size(max = 1024) 
  @Schema(name = "hazardSubstanceItemPageNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hazardSubstanceItemPageNumber")
  public String getHazardSubstanceItemPageNumber() {
    return hazardSubstanceItemPageNumber;
  }

  public void setHazardSubstanceItemPageNumber(String hazardSubstanceItemPageNumber) {
    this.hazardSubstanceItemPageNumber = hazardSubstanceItemPageNumber;
  }

  public HazardousMaterials tremCardNumber(String tremCardNumber) {
    this.tremCardNumber = tremCardNumber;
    return this;
  }

  /**
   * Get tremCardNumber
   * @return tremCardNumber
   */
  @Size(max = 1024) 
  @Schema(name = "tremCardNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tremCardNumber")
  public String getTremCardNumber() {
    return tremCardNumber;
  }

  public void setTremCardNumber(String tremCardNumber) {
    this.tremCardNumber = tremCardNumber;
  }

  public HazardousMaterials undgNumber(String undgNumber) {
    this.undgNumber = undgNumber;
    return this;
  }

  /**
   * Get undgNumber
   * @return undgNumber
   */
  @Size(max = 1024) 
  @Schema(name = "undgNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("undgNumber")
  public String getUndgNumber() {
    return undgNumber;
  }

  public void setUndgNumber(String undgNumber) {
    this.undgNumber = undgNumber;
  }

  public HazardousMaterials volumeOfDangerousGoods(BigDecimal volumeOfDangerousGoods) {
    this.volumeOfDangerousGoods = volumeOfDangerousGoods;
    return this;
  }

  /**
   * Get volumeOfDangerousGoods
   * @return volumeOfDangerousGoods
   */
  @Valid 
  @Schema(name = "volumeOfDangerousGoods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("volumeOfDangerousGoods")
  public BigDecimal getVolumeOfDangerousGoods() {
    return volumeOfDangerousGoods;
  }

  public void setVolumeOfDangerousGoods(BigDecimal volumeOfDangerousGoods) {
    this.volumeOfDangerousGoods = volumeOfDangerousGoods;
  }

  public HazardousMaterials weightOfDangerousGoods(BigDecimal weightOfDangerousGoods) {
    this.weightOfDangerousGoods = weightOfDangerousGoods;
    return this;
  }

  /**
   * Get weightOfDangerousGoods
   * @return weightOfDangerousGoods
   */
  @Valid 
  @Schema(name = "weightOfDangerousGoods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weightOfDangerousGoods")
  public BigDecimal getWeightOfDangerousGoods() {
    return weightOfDangerousGoods;
  }

  public void setWeightOfDangerousGoods(BigDecimal weightOfDangerousGoods) {
    this.weightOfDangerousGoods = weightOfDangerousGoods;
  }

  public HazardousMaterials hazardousMaterialsExtensionG(Map<String, Object> hazardousMaterialsExtensionG) {
    this.hazardousMaterialsExtensionG = hazardousMaterialsExtensionG;
    return this;
  }

  public HazardousMaterials putHazardousMaterialsExtensionGItem(String key, Object hazardousMaterialsExtensionGItem) {
    if (this.hazardousMaterialsExtensionG == null) {
      this.hazardousMaterialsExtensionG = new HashMap<>();
    }
    this.hazardousMaterialsExtensionG.put(key, hazardousMaterialsExtensionGItem);
    return this;
  }

  /**
   * Get hazardousMaterialsExtensionG
   * @return hazardousMaterialsExtensionG
   */
  
  @Schema(name = "hazardousMaterialsExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hazardousMaterialsExtensionG")
  public Map<String, Object> getHazardousMaterialsExtensionG() {
    return hazardousMaterialsExtensionG;
  }

  public void setHazardousMaterialsExtensionG(Map<String, Object> hazardousMaterialsExtensionG) {
    this.hazardousMaterialsExtensionG = hazardousMaterialsExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HazardousMaterials hazardousMaterials = (HazardousMaterials) o;
    return Objects.equals(this.chemicalName, hazardousMaterials.chemicalName) &&
        Objects.equals(this.dangerousGoodsFlashPoint, hazardousMaterials.dangerousGoodsFlashPoint) &&
        Objects.equals(this.dangerousGoodsRegulations, hazardousMaterials.dangerousGoodsRegulations) &&
        Objects.equals(this.hazardCodeIdentification, hazardousMaterials.hazardCodeIdentification) &&
        Objects.equals(this.hazardCodeVersionNumber, hazardousMaterials.hazardCodeVersionNumber) &&
        Objects.equals(this.hazardSubstanceItemPageNumber, hazardousMaterials.hazardSubstanceItemPageNumber) &&
        Objects.equals(this.tremCardNumber, hazardousMaterials.tremCardNumber) &&
        Objects.equals(this.undgNumber, hazardousMaterials.undgNumber) &&
        Objects.equals(this.volumeOfDangerousGoods, hazardousMaterials.volumeOfDangerousGoods) &&
        Objects.equals(this.weightOfDangerousGoods, hazardousMaterials.weightOfDangerousGoods) &&
        Objects.equals(this.hazardousMaterialsExtensionG, hazardousMaterials.hazardousMaterialsExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chemicalName, dangerousGoodsFlashPoint, dangerousGoodsRegulations, hazardCodeIdentification, hazardCodeVersionNumber, hazardSubstanceItemPageNumber, tremCardNumber, undgNumber, volumeOfDangerousGoods, weightOfDangerousGoods, hazardousMaterialsExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HazardousMaterials {\n");
    sb.append("    chemicalName: ").append(toIndentedString(chemicalName)).append("\n");
    sb.append("    dangerousGoodsFlashPoint: ").append(toIndentedString(dangerousGoodsFlashPoint)).append("\n");
    sb.append("    dangerousGoodsRegulations: ").append(toIndentedString(dangerousGoodsRegulations)).append("\n");
    sb.append("    hazardCodeIdentification: ").append(toIndentedString(hazardCodeIdentification)).append("\n");
    sb.append("    hazardCodeVersionNumber: ").append(toIndentedString(hazardCodeVersionNumber)).append("\n");
    sb.append("    hazardSubstanceItemPageNumber: ").append(toIndentedString(hazardSubstanceItemPageNumber)).append("\n");
    sb.append("    tremCardNumber: ").append(toIndentedString(tremCardNumber)).append("\n");
    sb.append("    undgNumber: ").append(toIndentedString(undgNumber)).append("\n");
    sb.append("    volumeOfDangerousGoods: ").append(toIndentedString(volumeOfDangerousGoods)).append("\n");
    sb.append("    weightOfDangerousGoods: ").append(toIndentedString(weightOfDangerousGoods)).append("\n");
    sb.append("    hazardousMaterialsExtensionG: ").append(toIndentedString(hazardousMaterialsExtensionG)).append("\n");
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

