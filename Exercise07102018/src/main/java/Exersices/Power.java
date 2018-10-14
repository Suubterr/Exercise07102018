package Exersices;

public class Power {

    int b;

    public int giveMePower(int n) {
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                b +=i;
            }
            return b;
        } else {
            return 0;
        }
    }
}
