package training.core.controlStatement;

public class foreachStatement {
    static String sentence = "Ala ma kota, który jest łaciaty i pstry.";

    public static void main(String[] args) {
        exampleWhichCharArray();
        exampleWhichStringArray();

    }

    private static void exampleWhichStringArray() {
        String[] strings = sentence.split(" ");
        for (String word : strings) {
            System.out.println(word);
        }
    }

    private static void exampleWhichCharArray() {
        char[] chars = sentence.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        for(char sign : chars) {
            System.out.println(sign);
        }
    }
}
