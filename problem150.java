public class problem150 {
    //130. Program 130 - Print Number Pattern 10101 01010
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int num =i%2==0?0:1;
            System.out.print(num);
            for(int j=1;j<5;j++){
                num =num ==0?1:0;
                System.out.print(num);
            }

            System.out.println();
        }
    }

}
