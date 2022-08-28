package com.employeerecord.application.entity;

import java.text.DecimalFormat;
import java.time.LocalTime;

public class DrawWheel {
    private Long id;
    private LocalTime createdDate;
    private LocalTime updatedDate;
    private LocalTime deletedDate;
    private DataStatus dataStatus;
    private DecimalFormat monthlyReward;
}
