import java.util.Arrays;
import java.util.Collections;

public class problem141 {
    //Sort an Array in descending order using built-in functions
    public static void main(String[] args) {
        Integer[] ar={9,3,1,2,6,5,4,8,7};
        Arrays.sort(ar,Collections.reverseOrder());
        System.out.println(Arrays.toString(ar));
    }
}
