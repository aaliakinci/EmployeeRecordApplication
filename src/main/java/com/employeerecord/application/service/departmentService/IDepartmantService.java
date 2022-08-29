package com.employeerecord.application.service.departmentService;

import com.employeerecord.application.entity.Department;
import com.employeerecord.application.model.DepartmentDTO;

import java.util.List;

public interface IDepartmantService {
    boolean Create(Department request);
    boolean Update(Department request);
    boolean Delete(long id);
    Department GetById(long id);
    List<Department> GetAllDepartments();
}
