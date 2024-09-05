public class problem50 {
    //find maximum and min in the given array
    public static void main(String[] args) {
        int[] a ={8,1,5,9,12,33,23,7,24};

        int max =a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max =a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("The max number in given array is"+max);
        System.out.println("The min numbe in given array is "+min);
    }

}
