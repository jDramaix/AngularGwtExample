package jdramaix.angular.client;

import jdramaix.angular.client.api.JsArray;
import jdramaix.angular.client.api.TodoDTO;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface TodoArray {
    @JsProperty
    TodoDTO[] getTodos();
}
