package Exersices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAndAvg {
    public List<Integer> userNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        List<Integer> nmbrs = new ArrayList<>();

        System.out.println("Give me some numbers bro!");
        while(n!=0) {
            n = scanner.nextInt();
            nmbrs.add(n);
        }
        return nmbrs;
    }

    public int getSum(List<Integer> l) {
        int sum = 0;
        for(int i : l) {
            sum+=i;
        }
        return sum;
    }
}
