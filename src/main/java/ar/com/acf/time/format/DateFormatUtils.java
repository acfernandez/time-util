package ar.com.acf.time.format;

import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateFormatUtils {


    /**
     * Formatter with pattern yyyy-MM-dd'T'HH:mm:ss.SSS
     */
    public static final DateTimeFormatter STD_DATE_TIME_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS")
        .withZone(DateTimeZone.UTC);

    /**
     * Formatter with pattern yyyy-MM-dd
     */
    public static final DateTimeFormatter STD_DATE_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd").withZone(
        DateTimeZone.UTC);

    /**
     * Formatter with pattern yyyyMMddHHmmssSSS
     */
    public static final DateTimeFormatter COMPRESSED_DATE_FORMATTER_WITH_MILLIS = DateTimeFormat.forPattern(
        "yyyyMMddHHmmssSSS").withZone(DateTimeZone.UTC);

    /**
     * Formatter with pattern yyyyMMdd
     */
    public static final DateTimeFormatter COMPRESSED_DATE_FORMATTER = DateTimeFormat.forPattern("yyyyMMdd").withZone(
        DateTimeZone.UTC);

    /**
     * Formatter with pattern ddMMyyyy
     */
    public static final DateTimeFormatter COMPRESSED_FRENCH_DATE_FORMATTER = DateTimeFormat.forPattern("ddMMyyyy").withZone(
        DateTimeZone.UTC);

    /**
     * Formatter with pattern dd/MM/yyyy
     */
    public static final DateTimeFormatter FRENCH_DATE_FORMATTER = DateTimeFormat.forPattern("dd/MM/yyyy").withZone(
        DateTimeZone.UTC);

    /**
     * Formatter with pattern MMyy
     */
    public static final DateTimeFormatter CC_EXPIRY_DATE_FORMATTER = DateTimeFormat.forPattern("MMyy").withZone(
        DateTimeZone.UTC);

    /**
     * Formatter with pattern yyyy-MM
     */
    public static final DateTimeFormatter YEAR_MONTH_DATE_FORMATTER = DateTimeFormat.forPattern("yyyy-MM").withZone(
        DateTimeZone.UTC);

    /**
     * Formatter with pattern dd-MM-yyyy
     */
    public static final DateTimeFormatter DAY_MONTH_YEAR_DATE_FORMATTER = DateTimeFormat.forPattern("dd-MM-yyyy").withZone(
        DateTimeZone.UTC);

    /**
     * Formatter with pattern yyyy-MM-dd HH:mm
     * 
     * Ready for java.sql.Date conversion
     */
    public static final DateTimeFormatter SQL_DATE_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");

}
