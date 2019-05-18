package tur.patryk;

import java.sql.Date;
import java.time.*;

public class DateConverter {

    public static Date localDateTime2SqlDate (LocalDateTime localDateTime) {

        if (localDateTime == null) {
            return null;
        }

        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();

        return new Date(instant.toEpochMilli());
    }

    public static LocalDateTime sqlDate2LocalDateTime (Date sqlDate) {

        if (sqlDate == null) {
            return null;
        }

        //return new LocalDateTime(sqlDate.getTime());
        return LocalDateTime.ofInstant(sqlDate.toInstant(), ZoneId.systemDefault());
    }
}