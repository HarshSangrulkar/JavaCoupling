package com.tight.coupling;

//the usermanager class is going to use 
public class UserManager {

    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo() {
        // here we are going to use the method created in the UserDatabase class
        // for this we have to create an instance of the userDB class

        return userDatabase.getUserDetails();
    }
}
