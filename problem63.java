import java.text.SimpleDateFormat;
import java.util.Date;

public class problem63 {
    public static void main(String[] args) {
        //print date and time in diffrent format
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date date = new Date();
        String formattedDate =sdf.format(date);
        System.out.println(formattedDate);
    }
}
