package javaSorting;

import java.util.ArrayList;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> listOfInterger = new ArrayList<>();
        listOfInterger.add(1);
        listOfInterger.add(25);
        listOfInterger.add(36);
        listOfInterger.add(23);
        System.out.println("Befor Sorting");
       MyUtils.iterateList(listOfInterger);

        System.out.println("after Sorting");
        listOfInterger.stream().sorted().forEach(s-> System.out.println(s));


        ArrayList<String> ListOfstr = new ArrayList<>();
        ListOfstr.add("abh");
        ListOfstr.add("nih");
        ListOfstr.add("baha");
        System.out.println("before sorting");
       MyUtils.iterateList(ListOfstr);

        System.out.println("after sorting");

        ListOfstr.stream().sorted().forEach(s -> System.out.println(s));



    }
}
