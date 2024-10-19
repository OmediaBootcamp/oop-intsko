package dev.omedia.Polymorphism;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> Engine is starting...";
    }

    @Override
    public String accelerate() {
        return "Holden -> Accelerating...";
    }

    @Override
    public String brake() {
        return "Holden -> Braking...";
    }
}
