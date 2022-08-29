package com.employeerecord.application.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.Period;

@Entity
@Table(name = "Payroll")
public class Payroll {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_gen")
    @SequenceGenerator(name="article_gen", sequenceName="article_seq")
    @Column(name = "payroll_id",nullable = false,updatable = false)
    private Long id;
    @Column(name = "created_date",nullable = false,updatable = false)
    private LocalDateTime createdDate;
    @Enumerated(EnumType.ORDINAL)
    private DataStatus dataStatus;
    @Column
    private String companyName;
    @Column
    private String tradeName;
    @Column
    private LocalDateTime period;
    @Column
    private LocalDateTime dateOfStart;
    @Column
    private Double salary;
    @Enumerated(EnumType.ORDINAL)
    private SalaryType salaryType;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


}
