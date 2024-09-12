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
import org.openapitools.model.HeaderInformation;
import org.openapitools.model.SituationRecordG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Situation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Situation {

  private String idG;

  private HeaderInformation headerInformation;

  @Valid
  private List<@Valid SituationRecordG> situationRecord = new ArrayList<>();

  @Valid
  private Map<String, Object> situationExtensionG = new HashMap<>();

  public Situation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Situation(String idG, HeaderInformation headerInformation, List<@Valid SituationRecordG> situationRecord) {
    this.idG = idG;
    this.headerInformation = headerInformation;
    this.situationRecord = situationRecord;
  }

  public Situation idG(String idG) {
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

  public Situation headerInformation(HeaderInformation headerInformation) {
    this.headerInformation = headerInformation;
    return this;
  }

  /**
   * Get headerInformation
   * @return headerInformation
   */
  @NotNull @Valid 
  @Schema(name = "headerInformation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("headerInformation")
  public HeaderInformation getHeaderInformation() {
    return headerInformation;
  }

  public void setHeaderInformation(HeaderInformation headerInformation) {
    this.headerInformation = headerInformation;
  }

  public Situation situationRecord(List<@Valid SituationRecordG> situationRecord) {
    this.situationRecord = situationRecord;
    return this;
  }

  public Situation addSituationRecordItem(SituationRecordG situationRecordItem) {
    if (this.situationRecord == null) {
      this.situationRecord = new ArrayList<>();
    }
    this.situationRecord.add(situationRecordItem);
    return this;
  }

  /**
   * Get situationRecord
   * @return situationRecord
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "situationRecord", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("situationRecord")
  public List<@Valid SituationRecordG> getSituationRecord() {
    return situationRecord;
  }

  public void setSituationRecord(List<@Valid SituationRecordG> situationRecord) {
    this.situationRecord = situationRecord;
  }

  public Situation situationExtensionG(Map<String, Object> situationExtensionG) {
    this.situationExtensionG = situationExtensionG;
    return this;
  }

  public Situation putSituationExtensionGItem(String key, Object situationExtensionGItem) {
    if (this.situationExtensionG == null) {
      this.situationExtensionG = new HashMap<>();
    }
    this.situationExtensionG.put(key, situationExtensionGItem);
    return this;
  }

  /**
   * Get situationExtensionG
   * @return situationExtensionG
   */
  
  @Schema(name = "situationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("situationExtensionG")
  public Map<String, Object> getSituationExtensionG() {
    return situationExtensionG;
  }

  public void setSituationExtensionG(Map<String, Object> situationExtensionG) {
    this.situationExtensionG = situationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Situation situation = (Situation) o;
    return Objects.equals(this.idG, situation.idG) &&
        Objects.equals(this.headerInformation, situation.headerInformation) &&
        Objects.equals(this.situationRecord, situation.situationRecord) &&
        Objects.equals(this.situationExtensionG, situation.situationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idG, headerInformation, situationRecord, situationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Situation {\n");
    sb.append("    idG: ").append(toIndentedString(idG)).append("\n");
    sb.append("    headerInformation: ").append(toIndentedString(headerInformation)).append("\n");
    sb.append("    situationRecord: ").append(toIndentedString(situationRecord)).append("\n");
    sb.append("    situationExtensionG: ").append(toIndentedString(situationExtensionG)).append("\n");
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

