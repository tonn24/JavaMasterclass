package com.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car (int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        // return " Car -> startEngine()";
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        // return "Car -> accelerate()";
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        // return "Car -> brake()";
        return getClass().getSimpleName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
