package com.boloncorps.ireporter.models;

import java.sql.Timestamp;

public class UserReporter {
    private int userId;
    private String firstName;
    private String lastName;
    private String otherName;
    private String username;
    private String email;
    private boolean isAdmin;
    private String password;
    private Timestamp registeredOn;

    public UserReporter() {
    }

    public UserReporter(int userId, String firstName, String lastName, String otherName, String username, String email, boolean isAdmin, String password, Timestamp registeredOn) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
        this.username = username;
        this.email = email;
        this.isAdmin = isAdmin;
        this.password = password;
        this.registeredOn = registeredOn;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(Timestamp registeredOn) {
        this.registeredOn = registeredOn;
    }
}
