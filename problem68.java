import java.util.Scanner;

public class problem68 {
    //intake number of second and convert to hours,mins,sec
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number of second");

        int totalSeconds =scanner.nextInt();
        //logic for calculating hous mins and sec

        int min =totalSeconds/60;
        int remainingSecond =totalSeconds%60;
        int hour = min/60;
        int remaingMintes =min%60;
        System.out.println(hour+":"+remaingMintes+":"+remainingSecond);

    }
}
