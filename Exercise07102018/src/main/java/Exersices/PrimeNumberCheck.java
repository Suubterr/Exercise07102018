package Exersices;

public class PrimeNumberCheck {

    public boolean checkIfItsPrime(int n) {

        int b = 1;

        if (b <= 3) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    b += 1;
                }
            }
        }

        if(b > 2) {
            return false;
        } else {
            return true;
        }
    }
}
