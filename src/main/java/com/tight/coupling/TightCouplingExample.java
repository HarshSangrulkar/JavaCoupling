package com.tight.coupling;

public class TightCouplingExample {
    // this is going to be the entry point for our application
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
