package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    // Parametresiz constructor
    public CarSkeleton() {
    }

    // Parametre alan constructor
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Public method: startEngine
    public String startEngine() {
        return "The car's engine is starting.";
    }

    // Public method: drive
    public String drive() {
        return runEngine() + " The car is now driving.";
    }

    // Protected method: runEngine
    protected String runEngine() {
        return "The car's engine is running.";
    }
}
