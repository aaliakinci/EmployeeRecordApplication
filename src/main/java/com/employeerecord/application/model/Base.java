package com.employeerecord.application.model;

import com.employeerecord.application.entity.DataStatus;

import java.time.LocalDateTime;
import java.util.Optional;

public abstract class Base {
    private Optional<Long> id;
    private Optional<LocalDateTime> createdDate;
    private DataStatus dataStatus;

    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public Optional<LocalDateTime> getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Optional<LocalDateTime> createdDate) {
        this.createdDate = createdDate;
    }

    public DataStatus getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
    }
}
