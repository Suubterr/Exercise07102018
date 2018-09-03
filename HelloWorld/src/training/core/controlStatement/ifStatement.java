package training.core.controlStatement;

public class ifStatement {
    private static final int ADULT_AGE = 18;

    public static void main(String[] args) {
        simpleAgeText();
        whichSchool();
        discount(44.2);
        discount(164.2);
        simpleAgeText(7);
    }

    private static void simpleAgeText() {
        int respondentAge = 15;

        if (respondentAge >= ADULT_AGE) {
            System.out.println("Zakwalifikowany / pełnoletni");
        } else {
            System.out.println("Odmowa.");
        }
    }

    private static void simpleAgeText(int age) {
        System.out.println("\n" +
                ((age < ADULT_AGE) ? "YOUNG" : "ADULT").toString()      //wyrażenie "ELVIS" - dziala jak if
        );
    }

    private static  void whichSchool() {
        int kidAge = 13;

        if(kidAge < 7) {
            System.out.println("Idziesz do podstawówki");
        } else if(kidAge < 11) {
            System.out.println("Idziesz do gimnazjum");
        } else if(kidAge < 15) {
            System.out.println("Idziesz do LO");
        }
    }

    private  static void discount(double valueOfCart) {
        if (valueOfCart < 150) {
            System.out.printf("\nYour payment is: %6.2f \nSpend %6.2f more to get a discount!\n",
                    valueOfCart,
                    (150 - valueOfCart));
        } else if (valueOfCart < 300) {
            System.out.printf("\nYour payment is: %6.2f. You have 10 percent discount. \nSpend %6.2f more to get more discount!\n",
                    valueOfCart*0.9,
                    300 - valueOfCart);
        }
    }


}
