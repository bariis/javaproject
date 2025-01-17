/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SysClassesAndMain;

import Users.User;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserSystem {
    
    // public static ArrayList<User> usersList = new ArrayList<User>();
    public static HashSet<User> userSet = new HashSet<User>();
    
    // checks if username already exist or not
    /*public static boolean checkUser(String username){
        for(User user: usersList){
            if(user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }*/
    
    public static boolean checkUser(String username){
        for(User user : userSet)
            if(user.getUsername().equalsIgnoreCase(username))
                return true;
        
        return false;
    }
    
    public static boolean checkUserPassCombo(String username, String password){
        for(User user : userSet)
            if(user.getUsername().equals(username) && 
                    String.copyValueOf(user.getPassword()).equals(password))
                return true;
        
        return false;
    }
    
    public static boolean addUser(User user){
        if(!checkUser(user.getName())){
            userSet.add(user);
            return true;
        }
        return false;
    }
    
    public static User searchUser(String username){
        for(User user : userSet){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }
    // adds user to the arrayList
    /*
     public static boolean addUser(User user){
         if(!checkUser(user.getName())){
            usersList.add(user);
            return true;
        }
        else {
            return false;
        }
     }*/
    
    
    
    // reads users information from file and reconstruct the users ArrayList.
    public static void readAllUsersFromFile(){
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("users.bin"));
            try {
                userSet.addAll((HashSet<User>) is.readObject());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(UserSystem.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("User read IO exception " + ex.getMessage());
        }
    }
    
    // writes user information to file.
    public static void writeAllUsersToFile(){
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("users.bin"));
            os.writeObject(userSet);
        } catch (IOException ex) {
            Logger.getLogger(UserSystem.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("User write IO exception " + ex.getMessage());
        }
        
    }
    
}
