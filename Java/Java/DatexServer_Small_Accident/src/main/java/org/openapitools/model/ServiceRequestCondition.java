package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.MultilingualString;
import org.openapitools.model.Reference;
import org.openapitools.model.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceRequestCondition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ServiceRequestCondition {

  private MultilingualString conditionDescription;

  @Valid
  private List<@Size(max = 1024)String> externalIdCondition = new ArrayList<>();

  @Valid
  private List<@Valid Reference> referencedCondition = new ArrayList<>();

  @Valid
  private List<@Valid VersionedReference> versionReferencedCondition = new ArrayList<>();

  @Valid
  private Map<String, Object> serviceRequestConditionExtensionG = new HashMap<>();

  public ServiceRequestCondition conditionDescription(MultilingualString conditionDescription) {
    this.conditionDescription = conditionDescription;
    return this;
  }

  /**
   * Get conditionDescription
   * @return conditionDescription
   */
  @Valid 
  @Schema(name = "conditionDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conditionDescription")
  public MultilingualString getConditionDescription() {
    return conditionDescription;
  }

  public void setConditionDescription(MultilingualString conditionDescription) {
    this.conditionDescription = conditionDescription;
  }

  public ServiceRequestCondition externalIdCondition(List<@Size(max = 1024)String> externalIdCondition) {
    this.externalIdCondition = externalIdCondition;
    return this;
  }

  public ServiceRequestCondition addExternalIdConditionItem(String externalIdConditionItem) {
    if (this.externalIdCondition == null) {
      this.externalIdCondition = new ArrayList<>();
    }
    this.externalIdCondition.add(externalIdConditionItem);
    return this;
  }

  /**
   * Get externalIdCondition
   * @return externalIdCondition
   */
  @Size(min = 0) 
  @Schema(name = "externalIdCondition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalIdCondition")
  public List<@Size(max = 1024)String> getExternalIdCondition() {
    return externalIdCondition;
  }

  public void setExternalIdCondition(List<@Size(max = 1024)String> externalIdCondition) {
    this.externalIdCondition = externalIdCondition;
  }

  public ServiceRequestCondition referencedCondition(List<@Valid Reference> referencedCondition) {
    this.referencedCondition = referencedCondition;
    return this;
  }

  public ServiceRequestCondition addReferencedConditionItem(Reference referencedConditionItem) {
    if (this.referencedCondition == null) {
      this.referencedCondition = new ArrayList<>();
    }
    this.referencedCondition.add(referencedConditionItem);
    return this;
  }

  /**
   * Get referencedCondition
   * @return referencedCondition
   */
  @Valid @Size(min = 0) 
  @Schema(name = "referencedCondition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referencedCondition")
  public List<@Valid Reference> getReferencedCondition() {
    return referencedCondition;
  }

  public void setReferencedCondition(List<@Valid Reference> referencedCondition) {
    this.referencedCondition = referencedCondition;
  }

  public ServiceRequestCondition versionReferencedCondition(List<@Valid VersionedReference> versionReferencedCondition) {
    this.versionReferencedCondition = versionReferencedCondition;
    return this;
  }

  public ServiceRequestCondition addVersionReferencedConditionItem(VersionedReference versionReferencedConditionItem) {
    if (this.versionReferencedCondition == null) {
      this.versionReferencedCondition = new ArrayList<>();
    }
    this.versionReferencedCondition.add(versionReferencedConditionItem);
    return this;
  }

  /**
   * Get versionReferencedCondition
   * @return versionReferencedCondition
   */
  @Valid @Size(min = 0) 
  @Schema(name = "versionReferencedCondition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionReferencedCondition")
  public List<@Valid VersionedReference> getVersionReferencedCondition() {
    return versionReferencedCondition;
  }

  public void setVersionReferencedCondition(List<@Valid VersionedReference> versionReferencedCondition) {
    this.versionReferencedCondition = versionReferencedCondition;
  }

  public ServiceRequestCondition serviceRequestConditionExtensionG(Map<String, Object> serviceRequestConditionExtensionG) {
    this.serviceRequestConditionExtensionG = serviceRequestConditionExtensionG;
    return this;
  }

  public ServiceRequestCondition putServiceRequestConditionExtensionGItem(String key, Object serviceRequestConditionExtensionGItem) {
    if (this.serviceRequestConditionExtensionG == null) {
      this.serviceRequestConditionExtensionG = new HashMap<>();
    }
    this.serviceRequestConditionExtensionG.put(key, serviceRequestConditionExtensionGItem);
    return this;
  }

  /**
   * Get serviceRequestConditionExtensionG
   * @return serviceRequestConditionExtensionG
   */
  
  @Schema(name = "serviceRequestConditionExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceRequestConditionExtensionG")
  public Map<String, Object> getServiceRequestConditionExtensionG() {
    return serviceRequestConditionExtensionG;
  }

  public void setServiceRequestConditionExtensionG(Map<String, Object> serviceRequestConditionExtensionG) {
    this.serviceRequestConditionExtensionG = serviceRequestConditionExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRequestCondition serviceRequestCondition = (ServiceRequestCondition) o;
    return Objects.equals(this.conditionDescription, serviceRequestCondition.conditionDescription) &&
        Objects.equals(this.externalIdCondition, serviceRequestCondition.externalIdCondition) &&
        Objects.equals(this.referencedCondition, serviceRequestCondition.referencedCondition) &&
        Objects.equals(this.versionReferencedCondition, serviceRequestCondition.versionReferencedCondition) &&
        Objects.equals(this.serviceRequestConditionExtensionG, serviceRequestCondition.serviceRequestConditionExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionDescription, externalIdCondition, referencedCondition, versionReferencedCondition, serviceRequestConditionExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRequestCondition {\n");
    sb.append("    conditionDescription: ").append(toIndentedString(conditionDescription)).append("\n");
    sb.append("    externalIdCondition: ").append(toIndentedString(externalIdCondition)).append("\n");
    sb.append("    referencedCondition: ").append(toIndentedString(referencedCondition)).append("\n");
    sb.append("    versionReferencedCondition: ").append(toIndentedString(versionReferencedCondition)).append("\n");
    sb.append("    serviceRequestConditionExtensionG: ").append(toIndentedString(serviceRequestConditionExtensionG)).append("\n");
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

