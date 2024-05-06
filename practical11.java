import java.util.*;

public class practical11 {
    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph. This paragraph contains some sample words. Sample words are used for counting.";

        // Remove punctuation marks and convert to lowercase
        String cleanParagraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the paragraph into words
        String[] words = cleanParagraph.split("\\s+");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        // Display word counts
        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
