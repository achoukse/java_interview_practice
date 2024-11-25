import java.util.Scanner;

public class problem59 {
    public static void main(String[] args) {
        //comapre thow given number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 =scanner.nextInt();

        System.out.println("Enter second number");
        int num2 =scanner.nextInt();
        if(num1==num2){
            System.out.println("Given number are equal");
        } else if (num1>num2) {
            System.out.println(num1+"is greater than "+num2);

        } else if (num1<num2) {
            System.out.println(num1+"is less than"+num2);
        }
scanner.close();

    }
}
