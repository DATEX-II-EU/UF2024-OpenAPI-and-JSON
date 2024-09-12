package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.ManagementTypeEnumG;
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
 * ElementReference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ElementReference {

  private ManagementTypeEnumG managementStatus;

  private Reference reference;

  private VersionedReference versionedReference;

  @Valid
  private Map<String, Object> elementReferenceExtensionG = new HashMap<>();

  public ElementReference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ElementReference(ManagementTypeEnumG managementStatus) {
    this.managementStatus = managementStatus;
  }

  public ElementReference managementStatus(ManagementTypeEnumG managementStatus) {
    this.managementStatus = managementStatus;
    return this;
  }

  /**
   * Get managementStatus
   * @return managementStatus
   */
  @NotNull @Valid 
  @Schema(name = "managementStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("managementStatus")
  public ManagementTypeEnumG getManagementStatus() {
    return managementStatus;
  }

  public void setManagementStatus(ManagementTypeEnumG managementStatus) {
    this.managementStatus = managementStatus;
  }

  public ElementReference reference(Reference reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
   */
  @Valid 
  @Schema(name = "reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public Reference getReference() {
    return reference;
  }

  public void setReference(Reference reference) {
    this.reference = reference;
  }

  public ElementReference versionedReference(VersionedReference versionedReference) {
    this.versionedReference = versionedReference;
    return this;
  }

  /**
   * Get versionedReference
   * @return versionedReference
   */
  @Valid 
  @Schema(name = "versionedReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionedReference")
  public VersionedReference getVersionedReference() {
    return versionedReference;
  }

  public void setVersionedReference(VersionedReference versionedReference) {
    this.versionedReference = versionedReference;
  }

  public ElementReference elementReferenceExtensionG(Map<String, Object> elementReferenceExtensionG) {
    this.elementReferenceExtensionG = elementReferenceExtensionG;
    return this;
  }

  public ElementReference putElementReferenceExtensionGItem(String key, Object elementReferenceExtensionGItem) {
    if (this.elementReferenceExtensionG == null) {
      this.elementReferenceExtensionG = new HashMap<>();
    }
    this.elementReferenceExtensionG.put(key, elementReferenceExtensionGItem);
    return this;
  }

  /**
   * Get elementReferenceExtensionG
   * @return elementReferenceExtensionG
   */
  
  @Schema(name = "elementReferenceExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementReferenceExtensionG")
  public Map<String, Object> getElementReferenceExtensionG() {
    return elementReferenceExtensionG;
  }

  public void setElementReferenceExtensionG(Map<String, Object> elementReferenceExtensionG) {
    this.elementReferenceExtensionG = elementReferenceExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementReference elementReference = (ElementReference) o;
    return Objects.equals(this.managementStatus, elementReference.managementStatus) &&
        Objects.equals(this.reference, elementReference.reference) &&
        Objects.equals(this.versionedReference, elementReference.versionedReference) &&
        Objects.equals(this.elementReferenceExtensionG, elementReference.elementReferenceExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementStatus, reference, versionedReference, elementReferenceExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementReference {\n");
    sb.append("    managementStatus: ").append(toIndentedString(managementStatus)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    versionedReference: ").append(toIndentedString(versionedReference)).append("\n");
    sb.append("    elementReferenceExtensionG: ").append(toIndentedString(elementReferenceExtensionG)).append("\n");
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

