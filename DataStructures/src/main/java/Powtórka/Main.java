package Powtórka;

public class Main {

    public static void main(String[] args) {
        StaticTest object1 = new StaticTest();
        object1.setFirstName("Paweł");
        object1.setLastName("Ruta");
        object1.setAge(35);
        object1.getVALUE();

        StaticTest object2 = new StaticTest();
        object2.setFirstName("Stefan");
        object2.setLastName("Burczymucha");
        object2.setAge(55);
        object2.getVALUE();

        printText(object1);
        printText(object2);
    }

    private static void printText(StaticTest object1) {
        System.out.printf("Wynik imie: %s, \nnazwisko: %s, \nwiek: %d - (%d)\n"
                , object1.getFirstName()
                , object1.getLastName()
                , object1.getAge()
                , object1.getVALUE()
        );
        System.out.println();
    }
}
