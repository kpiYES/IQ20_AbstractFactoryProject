package com;

public class BlackFactory implements BaseFactory {
    @Override
    public Circle createCircle() {
        return new Cirlce;
    }

    @Override
    public Triangle createTriangle() {
        return new Triangle;
    }
}
