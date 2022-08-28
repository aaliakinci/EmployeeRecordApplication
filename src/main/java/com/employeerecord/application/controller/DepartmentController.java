package com.employeerecord.application.controller;

import com.employeerecord.application.model.Department;
import com.employeerecord.application.service.departmentService.IDepartmantService;
import com.employeerecord.application.service.employeeService.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/department")
public class DepartmentController {
    private final IEmployeeService employeeService;
    private final IDepartmantService departmentService;
    @Autowired
    public DepartmentController(IEmployeeService employeeService,IDepartmantService departmentService)
    {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }


    @GetMapping
    public boolean CreateDepartment(Department department)
    {
       return this.departmentService.Create(department);
    }


}
