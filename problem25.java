import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem25 {
    public static void main(String[] args) {
        //Intakes String and prints the duplicate characters along with ...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any English statement");
        String str =scanner.nextLine();

        Map<Character,Integer> m = new HashMap<>();

        char[] ca = str.toCharArray();
        for(Character c: ca){
        if (m.containsKey(c)){
            m.put(c,m.get(c)+1);
        }else{
            m.put(c,1);
        }
        }
        for(Character c :m.keySet()){
            if(m.get(c)>1){
                System.out.println("character"+c+"is repeted"+m.get(c)+"times");
            }
        }

        scanner.close();
    }

}
