public class program49 {
    //find missing element in array
    public static void main(String[] args) {
        int[] a={1,2,3,4,6};
        //sum without any miss
        int sumwithoutmiss =0;
        for(int i=1;i<=6;i++){
            sumwithoutmiss =sumwithoutmiss+i;
        }
        //sum with miss
        int sumWithMiss =0;
        for(int e:a){
            sumWithMiss =sumWithMiss+e;
        }
        System.out.println("The missing element in array is"+(sumwithoutmiss-sumWithMiss));
    }
}
