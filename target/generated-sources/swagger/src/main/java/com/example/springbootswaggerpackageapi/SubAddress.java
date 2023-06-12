package com.example.springbootswaggerpackageapi;

import java.util.Objects;
import com.example.springbootswaggerpackageapi.Characteristic;
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
 * It is used for addressing within a property in an urban area (country properties are often defined differently). It may refer to a building, a building cluster, or a floor of a multistory building.
 */
@ApiModel(description = "It is used for addressing within a property in an urban area (country properties are often defined differently). It may refer to a building, a building cluster, or a floor of a multistory building.")
@Validated

public class SubAddress  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("subUnitType")
  private String subUnitType = null;

  @JsonProperty("subUnitNumber")
  private String subUnitNumber = null;

  @JsonProperty("levelType")
  private String levelType = null;

  @JsonProperty("levelNumber")
  private String levelNumber = null;

  @JsonProperty("buildingName")
  private String buildingName = null;

  @JsonProperty("privateStreetNumber")
  private String privateStreetNumber = null;

  @JsonProperty("privateStreetName")
  private String privateStreetName = null;

  @JsonProperty("characteristics")
  @Valid
  private List<Characteristic> characteristics = null;

  public SubAddress id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique Identifier of the subAddress
   * @return id
  **/
  @ApiModelProperty(value = "Unique Identifier of the subAddress")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubAddress href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Href of the subAddress
   * @return href
  **/
  @ApiModelProperty(value = "Href of the subAddress")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public SubAddress type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of subAddress: it can be a subunit or a private street
   * @return type
  **/
  @ApiModelProperty(value = "Type of subAddress: it can be a subunit or a private street")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SubAddress name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the subAddress to identify it with a meaningful identification
   * @return name
  **/
  @ApiModelProperty(value = "Name of the subAddress to identify it with a meaningful identification")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubAddress subUnitType(String subUnitType) {
    this.subUnitType = subUnitType;
    return this;
  }

  /**
   * The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.
   * @return subUnitType
  **/
  @ApiModelProperty(value = "The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.")


  public String getSubUnitType() {
    return subUnitType;
  }

  public void setSubUnitType(String subUnitType) {
    this.subUnitType = subUnitType;
  }

  public SubAddress subUnitNumber(String subUnitNumber) {
    this.subUnitNumber = subUnitNumber;
    return this;
  }

  /**
   * The discriminator used for the subunit often just a simple number e.g. FLAT 5, may also be a range
   * @return subUnitNumber
  **/
  @ApiModelProperty(value = "The discriminator used for the subunit often just a simple number e.g. FLAT 5, may also be a range")


  public String getSubUnitNumber() {
    return subUnitNumber;
  }

  public void setSubUnitNumber(String subUnitNumber) {
    this.subUnitNumber = subUnitNumber;
  }

  public SubAddress levelType(String levelType) {
    this.levelType = levelType;
    return this;
  }

  /**
   * Describes level types within a building
   * @return levelType
  **/
  @ApiModelProperty(value = "Describes level types within a building")


  public String getLevelType() {
    return levelType;
  }

  public void setLevelType(String levelType) {
    this.levelType = levelType;
  }

  public SubAddress levelNumber(String levelNumber) {
    this.levelNumber = levelNumber;
    return this;
  }

  /**
   * Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2
   * @return levelNumber
  **/
  @ApiModelProperty(value = "Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2")


  public String getLevelNumber() {
    return levelNumber;
  }

  public void setLevelNumber(String levelNumber) {
    this.levelNumber = levelNumber;
  }

  public SubAddress buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  /**
   * Allows for buildings that have well-known names
   * @return buildingName
  **/
  @ApiModelProperty(value = "Allows for buildings that have well-known names")


  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public SubAddress privateStreetNumber(String privateStreetNumber) {
    this.privateStreetNumber = privateStreetNumber;
    return this;
  }

  /**
   * Private streets numbers internal to a private street
   * @return privateStreetNumber
  **/
  @ApiModelProperty(value = "Private streets numbers internal to a private street")


  public String getPrivateStreetNumber() {
    return privateStreetNumber;
  }

  public void setPrivateStreetNumber(String privateStreetNumber) {
    this.privateStreetNumber = privateStreetNumber;
  }

  public SubAddress privateStreetName(String privateStreetName) {
    this.privateStreetName = privateStreetName;
    return this;
  }

  /**
   * Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office
   * @return privateStreetName
  **/
  @ApiModelProperty(value = "Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office")


  public String getPrivateStreetName() {
    return privateStreetName;
  }

  public void setPrivateStreetName(String privateStreetName) {
    this.privateStreetName = privateStreetName;
  }

  public SubAddress characteristics(List<Characteristic> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public SubAddress addCharacteristicsItem(Characteristic characteristicsItem) {
    if (this.characteristics == null) {
      this.characteristics = new ArrayList<Characteristic>();
    }
    this.characteristics.add(characteristicsItem);
    return this;
  }

  /**
   * Telecom specific characteristics
   * @return characteristics
  **/
  @ApiModelProperty(value = "Telecom specific characteristics")

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
    SubAddress subAddress = (SubAddress) o;
    return Objects.equals(this.id, subAddress.id) &&
        Objects.equals(this.href, subAddress.href) &&
        Objects.equals(this.type, subAddress.type) &&
        Objects.equals(this.name, subAddress.name) &&
        Objects.equals(this.subUnitType, subAddress.subUnitType) &&
        Objects.equals(this.subUnitNumber, subAddress.subUnitNumber) &&
        Objects.equals(this.levelType, subAddress.levelType) &&
        Objects.equals(this.levelNumber, subAddress.levelNumber) &&
        Objects.equals(this.buildingName, subAddress.buildingName) &&
        Objects.equals(this.privateStreetNumber, subAddress.privateStreetNumber) &&
        Objects.equals(this.privateStreetName, subAddress.privateStreetName) &&
        Objects.equals(this.characteristics, subAddress.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, type, name, subUnitType, subUnitNumber, levelType, levelNumber, buildingName, privateStreetNumber, privateStreetName, characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAddress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subUnitType: ").append(toIndentedString(subUnitType)).append("\n");
    sb.append("    subUnitNumber: ").append(toIndentedString(subUnitNumber)).append("\n");
    sb.append("    levelType: ").append(toIndentedString(levelType)).append("\n");
    sb.append("    levelNumber: ").append(toIndentedString(levelNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    privateStreetNumber: ").append(toIndentedString(privateStreetNumber)).append("\n");
    sb.append("    privateStreetName: ").append(toIndentedString(privateStreetName)).append("\n");
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

