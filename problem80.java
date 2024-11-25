import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class problem80 {
    //java program to reverse the postion of word in the string using collection
    public static void main(String[] args) {
        String str ="This is a string";
        String[] words =str.split(" ");
        List<String> list = Arrays.asList(words);

        Collections.reverse(list);
        for(String word :list){
            System.out.print(word+" ");
        }
    }
}
