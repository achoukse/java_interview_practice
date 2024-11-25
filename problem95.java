import java.util.Scanner;

public class problem95 {
    //Count number of words in string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any statement having multiple words");

        String str = scanner.nextLine();
        scanner.close();

        String[] strar=str.split(" ");
        System.out.println("The number of word in the given text is"+strar.length);
    }
}
