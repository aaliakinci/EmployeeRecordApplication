package com.employeerecord.application.model;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class EmploymentDetailDTO extends  Base {
    private LocalDateTime startDate;
    private Long employeeId;
    private Double grossPay;
    private Double payForIncomeTax;
    private Double incomeTaxPaid;
    private Double payForUsc;
    private Double uscPaid;
    private String prsiClass;
    private Double prsiPaid;

    public EmploymentDetailDTO() {
    }

    public EmploymentDetailDTO(LocalDateTime startDate, Double grossPay, Double payForIncomeTax, Double incomeTaxPaid, Double payForUsc, Double uscPaid, String prsiClass, Double prsiPaid) {
        this.startDate = startDate;
        this.grossPay = grossPay;
        this.payForIncomeTax = payForIncomeTax;
        this.incomeTaxPaid = incomeTaxPaid;
        this.payForUsc = payForUsc;
        this.uscPaid = uscPaid;
        this.prsiClass = prsiClass;
        this.prsiPaid = prsiPaid;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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
}
