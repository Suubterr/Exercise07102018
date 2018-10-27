package Maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class DictionaryMap {
    public static void main(String[] args) {
        String userWord = getUserInput();
        HashMap<String,String> dict = getDictionary();
        returnValueFromMap(userWord,dict);

        while(!userWord.equals("exit")) {
            userWord = getUserInput();
            dict = getDictionary();
            returnValueFromMap(userWord,dict);
        }


    }

    private static void returnValueFromMap(String userWord, HashMap<String, String> dict) {
        System.out.println(dict.get(userWord));
    }

    private static HashMap<String, String> getDictionary() {
        HashMap<String,String> dictionary = new HashMap<>();
        FileReader fr = null;
        String line = "";
        try {
            fr = new FileReader("dict.txt");
        } catch (FileNotFoundException e) {
            System.out.println("NO FILE!!");
            System.exit(1);
        }
        BufferedReader bfr = new BufferedReader(fr);
        try {
            while((line = bfr.readLine()) != null) {
                dictionary.put(line.split(" ")[0].toString()
                        ,line.split(" ")[1].toString());
            }
        } catch(IOException e) {
            System.out.println("ERROR READING FILE!");
            System.exit(3);
        }
        return dictionary;
    }

    private static String getUserInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }




}
