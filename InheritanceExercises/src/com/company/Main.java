package com.company;

import java.awt.geom.CubicCurve2D;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(5, 2);
        System.out.println(cylinder.getVolume());

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getArea());

        Cuboid cuboid = new Cuboid(3, 2, 15);
        System.out.println(cuboid.getVolume());
    }
}
