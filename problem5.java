import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        // Check whether the given input number is even or odd
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num =scanner.nextInt();
        scanner.close();
        if(num%2==0){
            System.out.println(num+"number given by user is even number");
        }
        else{
            System.out.println(num+"number given by user is odd number");
        }
    }
}
