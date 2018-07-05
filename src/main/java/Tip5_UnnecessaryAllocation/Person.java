package Tip5_UnnecessaryAllocation;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
    private  Date birthDate;
    private static final Date startDate;
    private static final Date endDate;
    static {

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(1946,Calendar.JANUARY,1,0,0,0);
        startDate=calendar.getTime();
        calendar.set(1964,Calendar.JANUARY,1,0,0,0);
        endDate = calendar.getTime();
    }

    public boolean isBabyBoom(){
        return birthDate.compareTo(startDate) >= 0 && birthDate.compareTo(endDate) < 0;
    }
}
