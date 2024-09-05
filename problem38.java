import java.util.HashSet;

public class problem38 {
    public static void main(String[] args) {
        //find duplicate in array using hash set
        int[] a={3,4,5,3,6,4};
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(hset.add(a[i])==false){
                System.out.println(a[i]+"is duplicate in the array");
            }
        }

    }
}
