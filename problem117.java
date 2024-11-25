import java.util.Arrays;
import java.util.Scanner;

public class problem117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String");

        String str1 =scanner.nextLine();
        System.out.println("Enter second String");

        String str2 =scanner.nextLine();

        str1 =str1.replaceAll("\\s","").toLowerCase();
        str2 =str2.replaceAll("\\s","").toLowerCase();

        if(isAnagram(str1,str2)){
            System.out.println("String "+str1+"and"+str2+" are Anagram");

        }
        else{
            System.out.println("String"+str1+" and"+str2+" are not anagram");
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        char[] caStr1=str1.toCharArray();
        char[] caStr2 =str1.toCharArray();
        Arrays.sort(caStr1);
        Arrays.sort(caStr2);
        return Arrays.equals(caStr1,caStr2);
    }
}
