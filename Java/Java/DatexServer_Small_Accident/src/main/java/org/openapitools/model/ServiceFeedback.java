package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Agent;
import org.openapitools.model.MultilingualString;
import org.openapitools.model.ServiceActionStatusEnumG;
import org.openapitools.model.VersionedReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceFeedback
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ServiceFeedback {

  private MultilingualString serviceRequestFeedbackReason;

  private ServiceActionStatusEnumG serviceRequestStatus;

  private VersionedReference serviceRequestReference;

  private Agent serviceProvider;

  @Valid
  private Map<String, Object> serviceFeedbackExtensionG = new HashMap<>();

  public ServiceFeedback() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceFeedback(ServiceActionStatusEnumG serviceRequestStatus, VersionedReference serviceRequestReference, Agent serviceProvider) {
    this.serviceRequestStatus = serviceRequestStatus;
    this.serviceRequestReference = serviceRequestReference;
    this.serviceProvider = serviceProvider;
  }

  public ServiceFeedback serviceRequestFeedbackReason(MultilingualString serviceRequestFeedbackReason) {
    this.serviceRequestFeedbackReason = serviceRequestFeedbackReason;
    return this;
  }

  /**
   * Get serviceRequestFeedbackReason
   * @return serviceRequestFeedbackReason
   */
  @Valid 
  @Schema(name = "serviceRequestFeedbackReason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceRequestFeedbackReason")
  public MultilingualString getServiceRequestFeedbackReason() {
    return serviceRequestFeedbackReason;
  }

  public void setServiceRequestFeedbackReason(MultilingualString serviceRequestFeedbackReason) {
    this.serviceRequestFeedbackReason = serviceRequestFeedbackReason;
  }

  public ServiceFeedback serviceRequestStatus(ServiceActionStatusEnumG serviceRequestStatus) {
    this.serviceRequestStatus = serviceRequestStatus;
    return this;
  }

  /**
   * Get serviceRequestStatus
   * @return serviceRequestStatus
   */
  @NotNull @Valid 
  @Schema(name = "serviceRequestStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceRequestStatus")
  public ServiceActionStatusEnumG getServiceRequestStatus() {
    return serviceRequestStatus;
  }

  public void setServiceRequestStatus(ServiceActionStatusEnumG serviceRequestStatus) {
    this.serviceRequestStatus = serviceRequestStatus;
  }

  public ServiceFeedback serviceRequestReference(VersionedReference serviceRequestReference) {
    this.serviceRequestReference = serviceRequestReference;
    return this;
  }

  /**
   * Get serviceRequestReference
   * @return serviceRequestReference
   */
  @NotNull @Valid 
  @Schema(name = "serviceRequestReference", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceRequestReference")
  public VersionedReference getServiceRequestReference() {
    return serviceRequestReference;
  }

  public void setServiceRequestReference(VersionedReference serviceRequestReference) {
    this.serviceRequestReference = serviceRequestReference;
  }

  public ServiceFeedback serviceProvider(Agent serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

  /**
   * Get serviceProvider
   * @return serviceProvider
   */
  @NotNull @Valid 
  @Schema(name = "serviceProvider", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceProvider")
  public Agent getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(Agent serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public ServiceFeedback serviceFeedbackExtensionG(Map<String, Object> serviceFeedbackExtensionG) {
    this.serviceFeedbackExtensionG = serviceFeedbackExtensionG;
    return this;
  }

  public ServiceFeedback putServiceFeedbackExtensionGItem(String key, Object serviceFeedbackExtensionGItem) {
    if (this.serviceFeedbackExtensionG == null) {
      this.serviceFeedbackExtensionG = new HashMap<>();
    }
    this.serviceFeedbackExtensionG.put(key, serviceFeedbackExtensionGItem);
    return this;
  }

  /**
   * Get serviceFeedbackExtensionG
   * @return serviceFeedbackExtensionG
   */
  
  @Schema(name = "serviceFeedbackExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceFeedbackExtensionG")
  public Map<String, Object> getServiceFeedbackExtensionG() {
    return serviceFeedbackExtensionG;
  }

  public void setServiceFeedbackExtensionG(Map<String, Object> serviceFeedbackExtensionG) {
    this.serviceFeedbackExtensionG = serviceFeedbackExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceFeedback serviceFeedback = (ServiceFeedback) o;
    return Objects.equals(this.serviceRequestFeedbackReason, serviceFeedback.serviceRequestFeedbackReason) &&
        Objects.equals(this.serviceRequestStatus, serviceFeedback.serviceRequestStatus) &&
        Objects.equals(this.serviceRequestReference, serviceFeedback.serviceRequestReference) &&
        Objects.equals(this.serviceProvider, serviceFeedback.serviceProvider) &&
        Objects.equals(this.serviceFeedbackExtensionG, serviceFeedback.serviceFeedbackExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRequestFeedbackReason, serviceRequestStatus, serviceRequestReference, serviceProvider, serviceFeedbackExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceFeedback {\n");
    sb.append("    serviceRequestFeedbackReason: ").append(toIndentedString(serviceRequestFeedbackReason)).append("\n");
    sb.append("    serviceRequestStatus: ").append(toIndentedString(serviceRequestStatus)).append("\n");
    sb.append("    serviceRequestReference: ").append(toIndentedString(serviceRequestReference)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    serviceFeedbackExtensionG: ").append(toIndentedString(serviceFeedbackExtensionG)).append("\n");
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

