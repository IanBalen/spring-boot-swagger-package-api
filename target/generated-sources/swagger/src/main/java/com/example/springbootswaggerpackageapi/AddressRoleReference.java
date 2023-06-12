package com.example.springbootswaggerpackageapi;

import java.util.Objects;
import com.example.springbootswaggerpackageapi.TimePeriod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Used to provide information on Address role reference object
 */
@ApiModel(description = "Used to provide information on Address role reference object")
@Validated

public class AddressRoleReference  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  /**
   * Address role reference role   * `legal` legal role   * `billDelivery` billDelivery role   * `notificationDelivery` notificationDelivery role   * `goodsDelivery` goodsDelivery role  
   */
  public enum RoleEnum {
    GOODSDELIVERY("goodsDelivery"),
    
    CONTACT("contact"),
    
    BILLDELIVERY("billDelivery"),
    
    INSTALLATION("installation"),
    
    LEGAL("legal"),
    
    MAIN("main");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("role")
  private RoleEnum role = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  public AddressRoleReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Address role reference identifier
   * @return id
  **/
  @ApiModelProperty(value = "Address role reference identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AddressRoleReference href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Address role reference Hypertext Reference
   * @return href
  **/
  @ApiModelProperty(value = "Address role reference Hypertext Reference")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AddressRoleReference role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Address role reference role   * `legal` legal role   * `billDelivery` billDelivery role   * `notificationDelivery` notificationDelivery role   * `goodsDelivery` goodsDelivery role  
   * @return role
  **/
  @ApiModelProperty(value = "Address role reference role   * `legal` legal role   * `billDelivery` billDelivery role   * `notificationDelivery` notificationDelivery role   * `goodsDelivery` goodsDelivery role  ")


  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public AddressRoleReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Address role reference name
   * @return name
  **/
  @ApiModelProperty(value = "Address role reference name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddressRoleReference validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The time period that the role is valid for
   * @return validFor
  **/
  @ApiModelProperty(value = "The time period that the role is valid for")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressRoleReference addressRoleReference = (AddressRoleReference) o;
    return Objects.equals(this.id, addressRoleReference.id) &&
        Objects.equals(this.href, addressRoleReference.href) &&
        Objects.equals(this.role, addressRoleReference.role) &&
        Objects.equals(this.name, addressRoleReference.name) &&
        Objects.equals(this.validFor, addressRoleReference.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, role, name, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressRoleReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

