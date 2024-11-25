import java.util.Arrays;
import java.util.Scanner;

public class problem78 {
   // recive input from user and saving it to array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size =scanner.nextInt();

        int[] ar = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter number");
            ar[i]=scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(ar));
    }
}
