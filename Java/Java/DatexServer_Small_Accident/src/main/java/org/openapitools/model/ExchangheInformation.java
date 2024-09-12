package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.DynamicInformation;
import org.openapitools.model.ExchangeContext;
import org.openapitools.model.MessageTypeEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ExchangheInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ExchangheInformation {

  private MessageTypeEnumG messageType;

  private ExchangeContext exchangeContext;

  private DynamicInformation dynamicInformation;

  @Valid
  private Map<String, Object> exchangeInformationExtensionG = new HashMap<>();

  public ExchangheInformation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExchangheInformation(ExchangeContext exchangeContext, DynamicInformation dynamicInformation) {
    this.exchangeContext = exchangeContext;
    this.dynamicInformation = dynamicInformation;
  }

  public ExchangheInformation messageType(MessageTypeEnumG messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * Get messageType
   * @return messageType
   */
  @Valid 
  @Schema(name = "messageType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageType")
  public MessageTypeEnumG getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnumG messageType) {
    this.messageType = messageType;
  }

  public ExchangheInformation exchangeContext(ExchangeContext exchangeContext) {
    this.exchangeContext = exchangeContext;
    return this;
  }

  /**
   * Get exchangeContext
   * @return exchangeContext
   */
  @NotNull @Valid 
  @Schema(name = "exchangeContext", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exchangeContext")
  public ExchangeContext getExchangeContext() {
    return exchangeContext;
  }

  public void setExchangeContext(ExchangeContext exchangeContext) {
    this.exchangeContext = exchangeContext;
  }

  public ExchangheInformation dynamicInformation(DynamicInformation dynamicInformation) {
    this.dynamicInformation = dynamicInformation;
    return this;
  }

  /**
   * Get dynamicInformation
   * @return dynamicInformation
   */
  @NotNull @Valid 
  @Schema(name = "dynamicInformation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dynamicInformation")
  public DynamicInformation getDynamicInformation() {
    return dynamicInformation;
  }

  public void setDynamicInformation(DynamicInformation dynamicInformation) {
    this.dynamicInformation = dynamicInformation;
  }

  public ExchangheInformation exchangeInformationExtensionG(Map<String, Object> exchangeInformationExtensionG) {
    this.exchangeInformationExtensionG = exchangeInformationExtensionG;
    return this;
  }

  public ExchangheInformation putExchangeInformationExtensionGItem(String key, Object exchangeInformationExtensionGItem) {
    if (this.exchangeInformationExtensionG == null) {
      this.exchangeInformationExtensionG = new HashMap<>();
    }
    this.exchangeInformationExtensionG.put(key, exchangeInformationExtensionGItem);
    return this;
  }

  /**
   * Get exchangeInformationExtensionG
   * @return exchangeInformationExtensionG
   */
  
  @Schema(name = "exchangeInformationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangeInformationExtensionG")
  public Map<String, Object> getExchangeInformationExtensionG() {
    return exchangeInformationExtensionG;
  }

  public void setExchangeInformationExtensionG(Map<String, Object> exchangeInformationExtensionG) {
    this.exchangeInformationExtensionG = exchangeInformationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangheInformation exchangheInformation = (ExchangheInformation) o;
    return Objects.equals(this.messageType, exchangheInformation.messageType) &&
        Objects.equals(this.exchangeContext, exchangheInformation.exchangeContext) &&
        Objects.equals(this.dynamicInformation, exchangheInformation.dynamicInformation) &&
        Objects.equals(this.exchangeInformationExtensionG, exchangheInformation.exchangeInformationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageType, exchangeContext, dynamicInformation, exchangeInformationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangheInformation {\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    exchangeContext: ").append(toIndentedString(exchangeContext)).append("\n");
    sb.append("    dynamicInformation: ").append(toIndentedString(dynamicInformation)).append("\n");
    sb.append("    exchangeInformationExtensionG: ").append(toIndentedString(exchangeInformationExtensionG)).append("\n");
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

