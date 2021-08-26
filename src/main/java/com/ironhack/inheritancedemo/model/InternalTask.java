package com.ironhack.inheritancedemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InternalTask extends Task {
    private  final int internalProjectsPlanning;

    public InternalTask(int internalProjectsPlanning) {
        this.internalProjectsPlanning = internalProjectsPlanning;
    }

    public InternalTask(int id, String title, date dueDate, boolean status, int internalProjectsPlanning) {
        super(id, title, dueDate, status);
        this.internalProjectsPlanning = internalProjectsPlanning;
    }

    public int getInternalProjectsPlanningProjectsPlanning() {
        return internalProjectsPlanning;
    }
}
