package com.employeerecord.application.service.scheduler;

import org.springframework.scheduling.annotation.Scheduled;

public class SchedulerService {

    @Scheduled(cron="0 0 0 1 1/1 *")
    public void doSomething() {
        // something that should execute on 1st day every month @ 00:00
    }
}
