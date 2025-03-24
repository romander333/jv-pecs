package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeWidth;
    private String bladeType;
    private double pushCapacity;

    public Bulldozer() {
    }

    public Bulldozer(double bladeWidth, String bladeType, double pushCapacity) {
        this.bladeWidth = bladeWidth;
        this.bladeType = bladeType;
        this.pushCapacity = pushCapacity;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public double getPushCapacity() {
        return pushCapacity;
    }

    public void setPushCapacity(double pushCapacity) {
        this.pushCapacity = pushCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + "bladeWidth=" + bladeWidth
                + ", bladeType='" + bladeType
                + '\''
                + ", pushCapacity=" + pushCapacity
                + '}';
    }
}
