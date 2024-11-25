package CodingDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,29,"tim",new Address("street1",8901));
        Employee e2 = new Employee(2,30,"jerry",new Address("street2",8902));
        Employee e3 = new Employee(3,21,"code",new Address("street3",8903));
        Employee e4 = new Employee(4,23,"decode",new Address("street4",8904));
// unsorted List
        List<Employee> em = new ArrayList<>();
        em.add(e1);
        em.add(e2);
        em.add(e3);
        em.add(e4);

        System.out.println("unsorted List"+em);
        System.out.println("******************");

        //sortted List

        Collections.sort(em,new AdressCompator());
        System.out.println("Sorted on based on ages"+em);

        System.out.println("******************");
        Collections.sort(em,new NameComaretor());
        System.out.println("Sorted on based on Name"+em);

        System.out.println("******************");
        Collections.sort(em,new AdressCompator());
        System.out.println("Sorted on based on address"+em);




    }
}
