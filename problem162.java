import java.util.Arrays;

public class problem162 {
    //selection sort
    public static void main(String[] args) {
        int [] ar ={35,1,5,16,3,9,12};
        int temp;
        for(int i=0;i<ar.length;i++){
            int m=i;
            for(int j =i+1;j<ar.length;j++){
                if(ar[j]<ar[m]){
                    m=j;
                }

            }
            temp=ar[i];
            ar[i] =ar[m];
            ar[m]=temp;

        }
        System.out.println(Arrays.toString(ar));
    }
}
