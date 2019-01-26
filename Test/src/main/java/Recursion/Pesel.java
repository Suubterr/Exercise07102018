package Recursion;

import java.util.Scanner;

public class Pesel {
    public static void main(String[] args) {

        checkPesel(getPesel());
    }

    private static void checkPesel(String[] peselList) {
        final Integer[] NUMBERS = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        for (String pesel : peselList) {
            Integer sum = 0;
            for (int i = 0; i < NUMBERS.length; i++) {
                System.out.println();
                int g = Integer.parseInt(pesel.substring(i,i+1));
                sum += g * NUMBERS[i];
            }
            System.out.println(sum);
            if (sum > 0 && sum % 10 == 0) {
                System.out.println('D');
                return;
            }
            System.out.println('N');;
        }
    }

    private static String[] getPesel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilosc: ");
        int t = sc.nextInt();
        sc.nextLine();
        String pesel = "";
        String[] peselLst = new String[t];
        for (int i = 0; i < t; i++) {
            System.out.println("Pesel: ");
            pesel = sc.next();
            peselLst[i] = pesel;
        }
        return peselLst;
    }
}