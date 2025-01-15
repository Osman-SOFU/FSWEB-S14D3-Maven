package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": The Holden's engine is starting.");
        return "The Holden's engine is starting.";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": The Holden is accelerating.");
        return "The Holden is accelerating.";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": The Holden is braking.");
        return "The Holden is braking.";
    }
}