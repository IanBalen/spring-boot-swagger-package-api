package com.example.springbootswaggerpackageapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer_ref_type")
public class CustomerRefType {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "serial_version_uid", nullable = false)
    private Long serialVersionUID;

    @Column(name = "href")
    private String href;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}