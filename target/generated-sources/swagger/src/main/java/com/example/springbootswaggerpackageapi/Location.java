package com.example.springbootswaggerpackageapi;

import java.util.Objects;
import com.example.springbootswaggerpackageapi.Point;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A GeographicLocation allows describing through coordinate(s) a point, a line or a space.
 */
@ApiModel(description = "A GeographicLocation allows describing through coordinate(s) a point, a line or a space.")
@Validated

public class Location  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("geometryType")
  private String geometryType = null;

  @JsonProperty("accuracy")
  private String accuracy = null;

  @JsonProperty("spatialRef")
  private String spatialRef = null;

  @JsonProperty("geometry")
  @Valid
  private List<Point> geometry = null;

  public Location id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique Identifier of a GeoLocation
   * @return id
  **/
  @ApiModelProperty(value = "Unique Identifier of a GeoLocation")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Location href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Href of the GeoLocation
   * @return href
  **/
  @ApiModelProperty(value = "Href of the GeoLocation")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Location name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of a GeoLocation
   * @return name
  **/
  @ApiModelProperty(value = "Name of a GeoLocation")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location geometryType(String geometryType) {
    this.geometryType = geometryType;
    return this;
  }

  /**
   * Type allows describing Geolocation form: it could be a point, a line, a polygon, a cylinder, etc...
   * @return geometryType
  **/
  @ApiModelProperty(value = "Type allows describing Geolocation form: it could be a point, a line, a polygon, a cylinder, etc...")


  public String getGeometryType() {
    return geometryType;
  }

  public void setGeometryType(String geometryType) {
    this.geometryType = geometryType;
  }

  public Location accuracy(String accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * Accuracy
   * @return accuracy
  **/
  @ApiModelProperty(value = "Accuracy")


  public String getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(String accuracy) {
    this.accuracy = accuracy;
  }

  public Location spatialRef(String spatialRef) {
    this.spatialRef = spatialRef;
    return this;
  }

  /**
   * Spatial reference
   * @return spatialRef
  **/
  @ApiModelProperty(value = "Spatial reference")


  public String getSpatialRef() {
    return spatialRef;
  }

  public void setSpatialRef(String spatialRef) {
    this.spatialRef = spatialRef;
  }

  public Location geometry(List<Point> geometry) {
    this.geometry = geometry;
    return this;
  }

  public Location addGeometryItem(Point geometryItem) {
    if (this.geometry == null) {
      this.geometry = new ArrayList<Point>();
    }
    this.geometry.add(geometryItem);
    return this;
  }

  /**
   * Geographical points related to location
   * @return geometry
  **/
  @ApiModelProperty(value = "Geographical points related to location")

  @Valid

  public List<Point> getGeometry() {
    return geometry;
  }

  public void setGeometry(List<Point> geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.href, location.href) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.geometryType, location.geometryType) &&
        Objects.equals(this.accuracy, location.accuracy) &&
        Objects.equals(this.spatialRef, location.spatialRef) &&
        Objects.equals(this.geometry, location.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, geometryType, accuracy, spatialRef, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    geometryType: ").append(toIndentedString(geometryType)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    spatialRef: ").append(toIndentedString(spatialRef)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

