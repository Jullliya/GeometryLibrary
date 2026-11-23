package com.example.geometry;

public class UnitsConverter {

    public static double convertAreaToMm(Double area) {
        return area * 100;
    };
    public static double convertAreaToM(Double area) {
        return area / 10000;
    };
    public static double convertPerimeterToMm(Double perimeter) {
        return perimeter * 10;
    };
    public static double convertPerimeterToM(Double perimeter) {
        return perimeter / 100;
    };
    public static double convertVolumeToMm(Double volume) {
        return volume * 1000;
    };
    public static double convertVolumeToM(Double volume) {
        return volume / 1000000;
    };
}
