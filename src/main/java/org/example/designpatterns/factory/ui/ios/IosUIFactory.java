package org.example.designpatterns.factory.ui.ios;

import org.example.designpatterns.factory.ui.Button;
import org.example.designpatterns.factory.ui.Menu;
import org.example.designpatterns.factory.ui.UIFactory;

/**
 * IosUIFactory — creates iOS-specific UI components.
 */
public class IosUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
