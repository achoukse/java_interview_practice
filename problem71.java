import java.util.Scanner;

public class problem71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any statement");
        String orignal = scanner.nextLine();
        scanner.close();

        System.out.println(orignal.toLowerCase());
    }
}
