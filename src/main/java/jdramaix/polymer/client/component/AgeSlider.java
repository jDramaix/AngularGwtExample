package jdramaix.polymer.client.component;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Event;
import jdramaix.polymer.client.GPolymer;
import jdramaix.polymer.client.js.Global;
import jdramaix.polymer.client.js.ObjectLiteral;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class AgeSlider {

    @JsProperty(namespace = "jdramaix.AgeSlider.prototype")
    public static final String is = "age-slider";

    @JsProperty(namespace = "jdramaix.AgeSlider.prototype")
    public static final ObjectLiteral properties = new ObjectLiteral() {
        @JsProperty
        public ObjectLiteral name = new ObjectLiteral() {
            @JsProperty
            public Object type = Global.String();
        };
    };

    private static final String[] names = {"Manon", "Geneviève", "Christian", "Christopher", "Jason",
            "Jean-Christophe", "Joel", "Julien", "Larry", "Maxime", "Philippe"};

    public interface ImplementationConstructor<T> {
        T create();
    }

    public int age;
    public String name;
    public String color;
    public String owner;

    private int nameIndex;

    public AgeSlider() {
    }

    /**
     * Called by polymer when the name changes.
     */
    @SuppressWarnings("unused")
    public void nameChanged(String oldValue, String newValue) {
        if (newValue != null && newValue.length() > 0) {
            name = newValue.substring(0, 1).toUpperCase() + newValue.substring(1);
        }
    }

    public void randomName(Event event, Object details, Element sender) {
        name = names[nameIndex++];
        nameIndex = nameIndex % names.length;
    }

    /**
     * Called by Polymer when a component is ready to be initialized
     */
    @SuppressWarnings("unused")
    public void ready() {
        GPolymer.log(this + " ready");
        age = 25;
        name = "Fred";
        color = "red";
        owner = "GWT";
    }


}
