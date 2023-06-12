package com.example.springbootswaggerpackageapi;

import java.util.Objects;
import com.example.springbootswaggerpackageapi.Address;
import com.example.springbootswaggerpackageapi.Characteristic;
import com.example.springbootswaggerpackageapi.CheckpointType;
import com.example.springbootswaggerpackageapi.CustomerRefType;
import com.example.springbootswaggerpackageapi.OrderRefType;
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
 * Shipment Tracking Type
 */
@ApiModel(description = "Shipment Tracking Type")
@Validated

public class ShipmentTracking  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("carrier")
  private String carrier = null;

  @JsonProperty("trackingCode")
  private String trackingCode = null;

  @JsonProperty("carrierTrackingUrl")
  private String carrierTrackingUrl = null;

  @JsonProperty("trackingDate")
  private Date trackingDate = null;

  /**
   * Current status of the package   * `initialized` Package shipment is initialized   * `inProcess` Package packing is in process   * `processed` Package packing was processed   * `shipped` Pacakage is shipped   * `inCustoms` Pacakage is in customs   * `delivered` Pacakage is delivered   * `returned` Pacakage is returned   * `error` Pacakage shipment status is undetermined  
   */
  public enum StatusEnum {
    INITIALIZED("initialized"),
    
    INPROCESS("inProcess"),
    
    PROCESSED("processed"),
    
    SHIPPED("shipped"),
    
    INCUSTOMS("inCustoms"),
    
    DELIVERED("delivered"),
    
    RETURNED("returned"),
    
    ERROR("error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("statusChangeDate")
  private Date statusChangeDate = null;

  @JsonProperty("statusChangeReason")
  private String statusChangeReason = null;

  @JsonProperty("weight")
  private Float weight = null;

  @JsonProperty("estimatedDeliveryDate")
  private Date estimatedDeliveryDate = null;

  @JsonProperty("addressFrom")
  private Address addressFrom = null;

  @JsonProperty("addressTo")
  private Address addressTo = null;

  @JsonProperty("checkpoint")
  @Valid
  private List<CheckpointType> checkpoint = null;

  @JsonProperty("order")
  @Valid
  private List<OrderRefType> order = null;

  @JsonProperty("relatedCustomer")
  private CustomerRefType relatedCustomer = null;

  @JsonProperty("createDate")
  private Date createDate = null;

  @JsonProperty("characteristics")
  @Valid
  private List<Characteristic> characteristics = null;

  public ShipmentTracking id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the shipment
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the shipment")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShipmentTracking href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference to the shipment to be queried or to perform actions on it via API
   * @return href
  **/
  @ApiModelProperty(value = "Reference to the shipment to be queried or to perform actions on it via API")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ShipmentTracking carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Carrier that is performing the shipment
   * @return carrier
  **/
  @ApiModelProperty(value = "Carrier that is performing the shipment")


  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public ShipmentTracking trackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
    return this;
  }

  /**
   * Tracking code in the carrier network
   * @return trackingCode
  **/
  @ApiModelProperty(value = "Tracking code in the carrier network")


  public String getTrackingCode() {
    return trackingCode;
  }

  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }

  public ShipmentTracking carrierTrackingUrl(String carrierTrackingUrl) {
    this.carrierTrackingUrl = carrierTrackingUrl;
    return this;
  }

  /**
   * URL to a public page provided by the carrier that shows tracking details for this tracker
   * @return carrierTrackingUrl
  **/
  @ApiModelProperty(value = "URL to a public page provided by the carrier that shows tracking details for this tracker")


  public String getCarrierTrackingUrl() {
    return carrierTrackingUrl;
  }

  public void setCarrierTrackingUrl(String carrierTrackingUrl) {
    this.carrierTrackingUrl = carrierTrackingUrl;
  }

  public ShipmentTracking trackingDate(Date trackingDate) {
    this.trackingDate = trackingDate;
    return this;
  }

  /**
   * Date when the shipment began to be tracked
   * @return trackingDate
  **/
  @ApiModelProperty(value = "Date when the shipment began to be tracked")

  @Valid

  public Date getTrackingDate() {
    return trackingDate;
  }

  public void setTrackingDate(Date trackingDate) {
    this.trackingDate = trackingDate;
  }

  public ShipmentTracking status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of the package   * `initialized` Package shipment is initialized   * `inProcess` Package packing is in process   * `processed` Package packing was processed   * `shipped` Pacakage is shipped   * `inCustoms` Pacakage is in customs   * `delivered` Pacakage is delivered   * `returned` Pacakage is returned   * `error` Pacakage shipment status is undetermined  
   * @return status
  **/
  @ApiModelProperty(value = "Current status of the package   * `initialized` Package shipment is initialized   * `inProcess` Package packing is in process   * `processed` Package packing was processed   * `shipped` Pacakage is shipped   * `inCustoms` Pacakage is in customs   * `delivered` Pacakage is delivered   * `returned` Pacakage is returned   * `error` Pacakage shipment status is undetermined  ")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ShipmentTracking statusChangeDate(Date statusChangeDate) {
    this.statusChangeDate = statusChangeDate;
    return this;
  }

  /**
   * Date when the tracking status last changed
   * @return statusChangeDate
  **/
  @ApiModelProperty(value = "Date when the tracking status last changed")

  @Valid

  public Date getStatusChangeDate() {
    return statusChangeDate;
  }

  public void setStatusChangeDate(Date statusChangeDate) {
    this.statusChangeDate = statusChangeDate;
  }

  public ShipmentTracking statusChangeReason(String statusChangeReason) {
    this.statusChangeReason = statusChangeReason;
    return this;
  }

  /**
   * Text describing the reason for the status of the tracking
   * @return statusChangeReason
  **/
  @ApiModelProperty(value = "Text describing the reason for the status of the tracking")


  public String getStatusChangeReason() {
    return statusChangeReason;
  }

  public void setStatusChangeReason(String statusChangeReason) {
    this.statusChangeReason = statusChangeReason;
  }

  public ShipmentTracking weight(Float weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight of the package in grams
   * @return weight
  **/
  @ApiModelProperty(value = "Weight of the package in grams")


  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public ShipmentTracking estimatedDeliveryDate(Date estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
    return this;
  }

  /**
   * Estimated deliveryDate
   * @return estimatedDeliveryDate
  **/
  @ApiModelProperty(value = "Estimated deliveryDate")

  @Valid

  public Date getEstimatedDeliveryDate() {
    return estimatedDeliveryDate;
  }

  public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
  }

  public ShipmentTracking addressFrom(Address addressFrom) {
    this.addressFrom = addressFrom;
    return this;
  }

  /**
   * Structured textual way of describing how to find a Property in an urban area (country properties are often defined differently)
   * @return addressFrom
  **/
  @ApiModelProperty(value = "Structured textual way of describing how to find a Property in an urban area (country properties are often defined differently)")

  @Valid

  public Address getAddressFrom() {
    return addressFrom;
  }

  public void setAddressFrom(Address addressFrom) {
    this.addressFrom = addressFrom;
  }

  public ShipmentTracking addressTo(Address addressTo) {
    this.addressTo = addressTo;
    return this;
  }

  /**
   * Structured textual way of describing how to find a Property in an urban area (country properties are often defined differently)
   * @return addressTo
  **/
  @ApiModelProperty(value = "Structured textual way of describing how to find a Property in an urban area (country properties are often defined differently)")

  @Valid

  public Address getAddressTo() {
    return addressTo;
  }

  public void setAddressTo(Address addressTo) {
    this.addressTo = addressTo;
  }

  public ShipmentTracking checkpoint(List<CheckpointType> checkpoint) {
    this.checkpoint = checkpoint;
    return this;
  }

  public ShipmentTracking addCheckpointItem(CheckpointType checkpointItem) {
    if (this.checkpoint == null) {
      this.checkpoint = new ArrayList<CheckpointType>();
    }
    this.checkpoint.add(checkpointItem);
    return this;
  }

  /**
   * Checkpoint Type
   * @return checkpoint
  **/
  @ApiModelProperty(value = "Checkpoint Type")

  @Valid

  public List<CheckpointType> getCheckpoint() {
    return checkpoint;
  }

  public void setCheckpoint(List<CheckpointType> checkpoint) {
    this.checkpoint = checkpoint;
  }

  public ShipmentTracking order(List<OrderRefType> order) {
    this.order = order;
    return this;
  }

  public ShipmentTracking addOrderItem(OrderRefType orderItem) {
    if (this.order == null) {
      this.order = new ArrayList<OrderRefType>();
    }
    this.order.add(orderItem);
    return this;
  }

  /**
   * Order that triggered this shipment
   * @return order
  **/
  @ApiModelProperty(value = "Order that triggered this shipment")

  @Valid

  public List<OrderRefType> getOrder() {
    return order;
  }

  public void setOrder(List<OrderRefType> order) {
    this.order = order;
  }

  public ShipmentTracking relatedCustomer(CustomerRefType relatedCustomer) {
    this.relatedCustomer = relatedCustomer;
    return this;
  }

  /**
   * Related customer on shipment tracking
   * @return relatedCustomer
  **/
  @ApiModelProperty(value = "Related customer on shipment tracking")

  @Valid

  public CustomerRefType getRelatedCustomer() {
    return relatedCustomer;
  }

  public void setRelatedCustomer(CustomerRefType relatedCustomer) {
    this.relatedCustomer = relatedCustomer;
  }

  public ShipmentTracking createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Date when tracking shipment was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Date when tracking shipment was created")

  @Valid

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public ShipmentTracking characteristics(List<Characteristic> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public ShipmentTracking addCharacteristicsItem(Characteristic characteristicsItem) {
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
    ShipmentTracking shipmentTracking = (ShipmentTracking) o;
    return Objects.equals(this.id, shipmentTracking.id) &&
        Objects.equals(this.href, shipmentTracking.href) &&
        Objects.equals(this.carrier, shipmentTracking.carrier) &&
        Objects.equals(this.trackingCode, shipmentTracking.trackingCode) &&
        Objects.equals(this.carrierTrackingUrl, shipmentTracking.carrierTrackingUrl) &&
        Objects.equals(this.trackingDate, shipmentTracking.trackingDate) &&
        Objects.equals(this.status, shipmentTracking.status) &&
        Objects.equals(this.statusChangeDate, shipmentTracking.statusChangeDate) &&
        Objects.equals(this.statusChangeReason, shipmentTracking.statusChangeReason) &&
        Objects.equals(this.weight, shipmentTracking.weight) &&
        Objects.equals(this.estimatedDeliveryDate, shipmentTracking.estimatedDeliveryDate) &&
        Objects.equals(this.addressFrom, shipmentTracking.addressFrom) &&
        Objects.equals(this.addressTo, shipmentTracking.addressTo) &&
        Objects.equals(this.checkpoint, shipmentTracking.checkpoint) &&
        Objects.equals(this.order, shipmentTracking.order) &&
        Objects.equals(this.relatedCustomer, shipmentTracking.relatedCustomer) &&
        Objects.equals(this.createDate, shipmentTracking.createDate) &&
        Objects.equals(this.characteristics, shipmentTracking.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, carrier, trackingCode, carrierTrackingUrl, trackingDate, status, statusChangeDate, statusChangeReason, weight, estimatedDeliveryDate, addressFrom, addressTo, checkpoint, order, relatedCustomer, createDate, characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentTracking {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
    sb.append("    carrierTrackingUrl: ").append(toIndentedString(carrierTrackingUrl)).append("\n");
    sb.append("    trackingDate: ").append(toIndentedString(trackingDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangeDate: ").append(toIndentedString(statusChangeDate)).append("\n");
    sb.append("    statusChangeReason: ").append(toIndentedString(statusChangeReason)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    estimatedDeliveryDate: ").append(toIndentedString(estimatedDeliveryDate)).append("\n");
    sb.append("    addressFrom: ").append(toIndentedString(addressFrom)).append("\n");
    sb.append("    addressTo: ").append(toIndentedString(addressTo)).append("\n");
    sb.append("    checkpoint: ").append(toIndentedString(checkpoint)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    relatedCustomer: ").append(toIndentedString(relatedCustomer)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

