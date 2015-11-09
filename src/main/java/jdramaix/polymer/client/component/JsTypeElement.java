package jdramaix.polymer.client.component;

import com.google.gwt.dom.client.Element;

public abstract class JsTypeElement<T> extends Element {
    protected JsTypeElement() {
    }

    public final native T getComponent() /*-{
        return this;
    }-*/;
}
