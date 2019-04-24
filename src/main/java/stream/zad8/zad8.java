package stream.zad8;

import java.util.ArrayList;
import java.util.List;

public class zad8 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Magda");
        names.add("Michał");
        names.add("Janina");
        names.add("Rafał");
        names.add("Garażyna");
        names.add("Dawid");
        names.add("Mateusz");
        names.add("Jan");
        names.add("Sławek");

        names.stream().sorted().forEach(System.out::println);
    }
}
