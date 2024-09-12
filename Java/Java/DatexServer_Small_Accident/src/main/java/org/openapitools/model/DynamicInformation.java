package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.ExchangeStatusEnumG;
import org.openapitools.model.MultilingualString;
import org.openapitools.model.ReturnInformation;
import org.openapitools.model.SessionInformation;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DynamicInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DynamicInformation {

  private ExchangeStatusEnumG exchangeStatus;

  private MultilingualString exchangeStatusDescription;

  private Boolean completedPaylod;

  private Integer messageSequencingNumber;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime messageGenerationTimestamp;

  private ReturnInformation returnInformation;

  private SessionInformation sessionInformation;

  @Valid
  private Map<String, Object> dynamicInformationExtensionG = new HashMap<>();

  public DynamicInformation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DynamicInformation(ExchangeStatusEnumG exchangeStatus, OffsetDateTime messageGenerationTimestamp) {
    this.exchangeStatus = exchangeStatus;
    this.messageGenerationTimestamp = messageGenerationTimestamp;
  }

  public DynamicInformation exchangeStatus(ExchangeStatusEnumG exchangeStatus) {
    this.exchangeStatus = exchangeStatus;
    return this;
  }

  /**
   * Get exchangeStatus
   * @return exchangeStatus
   */
  @NotNull @Valid 
  @Schema(name = "exchangeStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exchangeStatus")
  public ExchangeStatusEnumG getExchangeStatus() {
    return exchangeStatus;
  }

  public void setExchangeStatus(ExchangeStatusEnumG exchangeStatus) {
    this.exchangeStatus = exchangeStatus;
  }

  public DynamicInformation exchangeStatusDescription(MultilingualString exchangeStatusDescription) {
    this.exchangeStatusDescription = exchangeStatusDescription;
    return this;
  }

  /**
   * Get exchangeStatusDescription
   * @return exchangeStatusDescription
   */
  @Valid 
  @Schema(name = "exchangeStatusDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangeStatusDescription")
  public MultilingualString getExchangeStatusDescription() {
    return exchangeStatusDescription;
  }

  public void setExchangeStatusDescription(MultilingualString exchangeStatusDescription) {
    this.exchangeStatusDescription = exchangeStatusDescription;
  }

  public DynamicInformation completedPaylod(Boolean completedPaylod) {
    this.completedPaylod = completedPaylod;
    return this;
  }

  /**
   * Get completedPaylod
   * @return completedPaylod
   */
  
  @Schema(name = "completedPaylod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedPaylod")
  public Boolean getCompletedPaylod() {
    return completedPaylod;
  }

  public void setCompletedPaylod(Boolean completedPaylod) {
    this.completedPaylod = completedPaylod;
  }

  public DynamicInformation messageSequencingNumber(Integer messageSequencingNumber) {
    this.messageSequencingNumber = messageSequencingNumber;
    return this;
  }

  /**
   * Get messageSequencingNumber
   * minimum: 0
   * @return messageSequencingNumber
   */
  @Min(0) 
  @Schema(name = "messageSequencingNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageSequencingNumber")
  public Integer getMessageSequencingNumber() {
    return messageSequencingNumber;
  }

  public void setMessageSequencingNumber(Integer messageSequencingNumber) {
    this.messageSequencingNumber = messageSequencingNumber;
  }

  public DynamicInformation messageGenerationTimestamp(OffsetDateTime messageGenerationTimestamp) {
    this.messageGenerationTimestamp = messageGenerationTimestamp;
    return this;
  }

  /**
   * Get messageGenerationTimestamp
   * @return messageGenerationTimestamp
   */
  @NotNull @Valid 
  @Schema(name = "messageGenerationTimestamp", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messageGenerationTimestamp")
  public OffsetDateTime getMessageGenerationTimestamp() {
    return messageGenerationTimestamp;
  }

  public void setMessageGenerationTimestamp(OffsetDateTime messageGenerationTimestamp) {
    this.messageGenerationTimestamp = messageGenerationTimestamp;
  }

  public DynamicInformation returnInformation(ReturnInformation returnInformation) {
    this.returnInformation = returnInformation;
    return this;
  }

  /**
   * Get returnInformation
   * @return returnInformation
   */
  @Valid 
  @Schema(name = "returnInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnInformation")
  public ReturnInformation getReturnInformation() {
    return returnInformation;
  }

  public void setReturnInformation(ReturnInformation returnInformation) {
    this.returnInformation = returnInformation;
  }

  public DynamicInformation sessionInformation(SessionInformation sessionInformation) {
    this.sessionInformation = sessionInformation;
    return this;
  }

  /**
   * Get sessionInformation
   * @return sessionInformation
   */
  @Valid 
  @Schema(name = "sessionInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionInformation")
  public SessionInformation getSessionInformation() {
    return sessionInformation;
  }

  public void setSessionInformation(SessionInformation sessionInformation) {
    this.sessionInformation = sessionInformation;
  }

  public DynamicInformation dynamicInformationExtensionG(Map<String, Object> dynamicInformationExtensionG) {
    this.dynamicInformationExtensionG = dynamicInformationExtensionG;
    return this;
  }

  public DynamicInformation putDynamicInformationExtensionGItem(String key, Object dynamicInformationExtensionGItem) {
    if (this.dynamicInformationExtensionG == null) {
      this.dynamicInformationExtensionG = new HashMap<>();
    }
    this.dynamicInformationExtensionG.put(key, dynamicInformationExtensionGItem);
    return this;
  }

  /**
   * Get dynamicInformationExtensionG
   * @return dynamicInformationExtensionG
   */
  
  @Schema(name = "dynamicInformationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dynamicInformationExtensionG")
  public Map<String, Object> getDynamicInformationExtensionG() {
    return dynamicInformationExtensionG;
  }

  public void setDynamicInformationExtensionG(Map<String, Object> dynamicInformationExtensionG) {
    this.dynamicInformationExtensionG = dynamicInformationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicInformation dynamicInformation = (DynamicInformation) o;
    return Objects.equals(this.exchangeStatus, dynamicInformation.exchangeStatus) &&
        Objects.equals(this.exchangeStatusDescription, dynamicInformation.exchangeStatusDescription) &&
        Objects.equals(this.completedPaylod, dynamicInformation.completedPaylod) &&
        Objects.equals(this.messageSequencingNumber, dynamicInformation.messageSequencingNumber) &&
        Objects.equals(this.messageGenerationTimestamp, dynamicInformation.messageGenerationTimestamp) &&
        Objects.equals(this.returnInformation, dynamicInformation.returnInformation) &&
        Objects.equals(this.sessionInformation, dynamicInformation.sessionInformation) &&
        Objects.equals(this.dynamicInformationExtensionG, dynamicInformation.dynamicInformationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeStatus, exchangeStatusDescription, completedPaylod, messageSequencingNumber, messageGenerationTimestamp, returnInformation, sessionInformation, dynamicInformationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicInformation {\n");
    sb.append("    exchangeStatus: ").append(toIndentedString(exchangeStatus)).append("\n");
    sb.append("    exchangeStatusDescription: ").append(toIndentedString(exchangeStatusDescription)).append("\n");
    sb.append("    completedPaylod: ").append(toIndentedString(completedPaylod)).append("\n");
    sb.append("    messageSequencingNumber: ").append(toIndentedString(messageSequencingNumber)).append("\n");
    sb.append("    messageGenerationTimestamp: ").append(toIndentedString(messageGenerationTimestamp)).append("\n");
    sb.append("    returnInformation: ").append(toIndentedString(returnInformation)).append("\n");
    sb.append("    sessionInformation: ").append(toIndentedString(sessionInformation)).append("\n");
    sb.append("    dynamicInformationExtensionG: ").append(toIndentedString(dynamicInformationExtensionG)).append("\n");
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

