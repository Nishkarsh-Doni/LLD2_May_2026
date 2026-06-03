package org.example.designpatterns.factory.ui.android;

import org.example.designpatterns.factory.ui.Button;
import org.example.designpatterns.factory.ui.Menu;
import org.example.designpatterns.factory.ui.UIFactory;

/**
 * AndroidUIFactory — creates Android-specific UI components.
 */
public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
