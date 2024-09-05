public class problem56 {
    public static void main(String[] args) {
        //find number of occurences of a character in the given string
        String str ="Arun Motoori";
        char[] ca =str.toCharArray();
        int count =0;
        for(int i=0;i<ca.length;i++){
            if('o'==ca[i]){
                count++;
            }
        }
        System.out.println("the number of occurences of the character in given array"+count);
    }
}
