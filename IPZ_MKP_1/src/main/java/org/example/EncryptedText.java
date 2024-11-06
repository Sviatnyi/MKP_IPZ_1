package org.example;

public class EncryptedText extends TextDecorator {

    public EncryptedText(Text message) {
        super(message);
    }

    @Override
    public String getText() {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : message.getText().toCharArray()) {
            encryptedText.append((char) (c + 1)); // просте шифрування
        }
        return encryptedText.toString();
    }
}
