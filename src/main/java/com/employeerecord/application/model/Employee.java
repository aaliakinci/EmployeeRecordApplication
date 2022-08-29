package com.employeerecord.application.model;

import java.util.List;

public class Employee extends Base {
    private String name;
    private String mail;
    private Long phone;
    private Long departmentId;
    private List<Payroll> payrolls;
    private EmploymentDetail employmentDetail;
    private List<LuckWinning> luckWinnings;
    private Double latitude;
    private Double longitude;
}
