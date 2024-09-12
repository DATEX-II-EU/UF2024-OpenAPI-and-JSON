package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.LinearLocation;
import org.openapitools.model.PointLocation;
import org.openapitools.model.SingleRoadLinearLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LocationReferenceG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class LocationReferenceG {

  private LinearLocation locLinearLocation;

  private SingleRoadLinearLocation locSingleRoadLinearLocation;

  private PointLocation locPointLocation;

  public LocationReferenceG locLinearLocation(LinearLocation locLinearLocation) {
    this.locLinearLocation = locLinearLocation;
    return this;
  }

  /**
   * Get locLinearLocation
   * @return locLinearLocation
   */
  @Valid 
  @Schema(name = "locLinearLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locLinearLocation")
  public LinearLocation getLocLinearLocation() {
    return locLinearLocation;
  }

  public void setLocLinearLocation(LinearLocation locLinearLocation) {
    this.locLinearLocation = locLinearLocation;
  }

  public LocationReferenceG locSingleRoadLinearLocation(SingleRoadLinearLocation locSingleRoadLinearLocation) {
    this.locSingleRoadLinearLocation = locSingleRoadLinearLocation;
    return this;
  }

  /**
   * Get locSingleRoadLinearLocation
   * @return locSingleRoadLinearLocation
   */
  @Valid 
  @Schema(name = "locSingleRoadLinearLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locSingleRoadLinearLocation")
  public SingleRoadLinearLocation getLocSingleRoadLinearLocation() {
    return locSingleRoadLinearLocation;
  }

  public void setLocSingleRoadLinearLocation(SingleRoadLinearLocation locSingleRoadLinearLocation) {
    this.locSingleRoadLinearLocation = locSingleRoadLinearLocation;
  }

  public LocationReferenceG locPointLocation(PointLocation locPointLocation) {
    this.locPointLocation = locPointLocation;
    return this;
  }

  /**
   * Get locPointLocation
   * @return locPointLocation
   */
  @Valid 
  @Schema(name = "locPointLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locPointLocation")
  public PointLocation getLocPointLocation() {
    return locPointLocation;
  }

  public void setLocPointLocation(PointLocation locPointLocation) {
    this.locPointLocation = locPointLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationReferenceG locationReferenceG = (LocationReferenceG) o;
    return Objects.equals(this.locLinearLocation, locationReferenceG.locLinearLocation) &&
        Objects.equals(this.locSingleRoadLinearLocation, locationReferenceG.locSingleRoadLinearLocation) &&
        Objects.equals(this.locPointLocation, locationReferenceG.locPointLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locLinearLocation, locSingleRoadLinearLocation, locPointLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationReferenceG {\n");
    sb.append("    locLinearLocation: ").append(toIndentedString(locLinearLocation)).append("\n");
    sb.append("    locSingleRoadLinearLocation: ").append(toIndentedString(locSingleRoadLinearLocation)).append("\n");
    sb.append("    locPointLocation: ").append(toIndentedString(locPointLocation)).append("\n");
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

