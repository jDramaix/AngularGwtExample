package jdramaix.angular.client;

import com.google.gwt.core.client.EntryPoint;
import jdramaix.angular.client.api.Angular;
import jdramaix.angular.client.api.ControllerConstructor;
import jdramaix.angular.client.api.Global;
import jsinterop.annotations.JsMethod;

/**
 * Created by dramaix on 11/7/15.
 */
public class AngularApp implements EntryPoint {



    @Override
    public void onModuleLoad() {
        Angular angular = Angular.getAngular();

        angular.module("todoApp", new String[0])
                .controller("TodoListController",
                        new Object[]{"$http", (ControllerConstructor) TodoListController::new});


        angular.bootstrap(Global.getDocument(), new String[]{"todoApp"});
    }
}
