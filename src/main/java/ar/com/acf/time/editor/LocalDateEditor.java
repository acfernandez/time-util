package ar.com.acf.time.editor;

import java.beans.PropertyEditorSupport;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;

import ar.com.acf.time.format.DateFormatUtils;

public class LocalDateEditor
    extends PropertyEditorSupport {

    private DateTimeFormatter formatter = DateFormatUtils.STD_DATE_FORMATTER;

    public LocalDateEditor(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public String getAsText() {
        return this.formatter.print((LocalDate) this.getValue());
    }

    @Override
    public void setAsText(String text) {
        this.setValue(new LocalDate(this.formatter.parseDateTime(text)));
    }
}
