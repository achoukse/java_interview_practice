import java.util.Scanner;

public class problem118 {
    //check wheter given number is power of 4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number");
        int num =scanner.nextInt();
        scanner.close();

        boolean status =false;
        while (num>0){
            int reminder =num%4;
            if(reminder !=0){
                break;
            }
            num =num/4;
            if(num==1){
                System.out.println("Given number is power of 4");
                status =true;
                break;
            }
        }
        if(!status){
            System.out.println("Given number is not power of 4");
        }
    }


}
