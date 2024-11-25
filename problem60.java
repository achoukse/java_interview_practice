import java.util.Scanner;

public class problem60 {
    public static void main(String[] args) {
        //Find the ASC|| value of given character
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char c =scanner.nextLine().charAt(0);
        System.out.println("ASCII value of given charcter is"+(int)c);
        scanner.close();
    }
}
