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
import org.openapitools.model.AccidentCauseEnumG;
import org.openapitools.model.AccidentTypeEnumG;
import org.openapitools.model.CollisionTypeEnumG;
import org.openapitools.model.GroupOfPeopleInvolved;
import org.openapitools.model.GroupOfVehiclesInvolved;
import org.openapitools.model.LocationReferenceG;
import org.openapitools.model.ProbabilityOfOccurrenceEnumG;
import org.openapitools.model.Validity;
import org.openapitools.model.Vehicle;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Accident
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Accident {

  private String idG;

  private String versionG;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime situationRecordCreationTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime situationRecordVersionTime;

  private ProbabilityOfOccurrenceEnumG probabilityOfOccurrence;

  private AccidentCauseEnumG accidentCause;

  @Valid
  private List<@Valid AccidentTypeEnumG> accidentType = new ArrayList<>();

  private CollisionTypeEnumG collisionType;

  private Integer totalNumberOfPeopleInvolved;

  private Integer totalNumberOfVehiclesInvolved;

  private Validity validity;

  private LocationReferenceG locationReference;

  @Valid
  private List<@Valid Vehicle> vehicleInvolved = new ArrayList<>();

  @Valid
  private List<@Valid GroupOfVehiclesInvolved> groupOfVehiclesInvolved = new ArrayList<>();

  @Valid
  private List<@Valid GroupOfPeopleInvolved> groupOfPeopleInvolved = new ArrayList<>();

  @Valid
  private Map<String, Object> situationRecordExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> trafficElementExtensionG = new HashMap<>();

  @Valid
  private Map<String, Object> accidentExtensionG = new HashMap<>();

  public Accident() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Accident(String idG, String versionG, OffsetDateTime situationRecordCreationTime, OffsetDateTime situationRecordVersionTime, ProbabilityOfOccurrenceEnumG probabilityOfOccurrence, List<@Valid AccidentTypeEnumG> accidentType, Validity validity, LocationReferenceG locationReference) {
    this.idG = idG;
    this.versionG = versionG;
    this.situationRecordCreationTime = situationRecordCreationTime;
    this.situationRecordVersionTime = situationRecordVersionTime;
    this.probabilityOfOccurrence = probabilityOfOccurrence;
    this.accidentType = accidentType;
    this.validity = validity;
    this.locationReference = locationReference;
  }

  public Accident idG(String idG) {
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

  public Accident versionG(String versionG) {
    this.versionG = versionG;
    return this;
  }

  /**
   * Get versionG
   * @return versionG
   */
  @NotNull 
  @Schema(name = "versionG", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("versionG")
  public String getVersionG() {
    return versionG;
  }

  public void setVersionG(String versionG) {
    this.versionG = versionG;
  }

  public Accident situationRecordCreationTime(OffsetDateTime situationRecordCreationTime) {
    this.situationRecordCreationTime = situationRecordCreationTime;
    return this;
  }

  /**
   * Get situationRecordCreationTime
   * @return situationRecordCreationTime
   */
  @NotNull @Valid 
  @Schema(name = "situationRecordCreationTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("situationRecordCreationTime")
  public OffsetDateTime getSituationRecordCreationTime() {
    return situationRecordCreationTime;
  }

  public void setSituationRecordCreationTime(OffsetDateTime situationRecordCreationTime) {
    this.situationRecordCreationTime = situationRecordCreationTime;
  }

  public Accident situationRecordVersionTime(OffsetDateTime situationRecordVersionTime) {
    this.situationRecordVersionTime = situationRecordVersionTime;
    return this;
  }

  /**
   * Get situationRecordVersionTime
   * @return situationRecordVersionTime
   */
  @NotNull @Valid 
  @Schema(name = "situationRecordVersionTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("situationRecordVersionTime")
  public OffsetDateTime getSituationRecordVersionTime() {
    return situationRecordVersionTime;
  }

  public void setSituationRecordVersionTime(OffsetDateTime situationRecordVersionTime) {
    this.situationRecordVersionTime = situationRecordVersionTime;
  }

  public Accident probabilityOfOccurrence(ProbabilityOfOccurrenceEnumG probabilityOfOccurrence) {
    this.probabilityOfOccurrence = probabilityOfOccurrence;
    return this;
  }

  /**
   * Get probabilityOfOccurrence
   * @return probabilityOfOccurrence
   */
  @NotNull @Valid 
  @Schema(name = "probabilityOfOccurrence", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("probabilityOfOccurrence")
  public ProbabilityOfOccurrenceEnumG getProbabilityOfOccurrence() {
    return probabilityOfOccurrence;
  }

  public void setProbabilityOfOccurrence(ProbabilityOfOccurrenceEnumG probabilityOfOccurrence) {
    this.probabilityOfOccurrence = probabilityOfOccurrence;
  }

  public Accident accidentCause(AccidentCauseEnumG accidentCause) {
    this.accidentCause = accidentCause;
    return this;
  }

  /**
   * Get accidentCause
   * @return accidentCause
   */
  @Valid 
  @Schema(name = "accidentCause", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accidentCause")
  public AccidentCauseEnumG getAccidentCause() {
    return accidentCause;
  }

  public void setAccidentCause(AccidentCauseEnumG accidentCause) {
    this.accidentCause = accidentCause;
  }

  public Accident accidentType(List<@Valid AccidentTypeEnumG> accidentType) {
    this.accidentType = accidentType;
    return this;
  }

  public Accident addAccidentTypeItem(AccidentTypeEnumG accidentTypeItem) {
    if (this.accidentType == null) {
      this.accidentType = new ArrayList<>();
    }
    this.accidentType.add(accidentTypeItem);
    return this;
  }

  /**
   * Get accidentType
   * @return accidentType
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "accidentType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accidentType")
  public List<@Valid AccidentTypeEnumG> getAccidentType() {
    return accidentType;
  }

  public void setAccidentType(List<@Valid AccidentTypeEnumG> accidentType) {
    this.accidentType = accidentType;
  }

  public Accident collisionType(CollisionTypeEnumG collisionType) {
    this.collisionType = collisionType;
    return this;
  }

  /**
   * Get collisionType
   * @return collisionType
   */
  @Valid 
  @Schema(name = "collisionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collisionType")
  public CollisionTypeEnumG getCollisionType() {
    return collisionType;
  }

  public void setCollisionType(CollisionTypeEnumG collisionType) {
    this.collisionType = collisionType;
  }

  public Accident totalNumberOfPeopleInvolved(Integer totalNumberOfPeopleInvolved) {
    this.totalNumberOfPeopleInvolved = totalNumberOfPeopleInvolved;
    return this;
  }

  /**
   * Get totalNumberOfPeopleInvolved
   * minimum: 0
   * @return totalNumberOfPeopleInvolved
   */
  @Min(0) 
  @Schema(name = "totalNumberOfPeopleInvolved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalNumberOfPeopleInvolved")
  public Integer getTotalNumberOfPeopleInvolved() {
    return totalNumberOfPeopleInvolved;
  }

  public void setTotalNumberOfPeopleInvolved(Integer totalNumberOfPeopleInvolved) {
    this.totalNumberOfPeopleInvolved = totalNumberOfPeopleInvolved;
  }

  public Accident totalNumberOfVehiclesInvolved(Integer totalNumberOfVehiclesInvolved) {
    this.totalNumberOfVehiclesInvolved = totalNumberOfVehiclesInvolved;
    return this;
  }

  /**
   * Get totalNumberOfVehiclesInvolved
   * minimum: 0
   * @return totalNumberOfVehiclesInvolved
   */
  @Min(0) 
  @Schema(name = "totalNumberOfVehiclesInvolved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalNumberOfVehiclesInvolved")
  public Integer getTotalNumberOfVehiclesInvolved() {
    return totalNumberOfVehiclesInvolved;
  }

  public void setTotalNumberOfVehiclesInvolved(Integer totalNumberOfVehiclesInvolved) {
    this.totalNumberOfVehiclesInvolved = totalNumberOfVehiclesInvolved;
  }

  public Accident validity(Validity validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   * @return validity
   */
  @NotNull @Valid 
  @Schema(name = "validity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validity")
  public Validity getValidity() {
    return validity;
  }

  public void setValidity(Validity validity) {
    this.validity = validity;
  }

  public Accident locationReference(LocationReferenceG locationReference) {
    this.locationReference = locationReference;
    return this;
  }

  /**
   * Get locationReference
   * @return locationReference
   */
  @NotNull @Valid 
  @Schema(name = "locationReference", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locationReference")
  public LocationReferenceG getLocationReference() {
    return locationReference;
  }

  public void setLocationReference(LocationReferenceG locationReference) {
    this.locationReference = locationReference;
  }

  public Accident vehicleInvolved(List<@Valid Vehicle> vehicleInvolved) {
    this.vehicleInvolved = vehicleInvolved;
    return this;
  }

  public Accident addVehicleInvolvedItem(Vehicle vehicleInvolvedItem) {
    if (this.vehicleInvolved == null) {
      this.vehicleInvolved = new ArrayList<>();
    }
    this.vehicleInvolved.add(vehicleInvolvedItem);
    return this;
  }

  /**
   * Get vehicleInvolved
   * @return vehicleInvolved
   */
  @Valid @Size(min = 0) 
  @Schema(name = "vehicleInvolved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleInvolved")
  public List<@Valid Vehicle> getVehicleInvolved() {
    return vehicleInvolved;
  }

  public void setVehicleInvolved(List<@Valid Vehicle> vehicleInvolved) {
    this.vehicleInvolved = vehicleInvolved;
  }

  public Accident groupOfVehiclesInvolved(List<@Valid GroupOfVehiclesInvolved> groupOfVehiclesInvolved) {
    this.groupOfVehiclesInvolved = groupOfVehiclesInvolved;
    return this;
  }

  public Accident addGroupOfVehiclesInvolvedItem(GroupOfVehiclesInvolved groupOfVehiclesInvolvedItem) {
    if (this.groupOfVehiclesInvolved == null) {
      this.groupOfVehiclesInvolved = new ArrayList<>();
    }
    this.groupOfVehiclesInvolved.add(groupOfVehiclesInvolvedItem);
    return this;
  }

  /**
   * Get groupOfVehiclesInvolved
   * @return groupOfVehiclesInvolved
   */
  @Valid @Size(min = 0) 
  @Schema(name = "groupOfVehiclesInvolved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupOfVehiclesInvolved")
  public List<@Valid GroupOfVehiclesInvolved> getGroupOfVehiclesInvolved() {
    return groupOfVehiclesInvolved;
  }

  public void setGroupOfVehiclesInvolved(List<@Valid GroupOfVehiclesInvolved> groupOfVehiclesInvolved) {
    this.groupOfVehiclesInvolved = groupOfVehiclesInvolved;
  }

  public Accident groupOfPeopleInvolved(List<@Valid GroupOfPeopleInvolved> groupOfPeopleInvolved) {
    this.groupOfPeopleInvolved = groupOfPeopleInvolved;
    return this;
  }

  public Accident addGroupOfPeopleInvolvedItem(GroupOfPeopleInvolved groupOfPeopleInvolvedItem) {
    if (this.groupOfPeopleInvolved == null) {
      this.groupOfPeopleInvolved = new ArrayList<>();
    }
    this.groupOfPeopleInvolved.add(groupOfPeopleInvolvedItem);
    return this;
  }

  /**
   * Get groupOfPeopleInvolved
   * @return groupOfPeopleInvolved
   */
  @Valid @Size(min = 0) 
  @Schema(name = "groupOfPeopleInvolved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupOfPeopleInvolved")
  public List<@Valid GroupOfPeopleInvolved> getGroupOfPeopleInvolved() {
    return groupOfPeopleInvolved;
  }

  public void setGroupOfPeopleInvolved(List<@Valid GroupOfPeopleInvolved> groupOfPeopleInvolved) {
    this.groupOfPeopleInvolved = groupOfPeopleInvolved;
  }

  public Accident situationRecordExtensionG(Map<String, Object> situationRecordExtensionG) {
    this.situationRecordExtensionG = situationRecordExtensionG;
    return this;
  }

  public Accident putSituationRecordExtensionGItem(String key, Object situationRecordExtensionGItem) {
    if (this.situationRecordExtensionG == null) {
      this.situationRecordExtensionG = new HashMap<>();
    }
    this.situationRecordExtensionG.put(key, situationRecordExtensionGItem);
    return this;
  }

  /**
   * Get situationRecordExtensionG
   * @return situationRecordExtensionG
   */
  
  @Schema(name = "situationRecordExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("situationRecordExtensionG")
  public Map<String, Object> getSituationRecordExtensionG() {
    return situationRecordExtensionG;
  }

  public void setSituationRecordExtensionG(Map<String, Object> situationRecordExtensionG) {
    this.situationRecordExtensionG = situationRecordExtensionG;
  }

  public Accident trafficElementExtensionG(Map<String, Object> trafficElementExtensionG) {
    this.trafficElementExtensionG = trafficElementExtensionG;
    return this;
  }

  public Accident putTrafficElementExtensionGItem(String key, Object trafficElementExtensionGItem) {
    if (this.trafficElementExtensionG == null) {
      this.trafficElementExtensionG = new HashMap<>();
    }
    this.trafficElementExtensionG.put(key, trafficElementExtensionGItem);
    return this;
  }

  /**
   * Get trafficElementExtensionG
   * @return trafficElementExtensionG
   */
  
  @Schema(name = "trafficElementExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trafficElementExtensionG")
  public Map<String, Object> getTrafficElementExtensionG() {
    return trafficElementExtensionG;
  }

  public void setTrafficElementExtensionG(Map<String, Object> trafficElementExtensionG) {
    this.trafficElementExtensionG = trafficElementExtensionG;
  }

  public Accident accidentExtensionG(Map<String, Object> accidentExtensionG) {
    this.accidentExtensionG = accidentExtensionG;
    return this;
  }

  public Accident putAccidentExtensionGItem(String key, Object accidentExtensionGItem) {
    if (this.accidentExtensionG == null) {
      this.accidentExtensionG = new HashMap<>();
    }
    this.accidentExtensionG.put(key, accidentExtensionGItem);
    return this;
  }

  /**
   * Get accidentExtensionG
   * @return accidentExtensionG
   */
  
  @Schema(name = "accidentExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accidentExtensionG")
  public Map<String, Object> getAccidentExtensionG() {
    return accidentExtensionG;
  }

  public void setAccidentExtensionG(Map<String, Object> accidentExtensionG) {
    this.accidentExtensionG = accidentExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Accident accident = (Accident) o;
    return Objects.equals(this.idG, accident.idG) &&
        Objects.equals(this.versionG, accident.versionG) &&
        Objects.equals(this.situationRecordCreationTime, accident.situationRecordCreationTime) &&
        Objects.equals(this.situationRecordVersionTime, accident.situationRecordVersionTime) &&
        Objects.equals(this.probabilityOfOccurrence, accident.probabilityOfOccurrence) &&
        Objects.equals(this.accidentCause, accident.accidentCause) &&
        Objects.equals(this.accidentType, accident.accidentType) &&
        Objects.equals(this.collisionType, accident.collisionType) &&
        Objects.equals(this.totalNumberOfPeopleInvolved, accident.totalNumberOfPeopleInvolved) &&
        Objects.equals(this.totalNumberOfVehiclesInvolved, accident.totalNumberOfVehiclesInvolved) &&
        Objects.equals(this.validity, accident.validity) &&
        Objects.equals(this.locationReference, accident.locationReference) &&
        Objects.equals(this.vehicleInvolved, accident.vehicleInvolved) &&
        Objects.equals(this.groupOfVehiclesInvolved, accident.groupOfVehiclesInvolved) &&
        Objects.equals(this.groupOfPeopleInvolved, accident.groupOfPeopleInvolved) &&
        Objects.equals(this.situationRecordExtensionG, accident.situationRecordExtensionG) &&
        Objects.equals(this.trafficElementExtensionG, accident.trafficElementExtensionG) &&
        Objects.equals(this.accidentExtensionG, accident.accidentExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idG, versionG, situationRecordCreationTime, situationRecordVersionTime, probabilityOfOccurrence, accidentCause, accidentType, collisionType, totalNumberOfPeopleInvolved, totalNumberOfVehiclesInvolved, validity, locationReference, vehicleInvolved, groupOfVehiclesInvolved, groupOfPeopleInvolved, situationRecordExtensionG, trafficElementExtensionG, accidentExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Accident {\n");
    sb.append("    idG: ").append(toIndentedString(idG)).append("\n");
    sb.append("    versionG: ").append(toIndentedString(versionG)).append("\n");
    sb.append("    situationRecordCreationTime: ").append(toIndentedString(situationRecordCreationTime)).append("\n");
    sb.append("    situationRecordVersionTime: ").append(toIndentedString(situationRecordVersionTime)).append("\n");
    sb.append("    probabilityOfOccurrence: ").append(toIndentedString(probabilityOfOccurrence)).append("\n");
    sb.append("    accidentCause: ").append(toIndentedString(accidentCause)).append("\n");
    sb.append("    accidentType: ").append(toIndentedString(accidentType)).append("\n");
    sb.append("    collisionType: ").append(toIndentedString(collisionType)).append("\n");
    sb.append("    totalNumberOfPeopleInvolved: ").append(toIndentedString(totalNumberOfPeopleInvolved)).append("\n");
    sb.append("    totalNumberOfVehiclesInvolved: ").append(toIndentedString(totalNumberOfVehiclesInvolved)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    locationReference: ").append(toIndentedString(locationReference)).append("\n");
    sb.append("    vehicleInvolved: ").append(toIndentedString(vehicleInvolved)).append("\n");
    sb.append("    groupOfVehiclesInvolved: ").append(toIndentedString(groupOfVehiclesInvolved)).append("\n");
    sb.append("    groupOfPeopleInvolved: ").append(toIndentedString(groupOfPeopleInvolved)).append("\n");
    sb.append("    situationRecordExtensionG: ").append(toIndentedString(situationRecordExtensionG)).append("\n");
    sb.append("    trafficElementExtensionG: ").append(toIndentedString(trafficElementExtensionG)).append("\n");
    sb.append("    accidentExtensionG: ").append(toIndentedString(accidentExtensionG)).append("\n");
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

