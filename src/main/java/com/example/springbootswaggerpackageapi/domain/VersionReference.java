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
@Table(name = "version_reference")
public class VersionReference {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "serial_version_uid", nullable = false)
    private Long serialVersionUID;

    @Column(name = "href")
    private String href;

    @Column(name = "name")
    private String name;

    @Column(name = "version")
    private String version;

}