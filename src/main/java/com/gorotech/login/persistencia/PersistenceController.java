
package com.gorotech.login.persistencia;

import com.gorotech.login.logica.Rol;
import com.gorotech.login.logica.User;
import java.util.List;

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

    
    
}
