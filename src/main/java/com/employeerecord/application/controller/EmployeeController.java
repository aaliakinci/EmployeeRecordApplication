package com.employeerecord.application.controller;

import com.employeerecord.application.entity.Employee;
import com.employeerecord.application.model.EmployeeDTO;

import com.employeerecord.application.service.employeeService.IEmployeeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
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
    public boolean Create(@RequestBody Employee request)
    {

        return this.employeeService.Create(request);
    }
    @PutMapping
    public boolean Update(Employee request)
    {
        return this.employeeService.Update(request);
    }
    @DeleteMapping
    public boolean Delete(long id)
    {
        return this.employeeService.Delete(id);
    }
    @GetMapping("/{id}")
    public Employee GetEmployee(@PathVariable long id)
    {
        return this.employeeService.GetById(id);
    }

    @GetMapping("/{startDate}/{maxSalary}")
    public List<Employee> GetAllEmployees(@PathVariable LocalDateTime startDate, Double maxSalary)
    {
        return this.employeeService.GetAllEmployees(startDate,maxSalary);
    }
    @GetMapping("/GetAllEmployeesFull")
    public List<Employee> GetAllEmployeesFull()
    {
        return this.employeeService.GetAllEmployeesFull();
    }
    @GetMapping()
    public Employee GetWinner()
    {
        return this.employeeService.GetWinner();
    }

}
