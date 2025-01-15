package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": The Mitsubishi's engine is starting.");
        return "The Mitsubishi's engine is starting.";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": The Mitsubishi is accelerating.");
        return "The Mitsubishi is accelerating.";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": The Mitsubishi is braking.");
        return "The Mitsubishi is braking.";
    }
}