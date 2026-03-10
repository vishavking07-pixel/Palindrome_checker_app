/**
 * ==========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 */
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "Level";
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 1. Capture start time
        long startTime = System.nanoTime();

        // 2. Run the algorithm
        boolean isPalindrome = checkRecursive(cleanInput, 0, cleanInput.length() - 1);

        // 3. Capture end time
        long endTime = System.nanoTime();

        // 4. Calculate total duration
        long duration = endTime - startTime;

        // Display results as shown in the snapshot
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }

    public static boolean checkRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return checkRecursive(s, start + 1, end - 1);
    }
}
