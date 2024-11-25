public class problem93 {
    //multiply the corresponding element in the given two array
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={5,4,3,2,1};
        int size =a.length;
        for(int i=0;i<size-1;i++){
            System.out.println(a[i]*b[i]+" ");
        }
    }

}
