package dev.omedia.Polymorphism;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> Engine is starting...";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> Accelerating...";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> Braking...";
    }
}
