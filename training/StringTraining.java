package training;

public class StringTraining {
    public static void main(String[] args) {
        String napis = "Ala ma kota, a kto jest łaciaty i mruczy na jej widok.";
        System.out.println();
        System.out.println("Operacja n aobiekcie typu string.");
        System.out.println("Baza: " + napis);
        System.out.println("Długość: " + napis.length());
        System.out.println("znak na pozycji 4: " + napis.charAt(4));
        System.out.println("Zawiera słowo \"mrczek\": "+ napis.contains("mruczek"));
        System.out.println("Zawiera słowo \"jest\": " + napis.contains("jest"));
        System.out.println("Zmiana właściciela: " + napis.replaceAll("Al","Ol"));
        System.out.println("Słowo kot jest na pozycji: " + napis.indexOf("kot"));

        System.out.println();

        StringBuilder sb = new StringBuilder();
        sb.append("Ala ")
                .append("ma ")
                .append(77)
                .append(" kotów.");
        String drugiString = sb.toString(); //tu muszę wywołać jawnie metodę .toString
        System.out.println(sb); // na zmiennej sb jest 'automatycznie użyta metoa .toString w związku z kontekstem sout

        StringBuffer sBuff = new StringBuffer(); //sprawdź różnicę między StringBuffer a StringBuilder
        sBuff.append("Ola")
                .append(" ma ")
                .append(66)
                .append("kanarków.").reverse();
        System.out.println(sBuff);

        System.out.println();
        System.out.println();

//Porównywanie zmiennych
        System.out.println("Porównania zmiennych tekstowych: ");
        String tekst_1 = "Ala";
        String tekst_2 = "ala";
        String tekst_3 = new String("Ala");

        System.out.printf("\tPorównuję %s z %s co daje wynik %s.\n",
                tekst_1,
                tekst_2,
                tekst_1.equals(tekst_2));

        System.out.printf("\tPorównuję %s z %s co daje wynik %s.\n",
                tekst_1,
                tekst_2,
                tekst_1.equalsIgnoreCase(tekst_2)); //porównuje warości

        System.out.printf("\tPorównuję %s z %s co daje wynik %s.\n\n\n",
                tekst_1,
                tekst_3,
                tekst_1 == (tekst_3)); //porównuje adresy w pamięci


        StringBuffer slowo1 = new StringBuffer("kajak");
        System.out.println("\tWynik porównania ==: " + (slowo1.toString() == slowo1.reverse().toString()));
        System.out.println("\tWynik porównania .equals: " + slowo1.equals(slowo1.reverse()) + "\n");

    }
}
