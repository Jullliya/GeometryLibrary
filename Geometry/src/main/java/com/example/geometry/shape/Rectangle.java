package com.example.geometry.shape;

public class Rectangle implements Shape {

    private final double wight;
    private final double height;

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    @Override
    public double area() {
        return wight * height;
    }

    @Override
    public double perimeter() {
        return 2 * (wight + height);
    }
}
