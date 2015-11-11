package jdramaix.angular.client;


import jdramaix.angular.client.api.JsArray;
import jdramaix.angular.client.api.TodoDTO;
import jdramaix.angular.client.api.http.HttpService;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import static jdramaix.angular.client.api.Angular.getAngular;

@JsType
public class TodoListController {
    private class SimpleCounter {
        int value = 0;
    }

    public JsArray<Todo> todos = new JsArray<>();
    public String todoText = "";

    @JsIgnore
    public TodoListController(HttpService http) {
        http.get("server/todo.json").success((TodoArray data) -> {
            for (TodoDTO dto : data.getTodos())
               todos.push(new Todo(dto));
        });
    }

    public void addTodo() {
        todos.push(new Todo(todoText, false));
        todoText = "";
    }

    public int remaining() {
        SimpleCounter count = new SimpleCounter();

        getAngular().forEach(todos,
                (todo, key) -> count.value += todo.done ? 0 : 1);

        return count.value;
    }

    public void archive() {
        JsArray<Todo> oldTodos = todos;
        todos = new JsArray<>();

        getAngular().forEach(oldTodos, (value, key) -> {
            if (!value.done)
                todos.push(value);
        });
    }
}
