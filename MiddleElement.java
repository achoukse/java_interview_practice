import java.util.ArrayList;
import java.util.List;

public class MiddleElement {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        printMiddleElement(number);
    }

    private static void printMiddleElement(List<Integer> list) {
        if(list.isEmpty()){
            System.out.println("this list is empty");
            return;
        }

        int size = list.size();
        int middleIndex =size/2;

        Integer middleElement =list.get(middleIndex);

        System.out.println("The Middle element is"+middleElement);
    }
}
