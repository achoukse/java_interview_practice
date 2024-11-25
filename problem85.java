import java.util.Scanner;

public class problem85 {
    public static void main(String[] args) {
        //print first half of given string text
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any text");
        String str =scanner.nextLine();
        scanner.close();
        //logic for printing the first half of given sting text

        int size =str.length();
        System.out.println("First half of given text is :"+str.substring(0,size/2));
    }
}
