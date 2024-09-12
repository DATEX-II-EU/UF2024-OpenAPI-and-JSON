package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
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
 * AxleSpacing
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AxleSpacing {

  private BigDecimal axleSpacing;

  private Integer axleSpacingSequenceIdentifier;

  @Valid
  private Map<String, Object> axleSpacingExtensionG = new HashMap<>();

  public AxleSpacing() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AxleSpacing(BigDecimal axleSpacing, Integer axleSpacingSequenceIdentifier) {
    this.axleSpacing = axleSpacing;
    this.axleSpacingSequenceIdentifier = axleSpacingSequenceIdentifier;
  }

  public AxleSpacing axleSpacing(BigDecimal axleSpacing) {
    this.axleSpacing = axleSpacing;
    return this;
  }

  /**
   * Get axleSpacing
   * @return axleSpacing
   */
  @NotNull @Valid 
  @Schema(name = "axleSpacing", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("axleSpacing")
  public BigDecimal getAxleSpacing() {
    return axleSpacing;
  }

  public void setAxleSpacing(BigDecimal axleSpacing) {
    this.axleSpacing = axleSpacing;
  }

  public AxleSpacing axleSpacingSequenceIdentifier(Integer axleSpacingSequenceIdentifier) {
    this.axleSpacingSequenceIdentifier = axleSpacingSequenceIdentifier;
    return this;
  }

  /**
   * Get axleSpacingSequenceIdentifier
   * minimum: 0
   * @return axleSpacingSequenceIdentifier
   */
  @NotNull @Min(0) 
  @Schema(name = "axleSpacingSequenceIdentifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("axleSpacingSequenceIdentifier")
  public Integer getAxleSpacingSequenceIdentifier() {
    return axleSpacingSequenceIdentifier;
  }

  public void setAxleSpacingSequenceIdentifier(Integer axleSpacingSequenceIdentifier) {
    this.axleSpacingSequenceIdentifier = axleSpacingSequenceIdentifier;
  }

  public AxleSpacing axleSpacingExtensionG(Map<String, Object> axleSpacingExtensionG) {
    this.axleSpacingExtensionG = axleSpacingExtensionG;
    return this;
  }

  public AxleSpacing putAxleSpacingExtensionGItem(String key, Object axleSpacingExtensionGItem) {
    if (this.axleSpacingExtensionG == null) {
      this.axleSpacingExtensionG = new HashMap<>();
    }
    this.axleSpacingExtensionG.put(key, axleSpacingExtensionGItem);
    return this;
  }

  /**
   * Get axleSpacingExtensionG
   * @return axleSpacingExtensionG
   */
  
  @Schema(name = "axleSpacingExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("axleSpacingExtensionG")
  public Map<String, Object> getAxleSpacingExtensionG() {
    return axleSpacingExtensionG;
  }

  public void setAxleSpacingExtensionG(Map<String, Object> axleSpacingExtensionG) {
    this.axleSpacingExtensionG = axleSpacingExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AxleSpacing axleSpacing = (AxleSpacing) o;
    return Objects.equals(this.axleSpacing, axleSpacing.axleSpacing) &&
        Objects.equals(this.axleSpacingSequenceIdentifier, axleSpacing.axleSpacingSequenceIdentifier) &&
        Objects.equals(this.axleSpacingExtensionG, axleSpacing.axleSpacingExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(axleSpacing, axleSpacingSequenceIdentifier, axleSpacingExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AxleSpacing {\n");
    sb.append("    axleSpacing: ").append(toIndentedString(axleSpacing)).append("\n");
    sb.append("    axleSpacingSequenceIdentifier: ").append(toIndentedString(axleSpacingSequenceIdentifier)).append("\n");
    sb.append("    axleSpacingExtensionG: ").append(toIndentedString(axleSpacingExtensionG)).append("\n");
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

