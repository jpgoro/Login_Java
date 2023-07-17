
package com.gorotech.login.logica;

import com.gorotech.login.persistencia.PersistenceController;
import java.util.List;

public class Controller {
    PersistenceController persistenceCon ;

    public Controller() {
        persistenceCon = new PersistenceController();
    }
    
    

    public String validateUser(String user, String pass) {
        
        String message = "";
        List<User> listUsers = persistenceCon.bringUsers();
        for(User usu : listUsers){
            if(usu.getNameUser().equals(user)){
                if(usu.getPasswordUser().equals(pass)){
                   message= "Correct username and password, welcome" ;
                   return message;
                }else{
                    message="Incorrect password";
                    return message;
                          
                }
            }else{
                message="user not found";
            }
        }
        return message;
    }
}
