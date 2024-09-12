package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.InformationStatusEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * HeaderInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class HeaderInformation {

  private InformationStatusEnumG informationStatus;

  @Valid
  private Map<String, Object> headerInformationExtensionG = new HashMap<>();

  public HeaderInformation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HeaderInformation(InformationStatusEnumG informationStatus) {
    this.informationStatus = informationStatus;
  }

  public HeaderInformation informationStatus(InformationStatusEnumG informationStatus) {
    this.informationStatus = informationStatus;
    return this;
  }

  /**
   * Get informationStatus
   * @return informationStatus
   */
  @NotNull @Valid 
  @Schema(name = "informationStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("informationStatus")
  public InformationStatusEnumG getInformationStatus() {
    return informationStatus;
  }

  public void setInformationStatus(InformationStatusEnumG informationStatus) {
    this.informationStatus = informationStatus;
  }

  public HeaderInformation headerInformationExtensionG(Map<String, Object> headerInformationExtensionG) {
    this.headerInformationExtensionG = headerInformationExtensionG;
    return this;
  }

  public HeaderInformation putHeaderInformationExtensionGItem(String key, Object headerInformationExtensionGItem) {
    if (this.headerInformationExtensionG == null) {
      this.headerInformationExtensionG = new HashMap<>();
    }
    this.headerInformationExtensionG.put(key, headerInformationExtensionGItem);
    return this;
  }

  /**
   * Get headerInformationExtensionG
   * @return headerInformationExtensionG
   */
  
  @Schema(name = "headerInformationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headerInformationExtensionG")
  public Map<String, Object> getHeaderInformationExtensionG() {
    return headerInformationExtensionG;
  }

  public void setHeaderInformationExtensionG(Map<String, Object> headerInformationExtensionG) {
    this.headerInformationExtensionG = headerInformationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderInformation headerInformation = (HeaderInformation) o;
    return Objects.equals(this.informationStatus, headerInformation.informationStatus) &&
        Objects.equals(this.headerInformationExtensionG, headerInformation.headerInformationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(informationStatus, headerInformationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderInformation {\n");
    sb.append("    informationStatus: ").append(toIndentedString(informationStatus)).append("\n");
    sb.append("    headerInformationExtensionG: ").append(toIndentedString(headerInformationExtensionG)).append("\n");
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

