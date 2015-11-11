package jdramaix.angular.client.api.http;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface HttpService {
   HttpPromise get(String url);
}
