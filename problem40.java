import java.util.Scanner;

public class problem40 {
    public static void main(String[] args) {
        //count number of digit in the given number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any digit number");
        int num =scanner.nextInt();
        scanner.close();

        int sumOfDigit =0;
        while(num>0){
            int reminder = num %10;
            sumOfDigit = sumOfDigit+reminder;
            num =   num/10;
        }
        System.out.println("The sum of digit in given number is"+sumOfDigit);
    }

}
