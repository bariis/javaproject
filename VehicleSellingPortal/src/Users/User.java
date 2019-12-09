/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Users;

/**
 *
 * @author barisertas
 */
public class User {
    
    
    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
    private boolean isAdmin;
    
    public User(){
        
    }

    public User(String name, String surname, String email, String username, String password, boolean isAdmin) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", surname=" + surname + ", email=" + email + ", username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + '}';
    }
    
    
}
