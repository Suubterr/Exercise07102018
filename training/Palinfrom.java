package training;

public class Palinfrom {
    public static void main(String[] args) {
        String slowo = "kAjak";
        String zdanie = "Łajce psi specjał";

        System.out.println("Czy jest słowo \"" + slowo + "\" palindromem?");
        String revers = new StringBuffer(slowo).reverse().toString();
        System.out.println(slowo.equalsIgnoreCase(revers));

        revers = new StringBuffer(zdanie).reverse().toString();
        revers = revers.replaceAll(" ","");

        System.out.println("Czy jest zdanie \"" + zdanie + "\" palindromem?");
        zdanie = zdanie.replaceAll(" ","");

        System.out.println(zdanie.equalsIgnoreCase(revers));
    }
}
