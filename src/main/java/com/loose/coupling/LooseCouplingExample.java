package com.loose.coupling;

//for loose coupling, we either use interface or abstraction ie Abstract Class
public class LooseCouplingExample {
    // this is going to be the entry point for our application
    public static void main(String[] args) {

        // here we're creating object of the interface and assigning it to the object of
        // the class
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceProvider();
        UserManager userManagerWithWebService = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWebService.getUserInfo());
    }
}
