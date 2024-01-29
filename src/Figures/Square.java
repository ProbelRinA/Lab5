package Figures;

public class Square extends Figure
{
    private double side;

    public Square(String name, String color, double side)
    {
        super(name, color);
        this.side = side;
    }

    public double getArea()
    {
        return side * side;
    }

    public double getPerimeter()
    {
        return 4 * side;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Side: " + side);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
