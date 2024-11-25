import java.util.ArrayList;
import java.util.Collections;

public class problem142 {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(9);
        aList.add(7);
        aList.add(1);
        aList.add(3);
        System.out.println("defaut order"+aList);
        Collections.sort(aList);

        System.out.println("Acending order"+aList);
        Collections.sort(aList,Collections.reverseOrder());
    }
}
