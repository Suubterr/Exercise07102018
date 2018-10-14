package Exersices;

import java.util.Scanner;

public class pairsCypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in text u want to encode: ");
        String txt = sc.nextLine();

        encodeTxt(txt);
    }

    private static String encodeTxt(String txt) {

        if(txt.length() % 2 == 1) {
            txt+=" ";
        }

        StringBuilder stringResult = new StringBuilder();
        for(int i = 0; i < txt.length(); i+=2) {
            stringResult.append(txt.charAt(i+1)).append(txt.charAt(i));
        }
        System.out.println(stringResult);
        return stringResult.toString();
    }
}
