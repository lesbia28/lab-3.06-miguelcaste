package com.ironhack.prcompany.model;

import javax.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String company;
    @Embedded
    private Name name;

    public Contact() {
    }

    public Contact(Long id, String title, String company, Name name) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
