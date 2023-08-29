import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class SimplestWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a text:");
        String userInput = scanner.nextLine();

        String[] words = userInput.split("\\s+");
        int wordCount = words.length;
        
        System.out.println("Total words: " + wordCount);
        
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
