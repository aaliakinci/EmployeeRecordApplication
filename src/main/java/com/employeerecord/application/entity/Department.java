package com.employeerecord.application.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.persistence.Entity;
@Entity
@Table(name = "Department")
public class Department  {
    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "department_id",nullable = false,updatable = false)
    private Long id;
    @Column(name = "created_date",nullable = false,updatable = false)
    private LocalDateTime createdDate;
    @Enumerated(EnumType.ORDINAL)
    private DataStatus dataStatus;
    @Column(name = "name",nullable = false,columnDefinition = "TEXT")
    private String name;
    @OneToMany
    @JoinColumn(name = "employee_id")
    private Collection<Employee> employeeList;

    public Department(String name) {
        this.name = name;
    }


    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public DataStatus getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList.stream().toList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmployeeList(Collection<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
