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
 * Related customer on shipment tracking
 */
@ApiModel(description = "Related customer on shipment tracking")
@Validated

public class CustomerRefType  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  public CustomerRefType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Customer ID
   * @return id
  **/
  @ApiModelProperty(value = "Customer ID")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerRefType href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Resource URI
   * @return href
  **/
  @ApiModelProperty(value = "Resource URI")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CustomerRefType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Customer name
   * @return name
  **/
  @ApiModelProperty(value = "Customer name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerRefType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Customer description
   * @return description
  **/
  @ApiModelProperty(value = "Customer description")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRefType customerRefType = (CustomerRefType) o;
    return Objects.equals(this.id, customerRefType.id) &&
        Objects.equals(this.href, customerRefType.href) &&
        Objects.equals(this.name, customerRefType.name) &&
        Objects.equals(this.description, customerRefType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRefType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

