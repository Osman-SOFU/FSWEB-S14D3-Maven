package org.example.arge;

public class Main {
    public static void main(String[] args) {
        // Polymorphism ile farklı araçlar yaratma
        CarSkeleton gasCar = new GasPoweredCar("GasCar", "A gas-powered car", 15.0, 4);
        CarSkeleton electricCar = new ElectricCar("ElectricCar", "An electric car", 200.0, 75);
        CarSkeleton hybridCar = new HybridCar("HybridCar", "A hybrid car", 18.0, 50, 4);

        // StartEngine ve drive metotlarını çağırma
        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);
    }

    // Aracın sınıfını ekrana basan metod
    public static void testCar(CarSkeleton car) {
        System.out.println(car.startEngine());
        System.out.println(car.drive());
        System.out.println("Car type: " + car.getClass().getSimpleName());
        System.out.println("--------------");
    }
}
