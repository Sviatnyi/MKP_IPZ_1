package org.example;

public class Main {
    public static void main(String[] args) {
        Text message = new Text("   Текстове   повідомлення   для   обробки.    ");
        System.out.println("Оригінальне повідомлення: " + message.getText());

        message = new ShrinkedText(message);
        System.out.println("Стиснення: " + message.getText());

        message = new EncryptedText(message);
        System.out.println("Шифрування: " + message.getText());

        message = new TimestampedText(message);
        System.out.println("Додавання дати та часу: " + message.getText());

        message = new CreatorText(message);
        System.out.println("Додавання автора: " + message.getText());
    }
}