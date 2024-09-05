class Problem36 {
    public static void main(String[] args) {
        int[] a = {3, 3, 5, 6, 6, 7, 4, 3, 5, 6};

        // Edge case for empty array
        if (a.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int j = 0; // Pointer for the position of the last unique element

        // Iterate through the array, checking adjacent elements
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
        }

        // Print unique elements
        System.out.print("Unique elements: ");
        for (int k = 0; k <= j; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println(); // To ensure there's a newline at the end of the output
    }
}