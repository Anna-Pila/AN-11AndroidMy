package task4.two;

public class IsPalindrome implements Runnable {

    private String word;

    public IsPalindrome(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    @Override
    public void run() {
        if (isPalindrome(word)) {
            System.out.println("Это палиндром");
        }else {
            System.out.println("Это не палиндром");
        }
    }
}
