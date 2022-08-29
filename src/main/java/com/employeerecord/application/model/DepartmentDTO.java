package com.employeerecord.application.model;


import com.employeerecord.application.entity.DataStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class DepartmentDTO   {

    private Optional<Long> id;
    private Optional<LocalDateTime> createdDate;
    private DataStatus dataStatus;
    private String name;
    private List<EmployeeDTO> employeeList;

    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public Optional<LocalDateTime> getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Optional<LocalDateTime> createdDate) {
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

    public DepartmentDTO(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmployeeDTO> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeDTO> employeeList) {
        this.employeeList = employeeList;
    }
}
