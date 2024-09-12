package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EmissionClassificationEuroEnumG;
import org.openapitools.model.EmissionsExtensionTypeG;
import org.openapitools.model.LowEmissionLevelEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Emissions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Emissions {

  private EmissionClassificationEuroEnumG emissionClassificationEuro;

  @Valid
  private List<@Size(max = 1024)String> emissionClassificationOther = new ArrayList<>();

  private LowEmissionLevelEnumG emissionLevel;

  private EmissionsExtensionTypeG emissionsExtensionG;

  public Emissions emissionClassificationEuro(EmissionClassificationEuroEnumG emissionClassificationEuro) {
    this.emissionClassificationEuro = emissionClassificationEuro;
    return this;
  }

  /**
   * Get emissionClassificationEuro
   * @return emissionClassificationEuro
   */
  @Valid 
  @Schema(name = "emissionClassificationEuro", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emissionClassificationEuro")
  public EmissionClassificationEuroEnumG getEmissionClassificationEuro() {
    return emissionClassificationEuro;
  }

  public void setEmissionClassificationEuro(EmissionClassificationEuroEnumG emissionClassificationEuro) {
    this.emissionClassificationEuro = emissionClassificationEuro;
  }

  public Emissions emissionClassificationOther(List<@Size(max = 1024)String> emissionClassificationOther) {
    this.emissionClassificationOther = emissionClassificationOther;
    return this;
  }

  public Emissions addEmissionClassificationOtherItem(String emissionClassificationOtherItem) {
    if (this.emissionClassificationOther == null) {
      this.emissionClassificationOther = new ArrayList<>();
    }
    this.emissionClassificationOther.add(emissionClassificationOtherItem);
    return this;
  }

  /**
   * Get emissionClassificationOther
   * @return emissionClassificationOther
   */
  @Size(min = 0) 
  @Schema(name = "emissionClassificationOther", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emissionClassificationOther")
  public List<@Size(max = 1024)String> getEmissionClassificationOther() {
    return emissionClassificationOther;
  }

  public void setEmissionClassificationOther(List<@Size(max = 1024)String> emissionClassificationOther) {
    this.emissionClassificationOther = emissionClassificationOther;
  }

  public Emissions emissionLevel(LowEmissionLevelEnumG emissionLevel) {
    this.emissionLevel = emissionLevel;
    return this;
  }

  /**
   * Get emissionLevel
   * @return emissionLevel
   */
  @Valid 
  @Schema(name = "emissionLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emissionLevel")
  public LowEmissionLevelEnumG getEmissionLevel() {
    return emissionLevel;
  }

  public void setEmissionLevel(LowEmissionLevelEnumG emissionLevel) {
    this.emissionLevel = emissionLevel;
  }

  public Emissions emissionsExtensionG(EmissionsExtensionTypeG emissionsExtensionG) {
    this.emissionsExtensionG = emissionsExtensionG;
    return this;
  }

  /**
   * Get emissionsExtensionG
   * @return emissionsExtensionG
   */
  @Valid 
  @Schema(name = "emissionsExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emissionsExtensionG")
  public EmissionsExtensionTypeG getEmissionsExtensionG() {
    return emissionsExtensionG;
  }

  public void setEmissionsExtensionG(EmissionsExtensionTypeG emissionsExtensionG) {
    this.emissionsExtensionG = emissionsExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emissions emissions = (Emissions) o;
    return Objects.equals(this.emissionClassificationEuro, emissions.emissionClassificationEuro) &&
        Objects.equals(this.emissionClassificationOther, emissions.emissionClassificationOther) &&
        Objects.equals(this.emissionLevel, emissions.emissionLevel) &&
        Objects.equals(this.emissionsExtensionG, emissions.emissionsExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emissionClassificationEuro, emissionClassificationOther, emissionLevel, emissionsExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emissions {\n");
    sb.append("    emissionClassificationEuro: ").append(toIndentedString(emissionClassificationEuro)).append("\n");
    sb.append("    emissionClassificationOther: ").append(toIndentedString(emissionClassificationOther)).append("\n");
    sb.append("    emissionLevel: ").append(toIndentedString(emissionLevel)).append("\n");
    sb.append("    emissionsExtensionG: ").append(toIndentedString(emissionsExtensionG)).append("\n");
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

