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
 * Reference to an order that can typically be queried with another API
 */
@ApiModel(description = "Reference to an order that can typically be queried with another API")
@Validated

public class OrderRefType  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("referredType")
  private String referredType = null;

  public OrderRefType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the order
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the order")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderRefType href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URI where to query or perform actions on the order
   * @return href
  **/
  @ApiModelProperty(value = "URI where to query or perform actions on the order")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public OrderRefType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Screen name of the order
   * @return name
  **/
  @ApiModelProperty(value = "Screen name of the order")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderRefType referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * Type of the referred order in case it is polymorphic
   * @return referredType
  **/
  @ApiModelProperty(value = "Type of the referred order in case it is polymorphic")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRefType orderRefType = (OrderRefType) o;
    return Objects.equals(this.id, orderRefType.id) &&
        Objects.equals(this.href, orderRefType.href) &&
        Objects.equals(this.name, orderRefType.name) &&
        Objects.equals(this.referredType, orderRefType.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRefType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

