import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class problem77 {
    // java program to reverse an array using java collection
    public static void main(String[] args) {
        Integer[] a ={5,2,4,6,1,8};
        List<Integer> list = Arrays.asList(a);
        Collections.reverse(list);
        System.out.println(list);
    }
}
