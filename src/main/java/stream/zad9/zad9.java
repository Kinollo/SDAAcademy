package stream.zad9;

import java.util.*;

public class zad9 {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

            numbers.add(123);
            numbers.add(17);
            numbers.add(12);
            numbers.add(334);
            numbers.add(1512);
            numbers.add(6);

            numbers.stream().forEach(System.out::println);
        System.out.println(numbers.stream().mapToInt(v -> v).min());
        System.out.println(numbers.stream().mapToInt(v -> v).max());
        System.out.println(numbers.stream().mapToInt(v ->v).average());

    }
    }

