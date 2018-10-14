package Exersices;

import java.util.Scanner;

public class zadanko_na_rozgrzewke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number, brother!");

        int n = scanner.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("Wrong number!");
            return;
        }
        print1(n);
        System.out.println();
        System.out.println("=============");
        print2(n);
        System.out.println();
        System.out.println("=============");
        print3(n);
        System.out.println();
        System.out.println("=============");
        print4(n);
        System.out.println();
        System.out.println("=============");
        trojkat(n);
        System.out.println();
        System.out.println("=============");
        kwadrat(n);
        System.out.println();
        System.out.println("=============");
        iks(n);
        System.out.println();
        System.out.println("=============");
        przekatna(n);
        System.out.println();
        System.out.println("=============");

    }

    private static void przekatna(int n) {
        //int o = n-1;
        for(int i = n; i > 0; i--) {
            System.out.println();
            for(int k = 0; k <= n; k++) {
                if(k == i) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            //o-=1;
        }
    }

    private static void iks(int n) {
        int x = n;
        for(int i = 0; i < n; i++){
            System.out.println();
            for(int j = 0; j < n; j++) {
                if(i == j || j == x-1) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            x-=1;

        }
    }

    private static void kwadrat(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            if (i == 0 || i == n - 1) {
                for (int k = 0; k < n; k++) {
                    System.out.print('*');
                }
            } else if (i > 0 && i < n-1) {
                for(int j = 0; j < n; j++) {
                    if(j==0 || j == n-1) {
                        System.out.print('*');
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }

    private static void trojkat(int n) {
        char s = '*';
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int k = 0; k < i; k++) {
                System.out.print(s);
            }
        }
    }

    private static void print4(int n) {
        int k1 = 0;
        int k2 = 1;
        int j;
        for (int i = 0; i < n; i++) {
            System.out.print(k1 + " ");
            j = k1;
            k1 = k2;
            k2 += j;
        }
    }

    private static void print3(int n) {
        System.out.print("2 ");
        int multipier = 1;
        for (int i = 1, result = 4; i < n; i++, result += 2 * multipier) {
            if (i % 3 == 0) multipier *= -1;
            System.out.print(result + " ");
        }
        ;
    }

    private static void print2(int n) {
        for (int i = -1, j = 0, k = 1; j < n; i += k * 2, j++, k *= 2) {
            System.out.print(i + " ");
        }

    }

    public static void print1(int n) {

        for (int i = 1; i < n; i++) {
            System.out.print(i * 2 - 1 + " ");
        }
    }

}
