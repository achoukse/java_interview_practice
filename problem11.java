import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        // Program 11 - Intake two numbers and finds the quotient and reminder
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
         int num = scanner.nextInt();

        System.out.println("Enter the divisor");
        int divisor =scanner.nextInt();

        System.out.println("Quotient is:"+(num/divisor));
        System.out.println("Reminder is"+(num%divisor));
        scanner.close();
    }
}
