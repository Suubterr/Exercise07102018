package DataStructures;

import java.util.Scanner;

public class fibonacciArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


        long[] newArray = addToArray(size);
        printArray(newArray);
    }

    private static void printArray(long[] newArray) {
        for(long i : newArray) {
            System.out.print(i + " ");
        }
    }

    private static long[] addToArray(int size) {
        long[] array = new long[size];
        array[0] = 1;
        array[1] = 1;
        for(int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }
}
