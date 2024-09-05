import java.sql.SQLOutput;
import java.util.Scanner;

public class problem29 {
    public static void main(String[] args) {
        //Check wheter the given String text is a Palidrome
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String text");

        String orignalText =scanner.nextLine();

        //Logic for reversing the string text

        char[] ca = orignalText.toCharArray();
        scanner.close();
        int size =ca.length;
        String reverString ="";
        for(int i=size-1;i>=0;i--){
            reverString=reverString +ca[i];
        }
        //logic for comparing orignal with reverse text
        if(orignalText.equals(reverString)){
            System.out.println(orignalText+"is a palidrome");
        }else {
            System.out.println(orignalText+"is not a palidrome");
        }
    }

}
