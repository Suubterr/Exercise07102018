package Exersices;

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cezarCypher {
    public static void main(String[] args) {
        System.out.println("Type in text: ");
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String txt2 = "v}od#g}lhzhf}nd#gr#odvhf}nd";

        encode(convertToNumbers(txt), 3);
        decode(convertToNumbers(txt2), 3);
    }

    private static String encode(List ls, int k) {
        String code = "";
        for (Object i : ls) {
            char z = (char)(((int)i)+k);
            code+=z;
        }
        System.out.println(code);
        return code;
    }

    private static List convertToNumbers(String n) {
        int ascii;
        ArrayList<Integer> stringInAscii = new ArrayList<>();
        for(int i = 0; i < n.length(); i++) {
            ascii = n.charAt(i);
            stringInAscii.add(ascii);
        }
        System.out.println(stringInAscii);
        return stringInAscii;
    }

    private static String decode(List ls, int k) {
        String code = "";
        for (Object i : ls) {
            char z = (char)(((int)i)-k);
            code += z;
        }
        System.out.println(code);
        return code;
    }

}

