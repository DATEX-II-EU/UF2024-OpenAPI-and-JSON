package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SituationPublication;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PayloadPublicationG
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PayloadPublicationG {

  private String versionG = "3.5";

  private String modelBaseVersionG = "3";

  private String extensionNameG;

  private String extensionVersionG;

  private String profileNameG;

  private String profileVersionG;

  private SituationPublication sitSituationPublication;

  public PayloadPublicationG() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PayloadPublicationG(String modelBaseVersionG) {
    this.modelBaseVersionG = modelBaseVersionG;
  }

  public PayloadPublicationG versionG(String versionG) {
    this.versionG = versionG;
    return this;
  }

  /**
   * Get versionG
   * @return versionG
   */
  
  @Schema(name = "versionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionG")
  public String getVersionG() {
    return versionG;
  }

  public void setVersionG(String versionG) {
    this.versionG = versionG;
  }

  public PayloadPublicationG modelBaseVersionG(String modelBaseVersionG) {
    this.modelBaseVersionG = modelBaseVersionG;
    return this;
  }

  /**
   * Get modelBaseVersionG
   * @return modelBaseVersionG
   */
  @NotNull 
  @Schema(name = "modelBaseVersionG", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("modelBaseVersionG")
  public String getModelBaseVersionG() {
    return modelBaseVersionG;
  }

  public void setModelBaseVersionG(String modelBaseVersionG) {
    this.modelBaseVersionG = modelBaseVersionG;
  }

  public PayloadPublicationG extensionNameG(String extensionNameG) {
    this.extensionNameG = extensionNameG;
    return this;
  }

  /**
   * Get extensionNameG
   * @return extensionNameG
   */
  
  @Schema(name = "extensionNameG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extensionNameG")
  public String getExtensionNameG() {
    return extensionNameG;
  }

  public void setExtensionNameG(String extensionNameG) {
    this.extensionNameG = extensionNameG;
  }

  public PayloadPublicationG extensionVersionG(String extensionVersionG) {
    this.extensionVersionG = extensionVersionG;
    return this;
  }

  /**
   * Get extensionVersionG
   * @return extensionVersionG
   */
  
  @Schema(name = "extensionVersionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extensionVersionG")
  public String getExtensionVersionG() {
    return extensionVersionG;
  }

  public void setExtensionVersionG(String extensionVersionG) {
    this.extensionVersionG = extensionVersionG;
  }

  public PayloadPublicationG profileNameG(String profileNameG) {
    this.profileNameG = profileNameG;
    return this;
  }

  /**
   * Get profileNameG
   * @return profileNameG
   */
  
  @Schema(name = "profileNameG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileNameG")
  public String getProfileNameG() {
    return profileNameG;
  }

  public void setProfileNameG(String profileNameG) {
    this.profileNameG = profileNameG;
  }

  public PayloadPublicationG profileVersionG(String profileVersionG) {
    this.profileVersionG = profileVersionG;
    return this;
  }

  /**
   * Get profileVersionG
   * @return profileVersionG
   */
  
  @Schema(name = "profileVersionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileVersionG")
  public String getProfileVersionG() {
    return profileVersionG;
  }

  public void setProfileVersionG(String profileVersionG) {
    this.profileVersionG = profileVersionG;
  }

  public PayloadPublicationG sitSituationPublication(SituationPublication sitSituationPublication) {
    this.sitSituationPublication = sitSituationPublication;
    return this;
  }

  /**
   * Get sitSituationPublication
   * @return sitSituationPublication
   */
  @Valid 
  @Schema(name = "sitSituationPublication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sitSituationPublication")
  public SituationPublication getSitSituationPublication() {
    return sitSituationPublication;
  }

  public void setSitSituationPublication(SituationPublication sitSituationPublication) {
    this.sitSituationPublication = sitSituationPublication;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadPublicationG payloadPublicationG = (PayloadPublicationG) o;
    return Objects.equals(this.versionG, payloadPublicationG.versionG) &&
        Objects.equals(this.modelBaseVersionG, payloadPublicationG.modelBaseVersionG) &&
        Objects.equals(this.extensionNameG, payloadPublicationG.extensionNameG) &&
        Objects.equals(this.extensionVersionG, payloadPublicationG.extensionVersionG) &&
        Objects.equals(this.profileNameG, payloadPublicationG.profileNameG) &&
        Objects.equals(this.profileVersionG, payloadPublicationG.profileVersionG) &&
        Objects.equals(this.sitSituationPublication, payloadPublicationG.sitSituationPublication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionG, modelBaseVersionG, extensionNameG, extensionVersionG, profileNameG, profileVersionG, sitSituationPublication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadPublicationG {\n");
    sb.append("    versionG: ").append(toIndentedString(versionG)).append("\n");
    sb.append("    modelBaseVersionG: ").append(toIndentedString(modelBaseVersionG)).append("\n");
    sb.append("    extensionNameG: ").append(toIndentedString(extensionNameG)).append("\n");
    sb.append("    extensionVersionG: ").append(toIndentedString(extensionVersionG)).append("\n");
    sb.append("    profileNameG: ").append(toIndentedString(profileNameG)).append("\n");
    sb.append("    profileVersionG: ").append(toIndentedString(profileVersionG)).append("\n");
    sb.append("    sitSituationPublication: ").append(toIndentedString(sitSituationPublication)).append("\n");
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

