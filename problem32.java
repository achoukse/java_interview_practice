import java.util.Scanner;

public class problem32 {
    public static void main(String[] args) {
        //find cube of given number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num =scanner.nextInt();
        System.out.println("The cube of given number is"+(num*num*num));
        scanner.close();
    }
}
