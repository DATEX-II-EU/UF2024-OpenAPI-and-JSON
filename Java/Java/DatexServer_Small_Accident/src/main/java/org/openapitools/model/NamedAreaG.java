package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.IsoNamedArea;
import org.openapitools.model.NamedArea;
import org.openapitools.model.NamedAreaExtended;
import org.openapitools.model.NutsNamedArea;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NamedAreaG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class NamedAreaG {

  private NamedArea locNamedArea;

  private NutsNamedArea locNutsNamedArea;

  private IsoNamedArea locIsoNamedArea;

  private NamedAreaExtended locxNamedAreaExtended;

  public NamedAreaG locNamedArea(NamedArea locNamedArea) {
    this.locNamedArea = locNamedArea;
    return this;
  }

  /**
   * Get locNamedArea
   * @return locNamedArea
   */
  @Valid 
  @Schema(name = "locNamedArea", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locNamedArea")
  public NamedArea getLocNamedArea() {
    return locNamedArea;
  }

  public void setLocNamedArea(NamedArea locNamedArea) {
    this.locNamedArea = locNamedArea;
  }

  public NamedAreaG locNutsNamedArea(NutsNamedArea locNutsNamedArea) {
    this.locNutsNamedArea = locNutsNamedArea;
    return this;
  }

  /**
   * Get locNutsNamedArea
   * @return locNutsNamedArea
   */
  @Valid 
  @Schema(name = "locNutsNamedArea", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locNutsNamedArea")
  public NutsNamedArea getLocNutsNamedArea() {
    return locNutsNamedArea;
  }

  public void setLocNutsNamedArea(NutsNamedArea locNutsNamedArea) {
    this.locNutsNamedArea = locNutsNamedArea;
  }

  public NamedAreaG locIsoNamedArea(IsoNamedArea locIsoNamedArea) {
    this.locIsoNamedArea = locIsoNamedArea;
    return this;
  }

  /**
   * Get locIsoNamedArea
   * @return locIsoNamedArea
   */
  @Valid 
  @Schema(name = "locIsoNamedArea", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locIsoNamedArea")
  public IsoNamedArea getLocIsoNamedArea() {
    return locIsoNamedArea;
  }

  public void setLocIsoNamedArea(IsoNamedArea locIsoNamedArea) {
    this.locIsoNamedArea = locIsoNamedArea;
  }

  public NamedAreaG locxNamedAreaExtended(NamedAreaExtended locxNamedAreaExtended) {
    this.locxNamedAreaExtended = locxNamedAreaExtended;
    return this;
  }

  /**
   * Get locxNamedAreaExtended
   * @return locxNamedAreaExtended
   */
  @Valid 
  @Schema(name = "locxNamedAreaExtended", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locxNamedAreaExtended")
  public NamedAreaExtended getLocxNamedAreaExtended() {
    return locxNamedAreaExtended;
  }

  public void setLocxNamedAreaExtended(NamedAreaExtended locxNamedAreaExtended) {
    this.locxNamedAreaExtended = locxNamedAreaExtended;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedAreaG namedAreaG = (NamedAreaG) o;
    return Objects.equals(this.locNamedArea, namedAreaG.locNamedArea) &&
        Objects.equals(this.locNutsNamedArea, namedAreaG.locNutsNamedArea) &&
        Objects.equals(this.locIsoNamedArea, namedAreaG.locIsoNamedArea) &&
        Objects.equals(this.locxNamedAreaExtended, namedAreaG.locxNamedAreaExtended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locNamedArea, locNutsNamedArea, locIsoNamedArea, locxNamedAreaExtended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedAreaG {\n");
    sb.append("    locNamedArea: ").append(toIndentedString(locNamedArea)).append("\n");
    sb.append("    locNutsNamedArea: ").append(toIndentedString(locNutsNamedArea)).append("\n");
    sb.append("    locIsoNamedArea: ").append(toIndentedString(locIsoNamedArea)).append("\n");
    sb.append("    locxNamedAreaExtended: ").append(toIndentedString(locxNamedAreaExtended)).append("\n");
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

