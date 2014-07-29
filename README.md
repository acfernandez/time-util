time-util
=========

Utils for time operations

samples
=======

* DateFormatUtils.STD_DATE_FORMATTER.print(LocalDate.now()) produces a string with format yyyy-MM-dd

* DateFormatUtils.STD_DATE_FORMATTER.parseDateTime("2014-01-01") produces a joda-date-time object

* LocalDateEditor to use with a controller in order to binding uri which contains dates values:  
    
@InitBinder
public void initBinder(WebDataBinder binder) {
    binder.registerCustomEditor(LocalDate.class, new LocalDateEditor(DateFormatUtils.STD_DATE_FORMATTER));
}
