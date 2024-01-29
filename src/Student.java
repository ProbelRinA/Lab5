public class Student
{
    private String name;
    private String surname;
    private double[] grades;
    private int gradesAmount;
    public Student (String name, String surname, int MAXgradesAmount)
    {
        this.name=name;
        this.surname=surname;
        this.grades=new double[MAXgradesAmount];
        this.gradesAmount=0;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void addGrade(double grade)
    {
        if (gradesAmount < grades.length)
        {
            grades[gradesAmount] = grade;
            gradesAmount++;
        } else
        {
            System.out.println("The limit has been reached.");
        }
    }

    public double getGradeAverage()
    {
        if (gradesAmount == 0)
        {
            return 0.0;
        }

        double suma = 0.0;
        for (int i = 0; i < gradesAmount; i++)
        {
            suma += grades[i];
        }

        return suma/gradesAmount;
    }

    public void printGrades()
    {
        System.out.println("Grades: " );
        for (int i = 0; i < gradesAmount; i++)
        {
            System.out.println(grades[i] + " ");
        }

    }

    public void printImfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        printGrades();
        System.out.println("Average grade: " + getGradeAverage());
    }

    public static void main(String[] args)
    {
        Student student = new Student("Kenny", "Dolif", 5);

        student.addGrade(4.5);
        student.addGrade(5.0);
        student.addGrade(3.5);

        student.printImfo();

        student.addGrade(5.0);
        student.addGrade(4.5);

        student.printImfo();

        student.addGrade(3.5);

        student.printImfo();
    }
}
