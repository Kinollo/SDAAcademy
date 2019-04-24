package stream;

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
        names.add("Dawid");
        names.add("Mateusz");
        names.add("Tomek");
        names.add("Sławek");

        for (String x: names) {
            System.out.println(x);

        }
    }
}
