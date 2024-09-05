import java.util.Arrays;

public class problem53 {
    public static void main(String[] args) {
        //program to sort element in array using inbuildfuction
        int[] a={8,1,5,9,12,33,23,7,4,3};
        System.out.println("Befor sorting the array"+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After sorting the array"+Arrays.toString(a));
    }
}
