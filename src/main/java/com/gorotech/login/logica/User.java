package com.gorotech.login.logica;


public class User {
    
    private int id;
    private String nameUser;
    private String passwordUser;

    public User() {
    }

    public User(int id, String nameUser, String passwordUser) {
        this.id = id;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
    
    
}
