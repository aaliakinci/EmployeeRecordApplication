package com.employeerecord.application.service.employeeService;

import com.employeerecord.application.model.Employee;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.Period;
import java.util.List;
@Service
public class EmployeeService implements  IEmployeeService{

    @Override
    public boolean Create(Employee employee) {
        return false;
    }

    @Override
    public boolean Update(Employee employee) {
        return false;
    }

    @Override
    public boolean Delete(int id) {
        return false;
    }

    @Override
    public Employee GetById(int id) {
        return null;
    }

    @Override
    public List<Employee> GetAllEmployees(LocalTime startedDate, DecimalFormat salary) {
        return null;
    }

    @Override
    public boolean UpdateDepartmentLocation(double latitude, double longitude, long departmentId) {

        return false;
    }

    @Override
    public Employee GetWinner()
    {
        return null;
    }

}
