import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        //Print radius of circle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius =scanner.nextDouble();
        scanner.close();

        System.out.println("Area of circle having the given radius"+radius+"is"+(Math.PI*radius*radius));
    }
}
