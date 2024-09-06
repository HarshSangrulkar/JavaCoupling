package com.tight.coupling;

//A - MySQL, PostgreSQL
//lets say we want to switch to a diff db
//B - Web Services, MongoDB

//since usermanager is tightly coupled with the userdatabase, we will have to constantly change code inside usermanager when there's change in the database

//which is not atall good

public class UserDatabase {
    // access database and use info inside db
    // this section is gonna consist all the code that allows us to interact with
    // the database

    public String getUserDetails() {
        // directly access db here
        return "User Details from Database";
    }
}
