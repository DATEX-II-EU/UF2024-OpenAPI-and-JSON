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
import org.openapitools.model.ServiceFeedback;
import org.openapitools.model.ServiceRequest;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CISInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CISInformation {

  @Valid
  private List<@Valid ServiceFeedback> serviceFeedback = new ArrayList<>();

  @Valid
  private List<@Valid ServiceRequest> serviceRequest = new ArrayList<>();

  @Valid
  private Map<String, Object> cisInformationExtensionG = new HashMap<>();

  public CISInformation serviceFeedback(List<@Valid ServiceFeedback> serviceFeedback) {
    this.serviceFeedback = serviceFeedback;
    return this;
  }

  public CISInformation addServiceFeedbackItem(ServiceFeedback serviceFeedbackItem) {
    if (this.serviceFeedback == null) {
      this.serviceFeedback = new ArrayList<>();
    }
    this.serviceFeedback.add(serviceFeedbackItem);
    return this;
  }

  /**
   * Get serviceFeedback
   * @return serviceFeedback
   */
  @Valid @Size(min = 0) 
  @Schema(name = "serviceFeedback", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceFeedback")
  public List<@Valid ServiceFeedback> getServiceFeedback() {
    return serviceFeedback;
  }

  public void setServiceFeedback(List<@Valid ServiceFeedback> serviceFeedback) {
    this.serviceFeedback = serviceFeedback;
  }

  public CISInformation serviceRequest(List<@Valid ServiceRequest> serviceRequest) {
    this.serviceRequest = serviceRequest;
    return this;
  }

  public CISInformation addServiceRequestItem(ServiceRequest serviceRequestItem) {
    if (this.serviceRequest == null) {
      this.serviceRequest = new ArrayList<>();
    }
    this.serviceRequest.add(serviceRequestItem);
    return this;
  }

  /**
   * Get serviceRequest
   * @return serviceRequest
   */
  @Valid @Size(min = 0) 
  @Schema(name = "serviceRequest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceRequest")
  public List<@Valid ServiceRequest> getServiceRequest() {
    return serviceRequest;
  }

  public void setServiceRequest(List<@Valid ServiceRequest> serviceRequest) {
    this.serviceRequest = serviceRequest;
  }

  public CISInformation cisInformationExtensionG(Map<String, Object> cisInformationExtensionG) {
    this.cisInformationExtensionG = cisInformationExtensionG;
    return this;
  }

  public CISInformation putCisInformationExtensionGItem(String key, Object cisInformationExtensionGItem) {
    if (this.cisInformationExtensionG == null) {
      this.cisInformationExtensionG = new HashMap<>();
    }
    this.cisInformationExtensionG.put(key, cisInformationExtensionGItem);
    return this;
  }

  /**
   * Get cisInformationExtensionG
   * @return cisInformationExtensionG
   */
  
  @Schema(name = "cisInformationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cisInformationExtensionG")
  public Map<String, Object> getCisInformationExtensionG() {
    return cisInformationExtensionG;
  }

  public void setCisInformationExtensionG(Map<String, Object> cisInformationExtensionG) {
    this.cisInformationExtensionG = cisInformationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CISInformation ciSInformation = (CISInformation) o;
    return Objects.equals(this.serviceFeedback, ciSInformation.serviceFeedback) &&
        Objects.equals(this.serviceRequest, ciSInformation.serviceRequest) &&
        Objects.equals(this.cisInformationExtensionG, ciSInformation.cisInformationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFeedback, serviceRequest, cisInformationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CISInformation {\n");
    sb.append("    serviceFeedback: ").append(toIndentedString(serviceFeedback)).append("\n");
    sb.append("    serviceRequest: ").append(toIndentedString(serviceRequest)).append("\n");
    sb.append("    cisInformationExtensionG: ").append(toIndentedString(cisInformationExtensionG)).append("\n");
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

