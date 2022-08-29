package com.employeerecord.application.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import javax.persistence.Entity;
@Entity
@Table(name = "DrawWheel")
public class DrawWheel {
    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "draw_wheel_id",nullable = false,updatable = false)
    private Long id;
    @Column(name = "created_date",nullable = false,updatable = false)
    private LocalDateTime createdDate;

    @Enumerated(EnumType.ORDINAL)
    private DataStatus dataStatus;

    @Column
    private Double monthlyReward;

}
