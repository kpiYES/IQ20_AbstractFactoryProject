package com;

public class WhiteFactory implements BaseFactory {
    @Override
    public Circle createCircle() {
        return new Circle;
    }

    @Override
    public Triangle createTriangle() {
        return new Triangle;
    }
}
