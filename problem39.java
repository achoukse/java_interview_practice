import java.util.Scanner;

public class problem39 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any digit number");
        int num = scanner.nextInt();
        scanner.close();

        //logic for counting the numbe of digit in the given input number
        int digitCount =0;
        while (num>0){
            digitCount++;
            num =num/10;
        }
        System.out.println("The number in given digit id "+digitCount);
    }
}
