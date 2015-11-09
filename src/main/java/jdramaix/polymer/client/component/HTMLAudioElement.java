package jdramaix.polymer.client.component;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class HTMLAudioElement {
  public native String canPlayType(String mediaType);
}