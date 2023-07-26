
package com.gorotech.login.persistencia;

import com.gorotech.login.logica.Rol;
import com.gorotech.login.logica.User;
import com.gorotech.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    UserJpaController usuJpa = new UserJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<User> bringUsers() {
        return usuJpa.findUserEntities();
    }

    public List<Rol> bringRoles() {
        return rolJpa.findRolEntities();
        //SELECT * FROM Rol
    }

    public void createUser(User usu) {
        usuJpa.create(usu);
    }

    public void deleteUser(int id_user) {
        try {
            usuJpa.destroy(id_user);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User bringUser(int id_user) {
        return usuJpa.findUser(id_user);
    }

    public void editUser(User usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    
    
}
