/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud.lesson_15;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class User {
    protected String login;
    protected String password;
    protected String name;
    protected String email;
    protected boolean isLoggedIn;
    
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.name = "";
        this.email = "";
        this.isLoggedIn = false;
    }
    
    public User(String login, String password, String name, String email) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
        this.isLoggedIn = false;
    }
    
    public boolean login() throws FileNotFoundException, PasswordDontMatchExeption {
        CSVReader csv = new CSVReader(FileType.USERS);
        if (csv.getPasswordByLogin(login).equals(password)) {
            isLoggedIn = true;
            return true;
        } else {
            throw new PasswordDontMatchExeption("Не верный пароль", password);
        }
//        return false;
    }

    public void logout() {
        isLoggedIn = false;
    }
    
    public void signIn(){
        
    }

    public abstract void manageProfile();
}

class Customer extends User {

    public Customer(String login, String password) {
        super(login, password);
    }
    
    public Customer(String login, String password, String name, String email) {
        super(login, password, name, email);
    }

    public void manageProfile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Manager extends User {

    public Manager(String login, String password) {
        super(login, password);
    }

    public void manageProfile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class PasswordDontMatchExeption extends Exception{
    
    String password;

    public PasswordDontMatchExeption(String message, String password) {
        super(message);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

class Test {
    
    public static void main(String[] args) throws FileNotFoundException {
        String login = "hsh01";
        String pw = "poiuytre2";
        User user = new Customer(login, pw);
        try {
            if (user.login())
                System.out.println("Logged successful.");
        } catch (PasswordDontMatchExeption ex) {
            System.err.println(ex.getMessage() + ": " + ex.getPassword());
        }
    }
    
    
}
