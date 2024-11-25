import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class problem157 {
    //Convert a String to Date
    public static void main(String[] args) throws ParseException {
        String str ="2020-Nov-21";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
