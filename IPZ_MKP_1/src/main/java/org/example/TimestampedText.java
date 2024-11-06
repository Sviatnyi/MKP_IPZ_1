package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampedText extends TextDecorator {

    public TimestampedText(Text message) {
        super(message);
    }

    @Override
    public String getText() {
        String timestamp = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss] ").format(new Date());
        return timestamp + message.getText();
    }
}