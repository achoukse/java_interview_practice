import java.util.Scanner;

public class problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ther width of rectangle");
        double witdth =scanner.nextDouble();

        System.out.println("Enter the heinght of rectagle");

        double height = scanner.nextDouble();
        System.out.println("Area of rectagle is "+witdth*height);
        scanner.close();
    }
}
