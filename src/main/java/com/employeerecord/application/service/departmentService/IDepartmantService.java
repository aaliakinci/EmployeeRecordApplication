package com.employeerecord.application.service.departmentService;

import com.employeerecord.application.model.Department;

import java.util.List;

public interface IDepartmantService {
    boolean Create(Department department);
    boolean Update(Department department);
    boolean Delete(int id);
    Department GetById(int id);
    List<Department> GetAllDepartments();
}
