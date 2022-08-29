package com.employeerecord.application.entity;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.Period;

public class Payroll {
    private Long id;
    private LocalTime createdDate;
    private LocalTime updatedDate;
    private LocalTime deletedDate;
    private DataStatus dataStatus;

    private Long employeeId;
    private String companyName;
    private String tradeName;
    private LocalTime period;
    private LocalTime dateOfStart;
    private DecimalFormat salary;
    private SalaryType salaryType;
}
