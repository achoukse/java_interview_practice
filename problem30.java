import java.util.Scanner;

public class problem30 {
    public static void main(String[] args) {
        //java program to check whether the given number is a palindrome
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int originalNum =scanner.nextInt();
        int num =originalNum;
        int reverseNum=0;
        int reminder;

        while (num>0){
        reminder = num %10;
        num =num/10;

        reverseNum =reverseNum *10+reminder;
        }
        if(reverseNum==originalNum){
            System.out.println("give number is palideone");
        }else {
            System.out.println("given number is not palidrome");
        }
    }
}
