package com.employeerecord.application.service.employeeService;

import com.employeerecord.application.model.Employee;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.List;

public interface IEmployeeService {
    boolean Create(Employee employee);
    boolean Update(Employee employee);
    boolean Delete(int id);
    Employee GetById(int id);
    List<Employee> GetAllEmployees(LocalTime startedDate, DecimalFormat salary);

    boolean UpdateDepartmentLocation(double latitude, double longitude, long departmentId);
    Employee GetWinner();
}
