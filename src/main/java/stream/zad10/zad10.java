package stream.zad10;

import java.util.ArrayList;
import java.util.List;

public class zad10 {
    public static void main(String[] args) {

        Employee employee = new Employee("Marcin", "Kiński", 5000);
        Employee employee2 = new Employee("Michał", "Kwak", 3500);
        Employee employee3 = new Employee("Aga","Mała",2500);
        Employee employee4 = new Employee("Irena","Skalska",6230);
        Employee employee5 = new Employee("Grazyna","Kińska",12000);
        Employee employee6 = new Employee ("Andrzej","Gołota",8790);

        List<Employee> emplyee = new ArrayList<>();

        emplyee.add(employee);
        emplyee.add(employee2);
        emplyee.add(employee3);
        emplyee.add(employee4);
        emplyee.add(employee5);
        emplyee.add(employee6);

        //System.out.println(emplyee.stream().mapToInt(value -> v).average(Employee::getSalary));
    }
}
