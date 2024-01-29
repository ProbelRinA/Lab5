public class Student_2
{
    private String name;
    private String surname;
    private String id;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname=surname;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        if (id.matches("\\d+"))
        {
            this.id=id;
        } else
        {
            System.out.println("ID must consist of numbers.");
        }
    }
    public static void main(String[] args)
    {
        Student_2 student = new Student_2();

        student.setName("Liza");
        student.setSurname("Smith");
        student.setId("1123943");

        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("ID: " + student.getId());

        student.setId("Adkg23s");


    }
}
