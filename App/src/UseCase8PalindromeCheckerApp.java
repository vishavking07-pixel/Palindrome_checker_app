/**
 * ==========================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 6: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends;
 *
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how LinkedLists supports
 * double ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase8PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic";

        // Creating a LinkedList l
        LinkedList<String> l = new LinkedList<String>();

        l.add(input);
        boolean isPalindrome = true;
        while(l.size()>1){
            if(!(l.removeFirst().equals(l.removeLast()))){
                isPalindrome = false;
            }
        }
        System.out.println("Is Palindrome? :" + isPalindrome);

    }
}