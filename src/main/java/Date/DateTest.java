package Date;

import cn.hutool.core.date.DateUtil;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        Date previousDate = add(now, Calendar.MONTH, -6);
        System.out.println(previousDate);
        Long nowTime = now.getTime();
        Long previousTime = previousDate.getTime();

        System.out.println(nowTime);
        System.out.println(previousTime);
     /*   Date beginOfToday = DateUtil.beginOfDay(now);
        System.out.println(beginOfToday);*/
        /**
         *  we use the long number to represent the time !
         * */
      /*  long beginOfTodayTime = beginOfToday.getTime();
        System.out.println(beginOfTodayTime);*/
    }

    private static  Date add(Date date, int field, int diff) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(field, calendar.get(field) + diff);
        return calendar.getTime();
    }
}
