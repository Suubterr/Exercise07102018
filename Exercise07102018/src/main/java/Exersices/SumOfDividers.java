package Exersices;

public class SumOfDividers {

    public int giveMeDividersSum(int n) {

        int b = 0;

        if(n > 0) {
            for(int i = 1; i <= n; i++) {
                if(n % i == 0){
                    b += i;
                }
            }
        }
        return b;
    }

}
