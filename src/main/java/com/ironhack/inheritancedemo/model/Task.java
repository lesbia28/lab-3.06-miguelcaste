package com.ironhack.inheritancedemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.sql.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Task {
    @Id
    private int id;
    private String title;
    private Date dueDate;
    private boolean Status;

    public Task() {
    }

    public Task(int id, String title, date dueDate, boolean status) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public date getDueDate() {
        return dueDate;
    }

    public void setDueDate(date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}




