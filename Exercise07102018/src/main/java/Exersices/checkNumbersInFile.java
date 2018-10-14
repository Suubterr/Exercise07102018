package Exersices;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class checkNumbersInFile {
    public static void main(String[] args) throws IOException {
        File file = new File("numbers.txt");
        Scanner in = new Scanner(file);

        Integer nmb = in.nextInt();
        System.out.println(nmb);

        List<Integer> ints = Files.lines(Paths.get("numbers.txt"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i : ints) {
            System.out.print(i);
        }
    }

}