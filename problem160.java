import java.util.Scanner;

public class problem160 {
    //binary search
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number to search:");

        int searchNum =scanner.nextInt();

        scanner.close();

        int[] ar = {1,3,5,6,9,12,14,19,21,22,23};

        int low =0;
        int high =ar.length -1;

        int mid =0;

        while (low<=high){
            mid =(low+high)/2;

            if(searchNum ==ar[mid]){
                System.out.println("Given number is find at the  index " +mid);
                break;
            }else if(searchNum< ar[mid]){
                high = mid-1;

            }else if(searchNum >ar[mid]){
                low =mid+1;
            }

        }
       if(low >high){
           System.out.println("given number is not found in array");
       }

    }
}
