package com.gorotech.login.logica;

import java.io.Serializable;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private int id;
    private String nameUser;
    private String passwordUser;
    @ManyToOne
    @JoinColumn(name = "fk_rol")
    private Rol aRol;

    public User() {
    }

    public User(int id, String nameUser, String passwordUser, Rol aRol) {
        this.id = id;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
        this.aRol = aRol;
    }

    public Rol getaRol() {
        return aRol;
    }

    public void setaRol(Rol aRol) {
        this.aRol = aRol;
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
