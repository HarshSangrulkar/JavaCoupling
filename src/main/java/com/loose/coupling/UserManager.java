package com.loose.coupling;

//the usermanager class is going to use 
public class UserManager {

    // private UserDatabaseProvider userDatabase = new UserDatabaseProvider();

    // with loose coupling we do not have to hard encode the creration of the object

    // but with loose coupling, we are going to use Constructor

    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo() {
        // here we are going to use the method created in the UserDatabase class
        // for this we have to create an instance of the userDB class

        return userDataProvider.getUserDetails();
    }
}
