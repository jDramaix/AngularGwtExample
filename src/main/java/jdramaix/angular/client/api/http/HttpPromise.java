package jdramaix.angular.client.api.http;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface HttpPromise<T> {
    HttpPromise<T> success(HttpPromiseCallback<T> callback);
}
