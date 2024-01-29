package Figures;

public class Circle extends Figure
{
    private double radius;
    public Circle(String name, String color, double radius)
    {
        super(name, color);
        this.radius=radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Side: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
