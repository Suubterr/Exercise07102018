package training.core.controlStatement;

public class doWhileStatement {
    public static void main(String[] args) {
        exapleWithStopNow(false);
    }

    private static void exapleWithStopNow(boolean isRun) {
        do {                                                // Do While wykonuje się prynajmniej raz
            System.out.println("I'm running!");             // w przeciwieństwie do  While
        } while (isRun);
    }


}
