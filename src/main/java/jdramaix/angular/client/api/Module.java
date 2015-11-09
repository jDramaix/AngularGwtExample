package jdramaix.angular.client.api;

import jsinterop.annotations.JsType;

/**
 * Created by dramaix on 11/7/15.
 */
@JsType(isNative = true)
public class Module {

    public native Module controller(String name, ControllerConstructor constructor);

    public native Module controller(String name, Object[] inlineArrayAnnotations);
}
