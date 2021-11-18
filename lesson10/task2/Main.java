package task2;

import task4.HeavyBox;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String text = IOUtils.readFile("D:\\Аннушка любовь моя любимая\\Lesson10Home\\src\\task2\\text.txt");
        String[] word = IOUtils.splitOnWords(text);

        Map<String, Integer> wordMap = new HashMap<>();

        for (String massWord : word) {
            Integer count = wordMap.get(massWord);
            if (count == null) {
                count = 0;
            }
            wordMap.put(massWord, count + 1);
        }
        List<Map.Entry<String, Integer>> sort = new ArrayList<>(wordMap.entrySet());
        Collections.sort(sort, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });

        for (Map.Entry<String, Integer> heavyBox : sort) {
            System.out.print(heavyBox.getKey() + "-" + heavyBox.getValue() + "\n");
        }

    }
}
