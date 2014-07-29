What's it?
=========

Time-util is a little library to use with time operations

Samples
-------

1) Print a string with specific, in this case yyyy-MM-dd

	DateFormatUtils.STD_DATE_FORMATTER.print(LocalDate.now())

2) Parse a date string, which produces a joda-date-time object
	
	DateFormatUtils.STD_DATE_FORMATTER.parseDateTime("2014-01-01")

3) LocalDateEditor to use with a controller in order to binding the URI which contains dates values  
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(LocalDate.class, new LocalDateEditor(DateFormatUtils.STD_DATE_FORMATTER));
    }
