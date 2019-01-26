package Recursion;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversePrint {
    public static void main(String[] args) {
        List<Integer> chain = Arrays.asList(1,2,3,8,5,3,8);
        printInReverseOrder(chain, chain.size());
    }

    private static Integer printInReverseOrder(List<Integer> chain, Integer size) {
        if(size > 0) {
            System.out.println(chain.get(size-1));
            return printInReverseOrder(chain, size-1);
        } else {
            return 0;
        }
    }
}
