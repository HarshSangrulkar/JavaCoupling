package com.loose.coupling;

//A - MySQL, PostgreSQL
//lets say we want to switch to a diff db
//B - Web Services, MongoDB

//since usermanager is tightly coupled with the userdatabase, we will have to constantly change code inside usermanager when there's change in the database

//which is not atall good

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        // directly access db here
        return "User Details from Database";
    }
}
