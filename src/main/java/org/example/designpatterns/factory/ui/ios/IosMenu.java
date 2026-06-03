package org.example.designpatterns.factory.ui.ios;

import org.example.designpatterns.factory.ui.Menu;

public class IosMenu implements Menu {

    @Override
    public void render() {
        System.out.println("[iOS] Rendering Cupertino action sheet menu");
    }
}
