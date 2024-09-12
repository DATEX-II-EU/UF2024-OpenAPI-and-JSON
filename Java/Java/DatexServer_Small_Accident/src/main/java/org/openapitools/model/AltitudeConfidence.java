package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AltitudeAccuracyEnumG;
import org.openapitools.model.PositionConfidenceCodedErrorEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AltitudeConfidence
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AltitudeConfidence {

  private AltitudeAccuracyEnumG altitudeAccuracyCodedValue;

  private PositionConfidenceCodedErrorEnumG altitudeAccuracyCodedError;

  @Valid
  private Map<String, Object> altitudeConfidenceExtensionG = new HashMap<>();

  public AltitudeConfidence altitudeAccuracyCodedValue(AltitudeAccuracyEnumG altitudeAccuracyCodedValue) {
    this.altitudeAccuracyCodedValue = altitudeAccuracyCodedValue;
    return this;
  }

  /**
   * Get altitudeAccuracyCodedValue
   * @return altitudeAccuracyCodedValue
   */
  @Valid 
  @Schema(name = "altitudeAccuracyCodedValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("altitudeAccuracyCodedValue")
  public AltitudeAccuracyEnumG getAltitudeAccuracyCodedValue() {
    return altitudeAccuracyCodedValue;
  }

  public void setAltitudeAccuracyCodedValue(AltitudeAccuracyEnumG altitudeAccuracyCodedValue) {
    this.altitudeAccuracyCodedValue = altitudeAccuracyCodedValue;
  }

  public AltitudeConfidence altitudeAccuracyCodedError(PositionConfidenceCodedErrorEnumG altitudeAccuracyCodedError) {
    this.altitudeAccuracyCodedError = altitudeAccuracyCodedError;
    return this;
  }

  /**
   * Get altitudeAccuracyCodedError
   * @return altitudeAccuracyCodedError
   */
  @Valid 
  @Schema(name = "altitudeAccuracyCodedError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("altitudeAccuracyCodedError")
  public PositionConfidenceCodedErrorEnumG getAltitudeAccuracyCodedError() {
    return altitudeAccuracyCodedError;
  }

  public void setAltitudeAccuracyCodedError(PositionConfidenceCodedErrorEnumG altitudeAccuracyCodedError) {
    this.altitudeAccuracyCodedError = altitudeAccuracyCodedError;
  }

  public AltitudeConfidence altitudeConfidenceExtensionG(Map<String, Object> altitudeConfidenceExtensionG) {
    this.altitudeConfidenceExtensionG = altitudeConfidenceExtensionG;
    return this;
  }

  public AltitudeConfidence putAltitudeConfidenceExtensionGItem(String key, Object altitudeConfidenceExtensionGItem) {
    if (this.altitudeConfidenceExtensionG == null) {
      this.altitudeConfidenceExtensionG = new HashMap<>();
    }
    this.altitudeConfidenceExtensionG.put(key, altitudeConfidenceExtensionGItem);
    return this;
  }

  /**
   * Get altitudeConfidenceExtensionG
   * @return altitudeConfidenceExtensionG
   */
  
  @Schema(name = "altitudeConfidenceExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("altitudeConfidenceExtensionG")
  public Map<String, Object> getAltitudeConfidenceExtensionG() {
    return altitudeConfidenceExtensionG;
  }

  public void setAltitudeConfidenceExtensionG(Map<String, Object> altitudeConfidenceExtensionG) {
    this.altitudeConfidenceExtensionG = altitudeConfidenceExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AltitudeConfidence altitudeConfidence = (AltitudeConfidence) o;
    return Objects.equals(this.altitudeAccuracyCodedValue, altitudeConfidence.altitudeAccuracyCodedValue) &&
        Objects.equals(this.altitudeAccuracyCodedError, altitudeConfidence.altitudeAccuracyCodedError) &&
        Objects.equals(this.altitudeConfidenceExtensionG, altitudeConfidence.altitudeConfidenceExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altitudeAccuracyCodedValue, altitudeAccuracyCodedError, altitudeConfidenceExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltitudeConfidence {\n");
    sb.append("    altitudeAccuracyCodedValue: ").append(toIndentedString(altitudeAccuracyCodedValue)).append("\n");
    sb.append("    altitudeAccuracyCodedError: ").append(toIndentedString(altitudeAccuracyCodedError)).append("\n");
    sb.append("    altitudeConfidenceExtensionG: ").append(toIndentedString(altitudeConfidenceExtensionG)).append("\n");
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

