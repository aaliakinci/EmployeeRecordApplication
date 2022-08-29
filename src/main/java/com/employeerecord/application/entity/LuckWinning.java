package com.employeerecord.application.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.Period;
import javax.persistence.Entity;
@Entity
@Table(name = "LuckWinning")
public class LuckWinning {
    public LuckWinning()
    {

    }
    public LuckWinning(Long employeeId, LocalDateTime period) {
        this.winnerEmployeeId = employeeId;
        this.period = period;
        this.createdDate = LocalDateTime.now();
        this.dataStatus = DataStatus.Inserted;
    }
    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "luck_winning_id",nullable = false,updatable = false)
    private Long id;
    @Column(name = "created_date",nullable = false,updatable = false)
    private LocalDateTime createdDate;
    @Enumerated(EnumType.ORDINAL)
    private DataStatus dataStatus;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private Long winnerEmployeeId;
    private LocalDateTime period;
}
