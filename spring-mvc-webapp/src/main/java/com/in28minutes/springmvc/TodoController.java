package com.in28minutes.springmvc;

import com.in28minutes.shared.Constants;
import com.in28minutes.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        /* hard code for now */

        model.addAttribute("todos", todoService.retrieveTodos(Constants.VALID_USERNAME));
        return "list-todos";
    }
}
