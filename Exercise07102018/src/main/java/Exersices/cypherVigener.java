package Exersices;

import java.util.Scanner;

public class cypherVigener {
    public static final int ASCII_START = 65;
    public static final int ASCII_RANGE = 24;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in some text u wan to to encode, Brother: ");
        String usrText = sc.nextLine().toUpperCase();
        System.out.println("Type in your key, Brother: ");
        String usrKey = sc.nextLine().toUpperCase();


        //cypherIt(usrText, fixLenght(usrText, usrKey));

        resultWithSpace("CLJPWEHGL","PAWEL RUTA");
    }

    private static String resultWithSpace(String result, String input) {
        int n = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') {
                result = result.substring(0,i+1)+' '+result.indexOf(i+1,result.length());
            }
            System.out.println(result);
            return result;
        }


        return result;
    }

    private static String fixLenght(String text, String key) {
        int diff = 0;
        String textWithoutSpace = text.replace(" ","");
        String keyWithoutSpace = key.replace(" ","");

        while(textWithoutSpace.length() != keyWithoutSpace.length()) {
            if (textWithoutSpace.length() > keyWithoutSpace.length()) {
                diff = textWithoutSpace.length() - keyWithoutSpace.length();
                if(diff > keyWithoutSpace.length()) {keyWithoutSpace+=keyWithoutSpace;}
                else {keyWithoutSpace += keyWithoutSpace.substring(0, keyWithoutSpace.length() - diff);}
            } else if (textWithoutSpace.length() < keyWithoutSpace.length()) {
                diff = keyWithoutSpace.length() - textWithoutSpace.length();
                keyWithoutSpace = keyWithoutSpace.substring(0, keyWithoutSpace.length() - diff);

            }
        }
        return keyWithoutSpace;
    }

    private static String cypherIt(String text, String key) {
        String textWithoutSpace = text.replace(" ","");
        int keyCharIndex;
        int textCharIndex;
        String result = "";
        for(int i = 0; i < textWithoutSpace.length(); i++) {
            keyCharIndex = (int)key.charAt(i) - ASCII_START;
            textCharIndex = (int) textWithoutSpace.charAt(i) - ASCII_START;

            if(keyCharIndex + textCharIndex -1 > ASCII_RANGE) {
                result += (char)(ASCII_START + ((keyCharIndex + textCharIndex) % ASCII_RANGE));
            } else {
                result += (char)(ASCII_START + (keyCharIndex + textCharIndex));
            }
        }

        return result;

    }
}
