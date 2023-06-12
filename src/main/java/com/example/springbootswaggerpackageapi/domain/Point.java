package com.example.springbootswaggerpackageapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "point")
@Embeddable
public class Point {
    @Column(name = "serial_version_uid", nullable = false)
    private Long serialVersionUID;

    @Column(name = "x")
    private String x;

    @Column(name = "y")
    private String y;

    @Column(name = "z")
    private String z;


}