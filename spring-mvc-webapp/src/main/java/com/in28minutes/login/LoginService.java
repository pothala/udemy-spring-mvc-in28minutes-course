package com.in28minutes.login;

import com.in28minutes.shared.Constants;
import org.springframework.stereotype.Service;

@Service
public class LoginService {


    public boolean isValidUser(String username, String password) {
        return username.equalsIgnoreCase(Constants.VALID_USERNAME)
                && password.equalsIgnoreCase(Constants.VALID_PASSWORD);
    }
}
