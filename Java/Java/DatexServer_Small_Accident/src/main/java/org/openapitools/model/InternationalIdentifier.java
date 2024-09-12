package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InternationalIdentifier
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-12T12:02:17.317314499Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class InternationalIdentifier {

  private String country;

  private String nationalIdentifier;

  @Valid
  private Map<String, Object> internationalIdentifierExtensionG = new HashMap<>();

  public InternationalIdentifier() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InternationalIdentifier(String country, String nationalIdentifier) {
    this.country = country;
    this.nationalIdentifier = nationalIdentifier;
  }

  public InternationalIdentifier country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @NotNull @Size(max = 1024) 
  @Schema(name = "country", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public InternationalIdentifier nationalIdentifier(String nationalIdentifier) {
    this.nationalIdentifier = nationalIdentifier;
    return this;
  }

  /**
   * Get nationalIdentifier
   * @return nationalIdentifier
   */
  @NotNull @Size(max = 1024) 
  @Schema(name = "nationalIdentifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nationalIdentifier")
  public String getNationalIdentifier() {
    return nationalIdentifier;
  }

  public void setNationalIdentifier(String nationalIdentifier) {
    this.nationalIdentifier = nationalIdentifier;
  }

  public InternationalIdentifier internationalIdentifierExtensionG(Map<String, Object> internationalIdentifierExtensionG) {
    this.internationalIdentifierExtensionG = internationalIdentifierExtensionG;
    return this;
  }

  public InternationalIdentifier putInternationalIdentifierExtensionGItem(String key, Object internationalIdentifierExtensionGItem) {
    if (this.internationalIdentifierExtensionG == null) {
      this.internationalIdentifierExtensionG = new HashMap<>();
    }
    this.internationalIdentifierExtensionG.put(key, internationalIdentifierExtensionGItem);
    return this;
  }

  /**
   * Get internationalIdentifierExtensionG
   * @return internationalIdentifierExtensionG
   */
  
  @Schema(name = "internationalIdentifierExtensionG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internationalIdentifierExtensionG")
  public Map<String, Object> getInternationalIdentifierExtensionG() {
    return internationalIdentifierExtensionG;
  }

  public void setInternationalIdentifierExtensionG(Map<String, Object> internationalIdentifierExtensionG) {
    this.internationalIdentifierExtensionG = internationalIdentifierExtensionG;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternationalIdentifier internationalIdentifier = (InternationalIdentifier) o;
    return Objects.equals(this.country, internationalIdentifier.country) &&
        Objects.equals(this.nationalIdentifier, internationalIdentifier.nationalIdentifier) &&
        Objects.equals(this.internationalIdentifierExtensionG, internationalIdentifier.internationalIdentifierExtensionG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, nationalIdentifier, internationalIdentifierExtensionG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternationalIdentifier {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    nationalIdentifier: ").append(toIndentedString(nationalIdentifier)).append("\n");
    sb.append("    internationalIdentifierExtensionG: ").append(toIndentedString(internationalIdentifierExtensionG)).append("\n");
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

