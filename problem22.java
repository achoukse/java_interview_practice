import java.util.Scanner;

public class problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any digit number");

        int number = scanner.nextInt();

        scanner.close();

        int sum=0;
        while (number!=0){
            int remainder = number%10;
            sum=sum+remainder;
            number=number/10;
        }
    }
}
