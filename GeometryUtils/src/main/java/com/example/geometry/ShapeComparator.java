package com.example.geometry;

public class ShapeComparator {

    public static void volumeCompare(Double a, Double b){
        int result = Double.compare(a, b);
        if (result == 1) {
            System.out.println("The volume of the first shape more.");
        }
        else if (result == -1) {
            System.out.println("The volume of the second shape more.");
        }
    }

    public static void areaCompare(Double a, Double b){
        int result = Double.compare(a, b);
        if (result == 1) {
            System.out.println("The area of the first shape more.");
        }
        else if (result == -1) {
            System.out.println("The area of the second shape more.");
        }
    }

    public static void perimeterCompare(Double a, Double b){
        int result = Double.compare(a, b);
        if (result == 1) {
            System.out.println("The perimeter of the first shape more.");
        }
        else if (result == -1) {
            System.out.println("The perimeter of the second shape more.");
        }
    }
}
