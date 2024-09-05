import java.util.Scanner;

public class problem41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any digit number");
        int num =scanner.nextInt();
        int evencount =0;
        int oddcount =0;
        while (num>0){
            int reminder =num%10;
            if(reminder%2==0){
                evencount++;
            }else {
                oddcount++;
            }
            num =num/10;
        }

        System.out.println("The number of even digit in given number is"+evencount);
        System.out.println("The number of odd digit in given number is"+oddcount);
    }
}
