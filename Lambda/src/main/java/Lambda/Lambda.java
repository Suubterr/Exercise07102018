package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("raz","dwa","trzy","cztery");
        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });


    }
}

