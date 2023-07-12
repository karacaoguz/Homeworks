package hw3;

import java.util.Scanner;

public class StringWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String text = scanner.nextLine();

        System.out.println("Converted: " + convertToStringWithStars(text));

    }

    public static String convertToStringWithStars(String text) {
        String newText = "";
        int length = text.length();
        char[] characters = text.toCharArray();

        for(int i = 0; i < length - 1; i++) {
            char currentChar = text.charAt(i);
            if(Character.isLetter(characters[i]) == true && Character.isLetter(characters[i + 1]) == true) {
                newText = newText + currentChar + "*";
            }
            else {
                newText = newText + currentChar;
            }
        }
        return newText + text.charAt(length - 1);
    }
}