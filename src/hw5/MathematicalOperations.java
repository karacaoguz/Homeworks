package hw5;

public class MathematicalOperations {
    public void isPrime(int number) {
        int h = 0;
        for(int i = 2; i < number; i++) {

            if(number % i == 0) {
                h++;
                break;
            }
        }
        if(h == 0){
            System.out.println(number + " is a prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }
    }

    public void Fibonacci(int number) {
        int f1 = 0;
        int f2 = 1;
        int f3;

        System.out.print(f1 + " " + f2);

        for(int i = 2; i < number; i++) {
            f3 = f2 + f1;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }
        System.out.println();
    }

    public void perfectNumber(int number) {
        int[] intArray = new int[number];
        int j = 0;

        for(int i = 1; i < number; i ++) {
            if(number % i == 0){
                intArray[j] = i;
                j++;
            }
        }
        int sum = 0;
        for(int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        if(sum == number){
            System.out.println(number + " is a perfect number");
        }
        else {
            System.out.println(number + " is not a perfect number");
        }
    }
}
