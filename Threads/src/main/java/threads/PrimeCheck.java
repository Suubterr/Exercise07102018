package threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimeCheck {



    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("numbers.txt"));

        Long numberFromFile;
        Long primeCounter = 0L;
        while((scanner.hasNextLong())) {
            numberFromFile = scanner.nextLong();
            boolean result = isPrime(numberFromFile);
            if(result) {
                primeCounter++;
            }
        }
        System.out.println(primeCounter);
    }

    public static boolean isPrime(long input) {
        boolean x = true;
        for (int i = 2; i <= input/2; i++) {
            if(input%i==0) {
                x = false;
                break;
            }

        }
        return x;
    }

    public long getInput() {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        return input;
    }
}
