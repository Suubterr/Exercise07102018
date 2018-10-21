package DataStructures;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] arraySizes = getArraySize();
        int[] array1 = fillArrayWithRandom(arraySizes[0]);
        int[] array2 = fillArrayWithRandom(arraySizes[1]);
        int[] array3 = sumOfArrays(array1, array2);
        System.out.printf("\nArray 1: %s\nArray 2: %s\nSum of arrays: %s"
                , Arrays.toString(array1)
                , Arrays.toString(array2)
                , Arrays.toString(array3));
    }

    private static int[] sumOfArrays(int[] array1, int[] array2) {
        int[] result = new int[longerArray(array1, array2)];
        for (int i = 0; i < result.length; i++) {
            if (i + 1 > array1.length) {
                result[i] = array2[i];
            } else if (i + 1 > array2.length) {
                result[i] = array1[i];
            } else {
                result[i] = array1[i] + array2[i];
            }
        }
        return result;
    }

    private static int longerArray(int[] array1, int[] array2) {
        int length;
        if (array1.length > array2.length) {
            length = array1.length;
        } else {
            length = array2.length;
        }
        return length;
    }

    private static int[] fillArrayWithRandom(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = randomInt();
        }
        return array;
    }

    private static int randomInt() {
        Random rnd = new Random();
        int rand = rnd.nextInt(50);
        return rand;
    }

    private static int[] getArraySize() {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] sizes = new int[2];
        sizes[0] = size1;
        sizes[1] = size2;
        return sizes;
    }
}
