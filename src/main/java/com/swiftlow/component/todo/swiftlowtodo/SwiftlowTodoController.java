package com.swiftlow.component.todo.swiftlowtodo;


import com.swiftlow.component.todo.swiftlowtodo.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class SwiftlowTodoController {

    @GetMapping
    public List<Todo> list() {
        List<Todo> todos = new ArrayList<>();
        Todo sample = new Todo(123L, "do something", new Date(), ":todo 18 Jul 2018 at 17:00:50 do something!", "Somebody");
        todos.add(sample);
        return todos;
    }

}
