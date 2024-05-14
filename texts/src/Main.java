import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String text = "Bursting with imagery, motion, interaction and distraction though it is, today’s World Wide Web is still primarily a conduit for textual information. In HTML5, the focus on writing and authorship is more pronounced than ever. It’s evident in the very way that new elements such as article and aside are named. HTML5 asks us to treat the HTML document more as… well, a document.";

        ArrayList<String> list = new ArrayList<>();
        String[] text1 = text.split(" ");
        for (String word : text1) {
            list.add(word);
        }
        System.out.println("Words: " + list.size());

        // Split sentences using regular expression
        String[] text2 = text.split("[.!?]\\s*");
        System.out.println("Sentences: " + text2.length);

        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : text1) {
            // Remove punctuation marks and convert to lowercase
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            uniqueWords.add(word);
        }

        System.out.println("Unique Words: " + uniqueWords.size());

        // Count characters
        int characterCount = countCharacters(text);
        System.out.println("Characters: " + characterCount);

        // Count word frequency
        HashMap<String, Integer> wordFrequency = countWordFrequency(text1);
        System.out.println("Word Frequency: " + wordFrequency);
    }

    // Method to count characters excluding whitespace
    public static int countCharacters(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }

    // Method to count word frequency
    public static HashMap<String, Integer> countWordFrequency(String[] words) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            // Remove punctuation marks and convert to lowercase
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }
}
