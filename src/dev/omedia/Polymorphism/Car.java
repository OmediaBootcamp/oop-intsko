package dev.omedia.Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> Engine is starting...";
    }

    public String accelerate() {
        return "Car -> Car is accelerating...";
    }

    public String brake() {
        return "Car -> Car is braking...";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

