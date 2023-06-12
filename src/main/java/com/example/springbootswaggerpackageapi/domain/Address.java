package com.example.springbootswaggerpackageapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "serial_version_uid", nullable = false)
    private Long serialVersionUID;

    @Column(name = "href")
    private String href;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH}, orphanRemoval = true)
    @JoinColumn(name = "address_role_reference_entity_id")
    private AddressRoleReference addressRole;

    @Column(name = "street_nr")
    private String streetNr;

    @Column(name = "street_nr_suffix")
    private String streetNrSuffix;

    @Column(name = "street_nr_last")
    private String streetNrLast;

    @Column(name = "street_nr_last_suffix")
    private String streetNrLastSuffix;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "street_type")
    private String streetType;

    @Column(name = "street_suffix")
    private String streetSuffix;

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "locality")
    private String locality;

    @Column(name = "city")
    private String city;

    @Column(name = "state_or_province")
    private String stateOrProvince;

    @Column(name = "country")
    private String country;

    @Column(name = "full_address_name")
    private String fullAddressName;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "location_entity_id")
    private Location location;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH}, orphanRemoval = true)
    private List<SubAddress> subAddresses = new ArrayList<>();

    @Column(name = "note")
    private String note;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "audit_entity_id")
    private Audit audit;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "version_reference_entity_id")
    private VersionReference addressSpecRef;

}