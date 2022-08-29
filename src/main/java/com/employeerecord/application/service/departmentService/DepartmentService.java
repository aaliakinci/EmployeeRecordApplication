package com.employeerecord.application.service.departmentService;

import com.employeerecord.application.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService implements IDepartmantService{

    @Override
    public boolean Create(Department department) {
        return false;
    }

    @Override
    public boolean Update(Department department) {
        return false;
    }

    @Override
    public boolean Delete(int id) {
        return false;
    }

    @Override
    public Department GetById(int id) {
        return null;
    }

    @Override
    public List<Department> GetAllDepartments() {
        return null;
    }
}
