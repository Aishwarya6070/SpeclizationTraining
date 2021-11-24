package day2;

import java.util.ArrayList;
import java.util.List;

public class Listex {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Abhi", 12345)); // 0
        list.add(new Employee(2, "Arun", 12345)); // 1
        list.add(new Employee(3, "Aishu", 12345)); // 2

        /* for (int i = 0; i < list.size(); i++) {
            System.out.println("EID : " + list.get(i).eId);
            System.out.println("EName : " + list.get(i).eName);
            System.out.println("ESalary : " + list.get(i).eSalary + "\n");
        } */

        /* for (Employee e : list) {
            System.out.println("EID : " + e.eId);
            System.out.println("EName : " + e.eName);
            System.out.println("ESalary : " + e.eSalary + "\n");
        } */

        /* list.forEach(e -> {
            System.out.println("EID : " + e.eId);
            System.out.println("EName : " + e.eName);
            System.out.println("ESalary : " + e.eSalary + "\n");
        }); */
    }
}
