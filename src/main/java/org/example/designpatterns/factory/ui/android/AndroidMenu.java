package org.example.designpatterns.factory.ui.android;


import org.example.designpatterns.factory.ui.Menu;

public class AndroidMenu implements Menu {

    @Override
    public void render() {
        System.out.println("[Android] Rendering Material dropdown menu");
    }
}
