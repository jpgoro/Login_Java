
package com.gorotech.login.logica;

import com.gorotech.login.persistencia.PersistenceController;
import java.util.List;

public class Controller {
    PersistenceController persistenceCon ;

    public Controller() {
        persistenceCon = new PersistenceController();
    }
    
    

    public boolean validateUser(String user, String pass) {
        
        //String message = "";
        
        boolean ok = false;
        
        List<User> listUsers = persistenceCon.bringUsers();
        for(User usu : listUsers){
            if(usu.getNameUser().equals(user)){
                if(usu.getPasswordUser().equals(pass)){
                   //message= "Correct username and password, welcome" ;
                   return ok = true;
                }else{
                    //message="Incorrect password";
                    return ok = false;
                          
                }
            }else{
                //message="user not found";
                return ok = false;
            }
        }
        return ok;
    }

    public String validarRol(String user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
