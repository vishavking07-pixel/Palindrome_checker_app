/**
 * ==========================================================
 * MAIN CLASS - UseCase11Object-Oriented Palindrome Service
 * ==========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * Object-Oriented design.
 *
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 *This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 *
 * @author Developer
 * @version 11.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase11PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        UseCase11PalindromeCheckerApp app = new UseCase11PalindromeCheckerApp();

        String input = "Race Car";
        System.out.println("Is Palindrome? : " + app.checkPalindrome(input));
    }

    public boolean checkPalindrome(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return recursiveCheck(clean, 0, clean.length() - 1);
    }

    private boolean recursiveCheck(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return recursiveCheck(s, start + 1, end - 1);
    }
}