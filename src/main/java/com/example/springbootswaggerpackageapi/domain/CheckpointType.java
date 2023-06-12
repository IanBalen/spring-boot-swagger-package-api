package com.example.springbootswaggerpackageapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Table(name = "checkpoint_type")
@Embeddable
public class CheckpointType {
    @Column(name = "serial_version_uid", nullable = false)
    private long serialVersionUID;

    @Column(name = "status")
    private String status;

    @Column(name = "message")
    private String message;

    @Column(name = "date")
    private Date date;

    @Column(name = "check_post")
    private String checkPost;

    @Column(name = "city")
    private String city;

    @Column(name = "state_or_province")
    private String stateOrProvince;

    @Column(name = "country")
    private String country;

}