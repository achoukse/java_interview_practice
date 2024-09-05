import java.util.Scanner;

public class problem33 {
    public static void main(String[] args) {
        //find whether given number is amstron number
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();

        int orginalNum=num;
        int cubeNum=0;

        //logic for checking whether the given number is armstong number
        while (num>0){
            int reminder = num%10;
            cubeNum=cubeNum+(reminder*reminder*reminder);
            num=num/10;
        }
        if(orginalNum==cubeNum){
            System.out.println(orginalNum+"is an armstrong number");
        }else {
            System.out.println("it is not armstong number");
        }
        scanner.close();
    }
}
