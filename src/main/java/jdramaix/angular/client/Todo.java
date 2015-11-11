package jdramaix.angular.client;

import jdramaix.angular.client.api.TodoDTO;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class Todo {
    public String text;
    public boolean done;

    @JsIgnore
    public Todo(String text, boolean done) {
        this.text = text;
        this.done = done;
    }

    @JsIgnore
    public Todo(TodoDTO dto) {
        this.text = dto.getText();
        this.done = dto.isDone();
    }
}
