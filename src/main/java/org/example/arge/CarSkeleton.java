package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
        this("Generic Car", "Basic car skeleton");
    }

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

    public void startEngine() {
        System.out.println("CarSkeleton -> Engine started");
    }

    public void drive() {
        System.out.println("CarSkeleton -> Driving");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("CarSkeleton -> Engine is running");
    }
}
