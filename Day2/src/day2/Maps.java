package day2;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Abhi", "123");
        map.put("Arun", "1234579");
        map.put("Aishu", "12345679");

        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

