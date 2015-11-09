package jdramaix.angular.client.api;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;


/**
 * Native JavaScript array.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Array")
public class JsArray<T> {
    public native void push(T item);
}
