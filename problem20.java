import java.util.Scanner;

public class problem20 {
    public static void main(String[] args) {
//        Program 19 - Intake width and height of a Rectangle and find its perimeter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of the rectangle");

        double height =scanner.nextDouble();

        System.out.println("Enter width of rectangle");
        double width = scanner.nextDouble();

        scanner.close();

        System.out.println("The perimeter of the rectagle is "+2*(height+width));
    }
}
