// version 7.0
// author Manan Sharma
// UseCase 7 Deque Palindrome

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : input.toCharArray()) {

            deque.add(c);

        }

        boolean isPalindrome = true;

        while(deque.size() > 1) {

            if(deque.removeFirst() != deque.removeLast()) {

                isPalindrome = false;

                break;

            }

        }

        System.out.println("Input: " + input);

        if(isPalindrome)

            System.out.println("It is Palindrome");

        else

            System.out.println("It is not Palindrome");

    }

}