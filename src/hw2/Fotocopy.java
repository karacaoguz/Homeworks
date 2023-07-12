package hw2;

import java.util.Scanner;

public class Fotocopy {
    static int price = 0;

    static int oneCopy = 5;
    static int twelveCopy = 50;
    static int twentyFiveCopy = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç fotokopi olacak: ");
        int copy = scanner.nextInt();

        System.out.println("min fiyat: " + calculatePrice(copy));
        System.out.println("min fiyat recursive: " + calculatePriceRecusively(copy));
    }
    public static int calculatePrice(int n) {

        if(n >= 25) {
            int division = n / 25;
            int remainder = n % 25;
            price = twentyFiveCopy * division;

            if(remainder >= 12) {
                int secondDivision = remainder / 12;
                int secondRemainder = remainder % 12;
                price = price + (twelveCopy * secondDivision) + (oneCopy * secondRemainder);
            }
            else {
                price = price + (oneCopy * remainder);
            }
        }
        else if(n >= 12) {
            int division = n / 12;
            int remainder = n % 12;
            price = price + (twelveCopy * division) + (oneCopy * remainder);
        }
        else {
            price = oneCopy * n;
        }
        return price;
    }
    public static int calculatePriceRecusively(int n) {
        if(n < 12){
            return n * oneCopy;
        } else if (n < 25) {
            return twelveCopy + calculatePriceRecusively(n - 12);
        }
        else {
            return twentyFiveCopy + calculatePriceRecusively(n - 25);
        }
    }
}
