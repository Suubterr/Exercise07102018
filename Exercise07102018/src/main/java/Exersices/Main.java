package Exersices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number man!");
        int n = scanner.nextInt();

        // count strong
        Power new_power = new Power();
        System.out.printf("Strong of number %d is %d.\n", n, new_power.giveMePower(n));

        // count sum of dividers
        SumOfDividers new_sum = new SumOfDividers();
        System.out.printf("Sum of dividers of number %d is %d.\n",n,new_sum.giveMeDividersSum(n));

        // count if its prime
        PrimeNumberCheck new_prime = new PrimeNumberCheck();
        System.out.printf("Is number %d a prime number? %s", n, new_prime.checkIfItsPrime(n));
    }
}
