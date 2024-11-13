import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        run();
    }
    public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().toLowerCase();
    }
    public static int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                return i; 
            }
        }
        return 0; 
    }
    public static void run() {
        String word1 = getWord("Word 1: ");
        String word2 = getWord("Word 2: ");

        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 == 0 || vowelIndex2 == 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            String consonants1 = word1.substring(0, vowelIndex1);
            String rest1 = word1.substring(vowelIndex1);

            String consonants2 = word2.substring(0, vowelIndex2);
            String rest2 = word2.substring(vowelIndex2);

            String spoonerizedWord1 = consonants2 + rest1;
            String spoonerizedWord2 = consonants1 + rest2;

            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }
}
