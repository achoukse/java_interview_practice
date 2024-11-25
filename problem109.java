 class Problem109 {
    // Print diamond shape star pattern
    public static void main(String[] args) {
        int n = 5; // Number of rows for the top half of the diamond

        // Print the top half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Print the bottom half of the diamond
        for (int i = n - 1; i > 0; i--) {
            // Print leading spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
