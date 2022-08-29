package com.employeerecord.application;

import com.employeerecord.application.controller.DepartmentController;
import com.employeerecord.application.entity.Department;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URISyntaxException;
import java.util.Optional;

@SpringBootTest
class DepartmentTests {

	@Autowired
	private DepartmentController controller;

	@Test
	public void testCreateDepartment_success() throws URISyntaxException
	{
		Department department = new Department("test department");

		var result = controller.Create(department);
	}

	@Test
	public void testUpdateDepartment_success() throws URISyntaxException
	{
 		var alldepartments = controller.GetAllDepartment();

		Optional<Department> department = alldepartments.stream().findAny();
		department.get().setName("test update");

		var result = controller.Update(department.get());
	}

	@Test
	public void testDeleteDepartment_success() throws URISyntaxException
	{
		var alldepartments = controller.GetAllDepartment();

		Optional<Department> department = alldepartments.stream().findAny();

		var result = controller.Delete(department.get().getId());
	}
	@Test
	public void testGetDepartment_success() throws URISyntaxException
	{
		var alldepartments = controller.GetAllDepartment();

		Optional<Department> department = alldepartments.stream().findAny();

		var result = controller.GetDepartment(department.get().getId());
	}

	@Test
	public void testGetAllDepartment_success() throws URISyntaxException
	{
		var alldepartments = controller.GetAllDepartment();
	}
}
