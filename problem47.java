import java.util.Arrays;

public class problem47 {
    public static void main(String[] args) {
        //compre 2 arrays
        int[] a ={1,2,3,4};
        int[] b ={1,2,3,5};
        if(Arrays.equals(a,b)){
            System.out.println("Both the arrys are equal");
        }else {
            System.out.println("the given array is not equal");
        }
    }
}
