package spacexapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utils {

    private static String DATE_FORMAT = "yyyy-MM-dd";
    private static String UTC_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    public static String formatStringUtcDate(String dateInUtc) {
        SimpleDateFormat inputFormat = new SimpleDateFormat(Utils.UTC_FORMAT, Locale.US);
        SimpleDateFormat outputFormat = new SimpleDateFormat(Utils.DATE_FORMAT, Locale.US);
        Date date = null;
        try {
            date = inputFormat.parse(dateInUtc);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (date != null)
            return outputFormat.format(date);
        else
            return dateInUtc;
    }
}
