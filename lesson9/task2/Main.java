package task2;

import java.io.*;

import static task2.TextFormatter.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        String text = "nen Палиндромы — это слова или тут фраза слов, nen которая. одинаково читается слева направо и справа налево." +
//                "Чтобы проверить является ли слово палиндромом, введите ваше слово или строку в форму ниже и нажмите кнопку проверить.";
//        String[] countSentence = text.split("\\.");
//        for (String sentences : countSentence) {
//            System.out.println(countWord(sentences));
//            System.out.println(flagPalindrome(sentences));
//        }
//        for (String sentences : countSentence) {
//            if ((countWord(sentences) > 3) && ((countWord(sentences) < 5)) || flagPalindrome(sentences)) {
//                System.out.println(sentences);
//            }
//        }

        File fileOutput = new File("D:\\TMS\\Lesson9Home\\src\\task2\\text1.txt");
        try (var fileWriter = new FileWriter(fileOutput)) {
            File fileInput = new File("D:\\TMS\\Lesson9Home\\src\\task2\\text.txt");
            var inputPalindrome = new BufferedReader(
                    new FileReader(fileInput)
            );
            String sentences = inputPalindrome.readLine();
            while (sentences != null) {
                if ((countWord(sentences) >= 3) && ((countWord(sentences) <= 5)) || flagPalindrome(sentences)) {
                    fileWriter.write(sentences + "\n");
                }
                sentences = inputPalindrome.readLine();
            }
        }
    }
}
