import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String sentence = "java is easy and java is powerful";
        HashMap<String, Integer> wordCounts = new HashMap<>();

        if (sentence != null && !sentence.trim().isEmpty()) {
            String[] words = sentence.toLowerCase().trim().split("\\s+");
            for (String word : words) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        if (wordCounts.isEmpty()) {
            System.out.println("The sentence is empty.");
            return;
        }

        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        String mostFrequentWord = null;
        int highestCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > highestCount) {
                mostFrequentWord = entry.getKey();
                highestCount = entry.getValue();
            }
        }
        System.out.println("Most frequent word: " + mostFrequentWord + "=" + highestCount);
    }
}
