package Vehicles;

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car("Toyota", 2022, 4, "Petrol");

        Vehicle vehicle1 = (Vehicle) car;

        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Production Year: " + vehicle1.getYear());

        if (vehicle1 instanceof Car)
        {
            Car carWithCasting = (Car) vehicle1;
            System.out.println("Number of doors: " + carWithCasting.getDoorsAmount());
            System.out.println("Engine type: " + carWithCasting.getEngineType());
        }

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2021, "Chain", 1200.0);

        Vehicle vehicle2 = (Vehicle) motorcycle;

        System.out.println("\nBrand: " + vehicle2.getBrand());
        System.out.println("Production Year: " + vehicle2.getYear());

        if (vehicle2 instanceof Motorcycle)
        {
            Motorcycle motorcycleWithCasting = (Motorcycle) vehicle2;
            System.out.println("Drive type: " + motorcycleWithCasting.getDriveType());
            System.out.println("Engine capacity: " + motorcycleWithCasting.getEngineCapacity());
        }
    }
}
