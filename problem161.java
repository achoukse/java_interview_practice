import java.util.Arrays;

public class problem161 {
    //bubblesort
    public static void main(String[] args) {
        int[] arr ={35,1,5,16,3,9,12};

        int temp ;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
