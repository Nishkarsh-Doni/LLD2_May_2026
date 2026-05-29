package org.example.interfaces;

public class D implements B, C{
    @Override
    public void print() {
        B.super.print();
    }
}
