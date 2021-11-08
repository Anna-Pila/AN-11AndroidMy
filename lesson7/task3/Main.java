package task3;


public class Main {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println("Мой текст");
        String text = "Тут шабаш ведьм.Мой доход летел и летел вверх.Дед занимается йогой как проффесионал и ест боб , вот это мем.";
        System.out.println(text);
        String[] sentence = text.split("\\.");
        String test;
        int[] countPalindrome = new int[sentence.length];
        for (int i = 0; i < sentence.length; i++) {
            test = sentence[i];
            String[] word = test.split(" ");
            count = 0;
            for (String words : word) {
                makeCount(words);
            }
            countPalindrome[i] = count;
        }
        int max = countPalindrome[0];
        int maxIndex = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (max < countPalindrome[i]) {
                max = countPalindrome[i];
                maxIndex = i;
            }
        }
        System.out.println("Искомое предложение:");
        System.out.println(sentence[maxIndex]);
        System.out.println("Кол-во палиндромов - " + max);

    }

    static void makeCount(String word) {
        if ((word.length() > 1) && (iaPalindrome(word))) {
            count++;
        }
    }

    static boolean iaPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}