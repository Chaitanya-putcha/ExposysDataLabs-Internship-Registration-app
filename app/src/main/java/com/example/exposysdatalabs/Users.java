package com.example.exposysdatalabs;

public class Users {
    String name,branch,email,college,phonenumber,per10,per12,ug,pg,internship,paymentid;

    public Users() {
    }

    public Users(String name, String branch, String email, String college, String phonenumber, String per10, String per12, String ug, String pg, String internship, String paymentid) {
        this.name = name;
        this.branch = branch;
        this.email = email;
        this.college = college;
        this.phonenumber = phonenumber;
        this.per10 = per10;
        this.per12 = per12;
        this.ug = ug;
        this.pg = pg;
        this.internship = internship;
        this.paymentid = paymentid;
    }

    public Users(String name, String branch, String email, String college, String phonenumber, String per10, String per12, String ug,String internship, String paymentid) {
        this.name = name;
        this.branch = branch;
        this.email = email;
        this.college = college;
        this.phonenumber = phonenumber;
        this.per10 = per10;
        this.per12 = per12;
        this.ug = ug;
        this.internship = internship;
        this.paymentid = paymentid;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getEmail() {
        return email;
    }

    public String getCollege() {
        return college;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getPer10() {
        return per10;
    }

    public String getPer12() {
        return per12;
    }

    public String getUg() {
        return ug;
    }

    public String getPg() {
        return pg;
    }

    public String getInternship() {
        return internship;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setPer10(String per10) {
        this.per10 = per10;
    }

    public void setPer12(String per12) {
        this.per12 = per12;
    }

    public void setUg(String ug) {
        this.ug = ug;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public void setInternship(String internship) {
        this.internship = internship;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }
}
