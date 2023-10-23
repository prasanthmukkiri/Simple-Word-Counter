import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Tokenize the input into words using space as a delimiter
        String[] words = input.split(" ");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            // Remove punctuation and convert to lowercase
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");

            if (!word.isEmpty()) {
                if (wordCount.containsKey(word)) {
                    // Increment the count if the word is already in the map
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    // Add the word to the map with a count of 1 if it's not already present
                    wordCount.put(word, 1);
                }
            }
        }

        // Display the word count for each unique word
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
