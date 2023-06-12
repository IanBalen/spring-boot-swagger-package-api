package com.example.springbootswaggerpackageapi.domain;

import com.example.springbootswaggerpackageapi.domain.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "address_role_reference")
public class AddressRoleReference {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "serial_version_uid", nullable = false, insertable = false, updatable = false)
    private Long serialVersionUID;

    @Column(name = "href")
    private String href;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "name")
    private String name;

    @Embedded
    private TimePeriod validFor;


}