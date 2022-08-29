package com.employeerecord.application.entity;

import java.time.LocalTime;
import java.time.Period;

public class LuckWinning {
    private Long id;
    private LocalTime createdDate;
    private LocalTime updatedDate;
    private LocalTime deletedDate;
    private DataStatus dataStatus;

    private Long employeeId;
    private LocalTime period;
}
