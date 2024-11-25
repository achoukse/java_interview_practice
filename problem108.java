public class problem108 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=1;j<5-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
