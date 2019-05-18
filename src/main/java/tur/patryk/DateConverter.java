package tur.patryk;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateConverter {

    public static java.sql.Date localDateTime2SqlDate (LocalDateTime localDateTime) {

        if (localDateTime == null) {
            return null;
        }

        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();

        return new java.sql.Date(instant.toEpochMilli());
    }

    public static LocalDateTime sqlDate2LocalDateTime (java.sql.Date sqlDate) {

        if (sqlDate == null) {
            return null;
        }

        //return new LocalDateTime(sqlDate.getTime());
        return LocalDateTime.ofInstant(sqlDate.toInstant(), ZoneId.systemDefault());
    }
}