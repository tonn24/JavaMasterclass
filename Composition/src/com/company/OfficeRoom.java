package com.company;

public class Room {
    private int squareMeters;
    private Couch couch;
    private PC pc;
    private Desk desk;
    private Lamp lamp;
    private Tv tv;
    private Chair chair;

    public Room(int squareMeters, Couch couch, PC pc, Desk desk, Lamp lamp, Tv tv, Chair chair) {
        this.squareMeters = squareMeters;
        this.couch = couch;
        this.pc = pc;
        this.desk = desk;
        this.lamp = lamp;
        this.tv = tv;
        this.chair = chair;
    }
}
