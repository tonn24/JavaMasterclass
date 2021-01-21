package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("holden")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }
}
