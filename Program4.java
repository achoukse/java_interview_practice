import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        //    In-taking two numbers using Scanner and printing their sum
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a =scanner.nextInt();

        System.out.println("Enter second number");
        int b =scanner.nextInt();

        System.out.println("The sum of two given number is "+(a+b));
        scanner.close();
    }

}
