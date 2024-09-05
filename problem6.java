import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        //Printing the multiplication table of the given input number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();
        //Multipcation table of the given input
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
}
