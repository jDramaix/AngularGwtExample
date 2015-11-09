package jdramaix.angular.client;

import jsinterop.annotations.JsType;

@JsType(namespace = "jdramaix")
public class Todo {
    public String text;
    public boolean done;

    Todo(String text, boolean done) {
        this.text = text;
        this.done = done;
    }
}
