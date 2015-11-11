package jdramaix.angular.client;

import com.google.gwt.core.client.EntryPoint;
import jdramaix.angular.client.api.Angular;
import jdramaix.angular.client.api.ControllerConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;

public class AngularApp implements EntryPoint {
    @JsProperty(namespace = JsPackage.GLOBAL)
    public static native Object getDocument();

    @Override
    public void onModuleLoad() {
        Angular angular = Angular.getAngular();

        angular.module("todoApp", new String[0])
                .controller("TodoListController",
                        new Object[]{"$http", (ControllerConstructor) TodoListController::new});

        angular.bootstrap(getDocument(), new String[]{"todoApp"});
    }
}
