package jdramaix.polymer.client.component;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Event;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType
public class AgeSliderDescriptor  {


    private AgeSlider impl;

    /**
     * Called by Polymer when a component is created
     */
    @JsMethod
    public void created() {
        impl = new AgeSlider();
    }

    @JsMethod
    public void nameChanged(String oldValue, String newValue) {
        impl.nameChanged(oldValue, newValue);
    }

    @JsMethod
    public void setName(String name) {
        impl.name = name;
    }

    @JsMethod
    public String getName() {
        return impl.name;
    }


    public void randomName(Event event, Object details, Element sender) {
       impl.randomName(event, details, sender);
    }
}
