package com.example.delegatelog.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue
    private long id;
    private String ufname;
    private String ulname;
    private String email;
    private String pw;

    public User(){
    }

    public User(long id, String ufname, String ulname, String email, String pw){
        this.id = id;
        this.ufname = ufname;
        this.ulname = ulname;
        this.email = email;
        this.pw = pw;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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