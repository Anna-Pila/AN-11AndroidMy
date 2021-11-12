package task2;

final class TextFormatter {
    static int count = 0;


    static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    static int countWord(String sentence) {
        String[] word = sentence.split(" ");
        count = 0;
        for (String words : word) {
                count++;
        }
        return count;
    }


    static boolean flagPalindrome(String sentence) {
        String[] word = sentence.split(" ");
        count = 0;
        for (String words : word) {
            if ((isPalindrome(words)) && (words.length() > 1)) {
                count++;
            }
        }
        return count >= 1;
    }
}
