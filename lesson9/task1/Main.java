package task1;

import java.io.*;

public class Main {
    static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
    public static void main(String[] args) throws IOException {
        File fileOutput = new File("D:\\TMS\\Lesson9Home\\src\\task1\\task1_file2.txt");
        try (var fileWriter = new FileWriter(fileOutput)) {
            File fileInput = new File("D:\\TMS\\Lesson9Home\\src\\task1\\task1_file1.txt");
            var inputPalindrome = new BufferedReader(
                    new FileReader(fileInput)
            );
            String str = inputPalindrome.readLine();
            while (str != null) {
                if ((isPalindrome(str)) && (str.length() > 1)) {
                    fileWriter.write(str + "\n");
                    System.out.println(str);
                }
                str = inputPalindrome.readLine();
            }
        }
    }
}
