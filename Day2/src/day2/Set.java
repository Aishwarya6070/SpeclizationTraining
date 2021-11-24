package day2;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<>();

        set.add(10); // 1
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(10); // 1

        set.forEach(System.out::println);

    }
}