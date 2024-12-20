import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem116 {
    public static void main(String[] args) {
        //find string is anagram or not using collection

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
    Map<Character,Integer> str1Map = new HashMap<>();
    Map<Character,Integer> str2Map = new HashMap<>();
    Character ch;

    for(int i=0;i<str1.length();i++){
        ch =str1.charAt(i);
        if(str1Map.get(ch)==null){
            str1Map.put(ch,1);
        }else {
            str1Map.put(ch,str1Map.get(ch)+1);
        }
    }
        for(int i=0;i<str2.length();i++){
            ch =str2.charAt(i);
            if(str2Map.get(ch)==null){
                str2Map.put(ch,1);
            }else {
                str2Map.put(ch,str2Map.get(ch)+1);
            }
        }
        return str1Map.equals(str2Map);
    }
}
