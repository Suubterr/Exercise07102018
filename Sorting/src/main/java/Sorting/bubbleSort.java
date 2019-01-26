package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] tab = {4, 5, 7, 2, 9, 0, 5, 1};
        goBubbleSort(tab);
    }

    private static void goBubbleSort(int[] tab) {
        for (int k = 0; k < tab.length; k++) {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    int s = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = s;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}
