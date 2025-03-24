package core.mate.academy.model;

public class Excavator extends Machine {
    private double armLength;
    private double bucketCapacity;
    private String chassisType;

    public Excavator() {
    }

    public Excavator(double armLength, double bucketCapacity, String chassisType) {
        this.armLength = armLength;
        this.bucketCapacity = bucketCapacity;
        this.chassisType = chassisType;
    }

    public double getArmLength() {
        return armLength;
    }

    public void setArmLength(double armLength) {
        this.armLength = armLength;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String toString() {
        return "Excavator{"
                + "armLength=" + armLength
                + ", bucketCapacity=" + bucketCapacity
                + ", chassisType='" + chassisType + '\''
                + '}';
    }
}
