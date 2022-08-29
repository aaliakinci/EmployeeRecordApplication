package com.employeerecord.application.repository;

import com.employeerecord.application.entity.Department;
import com.employeerecord.application.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {

    @Query("select d from Department d where dataStatus != 2")
    @Override
    public List<Department> findAll();
}
