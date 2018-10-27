package Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayListFromHashMap {
    public static void main(String[] args) {
        HashMap<String,String> myHMap = new HashMap<>();
        myHMap.put("Iron Man", "Tony Stark");
        myHMap.put("Black Widow", "Natasha Romanov");
        myHMap.put("Hulk", "Bruce Banner");
        myHMap.put("Captain America", "Steve Rogers");
        System.out.println(myHMap);
        toPairsArray(myHMap);
        toKeyValueArray(myHMap);
    }

    private static void toKeyValueArray(HashMap<String, String> myHMap) {
        int mapSize = myHMap.size();
        String[] keysAndValues = new String[2];
        String[] keys = new String[mapSize];
        String[] values = new String[mapSize];
        int i = 0;
        for(String key : myHMap.keySet()) {
            keys[i] = key;
            values[i] = myHMap.get(key);
            i += 1;
        }

        keysAndValues[0] = Arrays.toString(keys);
        keysAndValues[1] = Arrays.toString(values);

        System.out.println(Arrays.toString(keysAndValues));
    }

    private static void toPairsArray(HashMap<String, String> myHMap) {
        ArrayList<String> pairs = new ArrayList<>();

        for(String key : myHMap.keySet()) {
            pairs.add(key + " is " + myHMap.get(key));
        }
        System.out.println(pairs);
    }
}
