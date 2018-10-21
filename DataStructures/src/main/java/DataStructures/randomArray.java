package DataStructures;

import java.util.Random;
import java.util.Scanner;

public class randomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] newArray = rndArray(size);
        printArray(newArray);

    }

    private static void printArray(int[] newArray) {
            for(int i : newArray) {
                System.out.println(i + " ");
            }
    }

    private static int[] rndArray(int size) {
        int[] array = new int[size];
        Random rnd = new Random();
        for(int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(20);
        }

        return array;
    }
}
