package jdramaix.polymer.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import jdramaix.polymer.client.component.AgeSliderElement;

public class View implements IsWidget {
  interface ViewUiBinder extends UiBinder<Widget, View> {
  }

  private static ViewUiBinder ourUiBinder = GWT.create(ViewUiBinder.class);

  @UiField
  AgeSliderElement ageSliderElement;
  @UiField
  AgeSliderElement ageSliderElement2;

  private Widget mainWidget;

  public View() {
    mainWidget = ourUiBinder.createAndBindUi(this);
  }

  @Override
  public Widget asWidget() {
    return mainWidget;
  }

  @UiHandler("externalButton")
  void onExternalButtonClick(ClickEvent e) {
    String tmp = ageSliderElement.getComponent().name;
    ageSliderElement.getComponent().name = ageSliderElement2.getComponent().name;
    ageSliderElement2.getComponent().name = tmp;
  }
}
