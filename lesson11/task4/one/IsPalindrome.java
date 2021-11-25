package task4.one;

import java.util.concurrent.Callable;

public class IsPalindrome implements Callable<String> {

    private String word;

    public IsPalindrome(String word) {
        this.word = word;
    }

    static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String call() throws Exception {
        if (isPalindrome(word)) {
            return "Это палиндром";
        }else {
            return "Это не палиндром";
        }
    }
}
