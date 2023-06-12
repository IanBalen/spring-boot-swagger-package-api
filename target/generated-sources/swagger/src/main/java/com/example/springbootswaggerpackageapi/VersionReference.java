package com.example.springbootswaggerpackageapi;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Generic link to another versioning resource
 */
@ApiModel(description = "Generic link to another versioning resource")
@Validated

public class VersionReference  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  public VersionReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the Reference
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the Reference")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VersionReference href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URI of the Reference
   * @return href
  **/
  @ApiModelProperty(value = "URI of the Reference")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public VersionReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Reference
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Reference")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionReference version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the Reference
   * @return version
  **/
  @ApiModelProperty(value = "Version of the Reference")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionReference versionReference = (VersionReference) o;
    return Objects.equals(this.id, versionReference.id) &&
        Objects.equals(this.href, versionReference.href) &&
        Objects.equals(this.name, versionReference.name) &&
        Objects.equals(this.version, versionReference.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

