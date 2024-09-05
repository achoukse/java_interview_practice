public class problem48 {
    public static void main(String[] args) {
        //Logic to compare two array without using inbuild method
        int[] a={1,2,3,4,5};
        int[] b ={1,2,3,4,5,6};
    boolean comparisionStatus =true;
    if(a.length==b.length){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                comparisionStatus=false;
                break;
            }
        }
    }
    else {
        comparisionStatus =false;
    }
    if(comparisionStatus){
        System.out.println("Both array are  equal");
    }else {
        System.out.println("The given array are not equal");
    }
    }

}
