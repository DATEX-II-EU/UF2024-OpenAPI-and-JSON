package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SessionInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SessionInformation {

  private String sessionID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startSession;

  @Valid
  private Map<String, Object> sessionInformationExtensionG = new HashMap<>();

  public SessionInformation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SessionInformation(String sessionID) {
    this.sessionID = sessionID;
  }

  public SessionInformation sessionID(String sessionID) {
    this.sessionID = sessionID;
    return this;
  }

  /**
   * Get sessionID
   * @return sessionID
   */
  @NotNull @Size(max = 1024) 
  @Schema(name = "sessionID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sessionID")
  public String getSessionID() {
    return sessionID;
  }

  public void setSessionID(String sessionID) {
    this.sessionID = sessionID;
  }

  public SessionInformation startSession(OffsetDateTime startSession) {
    this.startSession = startSession;
    return this;
  }

  /**
   * Get startSession
   * @return startSession
   */
  @Valid 
  @Schema(name = "startSession", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startSession")
  public OffsetDateTime getStartSession() {
    return startSession;
  }

  public void setStartSession(OffsetDateTime startSession) {
    this.startSession = startSession;
  }

  public SessionInformation sessionInformationExtensionG(Map<String, Object> sessionInformationExtensionG) {
    this.sessionInformationExtensionG = sessionInformationExtensionG;
    return this;
  }

  public SessionInformation putSessionInformationExtensionGItem(String key, Object sessionInformationExtensionGItem) {
    if (this.sessionInformationExtensionG == null) {
      this.sessionInformationExtensionG = new HashMap<>();
    }
    this.sessionInformationExtensionG.put(key, sessionInformationExtensionGItem);
    return this;
  }

  /**
   * Get sessionInformationExtensionG
   * @return sessionInformationExtensionG
   */
  
  @Schema(name = "sessionInformationExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionInformationExtensionG")
  public Map<String, Object> getSessionInformationExtensionG() {
    return sessionInformationExtensionG;
  }

  public void setSessionInformationExtensionG(Map<String, Object> sessionInformationExtensionG) {
    this.sessionInformationExtensionG = sessionInformationExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionInformation sessionInformation = (SessionInformation) o;
    return Objects.equals(this.sessionID, sessionInformation.sessionID) &&
        Objects.equals(this.startSession, sessionInformation.startSession) &&
        Objects.equals(this.sessionInformationExtensionG, sessionInformation.sessionInformationExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionID, startSession, sessionInformationExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionInformation {\n");
    sb.append("    sessionID: ").append(toIndentedString(sessionID)).append("\n");
    sb.append("    startSession: ").append(toIndentedString(startSession)).append("\n");
    sb.append("    sessionInformationExtensionG: ").append(toIndentedString(sessionInformationExtensionG)).append("\n");
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

