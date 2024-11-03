package org.example.lab5;

import java.util.Scanner;

abstract class Vehicle {
    private String modelName;
    private int mileage;
    private int health;

    public Vehicle(String modelName) {
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100;
    }

    public Vehicle(String modelName, int mileage, int health) {
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health;
    }

    public String getModelName() {
        return modelName;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract String service();

    public abstract int expectedLifespan();

    public boolean needsMaintenance() {
        return health < 70;
    }

    public int calculateRemainingLifespan() {
        int lifespan = expectedLifespan();
        if (health < 50) {
            lifespan = lifespan * health / 100;
        }
        return lifespan - mileage;
    }

    public void simulateYear() {
        if (mileage > expectedLifespan() / 2) {
            health -= 5;
        }
    }

    public static void performMaintenance(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println(car.repair());
            car.drive(100);
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println(truck.repair());
            truck.haul(6000);
        } else if (vehicle instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) vehicle;
            System.out.println(motorcycle.repair());
            motorcycle.race(50);
        }
    }
}

interface Repairable {
    String repair();
}

class Car extends Vehicle implements Repairable {
    public Car(String modelName) {
        super(modelName);
    }

    public Car(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String repair() {
        return "Engine tuned and oil changed for " + getModelName();
    }

    @Override
    public String service() {
        return "Car service: Check engine and change oil. Model: " + getModelName() +
                ", Mileage: " + getMileage() + ", Health: " + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 150000;
    }

    public void drive(int miles) {
        setMileage(getMileage() + miles);
        setHealth(getHealth() - 2);
    }
}

class Truck extends Vehicle implements Repairable {
    public Truck(String modelName) {
        super(modelName);
    }

    public Truck(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String repair() {
        return "Engine overhauled and tires replaced for " + getModelName();
    }

    @Override
    public String service() {
        return "Truck service: General inspection. Model: " + getModelName() +
                ", Mileage: " + getMileage() + ", Health: " + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 300000;
    }

    public void haul(int loadWeight) {
        if (loadWeight > 5000) {
            setHealth(getHealth() - 10);
        }
    }
}

class Motorcycle extends Vehicle implements Repairable {
    public Motorcycle(String modelName) {
        super(modelName);
    }

    public Motorcycle(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String repair() {
        return "Engine tuned and chain lubricated for " + getModelName();
    }

    @Override
    public String service() {
        return "Motorcycle service: Lubricate chain and tune engine. Model: " + getModelName() +
                ", Mileage: " + getMileage() + ", Health: " + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 50000;
    }

    public void race(int raceMiles) {
        setMileage(getMileage() + raceMiles);
        setHealth(getHealth() - 5);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Toyota"),
                new Truck("Ford", 10000, 80),
                new Motorcycle("Yamaha", 5000, 90)
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.service());
            vehicle.simulateYear();

            if (vehicle instanceof Car) {
                ((Car) vehicle).drive(100);
            } else if (vehicle instanceof Truck) {
                ((Truck) vehicle).haul(6000);
            } else if (vehicle instanceof Motorcycle) {
                ((Motorcycle) vehicle).race(50);
            }
        }

        for (Vehicle vehicle : vehicles) {
            Vehicle.performMaintenance(vehicle);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nOdaberite vozilo za održavanje:");
            for (int i = 0; i < vehicles.length; i++) {
                System.out.println((i + 1) + ". " + vehicles[i].getModelName());
            }
            System.out.println("0. Izlaz");

            int izbor = scanner.nextInt();
            if (izbor == 0) break;

            if (izbor > 0 && izbor <= vehicles.length) {
                Vehicle selectedVehicle = vehicles[izbor - 1];
                Vehicle.performMaintenance(selectedVehicle);
            } else {
                System.out.println("Neispravan unos, pokušajte ponovo.");
            }
        }
        scanner.close();
    }
}
