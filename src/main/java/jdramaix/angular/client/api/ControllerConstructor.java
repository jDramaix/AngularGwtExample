package jdramaix.angular.client.api;

import jdramaix.angular.client.api.http.HttpService;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface ControllerConstructor {
    Object construct(HttpService http);
}
