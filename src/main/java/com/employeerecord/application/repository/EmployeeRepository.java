package com.employeerecord.application.repository;

import com.employeerecord.application.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    /*FUNC('MONTH', lw.period)  = FUNC('MONTH', GETDATE())*/

    @Query("update Employee set latitude = (latitude) ,longitude = (longitude) where Id in (select id from Employee where employeeDepartmentId = (departmentId) )")
   boolean UpdateDepartmentLocation(double latitude, double longitude, long departmentId);
    @Query("select e from LuckWinning lw left join Employee e on lw.winnerEmployeeId = e.id where e.dataStatus != 2")
    Employee GetWinner();
    @Query("select e from Employee e left join EmploymentDetail ed on e.id = ed.employeeDetailId where ed.startedDate = (startedDate) and e.salary >= (salary) and e.dataStatus != 2")
    List<Employee> GetAllEmployee(LocalDateTime startedDate, double salary);

    @Query("select e from Employee e where e.dataStatus != 2")
    @Override
    public List<Employee> findAll();
}
