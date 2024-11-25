import java.util.Scanner;

public class problem69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");

        int num =scanner.nextInt();
        scanner.close();

        //logic for finding the diffrent
        // factor for the given number

        int count =0;
        System.out.println("The below are the diffrent factor of the given number");
        for(int i =1;i<=num;i++){
            if(num%i==0){
                System.out.println(i+" ");
                count++;
            }
        }
        System.out.println("The number of factor for given number are"+count);
    }
}
