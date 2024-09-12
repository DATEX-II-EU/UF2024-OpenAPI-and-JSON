package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Agent;
import org.openapitools.model.PredefinedServiceEnumG;
import org.openapitools.model.Reference;
import org.openapitools.model.ServiceActionEnumG;
import org.openapitools.model.ServiceRequestCondition;
import org.openapitools.model.VersionedReference;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ServiceRequest {

  private String idG;

  private String versionG;

  private Reference elementToProcessReference;

  private VersionedReference elementToProcessVersionedReference;

  private VersionedReference expiryTime;

  private String externalReference;

  private String notPredefinedServiceName;

  private PredefinedServiceEnumG predefinedService;

  private ServiceActionEnumG requestedAction;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime servicerRequestCreationTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime servicerRequestVersionTime;

  private String customServiceParameter;

  private Agent serviceRequester;

  @Valid
  private List<@Valid Agent> serviceProvider = new ArrayList<>();

  private ServiceRequestCondition serviceRequestCondition;

  @Valid
  private Map<String, Object> serviceRequestExtensionG = new HashMap<>();

  public ServiceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceRequest(String idG, String versionG, PredefinedServiceEnumG predefinedService, ServiceActionEnumG requestedAction, OffsetDateTime servicerRequestCreationTime, OffsetDateTime servicerRequestVersionTime, Agent serviceRequester, List<@Valid Agent> serviceProvider) {
    this.idG = idG;
    this.versionG = versionG;
    this.predefinedService = predefinedService;
    this.requestedAction = requestedAction;
    this.servicerRequestCreationTime = servicerRequestCreationTime;
    this.servicerRequestVersionTime = servicerRequestVersionTime;
    this.serviceRequester = serviceRequester;
    this.serviceProvider = serviceProvider;
  }

  public ServiceRequest idG(String idG) {
    this.idG = idG;
    return this;
  }

  /**
   * Get idG
   * @return idG
   */
  @NotNull 
  @Schema(name = "idG", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idG")
  public String getIdG() {
    return idG;
  }

  public void setIdG(String idG) {
    this.idG = idG;
  }

  public ServiceRequest versionG(String versionG) {
    this.versionG = versionG;
    return this;
  }

  /**
   * Get versionG
   * @return versionG
   */
  @NotNull 
  @Schema(name = "versionG", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("versionG")
  public String getVersionG() {
    return versionG;
  }

  public void setVersionG(String versionG) {
    this.versionG = versionG;
  }

  public ServiceRequest elementToProcessReference(Reference elementToProcessReference) {
    this.elementToProcessReference = elementToProcessReference;
    return this;
  }

  /**
   * Get elementToProcessReference
   * @return elementToProcessReference
   */
  @Valid 
  @Schema(name = "elementToProcessReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementToProcessReference")
  public Reference getElementToProcessReference() {
    return elementToProcessReference;
  }

  public void setElementToProcessReference(Reference elementToProcessReference) {
    this.elementToProcessReference = elementToProcessReference;
  }

  public ServiceRequest elementToProcessVersionedReference(VersionedReference elementToProcessVersionedReference) {
    this.elementToProcessVersionedReference = elementToProcessVersionedReference;
    return this;
  }

  /**
   * Get elementToProcessVersionedReference
   * @return elementToProcessVersionedReference
   */
  @Valid 
  @Schema(name = "elementToProcessVersionedReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementToProcessVersionedReference")
  public VersionedReference getElementToProcessVersionedReference() {
    return elementToProcessVersionedReference;
  }

  public void setElementToProcessVersionedReference(VersionedReference elementToProcessVersionedReference) {
    this.elementToProcessVersionedReference = elementToProcessVersionedReference;
  }

  public ServiceRequest expiryTime(VersionedReference expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  /**
   * Get expiryTime
   * @return expiryTime
   */
  @Valid 
  @Schema(name = "expiryTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiryTime")
  public VersionedReference getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(VersionedReference expiryTime) {
    this.expiryTime = expiryTime;
  }

  public ServiceRequest externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * Get externalReference
   * @return externalReference
   */
  @Size(max = 1024) 
  @Schema(name = "externalReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalReference")
  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public ServiceRequest notPredefinedServiceName(String notPredefinedServiceName) {
    this.notPredefinedServiceName = notPredefinedServiceName;
    return this;
  }

  /**
   * Get notPredefinedServiceName
   * @return notPredefinedServiceName
   */
  @Size(max = 1024) 
  @Schema(name = "notPredefinedServiceName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notPredefinedServiceName")
  public String getNotPredefinedServiceName() {
    return notPredefinedServiceName;
  }

  public void setNotPredefinedServiceName(String notPredefinedServiceName) {
    this.notPredefinedServiceName = notPredefinedServiceName;
  }

  public ServiceRequest predefinedService(PredefinedServiceEnumG predefinedService) {
    this.predefinedService = predefinedService;
    return this;
  }

  /**
   * Get predefinedService
   * @return predefinedService
   */
  @NotNull @Valid 
  @Schema(name = "predefinedService", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("predefinedService")
  public PredefinedServiceEnumG getPredefinedService() {
    return predefinedService;
  }

  public void setPredefinedService(PredefinedServiceEnumG predefinedService) {
    this.predefinedService = predefinedService;
  }

  public ServiceRequest requestedAction(ServiceActionEnumG requestedAction) {
    this.requestedAction = requestedAction;
    return this;
  }

  /**
   * Get requestedAction
   * @return requestedAction
   */
  @NotNull @Valid 
  @Schema(name = "requestedAction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestedAction")
  public ServiceActionEnumG getRequestedAction() {
    return requestedAction;
  }

  public void setRequestedAction(ServiceActionEnumG requestedAction) {
    this.requestedAction = requestedAction;
  }

  public ServiceRequest servicerRequestCreationTime(OffsetDateTime servicerRequestCreationTime) {
    this.servicerRequestCreationTime = servicerRequestCreationTime;
    return this;
  }

  /**
   * Get servicerRequestCreationTime
   * @return servicerRequestCreationTime
   */
  @NotNull @Valid 
  @Schema(name = "servicerRequestCreationTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("servicerRequestCreationTime")
  public OffsetDateTime getServicerRequestCreationTime() {
    return servicerRequestCreationTime;
  }

  public void setServicerRequestCreationTime(OffsetDateTime servicerRequestCreationTime) {
    this.servicerRequestCreationTime = servicerRequestCreationTime;
  }

  public ServiceRequest servicerRequestVersionTime(OffsetDateTime servicerRequestVersionTime) {
    this.servicerRequestVersionTime = servicerRequestVersionTime;
    return this;
  }

  /**
   * Get servicerRequestVersionTime
   * @return servicerRequestVersionTime
   */
  @NotNull @Valid 
  @Schema(name = "servicerRequestVersionTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("servicerRequestVersionTime")
  public OffsetDateTime getServicerRequestVersionTime() {
    return servicerRequestVersionTime;
  }

  public void setServicerRequestVersionTime(OffsetDateTime servicerRequestVersionTime) {
    this.servicerRequestVersionTime = servicerRequestVersionTime;
  }

  public ServiceRequest customServiceParameter(String customServiceParameter) {
    this.customServiceParameter = customServiceParameter;
    return this;
  }

  /**
   * Get customServiceParameter
   * @return customServiceParameter
   */
  @Size(max = 1024) 
  @Schema(name = "customServiceParameter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customServiceParameter")
  public String getCustomServiceParameter() {
    return customServiceParameter;
  }

  public void setCustomServiceParameter(String customServiceParameter) {
    this.customServiceParameter = customServiceParameter;
  }

  public ServiceRequest serviceRequester(Agent serviceRequester) {
    this.serviceRequester = serviceRequester;
    return this;
  }

  /**
   * Get serviceRequester
   * @return serviceRequester
   */
  @NotNull @Valid 
  @Schema(name = "serviceRequester", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceRequester")
  public Agent getServiceRequester() {
    return serviceRequester;
  }

  public void setServiceRequester(Agent serviceRequester) {
    this.serviceRequester = serviceRequester;
  }

  public ServiceRequest serviceProvider(List<@Valid Agent> serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

  public ServiceRequest addServiceProviderItem(Agent serviceProviderItem) {
    if (this.serviceProvider == null) {
      this.serviceProvider = new ArrayList<>();
    }
    this.serviceProvider.add(serviceProviderItem);
    return this;
  }

  /**
   * Get serviceProvider
   * @return serviceProvider
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "serviceProvider", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceProvider")
  public List<@Valid Agent> getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(List<@Valid Agent> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public ServiceRequest serviceRequestCondition(ServiceRequestCondition serviceRequestCondition) {
    this.serviceRequestCondition = serviceRequestCondition;
    return this;
  }

  /**
   * Get serviceRequestCondition
   * @return serviceRequestCondition
   */
  @Valid 
  @Schema(name = "serviceRequestCondition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceRequestCondition")
  public ServiceRequestCondition getServiceRequestCondition() {
    return serviceRequestCondition;
  }

  public void setServiceRequestCondition(ServiceRequestCondition serviceRequestCondition) {
    this.serviceRequestCondition = serviceRequestCondition;
  }

  public ServiceRequest serviceRequestExtensionG(Map<String, Object> serviceRequestExtensionG) {
    this.serviceRequestExtensionG = serviceRequestExtensionG;
    return this;
  }

  public ServiceRequest putServiceRequestExtensionGItem(String key, Object serviceRequestExtensionGItem) {
    if (this.serviceRequestExtensionG == null) {
      this.serviceRequestExtensionG = new HashMap<>();
    }
    this.serviceRequestExtensionG.put(key, serviceRequestExtensionGItem);
    return this;
  }

  /**
   * Get serviceRequestExtensionG
   * @return serviceRequestExtensionG
   */
  
  @Schema(name = "serviceRequestExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceRequestExtensionG")
  public Map<String, Object> getServiceRequestExtensionG() {
    return serviceRequestExtensionG;
  }

  public void setServiceRequestExtensionG(Map<String, Object> serviceRequestExtensionG) {
    this.serviceRequestExtensionG = serviceRequestExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRequest serviceRequest = (ServiceRequest) o;
    return Objects.equals(this.idG, serviceRequest.idG) &&
        Objects.equals(this.versionG, serviceRequest.versionG) &&
        Objects.equals(this.elementToProcessReference, serviceRequest.elementToProcessReference) &&
        Objects.equals(this.elementToProcessVersionedReference, serviceRequest.elementToProcessVersionedReference) &&
        Objects.equals(this.expiryTime, serviceRequest.expiryTime) &&
        Objects.equals(this.externalReference, serviceRequest.externalReference) &&
        Objects.equals(this.notPredefinedServiceName, serviceRequest.notPredefinedServiceName) &&
        Objects.equals(this.predefinedService, serviceRequest.predefinedService) &&
        Objects.equals(this.requestedAction, serviceRequest.requestedAction) &&
        Objects.equals(this.servicerRequestCreationTime, serviceRequest.servicerRequestCreationTime) &&
        Objects.equals(this.servicerRequestVersionTime, serviceRequest.servicerRequestVersionTime) &&
        Objects.equals(this.customServiceParameter, serviceRequest.customServiceParameter) &&
        Objects.equals(this.serviceRequester, serviceRequest.serviceRequester) &&
        Objects.equals(this.serviceProvider, serviceRequest.serviceProvider) &&
        Objects.equals(this.serviceRequestCondition, serviceRequest.serviceRequestCondition) &&
        Objects.equals(this.serviceRequestExtensionG, serviceRequest.serviceRequestExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idG, versionG, elementToProcessReference, elementToProcessVersionedReference, expiryTime, externalReference, notPredefinedServiceName, predefinedService, requestedAction, servicerRequestCreationTime, servicerRequestVersionTime, customServiceParameter, serviceRequester, serviceProvider, serviceRequestCondition, serviceRequestExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRequest {\n");
    sb.append("    idG: ").append(toIndentedString(idG)).append("\n");
    sb.append("    versionG: ").append(toIndentedString(versionG)).append("\n");
    sb.append("    elementToProcessReference: ").append(toIndentedString(elementToProcessReference)).append("\n");
    sb.append("    elementToProcessVersionedReference: ").append(toIndentedString(elementToProcessVersionedReference)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    notPredefinedServiceName: ").append(toIndentedString(notPredefinedServiceName)).append("\n");
    sb.append("    predefinedService: ").append(toIndentedString(predefinedService)).append("\n");
    sb.append("    requestedAction: ").append(toIndentedString(requestedAction)).append("\n");
    sb.append("    servicerRequestCreationTime: ").append(toIndentedString(servicerRequestCreationTime)).append("\n");
    sb.append("    servicerRequestVersionTime: ").append(toIndentedString(servicerRequestVersionTime)).append("\n");
    sb.append("    customServiceParameter: ").append(toIndentedString(customServiceParameter)).append("\n");
    sb.append("    serviceRequester: ").append(toIndentedString(serviceRequester)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    serviceRequestCondition: ").append(toIndentedString(serviceRequestCondition)).append("\n");
    sb.append("    serviceRequestExtensionG: ").append(toIndentedString(serviceRequestExtensionG)).append("\n");
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

