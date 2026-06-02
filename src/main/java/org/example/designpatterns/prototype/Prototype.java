package org.example.designpatterns.prototype;


// Any class that wants to be "cloneable" must implement this interface
public interface Prototype<T> {
    T clone();
}
