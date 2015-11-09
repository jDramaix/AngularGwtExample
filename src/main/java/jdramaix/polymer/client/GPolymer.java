package jdramaix.polymer.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RootPanel;
import jsinterop.annotations.JsMethod;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GPolymer implements EntryPoint {

  public void onModuleLoad() {

    importElement("component/age-slider.html");

    RootPanel.get().add(new View());
  }

  private void importElement(String href) {

    Element link = DOM.createElement("link");
    link.setAttribute("rel", "import");
    link.setAttribute("href", href);
    Document.get().getHead().appendChild(link);

    log(href + " imported");
  }

  @JsMethod(namespace = "console")
  public static native void log(String msg);
}
