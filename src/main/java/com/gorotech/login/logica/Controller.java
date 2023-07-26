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

    public void createUser(String user, String pass, String rol) {
        User usu = new User();
        usu.setNameUser(user);
        usu.setPasswordUser(pass);
        
        Rol rolFound = new Rol();
        rolFound = this.bringRol(rol);
        if(rolFound!=null){
            usu.setaRol(rolFound);
        }
        int id = this.bringLastIdUsers();
        usu.setId(id+1);
        persistenceCon.createUser(usu);
    }

    private Rol bringRol(String rol) {
       List<Rol> listRoles = persistenceCon.bringRoles();
       
       for(Rol aRol:listRoles){
           if(aRol.getRolName().equals(rol)){
               return aRol;
           }
       }
       return null;
    }

    private int bringLastIdUsers() {
        List<User> listUsers = this.bringUsers();
        User usu = listUsers.get(listUsers.size()-1);
        return usu.getId();
    }

    public void deleteUser(int id_user) {
        persistenceCon.deleteUser(id_user);
    }

    public User bringUser(int id_user) {
        
       return persistenceCon.bringUser(id_user);
        
    }

    public void editUser(User usu, String user, String pass, String rol) {
        usu.setNameUser(user);
        usu.setPasswordUser(pass);
        Rol rolFound = new Rol();
        rolFound = this.bringRol(rol);
        if(rolFound!=null){
            usu.setaRol(rolFound);
        }
        persistenceCon.editUser(usu);
    }

}
