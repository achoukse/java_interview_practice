import java.util.Scanner;

public class Ploblem7 {
    public static void main(String[] args) {
//        Leap Year is an year having 366 days, while the normal year has 365 days.
//                If the year is evenly divisible by 4 and not divisible by 100, then it is a Leap year.
//                If the year is evenly divisible by both 4 and 100, then we need to check if it is evenly divisible by 400, to confirm it as
//        Leap year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        scanner.close();
        //logic for checking whether the given year us leap year or not
        if(year % 4 ==0){
            if(year % 100 ==0){
                if(year % 400 ==0){
                    isLeapYear =true;
                }
                else{
                    isLeapYear =false;
                }
            }else {
                isLeapYear=true;
            }
        }
        else {
            isLeapYear=false;
        }

        if(isLeapYear ==true){
            System.out.println("Given year"+year+"is a LeapYear");
        }
        else {
            System.out.println("Given year"+year+"is not a leap year");
        }
        scanner.close();
    }
}
