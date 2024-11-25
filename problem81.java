import java.util.Scanner;

public class problem81 {
    public static void main(String[] args) {
//find the penultimate words of a sentence
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any statement:");

        // Read the entire line of input
        String statement = scanner.nextLine();

        // Close the scanner to free up resources
        scanner.close();

        // Split the statement into words
        String[] words = statement.split("\\s+"); // Use "\\s+" to handle multiple spaces

        // Check if the number of words is greater than 1
        if (words.length > 1) {
            // Print the penultimate word
            System.out.println("The penultimate word in the given statement is: " + words[words.length - 2]);
        } else {
            // Inform the user that there are not enough words
            System.out.println("The given statement has less than 2 words, hence the penultimate word cannot be printed.");
        }
    }
}