package org.example;

public class CreatorText extends TextDecorator {
    private final String author = "Тимофій Святний ІО-34";

    public CreatorText(Text message) {
        super(message);
    }

    @Override
    public String getText() {
        return message.getText() + " (Автор: " + author + ")";
    }
}