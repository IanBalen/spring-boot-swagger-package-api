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
 * A GeographicPoint defines a geographic point through coordinates.
 */
@ApiModel(description = "A GeographicPoint defines a geographic point through coordinates.")
@Validated

public class Point  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("x")
  private String x = null;

  @JsonProperty("y")
  private String y = null;

  @JsonProperty("z")
  private String z = null;

  public Point x(String x) {
    this.x = x;
    return this;
  }

  /**
   * x coordinate (usually latitude)
   * @return x
  **/
  @ApiModelProperty(value = "x coordinate (usually latitude)")


  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public Point y(String y) {
    this.y = y;
    return this;
  }

  /**
   * y coordinate (usually longitude)
   * @return y
  **/
  @ApiModelProperty(value = "y coordinate (usually longitude)")


  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }

  public Point z(String z) {
    this.z = z;
    return this;
  }

  /**
   * z coordinate (usually elevation)
   * @return z
  **/
  @ApiModelProperty(value = "z coordinate (usually elevation)")


  public String getZ() {
    return z;
  }

  public void setZ(String z) {
    this.z = z;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Point point = (Point) o;
    return Objects.equals(this.x, point.x) &&
        Objects.equals(this.y, point.y) &&
        Objects.equals(this.z, point.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Point {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

