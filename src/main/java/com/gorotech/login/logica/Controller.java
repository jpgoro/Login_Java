package com.gorotech.login.logica;

import com.gorotech.login.persistencia.PersistenceController;
import java.util.List;

public class Controller {

    PersistenceController persistenceCon;

    public Controller() {
        persistenceCon = new PersistenceController();
    }

    public User validateUser(String user, String pass) {

        User usr = null;

        List<User> listUsers = persistenceCon.bringUsers();
        for (User usu : listUsers) {
            if (usu.getNameUser().equals(user)) {
                if (usu.getPasswordUser().equals(pass)) {

                    usr = usu;
                    return usr;
                } else {

                    usr = null;
                    return usr;

                }
            } else {

                usr = null;
            }
        }
        return usr;
    }

    public List<User> bringUsers() {
       return persistenceCon.bringUsers();
    }

    public List<Rol> bringRoles() {
        return persistenceCon.bringRoles();
    }

}
