/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Users;

import UserHasA.BankAccount;

/**
 *
 * @author barisertas
 */
public class User {
    
    
    private String name;
    private String surname;
    private String email;
    private String username;
    private char[] password;
    private BankAccount account = new BankAccount(0);
    
    public User(){
        
    }

    public User(String name, String surname, String email, String username, char[] password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;
      
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }    



    @Override
    public String toString() {
        return "User" + "\nname=" + name + "\nsurname=" + surname + "\nemail=" +
                email + "\nusername=" + username + "\npassword=" + password + 
                "\nbalance=" + account.getAccountBalance();
    }
    
    
}
