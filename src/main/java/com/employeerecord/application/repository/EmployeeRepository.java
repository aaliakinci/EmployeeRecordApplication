package com.employeerecord.application.repository;

import com.employeerecord.application.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    @Query("update Employee set latitude = ?1 and set longitude = ?2 where Id in (select Id from employees where departmentId = ?3)")
   boolean UpdateDepartmentLocation(double latitude, double longitude, long departmentId);
    @Query("select e.* from luck_winnings lw " +
            "left join employees e on lw.employeeId = e.id" +
            "where MONTH(lw.period) = MONTH(GETDATE()) ")
    Employee GetWinner();
}
