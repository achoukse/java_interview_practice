import java.util.Random;

public class problem46 {//- Generate a random number within the given range
    public static void main(String[] args) {
        double random =Math.random();
        int range =15;
        System.out.println((int) (random*range));
    }
}
