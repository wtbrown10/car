package com.will;

public class Car {
    private String color;
    private String vin;
    public String model;
    private int tireCount;
    private int year;
    private boolean isOn = false;

    public Car(String color, String model, String vin, int tireCount, int year) {
        this.color = color;
        this.model = model;
        this.vin = vin;
        this.tireCount = tireCount;
        this.year = year;
        this.isOn = false;
    }

    public Car(String color, String model, String vin, int year) {
        this.color = color;
        this.model = model;
        this.vin = vin;
        this.tireCount = 4;
        this.year = year;
        this.isOn = false;
    }
    public void drive() {
        if (!isOn) {
            System.out.println("Turn the car on first.");
            return;
        }
        System.out.println("Moving!");
    }

    public void setOn(boolean on) {
        if(isOn && on) {
            System.out.println("Screech");
            return;
        }
        if (!isOn && !on) {
            System.out.println("radio starting.");
            return;
        }
        isOn = on;
    }

    public void toggleOn() {
        isOn = !isOn;
    }

    public void displayDetails() {
        System.out.printf("You are driving %s %n %s", color, year, model);
    }


    @Override
    public String toString() {
        return "You are driving a " + color + " " + year + " " + model + ".";
    }
}
