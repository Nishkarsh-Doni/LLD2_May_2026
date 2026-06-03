package org.example.designpatterns.factory.ui.android;


import org.example.designpatterns.factory.ui.Button;

public class AndroidButton implements Button {

    @Override
    public void render() {
        System.out.println("[Android] Rendering Material Design button");
    }

    @Override
    public void onClick() {
        System.out.println("[Android] Button clicked — ripple effect");
    }
}
