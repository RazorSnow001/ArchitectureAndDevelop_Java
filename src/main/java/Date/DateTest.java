package Date;

import cn.hutool.core.date.DateUtil;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date end = new Date();
        System.out.println(end);
        Date start = add(end, Calendar.HOUR, -24);
        System.out.println(start);
        Long endTime = end.getTime() / 1000;
        Long startTime = start.getTime() / 1000;

        System.out.println("startTime :" + startTime);
        System.out.println("endTime :" + endTime);
     /*   Date beginOfToday = DateUtil.beginOfDay(now);
        System.out.println(beginOfToday);*/
        /**
         *  we use the long number to represent the time !
         * */
      /*  long beginOfTodayTime = beginOfToday.getTime();
        System.out.println(beginOfTodayTime);*/
    }

    private static Date add(Date date, int field, int diff) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(field, calendar.get(field) + diff);
        return calendar.getTime();
    }
}
