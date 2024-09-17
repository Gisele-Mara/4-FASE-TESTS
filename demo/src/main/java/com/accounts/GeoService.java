package com.accounts;


public class GeoService {


    public static float triangleArea( float base, float height) {
        float area = (base * height) / 2;

        return area;

    }
    public static double circleArea(float radius) {
        double area = (Math.pow(radius, 2) * Math.PI );

        return area;

    }

    public static float squareArea(int length) {
        float area = (length * length);

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

    public static double cilinderVolume(float height, float radius) {
        float r = radius * radius;
        double volume = (Math.PI * r * height);

        return volume;

    }

    public static double sphereVolume(float radius) {
        double volume = (4 * (Math.PI * Math.pow(radius, 3))) / 3;

        return volume;
    }

}
