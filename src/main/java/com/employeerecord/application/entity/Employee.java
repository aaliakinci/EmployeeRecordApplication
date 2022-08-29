package com.employeerecord.application.entity;

import com.employeerecord.application.model.EmploymentDetailDTO;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;
@Entity
@Table(name = "Employee")
public class Employee{
    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "employee_id",nullable = false,updatable = false)
    private Long id;
    @Column(name = "created_date",nullable = false,updatable = false)
    private LocalDateTime createdDate;
    @Enumerated(EnumType.ORDINAL)
    private DataStatus dataStatus;

    @Column(name = "name",nullable = false,columnDefinition = "TEXT")
    private String name;
    @Column(name = "mail",nullable = false,columnDefinition = "TEXT")
    private String mail;
    @Column
    private Long phone;
    @Column
    private Double latitude;
    @Column
    private Double longitude;
    @Column
    private Long employeeDepartmentId;
    @Column
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToMany
    @JoinColumn(name = "payroll_id")
    private Collection<Payroll> payrolls;
    @OneToOne
    @JoinColumn(name = "employment_detail_id")
    @PrimaryKeyJoinColumn
    private EmploymentDetail employmentDetail;
    @OneToMany
    @JoinColumn(name = "lucy_winning_id")
    private Collection<LuckWinning> luckWinnings;

    public Employee() {
    }

    public Employee(String name, String mail, Long phone, EmploymentDetail employmentDetail, Double latitude, Double longitude) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.employmentDetail = employmentDetail;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public List<Payroll> getPayrolls() {
        return payrolls.stream().toList();
    }

    public void setPayrolls(List<Payroll> payrolls) {
        this.payrolls = payrolls;
    }

    public EmploymentDetail getEmploymentDetail() {
        return employmentDetail;
    }

    public void setEmploymentDetail(EmploymentDetail employmentDetail) {
        this.employmentDetail = employmentDetail;
    }

    public List<LuckWinning> getLuckWinnings() {
        return luckWinnings.stream().toList();
    }

    public void setLuckWinnings(List<LuckWinning> luckWinnings) {
        this.luckWinnings = luckWinnings;
    }
}
