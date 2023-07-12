package hw4;
import java.util.Scanner;
import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int number = scanner.nextInt();

        int[] intArray = new int[number - 1];

        if(number > 1) {

            System.out.print("Integer array: ");

            for(int i = 0; i < intArray.length; i++) {

                intArray[i] = i + 2;
                System.out.print(intArray[i] + " ");

            }

            System.out.println();

//			Equating non-prime numbers to 0
            for(int i = 2; i < intArray.length + 2; i++) {

                if(intArray[i - 2] != 0) {

                    int j = i * i;

                    while(j <= number) {

                        intArray[j - 2] = 0;
                        j = j + i;

                    }
                }
            }

//			Copying array with the zeros at the end of the array
            int i = 0;
            int primeNumberArray[] = new int[number - 1];

            for(int j = 0; j < intArray.length; j++) {

                if(intArray[j] != 0) {

                    primeNumberArray[i] = intArray[j];
                    i++;

                }
            }

//			Copying array without zeros
            int[] copyPrime = Arrays.copyOf(primeNumberArray, i);

            System.out.print("Prime array: ");


            for(int j = 0; j < copyPrime.length; j++) {

                System.out.print(copyPrime[j] + " ");

            }
        }

        else {
            System.out.println("Give a number greater than 1");
        }
    }
}