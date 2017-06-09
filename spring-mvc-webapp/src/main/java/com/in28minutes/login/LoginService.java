package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public static final String VALID_USERNAME = "Navid";
    public static final String VALID_PASSWORD = "abc123";

    public boolean isValidUser(String username, String password) {
        return username.equalsIgnoreCase(VALID_USERNAME) && password.equalsIgnoreCase(VALID_PASSWORD);
    }
}
