package com.employeerecord.application.entity;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import javax.persistence.Entity;
@Entity
@Table(name = "EmploymentDetail")
public class EmploymentDetail {
    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "employment_detail_id",nullable = false,updatable = false)
    private Long id;
    @Column(name = "created_date",nullable = false,updatable = false)
    private LocalDateTime createdDate;
    @Enumerated(EnumType.ORDINAL)
    private DataStatus dataStatus;

    public EmploymentDetail() {
    }

    private LocalDateTime startedDate;
    @Column
    private Double grossPay;
    @Column
    private Double payForIncomeTax;
    @Column
    private Double incomeTaxPaid;
    @Column
    private Double payForUsc;
    @Column
    private Double uscPaid;
    @Column
    private String prsiClass;
    @Column
    private Double prsiPaid;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name ="employee_id")
    private Employee employee;
    private Long employeeDetailId;

    public EmploymentDetail(LocalDateTime startDate, Double grossPay, Double payForIncomeTax, Double incomeTaxPaid, Double payForUsc, Double uscPaid, String prsiClass, Double prsiPaid) {
        this.startedDate = startDate;
        this.grossPay = grossPay;
        this.payForIncomeTax = payForIncomeTax;
        this.incomeTaxPaid = incomeTaxPaid;
        this.payForUsc = payForUsc;
        this.uscPaid = uscPaid;
        this.prsiClass = prsiClass;
        this.prsiPaid = prsiPaid;
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

    public LocalDateTime getStartDate() {
        return startedDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startedDate = startDate;
    }

    public Double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(Double grossPay) {
        this.grossPay = grossPay;
    }

    public Double getPayForIncomeTax() {
        return payForIncomeTax;
    }

    public void setPayForIncomeTax(Double payForIncomeTax) {
        this.payForIncomeTax = payForIncomeTax;
    }

    public Double getIncomeTaxPaid() {
        return incomeTaxPaid;
    }

    public void setIncomeTaxPaid(Double incomeTaxPaid) {
        this.incomeTaxPaid = incomeTaxPaid;
    }

    public Double getPayForUsc() {
        return payForUsc;
    }

    public void setPayForUsc(Double payForUsc) {
        this.payForUsc = payForUsc;
    }

    public Double getUscPaid() {
        return uscPaid;
    }

    public void setUscPaid(Double uscPaid) {
        this.uscPaid = uscPaid;
    }

    public String getPrsiClass() {
        return prsiClass;
    }

    public void setPrsiClass(String prsiClass) {
        this.prsiClass = prsiClass;
    }

    public Double getPrsiPaid() {
        return prsiPaid;
    }

    public void setPrsiPaid(Double prsiPaid) {
        this.prsiPaid = prsiPaid;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
