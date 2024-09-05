import java.util.Scanner;

public class problem51 {
    //search for given element in array
    public static void main(String[] args) {
        int[] a={8,1,5,9,12,33,23,7,4,3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any numbe that you want to serach in array");
        int searchNumber =scanner.nextInt();
scanner.close();
        //logic for searchin the number in an array
        boolean found =false;
        for(int i=0;i<a.length;i++){
            if(searchNumber==a[i]){
                found = true;
                System.out.println(searchNumber+"is found in this aay at index"+i);
                break;
            }
        }
        if(!found){
            System.out.println(searchNumber+"is not avilable in array");
        }
    }


}
