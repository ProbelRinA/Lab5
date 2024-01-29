package Vehicles;

public class Car extends Vehicle
{
    private int doorsAmount;
    private String engineType;

    public Car(String brand, int year, int doorsAmount, String engineType)
    {
        super(brand, year);
        this.doorsAmount=doorsAmount;
        this.engineType=engineType;
    }

    public int getDoorsAmount() {
        return doorsAmount;
    }

    public void setDoorsAmount(int doorsAmount) {
        this.doorsAmount = doorsAmount;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
