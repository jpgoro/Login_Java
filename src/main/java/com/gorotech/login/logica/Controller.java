
package com.gorotech.login.logica;

import com.gorotech.login.persistencia.PersistenceController;
import java.util.List;

public class Controller {
    PersistenceController persistenceCon ;

    public Controller() {
        persistenceCon = new PersistenceController();
    }
    
    

    public User validateUser(String user, String pass) {
        
        //String message = "";
        
        User usr = null;
        
        List<User> listUsers = persistenceCon.bringUsers();
        for(User usu : listUsers){
            if(usu.getNameUser().equals(user)){
                if(usu.getPasswordUser().equals(pass)){
                   //message= "Correct username and password, welcome" ;
                   usr=usu;
                   return usr;
                }else{
                    //message="Incorrect password";
                    usr=null;
                    return usr;
                          
                }
            }else{
                //message="user not found";
                usr=null;
                return usr;
            }
        }
        return usr;
    }

    
}
