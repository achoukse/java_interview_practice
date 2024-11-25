import java.util.Map;
import java.util.Scanner;

public class problem76 {//find squre root of given number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num =scanner.nextInt();
        scanner.close();

        //logic for finding the squ root of given number
        int sqrOfNum =(int) Math.sqrt(num);
        System.out.println("The squre root of given number is"+(sqrOfNum));
    }
}
