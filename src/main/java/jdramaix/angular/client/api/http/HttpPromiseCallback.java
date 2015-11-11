package jdramaix.angular.client.api.http;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface HttpPromiseCallback<T> {
    void execute(T data);
}
