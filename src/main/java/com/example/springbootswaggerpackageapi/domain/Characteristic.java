package com.example.springbootswaggerpackageapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "characteristic")
public class Characteristic {
    @Column(name = "serial_version_uid", nullable = false)
    private long serialVersionUID;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private String value;

}