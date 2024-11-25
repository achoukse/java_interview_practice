import java.util.Arrays;

public class problem92 {
    //swap first and last element of the Array
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int temp =a[0];
        int size =a.length;

        a[0]=a[size-1];
        a[size-1]=temp  ;

        System.out.println(Arrays.toString(a));
    }

}
