package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.InjuryStatusTypeEnumG;
import org.openapitools.model.InvolvementRolesEnumG;
import org.openapitools.model.PersonCategoryEnumG;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GroupOfPeopleInvolved
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GroupOfPeopleInvolved {

  private Integer numberOfPeople;

  private InjuryStatusTypeEnumG injuryStatusType;

  private InvolvementRolesEnumG involvementRole;

  private PersonCategoryEnumG categoryOfPeopleInvolved;

  @Valid
  private Map<String, Object> groupOfPeopleInvolvedExtensionG = new HashMap<>();

  public GroupOfPeopleInvolved numberOfPeople(Integer numberOfPeople) {
    this.numberOfPeople = numberOfPeople;
    return this;
  }

  /**
   * Get numberOfPeople
   * minimum: 0
   * @return numberOfPeople
   */
  @Min(0) 
  @Schema(name = "numberOfPeople", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfPeople")
  public Integer getNumberOfPeople() {
    return numberOfPeople;
  }

  public void setNumberOfPeople(Integer numberOfPeople) {
    this.numberOfPeople = numberOfPeople;
  }

  public GroupOfPeopleInvolved injuryStatusType(InjuryStatusTypeEnumG injuryStatusType) {
    this.injuryStatusType = injuryStatusType;
    return this;
  }

  /**
   * Get injuryStatusType
   * @return injuryStatusType
   */
  @Valid 
  @Schema(name = "injuryStatusType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("injuryStatusType")
  public InjuryStatusTypeEnumG getInjuryStatusType() {
    return injuryStatusType;
  }

  public void setInjuryStatusType(InjuryStatusTypeEnumG injuryStatusType) {
    this.injuryStatusType = injuryStatusType;
  }

  public GroupOfPeopleInvolved involvementRole(InvolvementRolesEnumG involvementRole) {
    this.involvementRole = involvementRole;
    return this;
  }

  /**
   * Get involvementRole
   * @return involvementRole
   */
  @Valid 
  @Schema(name = "involvementRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("involvementRole")
  public InvolvementRolesEnumG getInvolvementRole() {
    return involvementRole;
  }

  public void setInvolvementRole(InvolvementRolesEnumG involvementRole) {
    this.involvementRole = involvementRole;
  }

  public GroupOfPeopleInvolved categoryOfPeopleInvolved(PersonCategoryEnumG categoryOfPeopleInvolved) {
    this.categoryOfPeopleInvolved = categoryOfPeopleInvolved;
    return this;
  }

  /**
   * Get categoryOfPeopleInvolved
   * @return categoryOfPeopleInvolved
   */
  @Valid 
  @Schema(name = "categoryOfPeopleInvolved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryOfPeopleInvolved")
  public PersonCategoryEnumG getCategoryOfPeopleInvolved() {
    return categoryOfPeopleInvolved;
  }

  public void setCategoryOfPeopleInvolved(PersonCategoryEnumG categoryOfPeopleInvolved) {
    this.categoryOfPeopleInvolved = categoryOfPeopleInvolved;
  }

  public GroupOfPeopleInvolved groupOfPeopleInvolvedExtensionG(Map<String, Object> groupOfPeopleInvolvedExtensionG) {
    this.groupOfPeopleInvolvedExtensionG = groupOfPeopleInvolvedExtensionG;
    return this;
  }

  public GroupOfPeopleInvolved putGroupOfPeopleInvolvedExtensionGItem(String key, Object groupOfPeopleInvolvedExtensionGItem) {
    if (this.groupOfPeopleInvolvedExtensionG == null) {
      this.groupOfPeopleInvolvedExtensionG = new HashMap<>();
    }
    this.groupOfPeopleInvolvedExtensionG.put(key, groupOfPeopleInvolvedExtensionGItem);
    return this;
  }

  /**
   * Get groupOfPeopleInvolvedExtensionG
   * @return groupOfPeopleInvolvedExtensionG
   */
  
  @Schema(name = "groupOfPeopleInvolvedExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupOfPeopleInvolvedExtensionG")
  public Map<String, Object> getGroupOfPeopleInvolvedExtensionG() {
    return groupOfPeopleInvolvedExtensionG;
  }

  public void setGroupOfPeopleInvolvedExtensionG(Map<String, Object> groupOfPeopleInvolvedExtensionG) {
    this.groupOfPeopleInvolvedExtensionG = groupOfPeopleInvolvedExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupOfPeopleInvolved groupOfPeopleInvolved = (GroupOfPeopleInvolved) o;
    return Objects.equals(this.numberOfPeople, groupOfPeopleInvolved.numberOfPeople) &&
        Objects.equals(this.injuryStatusType, groupOfPeopleInvolved.injuryStatusType) &&
        Objects.equals(this.involvementRole, groupOfPeopleInvolved.involvementRole) &&
        Objects.equals(this.categoryOfPeopleInvolved, groupOfPeopleInvolved.categoryOfPeopleInvolved) &&
        Objects.equals(this.groupOfPeopleInvolvedExtensionG, groupOfPeopleInvolved.groupOfPeopleInvolvedExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfPeople, injuryStatusType, involvementRole, categoryOfPeopleInvolved, groupOfPeopleInvolvedExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupOfPeopleInvolved {\n");
    sb.append("    numberOfPeople: ").append(toIndentedString(numberOfPeople)).append("\n");
    sb.append("    injuryStatusType: ").append(toIndentedString(injuryStatusType)).append("\n");
    sb.append("    involvementRole: ").append(toIndentedString(involvementRole)).append("\n");
    sb.append("    categoryOfPeopleInvolved: ").append(toIndentedString(categoryOfPeopleInvolved)).append("\n");
    sb.append("    groupOfPeopleInvolvedExtensionG: ").append(toIndentedString(groupOfPeopleInvolvedExtensionG)).append("\n");
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

