package com.example.springbootswaggerpackageapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "sub_address")
public class SubAddress {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "serial_version_uid", nullable = false)
    private Long serialVersionUID;

    @Column(name = "href")
    private String href;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "sub_unit_type")
    private String subUnitType;

    @Column(name = "sub_unit_number")
    private String subUnitNumber;

    @Column(name = "level_type")
    private String levelType;

    @Column(name = "level_number")
    private String levelNumber;

    @Column(name = "building_name")
    private String buildingName;

    @Column(name = "private_street_number")
    private String privateStreetNumber;

    @Column(name = "private_street_name")
    private String privateStreetName;

}