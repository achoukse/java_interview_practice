import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class problem70 {
    //Capitalize the first letter of each word int he given statement
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any statement:");
        String originalStatement = scanner.nextLine();

        // Trim and split the input string into words
        String[] words = originalStatement.trim().split("\\s+");
        StringBuilder finalStatement = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char[] charArray = word.toCharArray();
                char firstChar = charArray[0];
                String firstCharUpperCase = String.valueOf(firstChar).toUpperCase();
                finalStatement.append(firstCharUpperCase);

                for (int i = 1; i < charArray.length; i++) {
                    finalStatement.append(charArray[i]);
                }
                finalStatement.append(" ");
            }
        }

        // Output the final statement
        System.out.println(finalStatement.toString().trim());
        }


}
