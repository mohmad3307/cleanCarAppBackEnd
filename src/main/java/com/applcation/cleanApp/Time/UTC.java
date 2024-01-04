package com.applcation.cleanApp.Time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class UTC {
    public static String getUTCTimeAndDate(){
        // الحصول على التوقيت الحالي بتوقيت UTC
        Instant instant = Instant.now();

        // تحديد المنطقة الزمنية (TimeZone) لتكون UTC
        ZoneId zoneId = ZoneId.of("UTC");

        // الحصول على التوقيت الحالي بتوقيت UTC
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);

        // تحويل ZonedDateTime إلى نص بتنسيق معين
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = zonedDateTime.format(formatter);
        return formattedDateTime;
    }
}
