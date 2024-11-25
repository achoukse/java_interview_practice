public class problem153 {
    //Print Alphabet Pattern A BB CCC DDDD EEEEE
    public static void main(String[] args) {
        int letter =65;
        for(int i=0;i<5;i++){
            for(int j =0;j<=i;j++){
                System.out.print((char) (letter+i)+" ");
            }
            System.out.println();
        }

    }
}
