package stream.zad7;

import java.util.ArrayList;
import java.util.List;

public class zad7 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Magda");
        names.add("Michał");
        names.add("Janek");
        names.add("Rafał");
        names.add("Garażyna");
        names.add("Dawid");
        names.add("Mateusz");
        names.add("Jan");
        names.add("Sławek");

        names.stream().filter(x -> x.contains("Jan")).forEach(System.out::println);


    }
}
