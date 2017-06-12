package com.in28minutes.springmvc;

import com.in28minutes.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * {@link Controller} for handling authentication.
 */
@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    public LoginService loginService;

    @RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleUserLogin(ModelMap model,
                                  @RequestParam String name,
                                  @RequestParam String password) {

        if (!loginService.isValidUser(name, password)) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }

        model.put("name", name);
        return "welcome";
    }

}
