import java.util.Scanner;

public class problem75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");//6
        int fnumber =scanner.nextInt();

        System.out.println("Enter second number");
        int sNumber =scanner.nextInt();
        scanner.close();

        //logic for finding the greatest common divisor of given two number
        int gcd=0;
        for(int i=1;i<=fnumber&&i<=sNumber;i++){
            if(fnumber%i==0 && sNumber%i==0){
                gcd=i;
            }
        }
        System.out.println("The greatest common divisor of given number is-->"+gcd);
    }
}
