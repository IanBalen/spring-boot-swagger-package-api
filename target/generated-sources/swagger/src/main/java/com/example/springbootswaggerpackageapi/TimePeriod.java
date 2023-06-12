package com.example.springbootswaggerpackageapi;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TimePeriod
 */
@Validated

public class TimePeriod  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("startDateTime")
  private Date startDateTime = null;

  @JsonProperty("endDateTime")
  private Date endDateTime = null;

  public TimePeriod startDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Beginning of the time period
   * @return startDateTime
  **/
  @ApiModelProperty(value = "Beginning of the time period")

  @Valid

  public Date getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }

  public TimePeriod endDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * End of the time period
   * @return endDateTime
  **/
  @ApiModelProperty(value = "End of the time period")

  @Valid

  public Date getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(this.startDateTime, timePeriod.startDateTime) &&
        Objects.equals(this.endDateTime, timePeriod.endDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDateTime, endDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
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

