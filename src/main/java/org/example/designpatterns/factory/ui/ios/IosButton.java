package org.example.designpatterns.factory.ui.ios;

import org.example.designpatterns.factory.ui.Button;

public class IosButton implements Button {

    @Override
    public void render() {
        System.out.println("[iOS] Rendering Cupertino-style button");
    }

    @Override
    public void onClick() {
        System.out.println("[iOS] Button tapped — haptic feedback");
    }
}
