package String;

import java.util.StringTokenizer;


public class CountNumberOfWordInString {

    public static void main(String[] args) {

        String str = "This is a new beginning";

        System.out.println(count(str));

    }

    // Using split function
    public static int countWordsUsingSplit(String input) {

        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }

    // Using StringTokenizer
    public static int countWordsUsingStringTokenizer(String sentence) {

        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }

    // String without using library method
    public static int count(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = word.length() - 1;
        char[] characters = word.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            // if the char is a letter, word = true.
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;
                // if char isn't a letter and there have been letters before, // counter goes up.
            } else if (!Character.isLetter(characters[i]) && isWord) {

                wordCount++;
                isWord = false;
                // last word of String;
                // if it doesn't end with a non letter, it // wouldn't count without this.
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

}
