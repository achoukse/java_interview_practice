import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radis ");

        double radius =scanner.nextDouble();
        scanner.close();

        System.out.println("perimeter of the circle "+(2*Math.PI*radius));
    }
}
