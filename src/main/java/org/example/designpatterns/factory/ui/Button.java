package org.example.designpatterns.factory.ui;

/**
 * Button — interface for UI buttons.
 * Different platforms (Android, iOS) have different button implementations.
 */
public interface Button {

    void render();

    void onClick();
}
