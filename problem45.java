import java.sql.SQLOutput;
import java.util.Scanner;

public class problem45 {
    public static void main(String[] args) {
        //reversing number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = scanner.nextInt();

        int reversednum =0;
        while (num>0){
            int reminder = num%10;
            reversednum=(reversednum*10)+reminder;
            num =num/10;
        }
        System.out.println("The reverse numebr is"+reversednum);
    }
}
