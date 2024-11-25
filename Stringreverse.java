public class Stringreverse {
    public static void main(String[] args) {
        String original= "Hello World";
        String reversed = reversedString(original);
        System.out.println("orignal String---->"+ original);
        System.out.println("Reversed String---->"+reversed);

    }

    private static String reversedString(String original) {
        StringBuilder stringBuilder = new StringBuilder(original);
        return stringBuilder.reverse().toString();
    }



}


