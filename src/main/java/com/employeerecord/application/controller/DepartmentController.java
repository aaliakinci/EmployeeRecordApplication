package com.employeerecord.application.controller;

import com.employeerecord.application.entity.Department;
import com.employeerecord.application.entity.Employee;
import com.employeerecord.application.model.DepartmentDTO;
import com.employeerecord.application.model.EmployeeDTO;
import com.employeerecord.application.service.departmentService.IDepartmantService;
import com.employeerecord.application.service.employeeService.IEmployeeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/department")
public class DepartmentController {
    private final IEmployeeService employeeService;
    private final IDepartmantService departmentService;
    private final ModelMapper mapper;

    @Autowired
    public DepartmentController(ModelMapper mapper,IEmployeeService employeeService,IDepartmantService departmentService)
    {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
        this.mapper = mapper;
    }


    @PostMapping(value = "/create",consumes = "application/json", produces = "application/json")
    @ResponseBody
    public boolean Create(Department request)
    {
       return this.departmentService.Create(request);
    }

    @PutMapping
    @ResponseBody
    public boolean Update(Department request)
    {
         return this.departmentService.Update(request);
    }
    @DeleteMapping
    @ResponseBody
    public boolean Delete(long id)
    {
        return this.employeeService.Delete(id);
    }
    @GetMapping("GetDepartment/{id}")
    public Department GetDepartment(@PathVariable long id)
    {
        return this.departmentService.GetById(id);
    }
    @GetMapping("/GetAllDepartment")
    public List<Department> GetAllDepartment()
    {
        return this.departmentService.GetAllDepartments();
    }
}
