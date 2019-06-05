package com.orange.test.crudwebservice.Models;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("Id")
    private int id;
    @SerializedName("Email")
    private String email;
    @SerializedName("FName")
    private String fName;
    @SerializedName("LName")
    private String lName;

    public User(int id, String email, String fName, String lName) {
        this.id = id;
        this.email = email;
        this.fName = fName;
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
