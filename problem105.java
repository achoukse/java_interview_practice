public class problem105 {
    //print right triangle
    public static void main(String[] args) {
        int n=5; //number of rows
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n-1;j++){
                System.out.print(" ");
            }
            //print star
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
