import java.util.Arrays;

public class problem79 {
    //Reverse the element in the array
    public static void main(String[] args) {
        int[] ar ={5,2,1,3,4};
        int start =0;
        int last =ar.length-1;
        int temp;
        while (start<last){
            temp=ar[start];
            ar[start]=ar[last];
            ar[last]=temp;
            start++;
            last--;

        }
        System.out.println(Arrays.toString(ar));
    }
}
