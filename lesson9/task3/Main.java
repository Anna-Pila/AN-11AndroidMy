package task3;

import java.io.*;

import static task3.TextFormatter.entryWord;
import static task3.TextFormatter.entryWordS;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
//        String text = "nen 3% Палиндромы — это слова или тут фраза слов, nen которая." +
//                "одинаково саня читается таракан слева направо и справа налево." +
//                "Чтобы проверить является ли слово палиндромом, введите ваше слово или строку в форму ниже и нажмите кнопку проверить.";
//        String [] sent = text.split("\\.");
//        String[] words = {"госсударство", "таракан", "саня", "3%", "бчб"};
//        entryWord(sent, words);

        File fileText = new File("D:\\TMS\\Lesson9Home\\src\\task3\\text.txt");
        File blackList = new File("D:\\TMS\\Lesson9Home\\src\\task3\\blackList.txt");
        var inputTxt = new BufferedReader(
                new FileReader(fileText)
        );
        var inputBL = new BufferedReader(
                new FileReader(blackList)
        );
        String myText = inputTxt.readLine();
        String myBlackList = inputBL.readLine();
        while (myText != null) {
            String[] arraySentences = myText.split("[.!?]");
            String[] arrayWords = myBlackList.split(" ");
            for (String arraySentence : arraySentences) {
                if (entryWord(arraySentences, arrayWords)) {
                    System.out.println(arraySentence);
                    count++;
                }
            }

            myText = inputTxt.readLine();
        }
        if (count==0){
            System.out.println("Текст прошел проверку");
        }
        else {
            System.out.println("Кол-во предложений для исправлений:  " + count + ".");
        }
    }
}
