public class problem151 {
    public static void main(String[] args) {
        // Print Diamond Number Pattern
        int n = 4; // Number of rows for half the diamond
        int spaces = n - 1; // Initial spaces

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;

            int start = i; // Start value for current row
            int count = 2 * i - 1; // Number of values to print in the row

            // Print numbers
            for (int j = 1; j <= count; j++) {
                System.out.print(start);
                // Adjust the start value for the next number
                if (j < count / 2 + 1) {
                    start--; // Decrease until the middle
                } else {
                    start++; // Increase after the middle
                }
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the diamond
        spaces = 1; // Reset spaces for the lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces++;

            int start = i; // Start value for current row
            int count = 2 * i - 1; // Number of values to print in the row

            // Print numbers
            for (int j = 1; j <= count; j++) {
                System.out.print(start);
                // Adjust the start value for the next number
                if (j < count / 2 + 1) {
                    start--; // Decrease until the middle
                } else {
                    start++; // Increase after the middle
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
