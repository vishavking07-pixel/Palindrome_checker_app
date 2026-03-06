/**
 * ==========================================================
 * MAIN CLASS - UseCase9RecursivePalindrome
 * ==========================================================
 *
 * Use Case 6: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion
 *
 * Characters are compared from the outer positions
 * moving inwards using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic";

        int start = 0;
        int end = input.length()-1;

        System.out.println("Is Palindrome? :"+ check(input, start, end));
    }

    public static boolean check(String s, int start, int end){

        boolean IsPalindrome = true;

        while(start != end){
            if(s.charAt(start) != s.charAt(end)){
                IsPalindrome = false;
                break;
            }
            else{
                start++;
                end--;
                check(s, start, end);
            }
        }
        return IsPalindrome;
    }
}