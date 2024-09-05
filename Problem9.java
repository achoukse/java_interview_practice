import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        //Check whether the given character is a Vowel
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Character");

        char c =scanner.next().charAt(0);
        scanner.close();
        //logic for checking whether the char is vowel

        boolean isVowel =false;
        switch (c){
            case 'a':
            case 'e':
            case  'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel=true;

        }
        if(isVowel){
            System.out.println(c+"is a Vowel");
        }else {
            System.out.println(c+"is not Vowel");
        }
    }
}
