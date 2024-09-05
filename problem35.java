import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem35 {
    public static void main(String[] args) {
        //remove dupicate in arry
        int[] a ={5,4,5,5,4,2,2,1,3,1};
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        Integer[] b=set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(b));
    }
}
