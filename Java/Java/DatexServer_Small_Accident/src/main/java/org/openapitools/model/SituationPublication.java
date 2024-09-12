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
import org.openapitools.model.InternationalIdentifier;
import org.openapitools.model.Situation;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SituationPublication
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SituationPublication {

  private String lang;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publicationTime;

  private InternationalIdentifier publicationCreator;

  @Valid
  private List<@Valid Situation> situation = new ArrayList<>();

  @Valid
  private Map<String, Object> payloadPublicationExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> situationPublicationExtensionG = new HashMap<>();

  public SituationPublication() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SituationPublication(String lang, OffsetDateTime publicationTime, InternationalIdentifier publicationCreator) {
    this.lang = lang;
    this.publicationTime = publicationTime;
    this.publicationCreator = publicationCreator;
  }

  public SituationPublication lang(String lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
   */
  @NotNull 
  @Schema(name = "lang", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public SituationPublication publicationTime(OffsetDateTime publicationTime) {
    this.publicationTime = publicationTime;
    return this;
  }

  /**
   * Get publicationTime
   * @return publicationTime
   */
  @NotNull @Valid 
  @Schema(name = "publicationTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publicationTime")
  public OffsetDateTime getPublicationTime() {
    return publicationTime;
  }

  public void setPublicationTime(OffsetDateTime publicationTime) {
    this.publicationTime = publicationTime;
  }

  public SituationPublication publicationCreator(InternationalIdentifier publicationCreator) {
    this.publicationCreator = publicationCreator;
    return this;
  }

  /**
   * Get publicationCreator
   * @return publicationCreator
   */
  @NotNull @Valid 
  @Schema(name = "publicationCreator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publicationCreator")
  public InternationalIdentifier getPublicationCreator() {
    return publicationCreator;
  }

  public void setPublicationCreator(InternationalIdentifier publicationCreator) {
    this.publicationCreator = publicationCreator;
  }

  public SituationPublication situation(List<@Valid Situation> situation) {
    this.situation = situation;
    return this;
  }

  public SituationPublication addSituationItem(Situation situationItem) {
    if (this.situation == null) {
      this.situation = new ArrayList<>();
    }
    this.situation.add(situationItem);
    return this;
  }

  /**
   * Get situation
   * @return situation
   */
  @Valid @Size(min = 0) 
  @Schema(name = "situation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("situation")
  public List<@Valid Situation> getSituation() {
    return situation;
  }

  public void setSituation(List<@Valid Situation> situation) {
    this.situation = situation;
  }

  public SituationPublication payloadPublicationExtensionG(Map<String, Object> payloadPublicationExtensionG) {
    this.payloadPublicationExtensionG = payloadPublicationExtensionG;
    return this;
  }

  public SituationPublication putPayloadPublicationExtensionGItem(String key, Object payloadPublicationExtensionGItem) {
    if (this.payloadPublicationExtensionG == null) {
      this.payloadPublicationExtensionG = new HashMap<>();
    }
    this.payloadPublicationExtensionG.put(key, payloadPublicationExtensionGItem);
    return this;
  }

  /**
   * Get payloadPublicationExtensionG
   * @return payloadPublicationExtensionG
   */
  
  @Schema(name = "payloadPublicationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payloadPublicationExtensionG")
  public Map<String, Object> getPayloadPublicationExtensionG() {
    return payloadPublicationExtensionG;
  }

  public void setPayloadPublicationExtensionG(Map<String, Object> payloadPublicationExtensionG) {
    this.payloadPublicationExtensionG = payloadPublicationExtensionG;
  }

  public SituationPublication situationPublicationExtensionG(Map<String, Object> situationPublicationExtensionG) {
    this.situationPublicationExtensionG = situationPublicationExtensionG;
    return this;
  }

  public SituationPublication putSituationPublicationExtensionGItem(String key, Object situationPublicationExtensionGItem) {
    if (this.situationPublicationExtensionG == null) {
      this.situationPublicationExtensionG = new HashMap<>();
    }
    this.situationPublicationExtensionG.put(key, situationPublicationExtensionGItem);
    return this;
  }

  /**
   * Get situationPublicationExtensionG
   * @return situationPublicationExtensionG
   */
  
  @Schema(name = "situationPublicationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("situationPublicationExtensionG")
  public Map<String, Object> getSituationPublicationExtensionG() {
    return situationPublicationExtensionG;
  }

  public void setSituationPublicationExtensionG(Map<String, Object> situationPublicationExtensionG) {
    this.situationPublicationExtensionG = situationPublicationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SituationPublication situationPublication = (SituationPublication) o;
    return Objects.equals(this.lang, situationPublication.lang) &&
        Objects.equals(this.publicationTime, situationPublication.publicationTime) &&
        Objects.equals(this.publicationCreator, situationPublication.publicationCreator) &&
        Objects.equals(this.situation, situationPublication.situation) &&
        Objects.equals(this.payloadPublicationExtensionG, situationPublication.payloadPublicationExtensionG) &&
        Objects.equals(this.situationPublicationExtensionG, situationPublication.situationPublicationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, publicationTime, publicationCreator, situation, payloadPublicationExtensionG, situationPublicationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituationPublication {\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    publicationTime: ").append(toIndentedString(publicationTime)).append("\n");
    sb.append("    publicationCreator: ").append(toIndentedString(publicationCreator)).append("\n");
    sb.append("    situation: ").append(toIndentedString(situation)).append("\n");
    sb.append("    payloadPublicationExtensionG: ").append(toIndentedString(payloadPublicationExtensionG)).append("\n");
    sb.append("    situationPublicationExtensionG: ").append(toIndentedString(situationPublicationExtensionG)).append("\n");
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

