package org.example;

public abstract class TextDecorator extends Text {
    protected Text message;

    public TextDecorator(Text message) {
        super(message.getText());
        this.message = message;
    }

    @Override
    public abstract String getText();
}
