package com.employeerecord.application.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee{
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

    @Column(name = "created_date",nullable = false,columnDefinition = "TEXT")
    private String name;
    @Column(name = "created_date",nullable = false,columnDefinition = "TEXT")
    private String mail;
    @Column
    private Long phone;
    @Column
    private Double latitude;
    @Column
    private Double longitude;

    @OneToMany
    @JoinColumn(name = "department_id")
    private Department department;
    private Long departmentId;

    @OneToMany
    @JoinColumn(name = "payroll_id")
    private List<Payroll> payrolls;
    @OneToOne
    @JoinColumn(name = "employment_detail_id")
    private EmploymentDetail employmentDetail;
    @OneToMany
    @JoinColumn(name = "lucy_winning_id")
    private List<LuckWinning> luckWinnings;
}
