package com.example.delegatelog.model;

public class User {
    private int id;
    private String ufname;
    private String ulname;
    private String email;
    private String pw;

    public User(){
    }

    public User(int id, String ufname, String ulname, String email, String pw){
        this.id = id;
        this.ufname = ufname;
        this.ulname = ulname;
        this.email = email;
        this.pw = pw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUfname() {
        return ufname;
    }

    public void setUfname(String ufname) {
        this.ufname = ufname;
    }

    public String getUlname() {
        return ulname;
    }

    public void setUlname(String ulname) {
        this.ulname = ulname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}