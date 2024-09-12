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
import org.openapitools.model.ElementReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InformationManagedResourceList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class InformationManagedResourceList {

  @Valid
  private List<@Valid ElementReference> elementReference = new ArrayList<>();

  @Valid
  private Map<String, Object> informationManagedResourceListExtensionG = new HashMap<>();

  public InformationManagedResourceList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InformationManagedResourceList(List<@Valid ElementReference> elementReference) {
    this.elementReference = elementReference;
  }

  public InformationManagedResourceList elementReference(List<@Valid ElementReference> elementReference) {
    this.elementReference = elementReference;
    return this;
  }

  public InformationManagedResourceList addElementReferenceItem(ElementReference elementReferenceItem) {
    if (this.elementReference == null) {
      this.elementReference = new ArrayList<>();
    }
    this.elementReference.add(elementReferenceItem);
    return this;
  }

  /**
   * Get elementReference
   * @return elementReference
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "elementReference", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elementReference")
  public List<@Valid ElementReference> getElementReference() {
    return elementReference;
  }

  public void setElementReference(List<@Valid ElementReference> elementReference) {
    this.elementReference = elementReference;
  }

  public InformationManagedResourceList informationManagedResourceListExtensionG(Map<String, Object> informationManagedResourceListExtensionG) {
    this.informationManagedResourceListExtensionG = informationManagedResourceListExtensionG;
    return this;
  }

  public InformationManagedResourceList putInformationManagedResourceListExtensionGItem(String key, Object informationManagedResourceListExtensionGItem) {
    if (this.informationManagedResourceListExtensionG == null) {
      this.informationManagedResourceListExtensionG = new HashMap<>();
    }
    this.informationManagedResourceListExtensionG.put(key, informationManagedResourceListExtensionGItem);
    return this;
  }

  /**
   * Get informationManagedResourceListExtensionG
   * @return informationManagedResourceListExtensionG
   */
  
  @Schema(name = "informationManagedResourceListExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("informationManagedResourceListExtensionG")
  public Map<String, Object> getInformationManagedResourceListExtensionG() {
    return informationManagedResourceListExtensionG;
  }

  public void setInformationManagedResourceListExtensionG(Map<String, Object> informationManagedResourceListExtensionG) {
    this.informationManagedResourceListExtensionG = informationManagedResourceListExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformationManagedResourceList informationManagedResourceList = (InformationManagedResourceList) o;
    return Objects.equals(this.elementReference, informationManagedResourceList.elementReference) &&
        Objects.equals(this.informationManagedResourceListExtensionG, informationManagedResourceList.informationManagedResourceListExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementReference, informationManagedResourceListExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformationManagedResourceList {\n");
    sb.append("    elementReference: ").append(toIndentedString(elementReference)).append("\n");
    sb.append("    informationManagedResourceListExtensionG: ").append(toIndentedString(informationManagedResourceListExtensionG)).append("\n");
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

