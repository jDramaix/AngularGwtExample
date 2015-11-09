package jdramaix.angular.client.api.http;

import jsinterop.annotations.JsFunction;


@JsFunction
public interface HttpPromiseCallback<T> {
    void execute(T data);
}
