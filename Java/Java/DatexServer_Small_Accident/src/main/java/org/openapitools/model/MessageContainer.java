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
import org.openapitools.model.CISInformation;
import org.openapitools.model.ExchangeInformation;
import org.openapitools.model.InformationManagement;
import org.openapitools.model.PayloadPublicationG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MessageContainer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MessageContainer {

  @Valid
  private List<@Valid PayloadPublicationG> payload = new ArrayList<>();

  private CISInformation cisInformation;

  private ExchangeInformation exchangeInformation;

  private InformationManagement informationManagement;

  @Valid
  private Map<String, Object> messageContainerExtensionG = new HashMap<>();

  public MessageContainer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MessageContainer(ExchangeInformation exchangeInformation) {
    this.exchangeInformation = exchangeInformation;
  }

  public MessageContainer payload(List<@Valid PayloadPublicationG> payload) {
    this.payload = payload;
    return this;
  }

  public MessageContainer addPayloadItem(PayloadPublicationG payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<>();
    }
    this.payload.add(payloadItem);
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @Valid @Size(min = 0) 
  @Schema(name = "payload", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payload")
  public List<@Valid PayloadPublicationG> getPayload() {
    return payload;
  }

  public void setPayload(List<@Valid PayloadPublicationG> payload) {
    this.payload = payload;
  }

  public MessageContainer cisInformation(CISInformation cisInformation) {
    this.cisInformation = cisInformation;
    return this;
  }

  /**
   * Get cisInformation
   * @return cisInformation
   */
  @Valid 
  @Schema(name = "cisInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cisInformation")
  public CISInformation getCisInformation() {
    return cisInformation;
  }

  public void setCisInformation(CISInformation cisInformation) {
    this.cisInformation = cisInformation;
  }

  public MessageContainer exchangeInformation(ExchangeInformation exchangeInformation) {
    this.exchangeInformation = exchangeInformation;
    return this;
  }

  /**
   * Get exchangeInformation
   * @return exchangeInformation
   */
  @NotNull @Valid 
  @Schema(name = "exchangeInformation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exchangeInformation")
  public ExchangeInformation getExchangeInformation() {
    return exchangeInformation;
  }

  public void setExchangeInformation(ExchangeInformation exchangeInformation) {
    this.exchangeInformation = exchangeInformation;
  }

  public MessageContainer informationManagement(InformationManagement informationManagement) {
    this.informationManagement = informationManagement;
    return this;
  }

  /**
   * Get informationManagement
   * @return informationManagement
   */
  @Valid 
  @Schema(name = "informationManagement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("informationManagement")
  public InformationManagement getInformationManagement() {
    return informationManagement;
  }

  public void setInformationManagement(InformationManagement informationManagement) {
    this.informationManagement = informationManagement;
  }

  public MessageContainer messageContainerExtensionG(Map<String, Object> messageContainerExtensionG) {
    this.messageContainerExtensionG = messageContainerExtensionG;
    return this;
  }

  public MessageContainer putMessageContainerExtensionGItem(String key, Object messageContainerExtensionGItem) {
    if (this.messageContainerExtensionG == null) {
      this.messageContainerExtensionG = new HashMap<>();
    }
    this.messageContainerExtensionG.put(key, messageContainerExtensionGItem);
    return this;
  }

  /**
   * Get messageContainerExtensionG
   * @return messageContainerExtensionG
   */
  
  @Schema(name = "messageContainerExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageContainerExtensionG")
  public Map<String, Object> getMessageContainerExtensionG() {
    return messageContainerExtensionG;
  }

  public void setMessageContainerExtensionG(Map<String, Object> messageContainerExtensionG) {
    this.messageContainerExtensionG = messageContainerExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContainer messageContainer = (MessageContainer) o;
    return Objects.equals(this.payload, messageContainer.payload) &&
        Objects.equals(this.cisInformation, messageContainer.cisInformation) &&
        Objects.equals(this.exchangeInformation, messageContainer.exchangeInformation) &&
        Objects.equals(this.informationManagement, messageContainer.informationManagement) &&
        Objects.equals(this.messageContainerExtensionG, messageContainer.messageContainerExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, cisInformation, exchangeInformation, informationManagement, messageContainerExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContainer {\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    cisInformation: ").append(toIndentedString(cisInformation)).append("\n");
    sb.append("    exchangeInformation: ").append(toIndentedString(exchangeInformation)).append("\n");
    sb.append("    informationManagement: ").append(toIndentedString(informationManagement)).append("\n");
    sb.append("    messageContainerExtensionG: ").append(toIndentedString(messageContainerExtensionG)).append("\n");
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

