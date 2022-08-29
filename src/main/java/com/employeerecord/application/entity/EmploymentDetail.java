package com.employeerecord.application.entity;

import java.text.DecimalFormat;
import java.time.LocalTime;

public class EmploymentDetail {
    private Long id;
    private LocalTime createdDate;
    private LocalTime updatedDate;
    private LocalTime deletedDate;
    private DataStatus dataStatus;

    private LocalTime startDate;
    private Long employeeId;
    private DecimalFormat grossPay;
    private DecimalFormat payForIncomeTax;
    private DecimalFormat incomeTaxPaid;
    private DecimalFormat payForUsc;
    private DecimalFormat uscPaid;
    private String prsiClass;
    private DecimalFormat prsiPaid;
}
