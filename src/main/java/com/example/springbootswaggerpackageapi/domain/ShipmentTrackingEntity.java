package com.example.springbootswaggerpackageapi.domain;

import com.example.springbootswaggerpackageapi.domain.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@Entity
@Table(name = "shipment_tracking")
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentTrackingEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "serial_version_uid", nullable = false)
    private Long serialVersionUID;

    @Column(name = "href")
    private String href;

    @Column(name = "carrier")
    private String carrier;

    @Column(name = "tracking_code")
    private String trackingCode;

    @Column(name = "carrier_tracking_url")
    private String carrierTrackingUrl;

    @Column(name = "tracking_date")
    private Date trackingDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "status_change_date")
    private Date statusChangeDate;

    @Column(name = "status_change_reason")
    private String statusChangeReason;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "estimated_delivery_date")
    private Date estimatedDeliveryDate;

    @ManyToOne
    @JoinColumn(name = "address_entity_from_id")
    private Address addressFrom;

    @ManyToOne
    @JoinColumn(name = "address_entity_to_id")
    private Address addressTo;

    @ElementCollection
    private List<CheckpointType> checkpoint = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH}, orphanRemoval = true)
    private List<OrderRefType> order = new ArrayList<>();

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "customer_ref_type_entity_id")
    private CustomerRefType relatedCustomer;

    @Column(name = "create_date")
    private Date createDate;

}