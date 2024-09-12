package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.EmissionsExtension;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * EmissionsExtensionTypeG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EmissionsExtensionTypeG {

  private EmissionsExtension emissionsExtension;

  public EmissionsExtensionTypeG emissionsExtension(EmissionsExtension emissionsExtension) {
    this.emissionsExtension = emissionsExtension;
    return this;
  }

  /**
   * Get emissionsExtension
   * @return emissionsExtension
   */
  @Valid 
  @Schema(name = "EmissionsExtension", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EmissionsExtension")
  public EmissionsExtension getEmissionsExtension() {
    return emissionsExtension;
  }

  public void setEmissionsExtension(EmissionsExtension emissionsExtension) {
    this.emissionsExtension = emissionsExtension;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public EmissionsExtensionTypeG putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmissionsExtensionTypeG emissionsExtensionTypeG = (EmissionsExtensionTypeG) o;
    return Objects.equals(this.emissionsExtension, emissionsExtensionTypeG.emissionsExtension) &&
    Objects.equals(this.additionalProperties, emissionsExtensionTypeG.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emissionsExtension, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmissionsExtensionTypeG {\n");
    sb.append("    emissionsExtension: ").append(toIndentedString(emissionsExtension)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

