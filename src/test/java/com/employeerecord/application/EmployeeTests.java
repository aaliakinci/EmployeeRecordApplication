package com.employeerecord.application;

import com.employeerecord.application.controller.DepartmentController;
import com.employeerecord.application.controller.EmployeeController;
import com.employeerecord.application.entity.Employee;
import com.employeerecord.application.entity.EmploymentDetail;
import com.employeerecord.application.model.DepartmentDTO;
import com.employeerecord.application.model.EmployeeDTO;
import com.employeerecord.application.model.EmploymentDetailDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Optional;

@SpringBootTest
class EmployeeTests {

    @Autowired
    private EmployeeController employeeController;
    @Autowired
    private DepartmentController departmentController;
    @Test
    public void testCreateEmployee_success() throws URISyntaxException
    {

        EmploymentDetail employmentDetail = new EmploymentDetail(LocalDateTime.now(),  5600d,40000d,30000d,4000d,4000d,"A",6000d);
        Employee employee = new Employee("ali","aliakiinci@gmail.com",5366180046L,employmentDetail,41d,28d);
        var result = employeeController.Create(employee);
    }

    @Test
    public void testUpdateDepartment_success() throws URISyntaxException
    {
        var employees = employeeController.GetAllEmployeesFull();

        var employee = employees.stream().findAny();

        employee.get().setName("test update");

        var result = employeeController.Update(employee.get());
    }

    @Test
    public void testDeleteEmployee_success() throws URISyntaxException
    {
        var employees = employeeController.GetAllEmployeesFull();

        var employee = employees.stream().findAny();

        var result = employeeController.Delete(employee.get().getId());
    }
    @Test
    public void testGetAllEmployees_success() throws URISyntaxException
    {
        var employees = employeeController.GetAllEmployees(LocalDateTime.of(2022, Month.AUGUST,29,10,20),5000d);
    }

    @Test
    public void testGetWinner_success() throws URISyntaxException
    {
        var winner = employeeController.GetWinner();
    }
}