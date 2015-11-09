package jdramaix.angular.client;


import jdramaix.angular.client.api.JsArray;
import jdramaix.angular.client.api.http.HttpService;
import jsinterop.annotations.JsType;

import static jdramaix.angular.client.api.Angular.getAngular;

@JsType(namespace = "jdramaix")
public class TodoListController {
    private class SimpleCounter {
        int value = 0;
    }

    public JsArray<Todo> todos;
    public String todoText = "";

    public TodoListController(HttpService http) {
        http.<TodoArray>get("server/todo.json")
                .success((TodoArray data) -> todos = data.todos);
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
