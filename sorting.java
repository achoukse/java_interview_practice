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
        for (Integer i : listOfInterger) {
            System.out.println(i);
        }

        System.out.println("after Sorting");
        listOfInterger.stream().sorted().forEach(s-> System.out.println(s));


        ArrayList<String> ListOfstr = new ArrayList<>();
        ListOfstr.add("abh");
        ListOfstr.add("nih");
        ListOfstr.add("baha");
        System.out.println("before sorting");
        for(String s: ListOfstr){
            System.out.println(s);
        }

        System.out.println("after sorting");

        ListOfstr.stream().sorted().forEach(s -> System.out.println(s));



    }
}
