import java.util.Scanner;

public class problem34 {
    public static void main(String[] args) {
        //find fatorial of number
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int num =scanner.nextInt();
        scanner.close();
        //logic for finding th factorial of given number
        int fact =factorial(num);
        System.out.println("Factorial of given number "+num+"is= "+fact);
    }

    private static int factorial(int num) {
        if(num==0){
            return 1;
        }else {
            return num * factorial(num-1);
        }
    }
}
