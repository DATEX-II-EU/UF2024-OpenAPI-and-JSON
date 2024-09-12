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
import org.openapitools.model.Agent;
import org.openapitools.model.OperatingModeEnumG;
import org.openapitools.model.ProtocolTypeEnumG;
import org.openapitools.model.Subscription;
import org.openapitools.model.UpdateMethodEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ExchangeContext
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ExchangeContext {

  private ProtocolTypeEnumG codedExchangeProtocol;

  private String exchangeSpecificationVersion;

  private OperatingModeEnumG operatingMode;

  private UpdateMethodEnumG updateMethod;

  private String nonCodedExchangeProtocol;

  private Agent supplierOrCisRequester;

  @Valid
  private List<@Valid Agent> clientOrCisProvider = new ArrayList<>();

  private Subscription subscription;

  @Valid
  private Map<String, Object> exchangeContextExtensionG = new HashMap<>();

  public ExchangeContext() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExchangeContext(ProtocolTypeEnumG codedExchangeProtocol, String exchangeSpecificationVersion, Agent supplierOrCisRequester) {
    this.codedExchangeProtocol = codedExchangeProtocol;
    this.exchangeSpecificationVersion = exchangeSpecificationVersion;
    this.supplierOrCisRequester = supplierOrCisRequester;
  }

  public ExchangeContext codedExchangeProtocol(ProtocolTypeEnumG codedExchangeProtocol) {
    this.codedExchangeProtocol = codedExchangeProtocol;
    return this;
  }

  /**
   * Get codedExchangeProtocol
   * @return codedExchangeProtocol
   */
  @NotNull @Valid 
  @Schema(name = "codedExchangeProtocol", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("codedExchangeProtocol")
  public ProtocolTypeEnumG getCodedExchangeProtocol() {
    return codedExchangeProtocol;
  }

  public void setCodedExchangeProtocol(ProtocolTypeEnumG codedExchangeProtocol) {
    this.codedExchangeProtocol = codedExchangeProtocol;
  }

  public ExchangeContext exchangeSpecificationVersion(String exchangeSpecificationVersion) {
    this.exchangeSpecificationVersion = exchangeSpecificationVersion;
    return this;
  }

  /**
   * Get exchangeSpecificationVersion
   * @return exchangeSpecificationVersion
   */
  @NotNull @Size(max = 1024) 
  @Schema(name = "exchangeSpecificationVersion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exchangeSpecificationVersion")
  public String getExchangeSpecificationVersion() {
    return exchangeSpecificationVersion;
  }

  public void setExchangeSpecificationVersion(String exchangeSpecificationVersion) {
    this.exchangeSpecificationVersion = exchangeSpecificationVersion;
  }

  public ExchangeContext operatingMode(OperatingModeEnumG operatingMode) {
    this.operatingMode = operatingMode;
    return this;
  }

  /**
   * Get operatingMode
   * @return operatingMode
   */
  @Valid 
  @Schema(name = "operatingMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatingMode")
  public OperatingModeEnumG getOperatingMode() {
    return operatingMode;
  }

  public void setOperatingMode(OperatingModeEnumG operatingMode) {
    this.operatingMode = operatingMode;
  }

  public ExchangeContext updateMethod(UpdateMethodEnumG updateMethod) {
    this.updateMethod = updateMethod;
    return this;
  }

  /**
   * Get updateMethod
   * @return updateMethod
   */
  @Valid 
  @Schema(name = "updateMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateMethod")
  public UpdateMethodEnumG getUpdateMethod() {
    return updateMethod;
  }

  public void setUpdateMethod(UpdateMethodEnumG updateMethod) {
    this.updateMethod = updateMethod;
  }

  public ExchangeContext nonCodedExchangeProtocol(String nonCodedExchangeProtocol) {
    this.nonCodedExchangeProtocol = nonCodedExchangeProtocol;
    return this;
  }

  /**
   * Get nonCodedExchangeProtocol
   * @return nonCodedExchangeProtocol
   */
  @Size(max = 1024) 
  @Schema(name = "nonCodedExchangeProtocol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nonCodedExchangeProtocol")
  public String getNonCodedExchangeProtocol() {
    return nonCodedExchangeProtocol;
  }

  public void setNonCodedExchangeProtocol(String nonCodedExchangeProtocol) {
    this.nonCodedExchangeProtocol = nonCodedExchangeProtocol;
  }

  public ExchangeContext supplierOrCisRequester(Agent supplierOrCisRequester) {
    this.supplierOrCisRequester = supplierOrCisRequester;
    return this;
  }

  /**
   * Get supplierOrCisRequester
   * @return supplierOrCisRequester
   */
  @NotNull @Valid 
  @Schema(name = "supplierOrCisRequester", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("supplierOrCisRequester")
  public Agent getSupplierOrCisRequester() {
    return supplierOrCisRequester;
  }

  public void setSupplierOrCisRequester(Agent supplierOrCisRequester) {
    this.supplierOrCisRequester = supplierOrCisRequester;
  }

  public ExchangeContext clientOrCisProvider(List<@Valid Agent> clientOrCisProvider) {
    this.clientOrCisProvider = clientOrCisProvider;
    return this;
  }

  public ExchangeContext addClientOrCisProviderItem(Agent clientOrCisProviderItem) {
    if (this.clientOrCisProvider == null) {
      this.clientOrCisProvider = new ArrayList<>();
    }
    this.clientOrCisProvider.add(clientOrCisProviderItem);
    return this;
  }

  /**
   * Get clientOrCisProvider
   * @return clientOrCisProvider
   */
  @Valid @Size(min = 0) 
  @Schema(name = "clientOrCisProvider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientOrCisProvider")
  public List<@Valid Agent> getClientOrCisProvider() {
    return clientOrCisProvider;
  }

  public void setClientOrCisProvider(List<@Valid Agent> clientOrCisProvider) {
    this.clientOrCisProvider = clientOrCisProvider;
  }

  public ExchangeContext subscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * Get subscription
   * @return subscription
   */
  @Valid 
  @Schema(name = "subscription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscription")
  public Subscription getSubscription() {
    return subscription;
  }

  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  public ExchangeContext exchangeContextExtensionG(Map<String, Object> exchangeContextExtensionG) {
    this.exchangeContextExtensionG = exchangeContextExtensionG;
    return this;
  }

  public ExchangeContext putExchangeContextExtensionGItem(String key, Object exchangeContextExtensionGItem) {
    if (this.exchangeContextExtensionG == null) {
      this.exchangeContextExtensionG = new HashMap<>();
    }
    this.exchangeContextExtensionG.put(key, exchangeContextExtensionGItem);
    return this;
  }

  /**
   * Get exchangeContextExtensionG
   * @return exchangeContextExtensionG
   */
  
  @Schema(name = "exchangeContextExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangeContextExtensionG")
  public Map<String, Object> getExchangeContextExtensionG() {
    return exchangeContextExtensionG;
  }

  public void setExchangeContextExtensionG(Map<String, Object> exchangeContextExtensionG) {
    this.exchangeContextExtensionG = exchangeContextExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeContext exchangeContext = (ExchangeContext) o;
    return Objects.equals(this.codedExchangeProtocol, exchangeContext.codedExchangeProtocol) &&
        Objects.equals(this.exchangeSpecificationVersion, exchangeContext.exchangeSpecificationVersion) &&
        Objects.equals(this.operatingMode, exchangeContext.operatingMode) &&
        Objects.equals(this.updateMethod, exchangeContext.updateMethod) &&
        Objects.equals(this.nonCodedExchangeProtocol, exchangeContext.nonCodedExchangeProtocol) &&
        Objects.equals(this.supplierOrCisRequester, exchangeContext.supplierOrCisRequester) &&
        Objects.equals(this.clientOrCisProvider, exchangeContext.clientOrCisProvider) &&
        Objects.equals(this.subscription, exchangeContext.subscription) &&
        Objects.equals(this.exchangeContextExtensionG, exchangeContext.exchangeContextExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codedExchangeProtocol, exchangeSpecificationVersion, operatingMode, updateMethod, nonCodedExchangeProtocol, supplierOrCisRequester, clientOrCisProvider, subscription, exchangeContextExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeContext {\n");
    sb.append("    codedExchangeProtocol: ").append(toIndentedString(codedExchangeProtocol)).append("\n");
    sb.append("    exchangeSpecificationVersion: ").append(toIndentedString(exchangeSpecificationVersion)).append("\n");
    sb.append("    operatingMode: ").append(toIndentedString(operatingMode)).append("\n");
    sb.append("    updateMethod: ").append(toIndentedString(updateMethod)).append("\n");
    sb.append("    nonCodedExchangeProtocol: ").append(toIndentedString(nonCodedExchangeProtocol)).append("\n");
    sb.append("    supplierOrCisRequester: ").append(toIndentedString(supplierOrCisRequester)).append("\n");
    sb.append("    clientOrCisProvider: ").append(toIndentedString(clientOrCisProvider)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    exchangeContextExtensionG: ").append(toIndentedString(exchangeContextExtensionG)).append("\n");
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

