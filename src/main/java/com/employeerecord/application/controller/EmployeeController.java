package com.employeerecord.application.controller;

import com.employeerecord.application.model.Employee;

import com.employeerecord.application.service.employeeService.IEmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping(path = "api/employee")
public class EmployeeController {

    private final IEmployeeService employeeService;
    private final ModelMapper mapper;

    @Autowired
    public EmployeeController(IEmployeeService employeeService, ModelMapper mapper)
    {
            this.employeeService = employeeService;
            this.mapper = mapper;
    }
    @PostMapping
    public boolean CreateEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.Create(employee);
    }
    @PutMapping
    public boolean UpdateEmployee(Employee employee)
    {
        return this.employeeService.Update(employee);
    }
    @DeleteMapping
    public boolean DeleteEmployee(int id)
    {
        return this.employeeService.Delete(id);
    }
    @GetMapping("/{id}")
    public Employee GetEmployee(@PathVariable int id)
    {
        return this.employeeService.GetById(id);
    }

    @GetMapping("/{startDate}/{maxSalary}")
    public List<Employee> GetAllEmployes(@PathVariable LocalTime startDate, DecimalFormat maxSalary)
    {
        return this.employeeService.GetAllEmployees(startDate,maxSalary);
    }

    @GetMapping()
    public Employee GetWinner()
    {
        return this.employeeService.GetWinner();
    }

}
