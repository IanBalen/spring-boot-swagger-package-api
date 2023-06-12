package com.example.springbootswaggerpackageapi;

import java.util.Objects;
import com.example.springbootswaggerpackageapi.AddressRoleReference;
import com.example.springbootswaggerpackageapi.Audit;
import com.example.springbootswaggerpackageapi.Characteristic;
import com.example.springbootswaggerpackageapi.GeoCode;
import com.example.springbootswaggerpackageapi.Location;
import com.example.springbootswaggerpackageapi.SubAddress;
import com.example.springbootswaggerpackageapi.TimePeriod;
import com.example.springbootswaggerpackageapi.VersionReference;
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
 * Structured textual way of describing how to find a Property in an urban area (country properties are often defined differently).
 */
@ApiModel(description = "Structured textual way of describing how to find a Property in an urban area (country properties are often defined differently).")
@Validated

public class Address  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("addressRole")
  private AddressRoleReference addressRole = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("streetNr")
  private String streetNr = null;

  @JsonProperty("streetNrSuffix")
  private String streetNrSuffix = null;

  @JsonProperty("streetNrLast")
  private String streetNrLast = null;

  @JsonProperty("streetNrLastSuffix")
  private String streetNrLastSuffix = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("streetType")
  private String streetType = null;

  @JsonProperty("streetSuffix")
  private String streetSuffix = null;

  @JsonProperty("postcode")
  private String postcode = null;

  @JsonProperty("locality")
  private String locality = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("stateOrProvince")
  private String stateOrProvince = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("geoCode")
  private GeoCode geoCode = null;

  @JsonProperty("fullAddressName")
  private String fullAddressName = null;

  @JsonProperty("characteristics")
  @Valid
  private List<Characteristic> characteristics = null;

  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("subAddresses")
  @Valid
  private List<SubAddress> subAddresses = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("audit")
  private Audit audit = null;

  @JsonProperty("addressSpecRef")
  private VersionReference addressSpecRef = null;

  public Address id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the address
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the address")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Address href(String href) {
    this.href = href;
    return this;
  }

  /**
   * An URI used to access to the address resource
   * @return href
  **/
  @ApiModelProperty(value = "An URI used to access to the address resource")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Address addressRole(AddressRoleReference addressRole) {
    this.addressRole = addressRole;
    return this;
  }

  /**
   * Address role
   * @return addressRole
  **/
  @ApiModelProperty(value = "Address role")

  @Valid

  public AddressRoleReference getAddressRole() {
    return addressRole;
  }

  public void setAddressRole(AddressRoleReference addressRole) {
    this.addressRole = addressRole;
  }

  public Address validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Address role validity
   * @return validFor
  **/
  @ApiModelProperty(value = "Address role validity")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public Address streetNr(String streetNr) {
    this.streetNr = streetNr;
    return this;
  }

  /**
   * Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses
   * @return streetNr
  **/
  @ApiModelProperty(value = "Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses")


  public String getStreetNr() {
    return streetNr;
  }

  public void setStreetNr(String streetNr) {
    this.streetNr = streetNr;
  }

  public Address streetNrSuffix(String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
    return this;
  }

  /**
   * The first street number suffix
   * @return streetNrSuffix
  **/
  @ApiModelProperty(value = "The first street number suffix")


  public String getStreetNrSuffix() {
    return streetNrSuffix;
  }

  public void setStreetNrSuffix(String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
  }

  public Address streetNrLast(String streetNrLast) {
    this.streetNrLast = streetNrLast;
    return this;
  }

  /**
   * Last number in a range of street numbers allocated to a property
   * @return streetNrLast
  **/
  @ApiModelProperty(value = "Last number in a range of street numbers allocated to a property")


  public String getStreetNrLast() {
    return streetNrLast;
  }

  public void setStreetNrLast(String streetNrLast) {
    this.streetNrLast = streetNrLast;
  }

  public Address streetNrLastSuffix(String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
    return this;
  }

  /**
   * Last street number suffix for a ranged address
   * @return streetNrLastSuffix
  **/
  @ApiModelProperty(value = "Last street number suffix for a ranged address")


  public String getStreetNrLastSuffix() {
    return streetNrLastSuffix;
  }

  public void setStreetNrLastSuffix(String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
  }

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of the street or other street type
   * @return streetName
  **/
  @ApiModelProperty(value = "Name of the street or other street type")


  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Address streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

  /**
   * Alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf
   * @return streetType
  **/
  @ApiModelProperty(value = "Alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf")


  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public Address streetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
    return this;
  }

  /**
   * A modifier denoting a relative direction
   * @return streetSuffix
  **/
  @ApiModelProperty(value = "A modifier denoting a relative direction")


  public String getStreetSuffix() {
    return streetSuffix;
  }

  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

  public Address postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as zipcode)
   * @return postcode
  **/
  @ApiModelProperty(value = "Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as zipcode)")


  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Address locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Locality (suburb, principality, ...)
   * @return locality
  **/
  @ApiModelProperty(value = "Locality (suburb, principality, ...)")


  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City that the address is in
   * @return city
  **/
  @ApiModelProperty(value = "City that the address is in")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * The State or Province that the address is in
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "The State or Province that the address is in")


  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public Address country(String country) {
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

  public Address geoCode(GeoCode geoCode) {
    this.geoCode = geoCode;
    return this;
  }

  /**
   * Geographic code of the address
   * @return geoCode
  **/
  @ApiModelProperty(value = "Geographic code of the address")

  @Valid

  public GeoCode getGeoCode() {
    return geoCode;
  }

  public void setGeoCode(GeoCode geoCode) {
    this.geoCode = geoCode;
  }

  public Address fullAddressName(String fullAddressName) {
    this.fullAddressName = fullAddressName;
    return this;
  }

  /**
   * Full address name used for presentation purposes
   * @return fullAddressName
  **/
  @ApiModelProperty(value = "Full address name used for presentation purposes")


  public String getFullAddressName() {
    return fullAddressName;
  }

  public void setFullAddressName(String fullAddressName) {
    this.fullAddressName = fullAddressName;
  }

  public Address characteristics(List<Characteristic> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public Address addCharacteristicsItem(Characteristic characteristicsItem) {
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

  public Address location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Geographical location of the address
   * @return location
  **/
  @ApiModelProperty(value = "Geographical location of the address")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Address subAddresses(List<SubAddress> subAddresses) {
    this.subAddresses = subAddresses;
    return this;
  }

  public Address addSubAddressesItem(SubAddress subAddressesItem) {
    if (this.subAddresses == null) {
      this.subAddresses = new ArrayList<SubAddress>();
    }
    this.subAddresses.add(subAddressesItem);
    return this;
  }

  /**
   * Addressing within a property (building, floor, ...)
   * @return subAddresses
  **/
  @ApiModelProperty(value = "Addressing within a property (building, floor, ...)")

  @Valid

  public List<SubAddress> getSubAddresses() {
    return subAddresses;
  }

  public void setSubAddresses(List<SubAddress> subAddresses) {
    this.subAddresses = subAddresses;
  }

  public Address note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Note
   * @return note
  **/
  @ApiModelProperty(value = "Note")


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Address audit(Audit audit) {
    this.audit = audit;
    return this;
  }

  /**
   * Used to provide an Audit object
   * @return audit
  **/
  @ApiModelProperty(value = "Used to provide an Audit object")

  @Valid

  public Audit getAudit() {
    return audit;
  }

  public void setAudit(Audit audit) {
    this.audit = audit;
  }

  public Address addressSpecRef(VersionReference addressSpecRef) {
    this.addressSpecRef = addressSpecRef;
    return this;
  }

  /**
   * Address specification reference
   * @return addressSpecRef
  **/
  @ApiModelProperty(value = "Address specification reference")

  @Valid

  public VersionReference getAddressSpecRef() {
    return addressSpecRef;
  }

  public void setAddressSpecRef(VersionReference addressSpecRef) {
    this.addressSpecRef = addressSpecRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.id, address.id) &&
        Objects.equals(this.href, address.href) &&
        Objects.equals(this.addressRole, address.addressRole) &&
        Objects.equals(this.validFor, address.validFor) &&
        Objects.equals(this.streetNr, address.streetNr) &&
        Objects.equals(this.streetNrSuffix, address.streetNrSuffix) &&
        Objects.equals(this.streetNrLast, address.streetNrLast) &&
        Objects.equals(this.streetNrLastSuffix, address.streetNrLastSuffix) &&
        Objects.equals(this.streetName, address.streetName) &&
        Objects.equals(this.streetType, address.streetType) &&
        Objects.equals(this.streetSuffix, address.streetSuffix) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.locality, address.locality) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.stateOrProvince, address.stateOrProvince) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.geoCode, address.geoCode) &&
        Objects.equals(this.fullAddressName, address.fullAddressName) &&
        Objects.equals(this.characteristics, address.characteristics) &&
        Objects.equals(this.location, address.location) &&
        Objects.equals(this.subAddresses, address.subAddresses) &&
        Objects.equals(this.note, address.note) &&
        Objects.equals(this.audit, address.audit) &&
        Objects.equals(this.addressSpecRef, address.addressSpecRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, addressRole, validFor, streetNr, streetNrSuffix, streetNrLast, streetNrLastSuffix, streetName, streetType, streetSuffix, postcode, locality, city, stateOrProvince, country, geoCode, fullAddressName, characteristics, location, subAddresses, note, audit, addressSpecRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    addressRole: ").append(toIndentedString(addressRole)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    streetNr: ").append(toIndentedString(streetNr)).append("\n");
    sb.append("    streetNrSuffix: ").append(toIndentedString(streetNrSuffix)).append("\n");
    sb.append("    streetNrLast: ").append(toIndentedString(streetNrLast)).append("\n");
    sb.append("    streetNrLastSuffix: ").append(toIndentedString(streetNrLastSuffix)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    geoCode: ").append(toIndentedString(geoCode)).append("\n");
    sb.append("    fullAddressName: ").append(toIndentedString(fullAddressName)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    subAddresses: ").append(toIndentedString(subAddresses)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
    sb.append("    addressSpecRef: ").append(toIndentedString(addressSpecRef)).append("\n");
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

