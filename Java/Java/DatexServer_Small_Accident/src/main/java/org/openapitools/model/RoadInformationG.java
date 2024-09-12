package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.RoadInformation;
import org.openapitools.model.RoadInformationEnhanced;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RoadInformationG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RoadInformationG {

  private RoadInformation locRoadInformation;

  private RoadInformationEnhanced prkRoadInformationEnhanced;

  public RoadInformationG locRoadInformation(RoadInformation locRoadInformation) {
    this.locRoadInformation = locRoadInformation;
    return this;
  }

  /**
   * Get locRoadInformation
   * @return locRoadInformation
   */
  @Valid 
  @Schema(name = "locRoadInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locRoadInformation")
  public RoadInformation getLocRoadInformation() {
    return locRoadInformation;
  }

  public void setLocRoadInformation(RoadInformation locRoadInformation) {
    this.locRoadInformation = locRoadInformation;
  }

  public RoadInformationG prkRoadInformationEnhanced(RoadInformationEnhanced prkRoadInformationEnhanced) {
    this.prkRoadInformationEnhanced = prkRoadInformationEnhanced;
    return this;
  }

  /**
   * Get prkRoadInformationEnhanced
   * @return prkRoadInformationEnhanced
   */
  @Valid 
  @Schema(name = "prkRoadInformationEnhanced", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prkRoadInformationEnhanced")
  public RoadInformationEnhanced getPrkRoadInformationEnhanced() {
    return prkRoadInformationEnhanced;
  }

  public void setPrkRoadInformationEnhanced(RoadInformationEnhanced prkRoadInformationEnhanced) {
    this.prkRoadInformationEnhanced = prkRoadInformationEnhanced;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadInformationG roadInformationG = (RoadInformationG) o;
    return Objects.equals(this.locRoadInformation, roadInformationG.locRoadInformation) &&
        Objects.equals(this.prkRoadInformationEnhanced, roadInformationG.prkRoadInformationEnhanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locRoadInformation, prkRoadInformationEnhanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadInformationG {\n");
    sb.append("    locRoadInformation: ").append(toIndentedString(locRoadInformation)).append("\n");
    sb.append("    prkRoadInformationEnhanced: ").append(toIndentedString(prkRoadInformationEnhanced)).append("\n");
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

