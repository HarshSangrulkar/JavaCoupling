package com.loose.coupling;

public class WebServiceProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Fetching data from Web Service";
    }

}
