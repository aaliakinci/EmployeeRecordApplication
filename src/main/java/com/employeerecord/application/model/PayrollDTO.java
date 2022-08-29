package com.employeerecord.application.model;

import com.employeerecord.application.entity.SalaryType;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class PayrollDTO extends Base {
    private Long employeeId;
    private String companyName;
    private String tradeName;
    private String period;
    private LocalDateTime dateOfStart;
    private DecimalFormat salary;
    private SalaryType salaryType;
}
