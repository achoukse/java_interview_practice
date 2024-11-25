import java.util.Scanner;

public class proble65 {
    public static void main(String[] args) {
        //intake a numberand print wheather the given number is even o odd

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num =scanner.nextInt();
        scanner.close();
        //logic for checking wheter the given number is even or odd

        if(num%2 ==0){
            System.out.println(num+"given by number is an even number");
        }else {
            System.out.println(num+"given bu user is  odd number");

        }

    }
}
