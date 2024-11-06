package org.example;

public class ShrinkedText extends TextDecorator {

    public ShrinkedText(Text message) {
        super(message);
    }

    @Override
    public String getText() {
        return message.getText().replaceAll("\\s+", " ").trim(); // видалення зайвих пробілів
    }
}