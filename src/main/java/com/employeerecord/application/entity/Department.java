package com.employeerecord.application.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department  {
    @Id
    @SequenceGenerator(
            name = "id_sequence",
            sequenceName = "id_sequence",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_sequence")
    @Column(name = "department_id",nullable = false,updatable = false)
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
    @OneToMany
    @JoinColumn(name = "employee_id")
    private List<Employee> employeeList;
}
