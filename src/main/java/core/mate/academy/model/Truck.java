package core.mate.academy.model;

public class Truck extends Machine {
    private double loadCapacity;
    private int numberOfWheels;

    public Truck() {
    }

    public Truck(double loadCapacity, int numberOfWheels) {
        this.loadCapacity = loadCapacity;
        this.numberOfWheels = numberOfWheels;
    }

    public Truck(int param1, int param2, String param3) {
        // Конструктор, який у тебе вже є
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
