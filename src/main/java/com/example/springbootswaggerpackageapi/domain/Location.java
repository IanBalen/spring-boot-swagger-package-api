package com.example.springbootswaggerpackageapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "location")
public class Location {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "serial_version_uid", nullable = false)
    private Long serialVersionUID;

    @Column(name = "href")
    private String href;

    @Column(name = "name")
    private String name;

    @Column(name = "geometry_type")
    private String geometryType;

    @Column(name = "accuracy")
    private String accuracy;

    @Column(name = "spatial_ref")
    private String spatialRef;

    @ElementCollection
    private List<Point> geometry = new ArrayList<>();

}