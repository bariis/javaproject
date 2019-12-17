/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SysClasses;

import Users.User;
import java.util.ArrayList;

/**
 *
 * @author barisertas
 */
public class UserSystem {
    
    public static ArrayList<User> usersList = new ArrayList<User>();
    
    // checks if username already exist or not
    public static boolean checkUser(String username){
        for(User user: usersList){
            if(user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
    
    // adds user to the arrayList
     public static boolean addUser(User user){
         if(!checkUser(user.getName())){
            usersList.add(user);
            return true;
        }
        else {
            return false;
        }
     }
    
    
    
    // reads users information from file and reconstruct the users ArrayList.
    public static void readAllUsersFromFile(){
        
    }
    
    // writes user information to file.
    public static void writeAllUsersToFile(){
       
    }
    
}
