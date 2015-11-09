package jdramaix.angular.client.api.http;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface HttpService {
   <T> HttpPromise<T> get(String url);
}
