import java.util.Scanner;

public class problem100 {
    // find the first occurence of given element in array without algorithm
    public static void main(String[] args) {
        int[] a ={1,3,5,5,5,6,9};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any number :");

        int num =scanner.nextInt();
        scanner.close();

        boolean isfound=false;
        for(int i=0;i< a.length;i++){
            if(num==a[i]){
                System.out.println("The given number "+num+"is avilable at index"+i);
                isfound=true;
                break;
            }
        }
        if(!isfound){
            System.out.println("the given number"+num+"is not avilable in the array");
        }

    }
}
