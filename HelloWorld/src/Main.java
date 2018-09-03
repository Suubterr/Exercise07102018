public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World".toUpperCase());

        System.out.println("Typy proste w JAVA:");
        System.out.println("Integer " + 4);
        System.out.println("Byte " +0x11);
        System.out.println("Long " + 12L);
        System.out.println("Double " + 2.01);
        System.out.println("Char " + 'z');     //pojedyncze ciapki to char; podwójne - string
        System.out.println("Boolean " + true);

        System.out.println("Typy proste w JAVA:");
        System.out.println("Integer " + new Integer(4));
        System.out.println("Byte " + new Byte("1100"));
        System.out.println("Long " + new Long(12L));
        System.out.println("Double " + new Double(2.01));
        System.out.println("Char " + new Character('z'));     //pojedyncze ciapki to char; podwójne - string
        System.out.println("Boolean " + new Boolean(true));
        System.out.println("String " + new String("String").toUpperCase());
    }
}
