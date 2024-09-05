import java.util.Scanner;

public class problem27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");

        int number =scanner.nextInt();
        scanner.close();

        int a=1,b=1;
        System.out.println(a+" ");
        System.out.println(b+" ");

        int f=0;
        while (f<number){
            f=a+b;
            if(f>number) break;

            System.out.println(f+" ");
            a=b; //2
            b=f; //3
        }
    }
}
