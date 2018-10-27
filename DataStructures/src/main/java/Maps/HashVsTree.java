package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HashVsTree {

    public static void main(String[] args) {
        ArrayList<String> keysAndValues = getUserInput();
        HashMap<String,String> myHMap = setHMap(keysAndValues);
        TreeMap<String,String> mySMap = setTMap(keysAndValues);


    }

    private static TreeMap<String, String> setTMap(ArrayList<String> keysAndValues) {
        TreeMap<String,String> tMap = new TreeMap<>();
        for(String i : keysAndValues) {
            String key = i.split(" ")[0];
            String value = i.split(" ")[1];
            tMap.put(key,value);
        }
        System.out.println("TreeMap: "+tMap);
        return tMap;
    }

    private static HashMap<String, String> setHMap(ArrayList<String> keysAndValues) {
        HashMap<String,String> hMap = new HashMap<>();
        for(String i : keysAndValues) {
            String key = i.split(" ")[0];
            String value = i.split(" ")[1];
            hMap.put(key,value);
        }
        System.out.println("HashMap: "+hMap);
        return hMap;
    }

    private static ArrayList<String> getUserInput() {
        ArrayList<String> usrInpt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String inpt = sc.nextLine();
        while(!inpt.equals("exit")) {
            usrInpt.add(inpt);
            inpt = sc.nextLine();
        }
        return usrInpt;
    }
}
