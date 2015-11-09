package jdramaix.polymer.client.js;

public class Global {
    // uncomment this once name is supported in JsMethod and remove jsni
    // @JsProperty(name= "String", namespace = GLOBAL)
    public native static Object String() /*-{
        return $wnd.String;
    }-*/;
}
