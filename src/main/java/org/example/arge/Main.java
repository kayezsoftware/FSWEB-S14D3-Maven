package org.example.arge;

public class Main {
    public static void main(String[] args) {

        CarSkeleton gas = new GasPoweredCar("Toyota", "Gas car", 12.5, 4);
        CarSkeleton electric = new ElectricCar("Tesla", "Electric car", 400, 100);
        CarSkeleton hybrid = new HybridCar("Prius", "Hybrid car", 18, 50, 4);

        gas.startEngine();
        gas.drive();

        electric.startEngine();
        electric.drive();

        hybrid.startEngine();
        hybrid.drive();
    }
}
