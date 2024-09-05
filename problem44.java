public class problem44 {
    public static void main(String[] args) {
        int[] a = {6, 3, 5, 2, 1, 5, 6};
        System.out.println("Below is even number in array");
        for (int e : a) {
            if (e % 2 == 0) {
                System.out.println(e + " ");
            }


        }
        System.out.println();
        System.out.println("below is odd number");
        for(int e:a){
            if(e%2!=0){
                System.out.println(e+" ");
            }
        }
    }
}