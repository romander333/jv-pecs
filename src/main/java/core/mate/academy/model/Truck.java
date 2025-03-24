package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;
    private int axles;
    private String fuelType;

    public Truck() {
    }

    public Truck(int loadCapacity, int axles, String fuelType) {
        this.loadCapacity = loadCapacity;
        this.axles = axles;
        this.fuelType = fuelType;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getAxles() {
        return axles;
    }

    public void setAxles(int axles) {
        this.axles = axles;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{"
                + "loadCapacity=" + loadCapacity
                + ", axles=" + axles
                + ", fuelType='" + fuelType + '\''
                + '}';
    }
}
