package com.example.springbootswaggerpackageapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Table(name = "time_period")
@Embeddable
public class TimePeriod {
    @Column(name = "serial_version_uid", nullable = false)
    private Long serialVersionUID;

    @Column(name = "start_date_time")
    private Date startDateTime;

    @Column(name = "end_date_time")
    private Date endDateTime;


}