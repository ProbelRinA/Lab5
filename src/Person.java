public class Person {
    private String name;
    private String surname;
    private int age;

    public Person (String name, String surname, int age)
    {
        this.name=name;
        this.surname=surname;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setSurname(String surname) {
        this.surname=surname;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args)
    {
        Person person = new Person("Lira", "Folicz", 34);
        person.printInfo();

        person.setAge(24);
        person.setName("Polia");
        person.setSurname("Wolia");

        System.out.println("\nName: " + person.getName() + "\nSurname: " + person.getSurname() + "\nAge: " + person.getAge());
    }
}