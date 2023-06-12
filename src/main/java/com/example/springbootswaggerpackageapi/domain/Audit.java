package com.example.springbootswaggerpackageapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "audit")
public class Audit {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "serial_version_uid", nullable = false)
    private Long serialVersionUID;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "changed_by")
    private String changedBy;

    @Column(name = "changed_date")
    private Date changedDate;

    @Column(name = "entity_version")
    private String entityVersion;

    @Column(name = "tag_id")
    private String tagId;

    @Column(name = "span_id")
    private String spanId;

    @Column(name = "change_reason")
    private String changeReason;

    @Column(name = "source_system")
    private String sourceSystem;

    @Column(name = "source_system_user")
    private String sourceSystemUser;

}