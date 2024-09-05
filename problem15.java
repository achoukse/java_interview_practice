import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNum =scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNum =scanner.nextInt();

        System.out.println("Enter the Three number");
        int three =scanner.nextInt();

        System.out.println("Enter the four number");
        int four =scanner.nextInt();

        System.out.println("Enter the five number");
        int five =scanner.nextInt();

        System.out.println("Enter the six number");
        int six =scanner.nextInt();

        System.out.println("averge of number is "+(firstNum+secondNum+three+four+five+six)/6);
    }
}
