public class problen149 {
    public static void main(String[] args) {
        // First part: printing the upper half of the pattern
        for (int i = 1; i <= 5; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" "); // Change to print to stay on the same line
            }
            // Print numbers
            for (int k = i; k <= 5; k++) {
                System.out.print(k + " "); // Change to print to stay on the same line
            }
            System.out.println(); // Move to the next line after finishing one row
        }

        // Second part: printing the lower half of the pattern
        for (int i = 4; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" "); // Change to print to stay on the same line
            }
            // Print numbers
            for (int k = i; k <= 5; k++) {
                System.out.print(k + " "); // Change to print to stay on the same line
            }
            System.out.println(); // Move to the next line after finishing one row
        }
        System.out.println(); // Optional: Adds an extra line after the pattern
    }
}

