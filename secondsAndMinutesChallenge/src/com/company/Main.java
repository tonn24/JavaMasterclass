package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationSong(3945));
    }

    public static String getDurationSong(int minutes, int seconds) {
        if(minutes < 0 && seconds < 0 || seconds > 59) {
            return "Invalid Value!";
        }
        long minutesToHours = minutes / 60;
        long minutesLeft = minutes % 60;
        return minutesToHours + "h " + minutesLeft + "m " + seconds + "s";
    }

    public static String getDurationSong(int seconds) {
        if(seconds < 0) {
            return "Invalid Value!";
        }
        long secondsToMinutes = seconds / 60;
        long secondsLeft = seconds % 60;
        long minutesToHours = secondsToMinutes / 60;
        long minutesLeft = secondsToMinutes % 60;
        return minutesToHours + "h " + minutesLeft + "m " + secondsLeft + "s";
    }
}
