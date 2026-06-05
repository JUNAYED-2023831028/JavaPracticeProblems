package PracticeProblem5;

class Car {
    String owner;
    String brand;
    String serialNumber;
    double fuel;

    Car(String owner, String brand, String serialNumber, double fuel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuel = fuel;
    }

    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }

    void checkFuel() {
        System.out.println("Current fuel: " + fuel + "L");
    }
}

public class CarManagement {
    public static void main(String[] args) {
        Car myCar = new Car("Junayed", "Audi", "ABC-123", 45.5);

        myCar.start();
        myCar.checkFuel();
        myCar.stop();
    }
}