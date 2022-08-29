package com.employeerecord.application.service.departmentService;


import com.employeerecord.application.entity.DataStatus;
import com.employeerecord.application.entity.Department;
import com.employeerecord.application.model.DepartmentDTO;
import com.employeerecord.application.model.EmployeeDTO;
import com.employeerecord.application.repository.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService implements IDepartmantService{

    private ModelMapper mapper;
    private DepartmentRepository departmentRepository;
    @Autowired
    public DepartmentService(ModelMapper mapper, DepartmentRepository departmentRepository)
    {
        this.mapper = mapper;
        this.departmentRepository = departmentRepository;
    }
    @Override
    public boolean Create(Department request) {

        if(request.getName() == null || request.getName().isEmpty())
            throw new RuntimeException("InvalidDepartmentName");

        var department = this.mapper.map(request,Department.class);

        department.setCreatedDate(LocalDateTime.now());
        department.setDataStatus(DataStatus.Inserted);
        this.departmentRepository.save(department);
        return true;
    }

    @Override
    public boolean Update(Department request) {

        var department = this.mapper.map(request,Department.class);
        department.setDataStatus(DataStatus.Updated);
        this.departmentRepository.save(department);
        return true;
    }

    @Override
    public boolean Delete(long id) {
        var departmentOptional = this.departmentRepository.findById(id);

        if(departmentOptional.isEmpty())
            throw new RuntimeException("EmployeeNotFound");

        var department = departmentOptional.get();

        department.setDataStatus(DataStatus.Deleted);

        this.departmentRepository.save(department);

        return true;
    }

    @Override
    public Department GetById(long id) {

        var departmentOptional = this.departmentRepository.findById(id);

        if(departmentOptional.isEmpty())
            throw new RuntimeException("DepartmentNotFound");

        var department = departmentOptional.get();

        if(department.getDataStatus() == DataStatus.Deleted)
            throw new RuntimeException("DepartmentDeleted");

        return department;
    }

    @Override
    public List<Department> GetAllDepartments() {
        var departments = this.departmentRepository.findAll();
        return departments;
    }
}
