package hw11;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk kaç sayıyı görmek istiyorsunuz: ");
        int limit = scanner.nextInt();
        BigInteger fibonacci1 = BigInteger.ZERO;
        BigInteger fibonacci2 = BigInteger.ONE;
        BigInteger fibonacci3;
        BigInteger sum;
        System.out.print(fibonacci1.intValue() + " " + fibonacci2.intValue());
        for (int i = 2; i < limit; i++) {
            sum = fibonacci2.add(fibonacci1);
            fibonacci3 = sum;
            System.out.print(" " + fibonacci3.intValue());
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci3;
        }
    }
}
