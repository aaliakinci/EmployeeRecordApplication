package com.employeerecord.application.service.employeeService;

import com.employeerecord.application.entity.DataStatus;
import com.employeerecord.application.entity.Employee;
import com.employeerecord.application.model.EmployeeDTO;
import com.employeerecord.application.repository.DepartmentRepository;
import com.employeerecord.application.repository.EmployeeRepository;

import com.employeerecord.application.repository.EmploymentDetailRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class EmployeeService implements  IEmployeeService{

    private ModelMapper mapper;
    private EmployeeRepository employeeRepository;
    private EmploymentDetailRepository employmentDetailRepository;

    @Autowired
    public EmployeeService(ModelMapper mapper, EmployeeRepository employeeRepository)
    {
        this.mapper = mapper;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public boolean Create(Employee employee) {
        this.ValidateEmployee(employee);

        employee.setCreatedDate(LocalDateTime.now());
        employee.setDataStatus(DataStatus.Inserted);
        var employmentDetail = employee.getEmploymentDetail();
        employmentDetail.setCreatedDate(LocalDateTime.now());
        employmentDetail.setDataStatus(DataStatus.Inserted);

        this.employeeRepository.save(employee);

        this.employmentDetailRepository.save(employmentDetail);

        return true;
    }

    @Override
    public boolean Update(Employee employee) {
        this.ValidateEmployee(employee);


        employee.setDataStatus(DataStatus.Updated);
        this.employeeRepository.save(employee);

        return true;
    }

    @Override
    public boolean Delete(long id) {
        var employeeOptional = this.employeeRepository.findById(id);

        if(employeeOptional.isEmpty())
            throw new RuntimeException("EmployeeNotFound");

        var employee = employeeOptional.get();

        employee.setDataStatus(DataStatus.Deleted);


        this.employeeRepository.save(employee);

        return true;
    }

    @Override
    public Employee GetById(long id) {

        var employeeOptional = this.employeeRepository.findById(id);

        if(employeeOptional.isEmpty())
            throw new RuntimeException("EmployeeNotFound");

        var employee = employeeOptional.get();

        if(employee.getDataStatus() == DataStatus.Deleted)
            throw new RuntimeException("EmployeeDeleted");

        return employee;
    }

    @Override
    public List<Employee> GetAllEmployees(LocalDateTime startedDate, Double salary) {
        var result = this.employeeRepository.GetAllEmployee(startedDate,salary);
        return result;
    }
    @Override
    public List<Employee> GetAllEmployeesFull() {
        var result = this.employeeRepository.findAll();
        return result;
    }
    @Override
    public boolean UpdateDepartmentLocation(double latitude, double longitude, long departmentId) {
        this.employeeRepository.UpdateDepartmentLocation(latitude,longitude,departmentId);
        return true;
    }

    @Override
    public Employee GetWinner()
    {
        return this.employeeRepository.GetWinner();
    }


    private void ValidateEmployee(Employee employee)
    {
        if(employee.getName().isEmpty())
            throw new RuntimeException("InvalidEmployeeName");
    }
}
