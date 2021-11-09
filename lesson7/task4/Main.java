package task4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите слова через пробел");
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split(" ");
        int minIndex = 0;
        int minLen = getNumMin(words[0]);
        for (int i = 0; i < words.length; i++) {
            if (getNumMin(words[i]) < minLen) {
                minIndex = i;
                minLen = getNumMin(words[i]);
            }
            if (minLen == 1) break;
        }
        System.out.println("Слово " + words[minIndex]);

    }

    public static int getNumMin(String word) {
        int count = word.length();
        Pattern pattern = Pattern.compile("(.)(?=.*(\\1))");
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()) count--;
        return count;
    }
}
