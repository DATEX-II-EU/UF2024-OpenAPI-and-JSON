package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.OverallPeriod;
import org.openapitools.model.ValidityStatusEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Validity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Validity {

  private ValidityStatusEnumG validityStatus;

  private OverallPeriod validityTimeSpecification;

  @Valid
  private Map<String, Object> validityExtensionG = new HashMap<>();

  public Validity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Validity(ValidityStatusEnumG validityStatus, OverallPeriod validityTimeSpecification) {
    this.validityStatus = validityStatus;
    this.validityTimeSpecification = validityTimeSpecification;
  }

  public Validity validityStatus(ValidityStatusEnumG validityStatus) {
    this.validityStatus = validityStatus;
    return this;
  }

  /**
   * Get validityStatus
   * @return validityStatus
   */
  @NotNull @Valid 
  @Schema(name = "validityStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validityStatus")
  public ValidityStatusEnumG getValidityStatus() {
    return validityStatus;
  }

  public void setValidityStatus(ValidityStatusEnumG validityStatus) {
    this.validityStatus = validityStatus;
  }

  public Validity validityTimeSpecification(OverallPeriod validityTimeSpecification) {
    this.validityTimeSpecification = validityTimeSpecification;
    return this;
  }

  /**
   * Get validityTimeSpecification
   * @return validityTimeSpecification
   */
  @NotNull @Valid 
  @Schema(name = "validityTimeSpecification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validityTimeSpecification")
  public OverallPeriod getValidityTimeSpecification() {
    return validityTimeSpecification;
  }

  public void setValidityTimeSpecification(OverallPeriod validityTimeSpecification) {
    this.validityTimeSpecification = validityTimeSpecification;
  }

  public Validity validityExtensionG(Map<String, Object> validityExtensionG) {
    this.validityExtensionG = validityExtensionG;
    return this;
  }

  public Validity putValidityExtensionGItem(String key, Object validityExtensionGItem) {
    if (this.validityExtensionG == null) {
      this.validityExtensionG = new HashMap<>();
    }
    this.validityExtensionG.put(key, validityExtensionGItem);
    return this;
  }

  /**
   * Get validityExtensionG
   * @return validityExtensionG
   */
  
  @Schema(name = "validityExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validityExtensionG")
  public Map<String, Object> getValidityExtensionG() {
    return validityExtensionG;
  }

  public void setValidityExtensionG(Map<String, Object> validityExtensionG) {
    this.validityExtensionG = validityExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Validity validity = (Validity) o;
    return Objects.equals(this.validityStatus, validity.validityStatus) &&
        Objects.equals(this.validityTimeSpecification, validity.validityTimeSpecification) &&
        Objects.equals(this.validityExtensionG, validity.validityExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validityStatus, validityTimeSpecification, validityExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Validity {\n");
    sb.append("    validityStatus: ").append(toIndentedString(validityStatus)).append("\n");
    sb.append("    validityTimeSpecification: ").append(toIndentedString(validityTimeSpecification)).append("\n");
    sb.append("    validityExtensionG: ").append(toIndentedString(validityExtensionG)).append("\n");
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

