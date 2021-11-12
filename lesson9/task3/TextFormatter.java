package task3;

class TextFormatter {
    static boolean entryWord(String[] sentence, String[] word) {
        for (int i = 0; i < sentence.length; i++) {
            for (int j = 0; j < word.length; j++) {
                if (sentence[i].contains(word[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean entryWordS(String sentence, String word) {
        return sentence.contains(word);
    }
}
