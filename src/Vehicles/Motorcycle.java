package Vehicles;

public class Motorcycle extends Vehicle
{
    private String driveType;
    private double engineCapacity;

    public Motorcycle(String brand, int year, String driveType, double engineCapacity)
    {
        super(brand, year);
        this.driveType=driveType;
        this.engineCapacity=engineCapacity;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
