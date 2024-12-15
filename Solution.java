import java.util.*;

public class Solution {
    
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int wordCount = words.length;
        int substringLength = wordLength * wordCount;
        
        // Create a map to count occurrences of each word
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Loop through the string s, and check each possible starting index
        for (int i = 0; i <= s.length() - substringLength; i++) {
            // Create a map to keep track of the words we are currently considering in the window
            Map<String, Integer> seenWords = new HashMap<>();
            int j = 0;
            
            // Loop through the words in the current window
            while (j < wordCount) {
                // Extract the current word
                String currentWord = s.substring(i + j * wordLength, i + (j + 1) * wordLength);
                
                // If the word is not in the original word list, break out of the loop
                if (!wordMap.containsKey(currentWord)) {
                    break;
                }
                
                // Update the count of the word in the current window
                seenWords.put(currentWord, seenWords.getOrDefault(currentWord, 0) + 1);
                
                // If a word appears more times than in the original list, break out of the loop
                if (seenWords.get(currentWord) > wordMap.get(currentWord)) {
                    break;
                }
                
                j++;
            }
            
            // If we have considered all words and they all match, add the starting index
            if (j == wordCount) {
                result.add(i);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test Case 1
        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo", "bar"};
        System.out.println("Test Case 1: " + sol.findSubstring(s1, words1));  // Expected Output: [0, 9]
        
        // Test Case 2
        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word", "good", "best", "word"};
        System.out.println("Test Case 2: " + sol.findSubstring(s2, words2));  // Expected Output: [8]
    }
}
