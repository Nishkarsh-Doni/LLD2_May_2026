package org.example.designpatterns.factory.ui;

/**
 * UIFactory — Abstract Factory for creating platform-specific UI components.
 *
 * Each platform (Android, iOS) has its own implementation that
 * returns the correct Button, Menu, etc.
 */
public interface UIFactory {

    Button createButton();

    Menu createMenu();
}
