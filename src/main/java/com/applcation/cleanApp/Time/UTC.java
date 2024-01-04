package com.applcation.cleanApp.Time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class UTC {
    public static String getUTCTimeAndDate(){
        Instant instant = Instant.now();

        ZoneId zoneId = ZoneId.of("UTC");

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = zonedDateTime.format(formatter);
        return formattedDateTime;
    }
}
