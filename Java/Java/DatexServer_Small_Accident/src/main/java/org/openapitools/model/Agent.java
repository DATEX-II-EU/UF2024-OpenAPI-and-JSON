package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.InternationalIdentifier;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Agent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Agent {

  private String address;

  private String name;

  private String referenceID;

  private String serviceURL;

  private InternationalIdentifier internationalIdentifier;

  @Valid
  private Map<String, Object> agentExtensionG = new HashMap<>();

  public Agent address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Size(max = 1024) 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Agent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Size(max = 1024) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Agent referenceID(String referenceID) {
    this.referenceID = referenceID;
    return this;
  }

  /**
   * Get referenceID
   * @return referenceID
   */
  @Size(max = 1024) 
  @Schema(name = "referenceID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceID")
  public String getReferenceID() {
    return referenceID;
  }

  public void setReferenceID(String referenceID) {
    this.referenceID = referenceID;
  }

  public Agent serviceURL(String serviceURL) {
    this.serviceURL = serviceURL;
    return this;
  }

  /**
   * Get serviceURL
   * @return serviceURL
   */
  @Size(max = 1024) 
  @Schema(name = "serviceURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceURL")
  public String getServiceURL() {
    return serviceURL;
  }

  public void setServiceURL(String serviceURL) {
    this.serviceURL = serviceURL;
  }

  public Agent internationalIdentifier(InternationalIdentifier internationalIdentifier) {
    this.internationalIdentifier = internationalIdentifier;
    return this;
  }

  /**
   * Get internationalIdentifier
   * @return internationalIdentifier
   */
  @Valid 
  @Schema(name = "internationalIdentifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internationalIdentifier")
  public InternationalIdentifier getInternationalIdentifier() {
    return internationalIdentifier;
  }

  public void setInternationalIdentifier(InternationalIdentifier internationalIdentifier) {
    this.internationalIdentifier = internationalIdentifier;
  }

  public Agent agentExtensionG(Map<String, Object> agentExtensionG) {
    this.agentExtensionG = agentExtensionG;
    return this;
  }

  public Agent putAgentExtensionGItem(String key, Object agentExtensionGItem) {
    if (this.agentExtensionG == null) {
      this.agentExtensionG = new HashMap<>();
    }
    this.agentExtensionG.put(key, agentExtensionGItem);
    return this;
  }

  /**
   * Get agentExtensionG
   * @return agentExtensionG
   */
  
  @Schema(name = "agentExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agentExtensionG")
  public Map<String, Object> getAgentExtensionG() {
    return agentExtensionG;
  }

  public void setAgentExtensionG(Map<String, Object> agentExtensionG) {
    this.agentExtensionG = agentExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(this.address, agent.address) &&
        Objects.equals(this.name, agent.name) &&
        Objects.equals(this.referenceID, agent.referenceID) &&
        Objects.equals(this.serviceURL, agent.serviceURL) &&
        Objects.equals(this.internationalIdentifier, agent.internationalIdentifier) &&
        Objects.equals(this.agentExtensionG, agent.agentExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, referenceID, serviceURL, internationalIdentifier, agentExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referenceID: ").append(toIndentedString(referenceID)).append("\n");
    sb.append("    serviceURL: ").append(toIndentedString(serviceURL)).append("\n");
    sb.append("    internationalIdentifier: ").append(toIndentedString(internationalIdentifier)).append("\n");
    sb.append("    agentExtensionG: ").append(toIndentedString(agentExtensionG)).append("\n");
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

