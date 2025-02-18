package Backtracking;
// Java implementation to print all possible
// letter combinations using Queue
import java.util.*;

class GfG {

    // Method to get all possible words
    static String[] possibleWords(int[] arr) {

        // Mapping digits to corresponding letters
        String[] mp
            = { "",    "",    "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz" };

        // List to store the result
        List<String> result = new ArrayList<>();

        // Queue to store intermediate combinations
        Queue<String> q = new LinkedList<>();

        q.add("");

        while (!q.isEmpty()) {

            // Get the front string from the queue
            String prefix = q.poll();

            // Check if the current string is complete
            if (prefix.length() == arr.length) {
                result.add(prefix);
            }
            else {

                // Get the corresponding digit
                int digit = arr[prefix.length()];

                // Skip invalid digits
                if (digit < 2 || digit > 9) {
                    continue;
                }

                // Add all possible letters for this digit
                for (char letter :
                     mp[digit].toCharArray()) {
                    q.add(prefix + letter);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    static void printArr(String[] words) {

        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3 };
        String[] words = possibleWords(arr);
        printArr(words);
    }
}
