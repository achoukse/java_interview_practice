public class problem154 {
    // Print Triangle Alphabet Pattern
    public static void main(String[] args) {
        int letter =65;
        for(int i=0;i<5;i++){
            for(int k=1;k<5-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char) (letter+j)+" ");
            }
            System.out.println();
        }

    }
}
