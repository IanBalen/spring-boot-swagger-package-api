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
 * Used to provide information on geographic code. Deprecated and shouldn&#39;t be used. Use \&quot;location\&quot; instead.
 */
@ApiModel(description = "Used to provide information on geographic code. Deprecated and shouldn't be used. Use \"location\" instead.")
@Validated

public class GeoCode  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  @JsonProperty("geographicDatum")
  private String geographicDatum = null;

  public GeoCode latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Geographic latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "Geographic latitude")


  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public GeoCode longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Geographic longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "Geographic longitude")


  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public GeoCode geographicDatum(String geographicDatum) {
    this.geographicDatum = geographicDatum;
    return this;
  }

  /**
   * Geodetic datum
   * @return geographicDatum
  **/
  @ApiModelProperty(value = "Geodetic datum")


  public String getGeographicDatum() {
    return geographicDatum;
  }

  public void setGeographicDatum(String geographicDatum) {
    this.geographicDatum = geographicDatum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoCode geoCode = (GeoCode) o;
    return Objects.equals(this.latitude, geoCode.latitude) &&
        Objects.equals(this.longitude, geoCode.longitude) &&
        Objects.equals(this.geographicDatum, geoCode.geographicDatum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, geographicDatum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoCode {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    geographicDatum: ").append(toIndentedString(geographicDatum)).append("\n");
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

