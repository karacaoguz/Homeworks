package hw10;

import java.util.Scanner;

public class ReverseTextAndNumber {
    public static void main(String[] args) {
       reverseTextWithString();
       reverseTextWithStringBuilder();
       reverseNumberWithString();
       reverseNumberWithStringBuilder();
    }

    public static void reverseTextWithString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the text that you want to reverse: ");
        String text = scanner.nextLine();
        String reversedText = "";
        for (int i = 1; i <= text.length(); i++) {
            reversedText += text.charAt(text.length() - i);
        }
        System.out.println("Reversed text: " + reversedText);
    }
    public static void reverseTextWithStringBuilder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the text that you want to reverse: ");
        StringBuilder text = new StringBuilder(scanner.nextLine());
        StringBuilder reversedText = text.reverse();
        System.out.println("Reversed text with StringBuilder: " + reversedText);
    }
    public static void reverseNumberWithString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the number that you want to reverse: ");
        int number = scanner.nextInt();
        String numberString = String.valueOf(number);
        String reversedNumber = "";
        for (int i = 1; i <= numberString.length(); i++) {
            reversedNumber += numberString.charAt(numberString.length() - i);
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
    public static void reverseNumberWithStringBuilder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the number that you want to reverse: ");
        int number = scanner.nextInt();
        StringBuilder numberString = new StringBuilder(String.valueOf(number));
        StringBuilder reversedNumber = numberString.reverse();
        System.out.println("Reversed number with StringBuilder: " + reversedNumber);
    }

}
