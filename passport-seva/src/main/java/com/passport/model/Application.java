package com.passport.model;

import java.sql.Date;

public class Application {

    private String name;

    private Date appliedDate;

    private String address;
    private String phoneNumber;

    private String email;
    private Date dob;

    public Application(String name, Date appliedDate, String address, String phoneNumber, String email, Date dob) {
        this.name = name;
        this.appliedDate = appliedDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dob = dob;
    }

    public Application() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", appliedDate=" + appliedDate +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
