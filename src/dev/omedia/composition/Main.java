package dev.omedia.composition;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(10, 16777215);

        Bed bed = new Bed("Modern", 4, 2, 6, 1);

        Lamp lamp = new Lamp("Classic", true, 5);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();
        System.out.println("Lamp Style: " + bedroom.getLamp().getStyle());
        System.out.println("Is Battery Operated: " + bedroom.getLamp().isBattery());
        System.out.println("Glob Rating: " + bedroom.getLamp().getGlobRating());
    }
}

