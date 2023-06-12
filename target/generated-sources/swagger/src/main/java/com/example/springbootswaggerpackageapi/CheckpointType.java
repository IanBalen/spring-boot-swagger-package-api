package com.example.springbootswaggerpackageapi;

import java.util.Objects;
import com.example.springbootswaggerpackageapi.Characteristic;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Checkpoint Type
 */
@ApiModel(description = "Checkpoint Type")
@Validated

public class CheckpointType  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("date")
  private Date date = null;

  @JsonProperty("checkPost")
  private String checkPost = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("stateOrProvince")
  private String stateOrProvince = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("characteristics")
  @Valid
  private List<Characteristic> characteristics = null;

  public CheckpointType status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the package at the time of the scan event
   * @return status
  **/
  @ApiModelProperty(value = "Status of the package at the time of the scan event")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CheckpointType message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message describing the performed action e.g.: attempted delivery, departed from warehouse...
   * @return message
  **/
  @ApiModelProperty(value = "Message describing the performed action e.g.: attempted delivery, departed from warehouse...")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CheckpointType date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Date
   * @return date
  **/
  @ApiModelProperty(value = "Date")

  @Valid

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public CheckpointType checkPost(String checkPost) {
    this.checkPost = checkPost;
    return this;
  }

  /**
   * Location display name
   * @return checkPost
  **/
  @ApiModelProperty(value = "Location display name")


  public String getCheckPost() {
    return checkPost;
  }

  public void setCheckPost(String checkPost) {
    this.checkPost = checkPost;
  }

  public CheckpointType city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Local administrative name such as a city, town, municipality or council, partido, concello, etc. that might comprise smaller entities
   * @return city
  **/
  @ApiModelProperty(value = "Local administrative name such as a city, town, municipality or council, partido, concello, etc. that might comprise smaller entities")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CheckpointType stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * Region, state, or province
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "Region, state, or province")


  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public CheckpointType country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country(ISO 3166-1 alpha-3 digit code) that the address is in
   * @return country
  **/
  @ApiModelProperty(value = "Country(ISO 3166-1 alpha-3 digit code) that the address is in")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CheckpointType characteristics(List<Characteristic> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public CheckpointType addCharacteristicsItem(Characteristic characteristicsItem) {
    if (this.characteristics == null) {
      this.characteristics = new ArrayList<Characteristic>();
    }
    this.characteristics.add(characteristicsItem);
    return this;
  }

  /**
   * List of characteristics
   * @return characteristics
  **/
  @ApiModelProperty(value = "List of characteristics")

  @Valid

  public List<Characteristic> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(List<Characteristic> characteristics) {
    this.characteristics = characteristics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckpointType checkpointType = (CheckpointType) o;
    return Objects.equals(this.status, checkpointType.status) &&
        Objects.equals(this.message, checkpointType.message) &&
        Objects.equals(this.date, checkpointType.date) &&
        Objects.equals(this.checkPost, checkpointType.checkPost) &&
        Objects.equals(this.city, checkpointType.city) &&
        Objects.equals(this.stateOrProvince, checkpointType.stateOrProvince) &&
        Objects.equals(this.country, checkpointType.country) &&
        Objects.equals(this.characteristics, checkpointType.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, date, checkPost, city, stateOrProvince, country, characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckpointType {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    checkPost: ").append(toIndentedString(checkPost)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
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

