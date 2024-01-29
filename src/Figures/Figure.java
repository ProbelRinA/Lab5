package Figures;

public class Figure
{
    private String name;
    private String color;

    public Figure (String name, String color)
    {
        this.name=name;
        this.color=color;
    }

    public void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }
}

