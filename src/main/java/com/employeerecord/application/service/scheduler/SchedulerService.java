package com.employeerecord.application.service.scheduler;

import com.employeerecord.application.entity.LuckWinning;
import com.employeerecord.application.repository.EmployeeRepository;
import com.employeerecord.application.repository.LuckWinningRepository;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.util.Random;

public class SchedulerService {

    private EmployeeRepository employeeRepository;
    private LuckWinningRepository luckWinningRepository;

    public SchedulerService(EmployeeRepository employeeRepository, LuckWinningRepository luckWinningRepository) {
        this.employeeRepository = employeeRepository;
        this.luckWinningRepository = luckWinningRepository;
    }



    @Scheduled(cron="0 0 0 1 1/1 *")
    public void SetMonthlyWinner() {
        var employees = this.employeeRepository.findAll();
        Random rand = new Random();
        var winner = employees.get(rand.nextInt(employees.size()));

        var luckWinning = new LuckWinning(winner.getId(), LocalDateTime.now());

        this.luckWinningRepository.save(luckWinning);

    }
}
