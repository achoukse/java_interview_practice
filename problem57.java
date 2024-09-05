public class problem57 {
    public static void main(String[] args) {
        String str ="Mr Arun Motoori";
        String[] words =str.split(" ");
        String reversedString ="";
        for(String word : words){
            String reverdWord ="";
            for(int i=word.length()-1;i>=0;i--){
                reverdWord =reverdWord+word.charAt(i);
            }
            reversedString =reversedString+reverdWord+" ";
        }
        System.out.println(reversedString);
    }
}
