package jdramaix.angular.client.api;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;

/**
 * Created by dramaix on 11/7/15.
 */
public class Global {
    @JsProperty(namespace = JsPackage.GLOBAL)
    public static native Object getDocument();
}
