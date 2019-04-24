package oop.zad2;

public class Person extends Adress {
    private String name;
    private String surname;
    private int age;


    public void introduce(){
        System.out.println("Imie "+ name+ "Nazwisko: "+surname);
    }

    public Person(String street, String city, String country, int flatNo, int homeNo, String name, String surname, int age) {
        super(street, city, country, flatNo, homeNo);
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}





