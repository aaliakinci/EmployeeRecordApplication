package com.employeerecord.application.repository;

import com.employeerecord.application.entity.Department;
import com.employeerecord.application.entity.EmploymentDetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmploymentDetailRepository extends CrudRepository<EmploymentDetail,Long> {

    @Query("select d from Department d where dataStatus != 2")
    @Override
    public List<EmploymentDetail> findAll();
}
