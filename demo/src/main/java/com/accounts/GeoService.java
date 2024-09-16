package com.accounts;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class GeoService {

    private static double pi = 3.14;
 

    public float triangleArea(int base, int height) {
        float area = (base * height) / 2;

        return area;

    }

    public static float squareArea(int base) {
        float area = (base * base);

        return area;

    }

    public static float rectangleArea(int base, int height) {
        float area = (base * height);

        return area;

    }

    public static double cubeVolume(double length) {
        double volume = Math.pow(length, 3);
        return volume;

    }

    public static double cilinderVolume(int height, float radius) {
        float r = radius * radius;
        double volume = (Math.PI * r * height);

        return volume;

    }

    public double sphereVolume(float radius) {
        double volume = (4 * (pi * Math.pow(radius, 3))) / 3;

        return volume;
    }

}
