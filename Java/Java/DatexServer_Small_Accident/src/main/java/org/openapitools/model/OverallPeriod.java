package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OverallPeriod
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OverallPeriod {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime overallStartTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime overallEndTime;

  @Valid
  private Map<String, Object> overallPeriodExtensionG = new HashMap<>();

  public OverallPeriod() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OverallPeriod(OffsetDateTime overallStartTime) {
    this.overallStartTime = overallStartTime;
  }

  public OverallPeriod overallStartTime(OffsetDateTime overallStartTime) {
    this.overallStartTime = overallStartTime;
    return this;
  }

  /**
   * Get overallStartTime
   * @return overallStartTime
   */
  @NotNull @Valid 
  @Schema(name = "overallStartTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("overallStartTime")
  public OffsetDateTime getOverallStartTime() {
    return overallStartTime;
  }

  public void setOverallStartTime(OffsetDateTime overallStartTime) {
    this.overallStartTime = overallStartTime;
  }

  public OverallPeriod overallEndTime(OffsetDateTime overallEndTime) {
    this.overallEndTime = overallEndTime;
    return this;
  }

  /**
   * Get overallEndTime
   * @return overallEndTime
   */
  @Valid 
  @Schema(name = "overallEndTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overallEndTime")
  public OffsetDateTime getOverallEndTime() {
    return overallEndTime;
  }

  public void setOverallEndTime(OffsetDateTime overallEndTime) {
    this.overallEndTime = overallEndTime;
  }

  public OverallPeriod overallPeriodExtensionG(Map<String, Object> overallPeriodExtensionG) {
    this.overallPeriodExtensionG = overallPeriodExtensionG;
    return this;
  }

  public OverallPeriod putOverallPeriodExtensionGItem(String key, Object overallPeriodExtensionGItem) {
    if (this.overallPeriodExtensionG == null) {
      this.overallPeriodExtensionG = new HashMap<>();
    }
    this.overallPeriodExtensionG.put(key, overallPeriodExtensionGItem);
    return this;
  }

  /**
   * Get overallPeriodExtensionG
   * @return overallPeriodExtensionG
   */
  
  @Schema(name = "overallPeriodExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overallPeriodExtensionG")
  public Map<String, Object> getOverallPeriodExtensionG() {
    return overallPeriodExtensionG;
  }

  public void setOverallPeriodExtensionG(Map<String, Object> overallPeriodExtensionG) {
    this.overallPeriodExtensionG = overallPeriodExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverallPeriod overallPeriod = (OverallPeriod) o;
    return Objects.equals(this.overallStartTime, overallPeriod.overallStartTime) &&
        Objects.equals(this.overallEndTime, overallPeriod.overallEndTime) &&
        Objects.equals(this.overallPeriodExtensionG, overallPeriod.overallPeriodExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overallStartTime, overallEndTime, overallPeriodExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverallPeriod {\n");
    sb.append("    overallStartTime: ").append(toIndentedString(overallStartTime)).append("\n");
    sb.append("    overallEndTime: ").append(toIndentedString(overallEndTime)).append("\n");
    sb.append("    overallPeriodExtensionG: ").append(toIndentedString(overallPeriodExtensionG)).append("\n");
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

