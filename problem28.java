public class problem28 {
    public static void main(String[] args) {
        //reverse sting
        String st = "Abhilash";
        char[] ca=st.toCharArray();
        int size =ca.length;
        String reversedString ="";
        for(int i=size-1;i>=0;i--){
            reversedString =reversedString+ca[i];
        }
        System.out.println(reversedString);

        //second approch
        StringBuffer stringBuffer = new StringBuffer(st);

        System.out.println( "used string buffer -->"+stringBuffer.reverse());
    }
}
