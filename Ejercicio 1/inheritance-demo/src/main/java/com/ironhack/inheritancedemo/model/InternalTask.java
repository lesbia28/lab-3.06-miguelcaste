package com.ironhack.inheritancedemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import java.sql.Date;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class InternalTask extends Task {
    private final int internalProjectsPlanning;

    public InternalTask(int internalProjectsPlanning) {
        this.internalProjectsPlanning = internalProjectsPlanning;
    }

    public InternalTask(int id, String title, Date dueDate, boolean status, int internalProjectsPlanning) {
        super(id, title, dueDate, status);
        this.internalProjectsPlanning = internalProjectsPlanning;
    }

    public int getInternalProjectsPlanningProjectsPlanning() {
        return internalProjectsPlanning;
    }
}
