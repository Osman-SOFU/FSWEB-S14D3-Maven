package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Constructor
    public Car(int cylinders, String name) {
        this.engine = true; // Default olarak motor var
        this.wheels = 4;    // Default olarak 4 tekerlek var
        this.cylinders = cylinders;
        this.name = name;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    // Methods
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + "the car's engine is starting");
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName() + "the car is accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName() + "the car is braking");
        return "the car is braking";
    }

}
