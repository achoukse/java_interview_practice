import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class problem94 {
    //find IP address of the website
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the website URL");
        String website =scanner.nextLine();
        scanner.close();
        //logic for finding ip adress of given website URL
        try {
            InetAddress ip =InetAddress.getByName(website);
            System.out.println("IP adress of given wesite URL is"+ip);
        }catch (UnknownHostException e){
            System.out.println("User has inputted an invalid website");
        }
    }
}
