package com.in28minutes.springmvc;

import com.in28minutes.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        String user = (String) model.get("name");
        model.addAttribute("todos", todoService.retrieveTodos(user));
        return "list-todos";
    }
}
