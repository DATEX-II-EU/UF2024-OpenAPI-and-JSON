package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.InformationManagedResourceList;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InformationManagement
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class InformationManagement {

  private InformationManagedResourceList informationManagedResourceList;

  @Valid
  private Map<String, Object> informationManagementExtensionG = new HashMap<>();

  public InformationManagement informationManagedResourceList(InformationManagedResourceList informationManagedResourceList) {
    this.informationManagedResourceList = informationManagedResourceList;
    return this;
  }

  /**
   * Get informationManagedResourceList
   * @return informationManagedResourceList
   */
  @Valid 
  @Schema(name = "informationManagedResourceList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("informationManagedResourceList")
  public InformationManagedResourceList getInformationManagedResourceList() {
    return informationManagedResourceList;
  }

  public void setInformationManagedResourceList(InformationManagedResourceList informationManagedResourceList) {
    this.informationManagedResourceList = informationManagedResourceList;
  }

  public InformationManagement informationManagementExtensionG(Map<String, Object> informationManagementExtensionG) {
    this.informationManagementExtensionG = informationManagementExtensionG;
    return this;
  }

  public InformationManagement putInformationManagementExtensionGItem(String key, Object informationManagementExtensionGItem) {
    if (this.informationManagementExtensionG == null) {
      this.informationManagementExtensionG = new HashMap<>();
    }
    this.informationManagementExtensionG.put(key, informationManagementExtensionGItem);
    return this;
  }

  /**
   * Get informationManagementExtensionG
   * @return informationManagementExtensionG
   */
  
  @Schema(name = "informationManagementExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("informationManagementExtensionG")
  public Map<String, Object> getInformationManagementExtensionG() {
    return informationManagementExtensionG;
  }

  public void setInformationManagementExtensionG(Map<String, Object> informationManagementExtensionG) {
    this.informationManagementExtensionG = informationManagementExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformationManagement informationManagement = (InformationManagement) o;
    return Objects.equals(this.informationManagedResourceList, informationManagement.informationManagedResourceList) &&
        Objects.equals(this.informationManagementExtensionG, informationManagement.informationManagementExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(informationManagedResourceList, informationManagementExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformationManagement {\n");
    sb.append("    informationManagedResourceList: ").append(toIndentedString(informationManagedResourceList)).append("\n");
    sb.append("    informationManagementExtensionG: ").append(toIndentedString(informationManagementExtensionG)).append("\n");
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

