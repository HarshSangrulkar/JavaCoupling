package com.loose.coupling;

//this is the contract for fetching the user details from databse
public interface UserDataProvider {
    // here i can specify how i want my user details to be fetched

    // i can define all methods that i want that can interact with db, over here

    String getUserDetails();
}
