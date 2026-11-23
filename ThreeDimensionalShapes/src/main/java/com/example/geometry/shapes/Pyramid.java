package com.example.geometry.shapes;

public class Pyramid implements Shape3D {

    private final double baseSide;
    private final double height;

    public Pyramid(double baseSide, double height) {
        this.baseSide = baseSide;
        this.height = height;
    }

    private double slantHeight() {
        double halfBase = baseSide / 2;
        return Math.sqrt(height * height + halfBase * halfBase);
    }

    @Override
    public double volume() {
        return baseSide * baseSide * height / 3;
    }

    @Override
    public double surfaceArea() {
        double baseArea = baseSide * baseSide;
        double lateralArea = 2 * baseSide * slantHeight();
        return baseArea + lateralArea;
    }
}
