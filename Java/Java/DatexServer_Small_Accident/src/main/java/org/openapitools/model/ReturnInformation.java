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
import org.openapitools.model.ExchangeReturnEnumG;
import org.openapitools.model.InvalidityReasonEnumG;
import org.openapitools.model.MultilingualString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReturnInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnInformation {

  private ExchangeReturnEnumG returnStatus;

  private MultilingualString returnStatusReason;

  @Valid
  private List<@Valid InvalidityReasonEnumG> codedInvalidityReason = new ArrayList<>();

  @Valid
  private Map<String, Object> returnInformationExtensionG = new HashMap<>();

  public ReturnInformation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReturnInformation(ExchangeReturnEnumG returnStatus) {
    this.returnStatus = returnStatus;
  }

  public ReturnInformation returnStatus(ExchangeReturnEnumG returnStatus) {
    this.returnStatus = returnStatus;
    return this;
  }

  /**
   * Get returnStatus
   * @return returnStatus
   */
  @NotNull @Valid 
  @Schema(name = "returnStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnStatus")
  public ExchangeReturnEnumG getReturnStatus() {
    return returnStatus;
  }

  public void setReturnStatus(ExchangeReturnEnumG returnStatus) {
    this.returnStatus = returnStatus;
  }

  public ReturnInformation returnStatusReason(MultilingualString returnStatusReason) {
    this.returnStatusReason = returnStatusReason;
    return this;
  }

  /**
   * Get returnStatusReason
   * @return returnStatusReason
   */
  @Valid 
  @Schema(name = "returnStatusReason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnStatusReason")
  public MultilingualString getReturnStatusReason() {
    return returnStatusReason;
  }

  public void setReturnStatusReason(MultilingualString returnStatusReason) {
    this.returnStatusReason = returnStatusReason;
  }

  public ReturnInformation codedInvalidityReason(List<@Valid InvalidityReasonEnumG> codedInvalidityReason) {
    this.codedInvalidityReason = codedInvalidityReason;
    return this;
  }

  public ReturnInformation addCodedInvalidityReasonItem(InvalidityReasonEnumG codedInvalidityReasonItem) {
    if (this.codedInvalidityReason == null) {
      this.codedInvalidityReason = new ArrayList<>();
    }
    this.codedInvalidityReason.add(codedInvalidityReasonItem);
    return this;
  }

  /**
   * Get codedInvalidityReason
   * @return codedInvalidityReason
   */
  @Valid @Size(min = 0) 
  @Schema(name = "codedInvalidityReason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codedInvalidityReason")
  public List<@Valid InvalidityReasonEnumG> getCodedInvalidityReason() {
    return codedInvalidityReason;
  }

  public void setCodedInvalidityReason(List<@Valid InvalidityReasonEnumG> codedInvalidityReason) {
    this.codedInvalidityReason = codedInvalidityReason;
  }

  public ReturnInformation returnInformationExtensionG(Map<String, Object> returnInformationExtensionG) {
    this.returnInformationExtensionG = returnInformationExtensionG;
    return this;
  }

  public ReturnInformation putReturnInformationExtensionGItem(String key, Object returnInformationExtensionGItem) {
    if (this.returnInformationExtensionG == null) {
      this.returnInformationExtensionG = new HashMap<>();
    }
    this.returnInformationExtensionG.put(key, returnInformationExtensionGItem);
    return this;
  }

  /**
   * Get returnInformationExtensionG
   * @return returnInformationExtensionG
   */
  
  @Schema(name = "returnInformationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnInformationExtensionG")
  public Map<String, Object> getReturnInformationExtensionG() {
    return returnInformationExtensionG;
  }

  public void setReturnInformationExtensionG(Map<String, Object> returnInformationExtensionG) {
    this.returnInformationExtensionG = returnInformationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnInformation returnInformation = (ReturnInformation) o;
    return Objects.equals(this.returnStatus, returnInformation.returnStatus) &&
        Objects.equals(this.returnStatusReason, returnInformation.returnStatusReason) &&
        Objects.equals(this.codedInvalidityReason, returnInformation.codedInvalidityReason) &&
        Objects.equals(this.returnInformationExtensionG, returnInformation.returnInformationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnStatus, returnStatusReason, codedInvalidityReason, returnInformationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnInformation {\n");
    sb.append("    returnStatus: ").append(toIndentedString(returnStatus)).append("\n");
    sb.append("    returnStatusReason: ").append(toIndentedString(returnStatusReason)).append("\n");
    sb.append("    codedInvalidityReason: ").append(toIndentedString(codedInvalidityReason)).append("\n");
    sb.append("    returnInformationExtensionG: ").append(toIndentedString(returnInformationExtensionG)).append("\n");
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

