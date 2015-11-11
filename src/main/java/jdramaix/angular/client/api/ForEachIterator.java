package jdramaix.angular.client.api;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ForEachIterator<T> {
    void onIterate(T value, int key);
}
