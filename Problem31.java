import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        //find squre of given number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();

        System.out.println("Sqare of give number is "+(num*num));
        scanner.close();
    }
}
