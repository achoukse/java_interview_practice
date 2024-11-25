public class problem123 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // spaces
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            // number
            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1); // This computes the binomial coefficient
            }
            System.out.println();
        }
    }
}
