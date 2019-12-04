/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Users;

import java.util.ArrayList;

/**
 *
 * @author barisertas
 */
public class UserSystem {
    
    public static ArrayList<User> usersList = new ArrayList<User>();
    
    
    public static boolean checkUser(String userName){
        for(User user: usersList)
            if(user.getUsername().compareTo(userName) == 0)
                return true;
        
        return false;
    }
    
    
    
}
