package stream.zad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Magda");
        names.add("Michał");
        names.add("Bartek");
        names.add("Rafał");
        names.add("Garażyna");

        names.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
    }
}
