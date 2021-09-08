package com.ironhack.prcompany.model;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
    //firstName, lastName, middleName, and salutation.
    private String firstName;
    private String lastName;
    private String middleName;
    private String salutation;

    public Name() {
    }

    public Name(String firstName, String lastName, String middleName, String salutation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
