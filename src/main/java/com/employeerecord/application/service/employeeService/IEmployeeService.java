package com.employeerecord.application.service.employeeService;

import com.employeerecord.application.entity.Employee;


import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.List;

public interface IEmployeeService {
    boolean Create(Employee employee);
    boolean Update(Employee employee);
    boolean Delete(long id);
    Employee GetById(long id);
    List<Employee> GetAllEmployees(LocalDateTime startedDate, Double salary);
    List<Employee> GetAllEmployeesFull();
    boolean UpdateDepartmentLocation(double latitude, double longitude, long departmentId);
    Employee GetWinner();
}
