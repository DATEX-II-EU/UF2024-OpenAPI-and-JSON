package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Reference;
import org.openapitools.model.Validity;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Subscription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Subscription {

  private String name;

  private Reference referenceID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime subscriptionStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime subscriptionEnd;

  private Integer deliveyFrequency;

  private Validity validity;

  @Valid
  private Map<String, Object> subscriptionExtensionG = new HashMap<>();

  public Subscription name(String name) {
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

  public Subscription referenceID(Reference referenceID) {
    this.referenceID = referenceID;
    return this;
  }

  /**
   * Get referenceID
   * @return referenceID
   */
  @Valid 
  @Schema(name = "referenceID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceID")
  public Reference getReferenceID() {
    return referenceID;
  }

  public void setReferenceID(Reference referenceID) {
    this.referenceID = referenceID;
  }

  public Subscription subscriptionStart(OffsetDateTime subscriptionStart) {
    this.subscriptionStart = subscriptionStart;
    return this;
  }

  /**
   * Get subscriptionStart
   * @return subscriptionStart
   */
  @Valid 
  @Schema(name = "subscriptionStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionStart")
  public OffsetDateTime getSubscriptionStart() {
    return subscriptionStart;
  }

  public void setSubscriptionStart(OffsetDateTime subscriptionStart) {
    this.subscriptionStart = subscriptionStart;
  }

  public Subscription subscriptionEnd(OffsetDateTime subscriptionEnd) {
    this.subscriptionEnd = subscriptionEnd;
    return this;
  }

  /**
   * Get subscriptionEnd
   * @return subscriptionEnd
   */
  @Valid 
  @Schema(name = "subscriptionEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionEnd")
  public OffsetDateTime getSubscriptionEnd() {
    return subscriptionEnd;
  }

  public void setSubscriptionEnd(OffsetDateTime subscriptionEnd) {
    this.subscriptionEnd = subscriptionEnd;
  }

  public Subscription deliveyFrequency(Integer deliveyFrequency) {
    this.deliveyFrequency = deliveyFrequency;
    return this;
  }

  /**
   * Get deliveyFrequency
   * minimum: 0
   * @return deliveyFrequency
   */
  @Min(0) 
  @Schema(name = "deliveyFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveyFrequency")
  public Integer getDeliveyFrequency() {
    return deliveyFrequency;
  }

  public void setDeliveyFrequency(Integer deliveyFrequency) {
    this.deliveyFrequency = deliveyFrequency;
  }

  public Subscription validity(Validity validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   * @return validity
   */
  @Valid 
  @Schema(name = "validity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validity")
  public Validity getValidity() {
    return validity;
  }

  public void setValidity(Validity validity) {
    this.validity = validity;
  }

  public Subscription subscriptionExtensionG(Map<String, Object> subscriptionExtensionG) {
    this.subscriptionExtensionG = subscriptionExtensionG;
    return this;
  }

  public Subscription putSubscriptionExtensionGItem(String key, Object subscriptionExtensionGItem) {
    if (this.subscriptionExtensionG == null) {
      this.subscriptionExtensionG = new HashMap<>();
    }
    this.subscriptionExtensionG.put(key, subscriptionExtensionGItem);
    return this;
  }

  /**
   * Get subscriptionExtensionG
   * @return subscriptionExtensionG
   */
  
  @Schema(name = "subscriptionExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionExtensionG")
  public Map<String, Object> getSubscriptionExtensionG() {
    return subscriptionExtensionG;
  }

  public void setSubscriptionExtensionG(Map<String, Object> subscriptionExtensionG) {
    this.subscriptionExtensionG = subscriptionExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.name, subscription.name) &&
        Objects.equals(this.referenceID, subscription.referenceID) &&
        Objects.equals(this.subscriptionStart, subscription.subscriptionStart) &&
        Objects.equals(this.subscriptionEnd, subscription.subscriptionEnd) &&
        Objects.equals(this.deliveyFrequency, subscription.deliveyFrequency) &&
        Objects.equals(this.validity, subscription.validity) &&
        Objects.equals(this.subscriptionExtensionG, subscription.subscriptionExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, referenceID, subscriptionStart, subscriptionEnd, deliveyFrequency, validity, subscriptionExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referenceID: ").append(toIndentedString(referenceID)).append("\n");
    sb.append("    subscriptionStart: ").append(toIndentedString(subscriptionStart)).append("\n");
    sb.append("    subscriptionEnd: ").append(toIndentedString(subscriptionEnd)).append("\n");
    sb.append("    deliveyFrequency: ").append(toIndentedString(deliveyFrequency)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    subscriptionExtensionG: ").append(toIndentedString(subscriptionExtensionG)).append("\n");
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

