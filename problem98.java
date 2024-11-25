import java.util.Scanner;

public class problem98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int num =scanner.nextInt();
        //logic for checking wether the given number is a prime number

        boolean isPrimeNumber=true;
        if(num>1){
            for(int i=2;i<num;i++){
                if(num%2==0){
                    isPrimeNumber= false;

                }
            }
        }else{
            isPrimeNumber=false;
        }
if(isPrimeNumber){
    System.out.println(num+"is a prime number");
}else {
    System.out.println("not a prime number");
}
    }
}
