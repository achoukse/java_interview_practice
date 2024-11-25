import java.util.Arrays;

public class problemrotate102 {
    public static void main(String[] args) {
        String str = "arun";
        char[] ca = str.toCharArray();

        char first = ca[0];

        int size = ca.length;


        for (int i = 0; i < size - 1; i++) {
            ca[i] = ca[i + 1];
        }
        ca[size - 1] = first;
StringBuffer stringBuffer= new StringBuffer();
        for(char element:ca){
            stringBuffer.append(element);
        }

        System.out.println("chater in the array"+ Arrays.toString(ca));
    }

}