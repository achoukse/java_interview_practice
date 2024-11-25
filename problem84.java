import java.util.Scanner;
// find last three letter of String
public class problem84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string text");
        String st =scanner.nextLine();

        char[] strca =st.toCharArray();
        int size =strca.length;

        String lastThreeLetter ="";
        for(int i =size-1;i>size-4;i--){
            lastThreeLetter=strca[i]+lastThreeLetter;
        }
        System.out.println("last three letter of given string text is "+lastThreeLetter);
    }
}
