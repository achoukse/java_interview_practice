import java.util.Scanner;

public class problem42 {
    //find the largest of given three numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");

        int a =scanner.nextInt();

        System.out.println("enter second number");
        int b = scanner.nextInt();

        System.out.println("Enter third number");
        int c =scanner.nextInt();

        if(a>b &&a>c){
            System.out.println(a+"is largest number");
        }if(b>c){
            System.out.println(b+"is largest number");
        }else {
            System.out.println(c+"is largest number");
        }
    }
}
