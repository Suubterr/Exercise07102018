package training.core.controlStatement;

public class forStatement {
    public static void main(String[] args) {
        printFirst10Numbers();
        print10NumberFrom(44);
        print5NumbersLessThan(8);
        printEvenNumbersFrom(17,33);
        printEveryNthNumberInRange(1,44,6);
        printIfForPalindrom("to jest palindrom");

    }

    private static boolean printIfForPalindrom(String word) {
        int i1 = 1;
        int i2 = word.length();

        for(;;) {
            if(word.charAt(i1) == word.charAt(i2)) {
                i1++;
                i2-=1;
                continue;
            } else {
                return false;
            }
            //return true;
        }

    }

    private static void printEveryNthNumberInRange(int start, int stop, int N_th) {
        for (int i = start; i <= stop; i += N_th) {
            System.out.println("N_th: " + i);
        }
    }

    private static void printEvenNumbersFrom(int start, int stop) {
        for(int i = start; i <= stop; i++) {
            if(i % 2 != 0){
                continue;
            }
            System.out.println("N:" + i);
            }
        }

    private static void print5NumbersLessThan(int start) {
        int end = start - 5;
        int i = start;

        for(; ; ) {
            System.out.println("T: " + i);
            i--;
            if(i < end) {
                break;
            }
        }
    }

    private static void print10NumberFrom(int start) {
        for(int i=start;i<=start+10;i++) {
            System.out.println("N: "+i);
        }
    }

    private static void printFirst10Numbers() {
        for(int i = 1;i<=10;i++) {
            System.out.println("i = "+i);
        }
    }


}
