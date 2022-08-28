package com.employeerecord.application.model;

import java.time.LocalTime;

public abstract class Base {
    private Long id;
    private LocalTime createdDate;
    private LocalTime updatedDate;
    private LocalTime deletedDate;
    private DataStatus dataStatus;
}
