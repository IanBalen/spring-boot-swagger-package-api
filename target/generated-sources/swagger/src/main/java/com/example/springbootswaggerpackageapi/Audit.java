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
 * Used to provide auditing data.
 */
@ApiModel(description = "Used to provide auditing data.")
@Validated

public class Audit  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("createdDate")
  private Date createdDate = null;

  @JsonProperty("changedBy")
  private String changedBy = null;

  @JsonProperty("changedDate")
  private Date changedDate = null;

  @JsonProperty("entityVersion")
  private String entityVersion = null;

  @JsonProperty("tagId")
  private String tagId = null;

  @JsonProperty("spanId")
  private String spanId = null;

  @JsonProperty("changeReason")
  private String changeReason = null;

  @JsonProperty("sourceSystem")
  private String sourceSystem = null;

  @JsonProperty("sourceSystemUser")
  private String sourceSystemUser = null;

  @JsonProperty("characteristics")
  @Valid
  private List<Characteristic> characteristics = null;

  public Audit id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Audit ID.
   * @return id
  **/
  @ApiModelProperty(value = "Audit ID.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Audit createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * User that created the record.
   * @return createdBy
  **/
  @ApiModelProperty(value = "User that created the record.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Audit createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Date when the record was created.
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date when the record was created.")

  @Valid

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public Audit changedBy(String changedBy) {
    this.changedBy = changedBy;
    return this;
  }

  /**
   * User who modified the record
   * @return changedBy
  **/
  @ApiModelProperty(value = "User who modified the record")


  public String getChangedBy() {
    return changedBy;
  }

  public void setChangedBy(String changedBy) {
    this.changedBy = changedBy;
  }

  public Audit changedDate(Date changedDate) {
    this.changedDate = changedDate;
    return this;
  }

  /**
   * Date when the record was modified.
   * @return changedDate
  **/
  @ApiModelProperty(value = "Date when the record was modified.")

  @Valid

  public Date getChangedDate() {
    return changedDate;
  }

  public void setChangedDate(Date changedDate) {
    this.changedDate = changedDate;
  }

  public Audit entityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
    return this;
  }

  /**
   * Version of record. Starts with 0 on insert and is increased by one on each update. -1 for deleted records.
   * @return entityVersion
  **/
  @ApiModelProperty(value = "Version of record. Starts with 0 on insert and is increased by one on each update. -1 for deleted records.")


  public String getEntityVersion() {
    return entityVersion;
  }

  public void setEntityVersion(String entityVersion) {
    this.entityVersion = entityVersion;
  }

  public Audit tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

  /**
   * Tag Id.
   * @return tagId
  **/
  @ApiModelProperty(value = "Tag Id.")


  public String getTagId() {
    return tagId;
  }

  public void setTagId(String tagId) {
    this.tagId = tagId;
  }

  public Audit spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Span Id.
   * @return spanId
  **/
  @ApiModelProperty(value = "Span Id.")


  public String getSpanId() {
    return spanId;
  }

  public void setSpanId(String spanId) {
    this.spanId = spanId;
  }

  public Audit changeReason(String changeReason) {
    this.changeReason = changeReason;
    return this;
  }

  /**
   * Reason why change has made.
   * @return changeReason
  **/
  @ApiModelProperty(value = "Reason why change has made.")


  public String getChangeReason() {
    return changeReason;
  }

  public void setChangeReason(String changeReason) {
    this.changeReason = changeReason;
  }

  public Audit sourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
    return this;
  }

  /**
   * Source system that initiated change.
   * @return sourceSystem
  **/
  @ApiModelProperty(value = "Source system that initiated change.")


  public String getSourceSystem() {
    return sourceSystem;
  }

  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }

  public Audit sourceSystemUser(String sourceSystemUser) {
    this.sourceSystemUser = sourceSystemUser;
    return this;
  }

  /**
   * Source system User that initiated change.
   * @return sourceSystemUser
  **/
  @ApiModelProperty(value = "Source system User that initiated change.")


  public String getSourceSystemUser() {
    return sourceSystemUser;
  }

  public void setSourceSystemUser(String sourceSystemUser) {
    this.sourceSystemUser = sourceSystemUser;
  }

  public Audit characteristics(List<Characteristic> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public Audit addCharacteristicsItem(Characteristic characteristicsItem) {
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
    Audit audit = (Audit) o;
    return Objects.equals(this.id, audit.id) &&
        Objects.equals(this.createdBy, audit.createdBy) &&
        Objects.equals(this.createdDate, audit.createdDate) &&
        Objects.equals(this.changedBy, audit.changedBy) &&
        Objects.equals(this.changedDate, audit.changedDate) &&
        Objects.equals(this.entityVersion, audit.entityVersion) &&
        Objects.equals(this.tagId, audit.tagId) &&
        Objects.equals(this.spanId, audit.spanId) &&
        Objects.equals(this.changeReason, audit.changeReason) &&
        Objects.equals(this.sourceSystem, audit.sourceSystem) &&
        Objects.equals(this.sourceSystemUser, audit.sourceSystemUser) &&
        Objects.equals(this.characteristics, audit.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, createdDate, changedBy, changedDate, entityVersion, tagId, spanId, changeReason, sourceSystem, sourceSystemUser, characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    changedBy: ").append(toIndentedString(changedBy)).append("\n");
    sb.append("    changedDate: ").append(toIndentedString(changedDate)).append("\n");
    sb.append("    entityVersion: ").append(toIndentedString(entityVersion)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    sourceSystemUser: ").append(toIndentedString(sourceSystemUser)).append("\n");
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

