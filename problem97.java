import java.util.Scanner;

public class problem97 {
    //perform calculator operation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");

        double firstNumber =scanner.nextDouble();
        System.out.println("Enter any operator from (+,-,*,/)");

        char operator =scanner.next().charAt(0);

        System.out.println("Enter the second number");

        double secondNumber =scanner.nextDouble();
        scanner.close();

        //logic for performing calculator operation

        double result =0;
        boolean status =true;
        switch (operator){
            case '+': result =firstNumber+secondNumber;
            break;
            case '-': result =firstNumber-secondNumber;
                break;
            case '*': result =firstNumber*secondNumber;
                break;
            case '/': result =firstNumber/secondNumber;
                break;
            default:
                System.out.println("Invalid operation given by user ,hence operation cannot be performed");
        }
        System.out.println(firstNumber+" "+operator+" "+secondNumber+"="+result);
    }


}
