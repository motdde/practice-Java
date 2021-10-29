package tau.chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Test Automation University");
        reverseString("Hello TAU");
        addSpaces("HeyWorld!It'sMeOluwaseun");
        System.out.println();
    }

    private static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

    /**
     * Prints a string in reverse order
     * 
     * @param text
     */

    private static void reverseString(String text) {
        var reversedWords = new StringBuilder();
        System.out.println(reversedWords);
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedWords.append(text.charAt(i));
        }
        System.out.println(reversedWords);
    }

    /**
     * Splites a String into an array by tokenising it. Count words and prints them
     * 
     * @param text
     */
    private static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
