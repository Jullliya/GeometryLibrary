package com.example.geometry.shape;

public class Rectangle implements Shape {

    private double wight;
    private double height;

    public Rectangle(double x, double y) {
        this.wight = x;
        this.height = y;
    }

    @Override
    public double area() {
        return wight * height;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
