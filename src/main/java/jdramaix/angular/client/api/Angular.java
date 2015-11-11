package jdramaix.angular.client.api;

        import jsinterop.annotations.JsPackage;
        import jsinterop.annotations.JsProperty;
        import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Angular {
    @JsProperty(namespace = JsPackage.GLOBAL)
    public static native Angular getAngular();

    public native Module module(String name, String[] requires);

    public native <T> void forEach(JsArray<T> obj, ForEachIterator<T> iterator);

    public native void bootstrap(Object element, String[] module);
}
