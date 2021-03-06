package stream.zad10;

public class Employee {
    private int salary;
    private String name;
    private String surname;

    public Employee() {
    }

    public Employee( String name, String surname,int salary) {
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
