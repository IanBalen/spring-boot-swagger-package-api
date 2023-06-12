package com.example.springbootswaggerpackageapi;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Default error message template
 */
@ApiModel(description = "Default error message template")
@Validated

public class Error  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("timestamp")
  private Date timestamp = null;

  @JsonProperty("isTitleEnabled")
  private Boolean isTitleEnabled = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("htmlLabel")
  private String htmlLabel = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("retryable")
  private Boolean retryable = null;

  /**
   * Describes severity of error. Order from most to least critical is: FATAL, ERROR, WARN, INFO, DEBUG, TRACE * `FATAL` Designates very severe error events that will presumably lead the application to abort.   * `ERROR` Designates error events that might still allow the application to continue running.   * `WARN` Designates potentially harmful situations.   * `INFO` Designates informational messages that highlight the progress of the application at coarse-grained level.   * `DEBUG` Designates fine-grained informational events that are most useful to debug an application.   * `TRACE` Designates finer-grained informational events than the DEBUG. 
   */
  public enum SeverityEnum {
    FATAL("FATAL"),
    
    ERROR("ERROR"),
    
    WARN("WARN"),
    
    INFO("INFO"),
    
    DEBUG("DEBUG"),
    
    TRACE("TRACE");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("severity")
  private SeverityEnum severity = null;

  @JsonProperty("details")
  @Valid
  private List<Object> details = null;

  public Error id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique error ID, used for logging purposes, UUID format
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique error ID, used for logging purposes, UUID format")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * A string coding the error type. This is given to caller so he can translate them if required.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "A string coding the error type. This is given to caller so he can translate them if required.")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Exact time of error
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Exact time of error")
  @NotNull

  @Valid

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public Error isTitleEnabled(Boolean isTitleEnabled) {
    this.isTitleEnabled = isTitleEnabled;
    return this;
  }

  /**
   * A boolean that provides info is will title be shown.
   * @return isTitleEnabled
  **/
  @ApiModelProperty(value = "A boolean that provides info is will title be shown.")


  public Boolean isIsTitleEnabled() {
    return isTitleEnabled;
  }

  public void setIsTitleEnabled(Boolean isTitleEnabled) {
    this.isTitleEnabled = isTitleEnabled;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A short localized string that describes the error.
   * @return message
  **/
  @ApiModelProperty(value = "A short localized string that describes the error.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A localized string used for error title.
   * @return title
  **/
  @ApiModelProperty(value = "A localized string used for error title.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Error htmlLabel(String htmlLabel) {
    this.htmlLabel = htmlLabel;
    return this;
  }

  /**
   * A localized string used for error presentation. Label with HTML support
   * @return htmlLabel
  **/
  @ApiModelProperty(value = "A localized string used for error presentation. Label with HTML support")


  public String getHtmlLabel() {
    return htmlLabel;
  }

  public void setHtmlLabel(String htmlLabel) {
    this.htmlLabel = htmlLabel;
  }

  public Error label(String label) {
    this.label = label;
    return this;
  }

  /**
   * A localized string used for error presentation.
   * @return label
  **/
  @ApiModelProperty(value = "A localized string used for error presentation.")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Error retryable(Boolean retryable) {
    this.retryable = retryable;
    return this;
  }

  /**
   * A boolean that provides info is request retryable
   * @return retryable
  **/
  @ApiModelProperty(value = "A boolean that provides info is request retryable")


  public Boolean isRetryable() {
    return retryable;
  }

  public void setRetryable(Boolean retryable) {
    this.retryable = retryable;
  }

  public Error severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Describes severity of error. Order from most to least critical is: FATAL, ERROR, WARN, INFO, DEBUG, TRACE * `FATAL` Designates very severe error events that will presumably lead the application to abort.   * `ERROR` Designates error events that might still allow the application to continue running.   * `WARN` Designates potentially harmful situations.   * `INFO` Designates informational messages that highlight the progress of the application at coarse-grained level.   * `DEBUG` Designates fine-grained informational events that are most useful to debug an application.   * `TRACE` Designates finer-grained informational events than the DEBUG. 
   * @return severity
  **/
  @ApiModelProperty(value = "Describes severity of error. Order from most to least critical is: FATAL, ERROR, WARN, INFO, DEBUG, TRACE * `FATAL` Designates very severe error events that will presumably lead the application to abort.   * `ERROR` Designates error events that might still allow the application to continue running.   * `WARN` Designates potentially harmful situations.   * `INFO` Designates informational messages that highlight the progress of the application at coarse-grained level.   * `DEBUG` Designates fine-grained informational events that are most useful to debug an application.   * `TRACE` Designates finer-grained informational events than the DEBUG. ")


  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Error details(List<Object> details) {
    this.details = details;
    return this;
  }

  public Error addDetailsItem(Object detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<Object>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Exception detailed info
   * @return details
  **/
  @ApiModelProperty(value = "Exception detailed info")


  public List<Object> getDetails() {
    return details;
  }

  public void setDetails(List<Object> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.id, error.id) &&
        Objects.equals(this.code, error.code) &&
        Objects.equals(this.timestamp, error.timestamp) &&
        Objects.equals(this.isTitleEnabled, error.isTitleEnabled) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.title, error.title) &&
        Objects.equals(this.htmlLabel, error.htmlLabel) &&
        Objects.equals(this.label, error.label) &&
        Objects.equals(this.retryable, error.retryable) &&
        Objects.equals(this.severity, error.severity) &&
        Objects.equals(this.details, error.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, timestamp, isTitleEnabled, message, title, htmlLabel, label, retryable, severity, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    isTitleEnabled: ").append(toIndentedString(isTitleEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    htmlLabel: ").append(toIndentedString(htmlLabel)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    retryable: ").append(toIndentedString(retryable)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

