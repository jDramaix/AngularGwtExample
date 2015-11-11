package jdramaix.angular.client.api.http;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface HttpPromise {
    <T> HttpPromise success(HttpPromiseCallback<T> callback);
}
