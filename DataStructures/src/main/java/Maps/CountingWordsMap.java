package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CountingWordsMap {
    public static void main(String[] args) {
        ArrayList<String> words = getUserWords();
        countUserWords(words);
    }

    private static HashMap<String, Integer> countUserWords(ArrayList<String> words) {
        HashMap<String, Integer> wordsCounter = new HashMap<>();
        for(String i : words) {
            if(wordsCounter.containsKey(i)) {
                wordsCounter.put(i,wordsCounter.get(i)+1);
            } else {
                wordsCounter.put(i, 1);
            }
        }
        System.out.println(wordsCounter);
        return wordsCounter;
    }

    private static ArrayList<String> getUserWords() {
        ArrayList<String> usrWords = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        while(!word.equals("exit")) {
            usrWords.add(word);
            word = sc.nextLine();
        }
        System.out.println(usrWords);
        return usrWords;
    }
}
