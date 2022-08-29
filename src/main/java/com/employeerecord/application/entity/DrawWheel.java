package com.employeerecord.application.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.time.LocalTime;

@Entity
@Table(name = "draw_wheels")
public class DrawWheel {

    @Id
    @SequenceGenerator(
            name = "id_sequence",
            sequenceName = "id_sequence",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_sequence")
    @Column(name = "employee_id",nullable = false,updatable = false)
    private Long id;
    @Column(name = "created_date",nullable = false,updatable = false)
    private LocalTime createdDate;
    @Column()
    private LocalTime updatedDate;
    @Column()
    private LocalTime deletedDate;
    @Enumerated(EnumType.ORDINAL)
    private DataStatus dataStatus;

    @Column
    private DecimalFormat monthlyReward;
}
