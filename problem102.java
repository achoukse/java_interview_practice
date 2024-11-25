import java.util.Arrays;

public class problem102 {
    //left rotate String by 3 postion
    public static void main(String[] args) {
        String str ="arun";
        char[] ca = str.toCharArray();

        int n=3;
for(int j=0;j<n;j++){
    char first =ca[0];
    int size =ca.length;
    for(int i=0;i<size-1;i++){

        ca[i]=ca[i+1];

    }
    ca[size-1]=first;
}

        StringBuffer stringBuffer= new StringBuffer();
        for(char st:ca){
            stringBuffer.append(ca);

        }

        System.out.println(Arrays.toString(ca));

    }
}
