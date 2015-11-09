package jdramaix.polymer.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import jdramaix.polymer.client.component.AgeSliderElement;

public class SimpleExample implements IsWidget {
    interface ViewUiBinder extends UiBinder<Widget, SimpleExample> {
    }

    private static ViewUiBinder ourUiBinder = GWT.create(ViewUiBinder.class);


    @UiField
    AgeSliderElement ageSliderElement;

    private void init() {
        ageSliderElement.getComponent().name = "Foo";
    }


    private Widget mainWidget;

    public SimpleExample() {
        mainWidget = ourUiBinder.createAndBindUi(this);
    }

    @Override
    public Widget asWidget() {
        return mainWidget;
    }

}
