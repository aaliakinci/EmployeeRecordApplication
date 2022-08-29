package com.employeerecord.application.model;

import java.text.DecimalFormat;
import java.time.LocalTime;

public class EmploymentDetail extends  Base {
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
