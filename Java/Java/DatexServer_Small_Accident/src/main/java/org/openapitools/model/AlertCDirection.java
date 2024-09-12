package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AlertCDirectionEnumG;
import org.openapitools.model.LinearDirectionEnumG;
import org.openapitools.model.MultilingualString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlertCDirection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AlertCDirection {

  private AlertCDirectionEnumG alertCDirectionCoded;

  private MultilingualString alertCDirectionNamed;

  private LinearDirectionEnumG alertCAffectedDirection;

  @Valid
  private Map<String, Object> alertCDirectionExtensionG = new HashMap<>();

  public AlertCDirection() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlertCDirection(AlertCDirectionEnumG alertCDirectionCoded, LinearDirectionEnumG alertCAffectedDirection) {
    this.alertCDirectionCoded = alertCDirectionCoded;
    this.alertCAffectedDirection = alertCAffectedDirection;
  }

  public AlertCDirection alertCDirectionCoded(AlertCDirectionEnumG alertCDirectionCoded) {
    this.alertCDirectionCoded = alertCDirectionCoded;
    return this;
  }

  /**
   * Get alertCDirectionCoded
   * @return alertCDirectionCoded
   */
  @NotNull @Valid 
  @Schema(name = "alertCDirectionCoded", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCDirectionCoded")
  public AlertCDirectionEnumG getAlertCDirectionCoded() {
    return alertCDirectionCoded;
  }

  public void setAlertCDirectionCoded(AlertCDirectionEnumG alertCDirectionCoded) {
    this.alertCDirectionCoded = alertCDirectionCoded;
  }

  public AlertCDirection alertCDirectionNamed(MultilingualString alertCDirectionNamed) {
    this.alertCDirectionNamed = alertCDirectionNamed;
    return this;
  }

  /**
   * Get alertCDirectionNamed
   * @return alertCDirectionNamed
   */
  @Valid 
  @Schema(name = "alertCDirectionNamed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCDirectionNamed")
  public MultilingualString getAlertCDirectionNamed() {
    return alertCDirectionNamed;
  }

  public void setAlertCDirectionNamed(MultilingualString alertCDirectionNamed) {
    this.alertCDirectionNamed = alertCDirectionNamed;
  }

  public AlertCDirection alertCAffectedDirection(LinearDirectionEnumG alertCAffectedDirection) {
    this.alertCAffectedDirection = alertCAffectedDirection;
    return this;
  }

  /**
   * Get alertCAffectedDirection
   * @return alertCAffectedDirection
   */
  @NotNull @Valid 
  @Schema(name = "alertCAffectedDirection", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alertCAffectedDirection")
  public LinearDirectionEnumG getAlertCAffectedDirection() {
    return alertCAffectedDirection;
  }

  public void setAlertCAffectedDirection(LinearDirectionEnumG alertCAffectedDirection) {
    this.alertCAffectedDirection = alertCAffectedDirection;
  }

  public AlertCDirection alertCDirectionExtensionG(Map<String, Object> alertCDirectionExtensionG) {
    this.alertCDirectionExtensionG = alertCDirectionExtensionG;
    return this;
  }

  public AlertCDirection putAlertCDirectionExtensionGItem(String key, Object alertCDirectionExtensionGItem) {
    if (this.alertCDirectionExtensionG == null) {
      this.alertCDirectionExtensionG = new HashMap<>();
    }
    this.alertCDirectionExtensionG.put(key, alertCDirectionExtensionGItem);
    return this;
  }

  /**
   * Get alertCDirectionExtensionG
   * @return alertCDirectionExtensionG
   */
  
  @Schema(name = "alertCDirectionExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertCDirectionExtensionG")
  public Map<String, Object> getAlertCDirectionExtensionG() {
    return alertCDirectionExtensionG;
  }

  public void setAlertCDirectionExtensionG(Map<String, Object> alertCDirectionExtensionG) {
    this.alertCDirectionExtensionG = alertCDirectionExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCDirection alertCDirection = (AlertCDirection) o;
    return Objects.equals(this.alertCDirectionCoded, alertCDirection.alertCDirectionCoded) &&
        Objects.equals(this.alertCDirectionNamed, alertCDirection.alertCDirectionNamed) &&
        Objects.equals(this.alertCAffectedDirection, alertCDirection.alertCAffectedDirection) &&
        Objects.equals(this.alertCDirectionExtensionG, alertCDirection.alertCDirectionExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertCDirectionCoded, alertCDirectionNamed, alertCAffectedDirection, alertCDirectionExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCDirection {\n");
    sb.append("    alertCDirectionCoded: ").append(toIndentedString(alertCDirectionCoded)).append("\n");
    sb.append("    alertCDirectionNamed: ").append(toIndentedString(alertCDirectionNamed)).append("\n");
    sb.append("    alertCAffectedDirection: ").append(toIndentedString(alertCAffectedDirection)).append("\n");
    sb.append("    alertCDirectionExtensionG: ").append(toIndentedString(alertCDirectionExtensionG)).append("\n");
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

