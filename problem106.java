public class problem106 {
    public static void main(String[] args) {
//        int rows =5;
//        for(int i=0;i<rows;i++){
//            //print leading spaces
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            //print starts
//            for(int k=rows-1;k>0;k--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        int rows = 5; // You can change this value to adjust the size of the pyramid

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = rows - i; k > 0; k--) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }


}

