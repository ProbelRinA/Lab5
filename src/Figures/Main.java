package Figures;

public class Main
{
    public static void main(String[] args)
    {
        Square square = new Square("Circle", "Red", 6.7);
        Circle circle = new Circle("Circle", "Clue", 4.5);

        square.printInfo();
        circle.printInfo();
    }
}
