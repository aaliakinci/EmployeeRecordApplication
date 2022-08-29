package com.employeerecord.application.repository;

import com.employeerecord.application.entity.LuckWinning;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LuckWinningRepository extends CrudRepository<LuckWinning,Long> {
}
