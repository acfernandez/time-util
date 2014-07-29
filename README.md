What's it?
=========

time-util is a little library to use with time operations

Samples
-------

1) DateFormatUtils.STD_DATE_FORMATTER.print(LocalDate.now()) produces a string with format yyyy-MM-dd

2) DateFormatUtils.STD_DATE_FORMATTER.parseDateTime("2014-01-01") produces a joda-date-time object

3) LocalDateEditor to use with a controller in order to binding the URI which contains dates values:  
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(LocalDate.class, new LocalDateEditor(DateFormatUtils.STD_DATE_FORMATTER));
    }
