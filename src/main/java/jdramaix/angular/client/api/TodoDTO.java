package jdramaix.angular.client.api;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface TodoDTO {
    @JsProperty
    String getText();
    @JsProperty
    boolean isDone();
}
