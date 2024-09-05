import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number =scanner.nextInt();

        int initialNumber = number;

        System.out.println("Enter the power");
        int power =scanner.nextInt();

        for(int i =1;i<power;i++){
            number = number*initialNumber;
        }
        System.out.println("The"+initialNumber+"power"+power+"is"+number);
        scanner.close();
    }
}
