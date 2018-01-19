package pl.sda.zadnie5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj linie");
        String line = scanner.nextLine();

        Map<String, Integer> words = countWords(line);
        System.out.println(words);
    }

    private static Map<String, Integer> countWords(String line) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = line.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                int wordCount = map.get(word);
                wordCount++;
                map.put(word, wordCount);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}
