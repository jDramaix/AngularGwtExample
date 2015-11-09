package jdramaix.angular.client.api;

import jsinterop.annotations.JsFunction;

/**
 * Created by dramaix on 11/7/15.
 */
@JsFunction
public interface ForEachIterator<T> {
    public void onIterate(T value, int key);
}
