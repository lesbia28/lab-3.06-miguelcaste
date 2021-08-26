package com.ironhack.inheritancedemo.model;

import javax.persistence.Entity;

@Entity
public class BillableTask extends Task {
    private final int billableProjectsPlanning;
    private int hourlyRate;

    public BillableTask(int billableProjectsPlanning) {
        this.billableProjectsPlanning = billableProjectsPlanning;
    }

    public BillableTask(int id, String title, date dueDate, boolean status, int billableProjectsPlanning, int hourlyRate) {
        super(id, title, dueDate, status);
        this.billableProjectsPlanning = billableProjectsPlanning;
        this.hourlyRate = hourlyRate;
    }

    public int getBillableProjectsPlanning() {
        return billableProjectsPlanning;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
