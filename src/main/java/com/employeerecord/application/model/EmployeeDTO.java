package com.employeerecord.application.model;

import java.util.List;

public class EmployeeDTO extends Base {
    private String name;
    private String mail;
    private Long phone;
    private Long departmentId;
    private List<PayrollDTO> payrolls;
    private EmploymentDetailDTO employmentDetail;
    private List<LuckWinningDTO> luckWinnings;
    private Double latitude;
    private Double longitude;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, String mail, Long phone, Long departmentId, EmploymentDetailDTO employmentDetail, Double latitude, Double longitude) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.departmentId = departmentId;
        this.employmentDetail = employmentDetail;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public List<PayrollDTO> getPayrolls() {
        return payrolls;
    }

    public void setPayrolls(List<PayrollDTO> payrolls) {
        this.payrolls = payrolls;
    }

    public EmploymentDetailDTO getEmploymentDetail() {
        return employmentDetail;
    }

    public void setEmploymentDetail(EmploymentDetailDTO employmentDetail) {
        this.employmentDetail = employmentDetail;
    }

    public List<LuckWinningDTO> getLuckWinnings() {
        return luckWinnings;
    }

    public void setLuckWinnings(List<LuckWinningDTO> luckWinnings) {
        this.luckWinnings = luckWinnings;
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
}
