package pl.sdacademy.java16poz.programowanie2.program.helpers;

import java.util.Date;

public final class DateUtils {
    public static long getDateDiff(Date date1, Date date2){
        return date1.getTime() - date2.getTime();
    }
}
