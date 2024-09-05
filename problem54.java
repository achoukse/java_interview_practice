public class problem54 {
    public static void main(String[] args) {
        //Remove special charate space and othe from given string
        String str ="$131*&% $abc123 ABCDF";
        String str2 =str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str2);
    }
}
