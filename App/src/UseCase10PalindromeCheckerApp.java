/**
 * ==========================================================
 * MAIN CLASS - UseCase10Case-Insensitive & Space-Ignored Palindrome
 * ==========================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class validates a palindrome after processing
 * the input string
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Example input with mixed case, spaces, and symbols
        String input = "A man, a plan, a canal: Panama";

        // Step 1: Normalization (Remove non-alphanumeric and lowercase)
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Recursive Check
        boolean result = isPalindrome(cleanInput, 0, cleanInput.length() - 1);

        System.out.println("Original: " + input);
        System.out.println("Normalized: " + cleanInput);
        System.out.println("Is Palindrome: " + result);
    }

    /**
     * Recursive helper method to check palindrome status.
     */
    public static boolean isPalindrome(String s, int start, int end) {
        // Base Case: If pointers meet or cross, it is a palindrome
        if (start >= end) {
            return true;
        }

        // If characters at current pointers don't match, fail immediately
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call: Move pointers inward
        return isPalindrome(s, start + 1, end - 1);
    }
}