package com.employeerecord.application.model;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.Period;

public class Payroll extends Base {
    private Long employeeId;
    private String companyName;
    private String tradeName;
    private String period;
    private LocalTime dateOfStart;
    private DecimalFormat salary;
    private SalaryType salaryType;
}
