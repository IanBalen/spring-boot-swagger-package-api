package com.example.springbootswaggerpackageapi.domain;

import com.example.springbootswaggerpackageapi.domain.enums.Severity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "error")
public class Error extends Exception{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "serial_version_uid", nullable = false)
    private Long serialVersionUID;

    @Column(name = "code")
    private String code;

    @Column(name = "timestamp")
    private Date timestamp;

    @Column(name = "is_title_enabled")
    private Boolean isTitleEnabled;

    @Column(name = "message")
    private String message;

    @Column(name = "title")
    private String title;

    @Column(name = "html_label")
    private String htmlLabel;

    @Column(name = "label")
    private String label;

    @Column(name = "retryable")
    private Boolean retryable;

    @Enumerated(EnumType.STRING)
    private Severity severity;

}