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
 * Characteristic
 */
@Validated

public class Characteristic  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  public Characteristic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * characteristic name
   * @return name
  **/
  @ApiModelProperty(value = "characteristic name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Characteristic value(String value) {
    this.value = value;
    return this;
  }

  /**
   * characteristic value
   * @return value
  **/
  @ApiModelProperty(value = "characteristic value")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Characteristic characteristic = (Characteristic) o;
    return Objects.equals(this.name, characteristic.name) &&
        Objects.equals(this.value, characteristic.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Characteristic {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

