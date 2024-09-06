package com.tight.coupling;

public class UserDatabase {
    // access database and use info inside db
    // this section is gonna consist all the code that allows us to interact with
    // the database

    public String getUserDetails() {
        // directly access db here
        return "User Details from Database";
    }
}
