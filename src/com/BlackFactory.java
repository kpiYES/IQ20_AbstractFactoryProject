package com;

public class BlackFactory implements BaseFactory {
    @Override
    public Circle createCircle() {
        return new Circle;
    }

    @Override
    public Triangle createTriangle() {
        return new Triangle;
    }
}
