package com.in28minutes.todo.service;

import com.in28minutes.model.Todo;
import com.in28minutes.shared.Constants;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, Constants.VALID_USERNAME, "Learn Spring MVC", new Date(), false));
        todos.add(new Todo(2, Constants.VALID_USERNAME, "Learn Kotlin", new Date(), false));
        todos.add(new Todo(3, Constants.VALID_USERNAME, "Learn Reactive Programming", new Date(), false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user))
                filteredTodos.add(todo);
        }
        return filteredTodos;
    }

    public void addTodo(String name, String description, Date targetDate, boolean isDone) {
        todos.add(new Todo(++todoCount, name, description, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }
}
